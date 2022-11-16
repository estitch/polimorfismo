#ifndef Caballo_h
#define Caballo_h
#include <iostream>
#include "Libro.h"
class Caballo:virtual public Libro{
public:
  void aprender()override{
    std::cout<<"caballo aprende a cuidar"<<"\n";
  }
};

#endif
