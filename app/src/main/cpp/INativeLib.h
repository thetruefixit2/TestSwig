//
// Created by dbelevtsev on 16.03.2018.
//

#ifndef TESTSWIG_INATIVE_H
#define TESTSWIG_INATIVE_H

#include <string>
namespace SJ {
    class IMan {
    public:

        virtual ~IMan() {};

        virtual std::string Hello(const std::string name)=0;

    };
}

#endif //TESTSWIG_INATIVE_H
