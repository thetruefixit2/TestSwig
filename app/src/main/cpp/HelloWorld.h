//
// Created by fixit on 15.03.2018.
//

#ifndef NDKSWING_HELLOWORLD_H
#define NDKSWING_HELLOWORLD_H


#include <string>
#include "IHelloWorld.h"

namespace TT {
    class HelloWorld : public IHelloWorld {
    public:
        HelloWorld();

        virtual ~HelloWorld();

        virtual std::string hello_world(std::string name);
    };
}

#endif //NDKSWING_HELLOWORLD_H
