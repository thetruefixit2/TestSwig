/* File : SeePlusPlus.i */
%module HelloWorld_Wrapper

/* Anything in the following section is added verbatim to the .cxx wrapper file */
%{
#include "HelloWorld.h"
%}

/* This will allow us to iterate through arrays defined by STL containers */
%include "std_string.i"

/* Create a template for std::vector< std::string > and std::vector< int > in Java */
namespace std {
}

/* This is the list of headers to be wrapped */
/* For Java, it seems we need the file of interest and all files up the inheritance tree */
%include "HelloWorld.h"
%include "IHelloWorld.h"
