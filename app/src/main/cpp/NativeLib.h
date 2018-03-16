//
// Created by fixit on 15.03.2018.
//

#ifndef NDKSWING_NATIVE_H
#define NDKSWING_NATIVE_H


#include <string>
#include "INativeLib.h"

namespace SJ {
    class Man : public IMan {
    public:

        Man();

        virtual ~Man();

        virtual std::string Hello(const std::string name);
    };
}
#endif //NDKSWING_NATIVE_H
