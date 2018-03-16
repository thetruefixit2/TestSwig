# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# SWING
set(SWIG_I_FILE "src/main/cpp/NativeLib.i")
set(JAVA_GEN_PACKAGE "ru.dbelevtsev.ndkswing.core")
string(REPLACE "." "/" JAVA_GEN_SUBDIR ${JAVA_GEN_PACKAGE})
set(JAVA_GEN_DIR ${Project_SOURCE_DIR}/build/generated/source/swig/${JAVA_GEN_SUBDIR})
# END SWING

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Sets some warning/error conditions and which version of C/C++ to use
set(CMAKE_C_FLAGS "${CMAKE_C_FLAGS} -std=c++14")
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -Wall -std=c++14")

# Note: One could use a 'GLOB' here, but newly added source files won't auto-regen build files
# After adding files, you'd need to 'touch' the CMakeLists.txt to re-gen
set(SOURCE_FILES
    src/main/cpp/NativeLib.cpp
    )

# Include a location to the header files
include_directories(src/main/cpp)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

add_library( # Sets the name of the library.
             NativeLib

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/cpp/NativeLib.cpp )

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

# Fail the build if SWIG is not found - Ensure SWIG is installed and on the system path
find_package(SWIG REQUIRED)
include(${SWIG_USE_FILE})

# Remove old java files, in case we don't need to generate some of them anymore
file(REMOVE_RECURSE ${JAVA_GEN_DIR})

# Ensure file recognized as C++ (otherwise, exported as C file)
set_property(SOURCE src/main/cpp/NativeLib.i PROPERTY CPLUSPLUS ON)

# Setup SWIG flags and locations
set(CMAKE_SWIG_FLAGS -c++ -package ${JAVA_GEN_PACKAGE})
set(CMAKE_SWIG_OUTDIR ${JAVA_GEN_DIR})

# Export a wrapper file to Java, and link with the created C++ library
swig_add_module(NativeLib_Wrapper java ${SWIG_I_FILE})
swig_link_libraries(NativeLib_Wrapper NativeLib)

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       NativeLib

                       # Links the target library to the log library
                       # included in the NDK.
                       ${log-lib} )