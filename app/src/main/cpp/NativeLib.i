/* File : SeePlusPlus.i */
%module NativeLib_Wrapper

/* Anything in the following section is added verbatim to the .cxx wrapper file */
%{
#include "NativeLib.h"
#include "INativeLib.h"
%}

%include "std_string.i"
%include "NativeLib.h"
%include "INativeLib.h"