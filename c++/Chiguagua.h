#ifndef Chiguagua_h
#define Chiguagua_h
#include <iostream>
#include "Libro.h"
class Chiguagua:virtual public Libro{
public:
  void aprender(){
    std::cout<<"Chiguagua aprende a cuidar";
  }

};
#endif
