//
// Created by fixit on 16.03.2018.
//

#ifndef NDKSWING_IHELLOWORLD_H
#define NDKSWING_IHELLOWORLD_H

#include <string>

namespace TT {
    class IHelloWorld {
    public:
        virtual ~IHelloWorld(){};
        virtual std::string hello_world(std::string name)= 0;
    };
}
#endif //NDKSWING_IHELLOWORLD_H
