//
// Created by fixit on 15.03.2018.
//

#include "NativeLib.h"

using namespace SJ;

Man::Man() {}

Man::~Man() {}

std::string Man::Hello(const std::string name) {
    return std::string("Hello friend").append(", ").append(name);
}
