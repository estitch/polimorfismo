#ifndef Chiguagua_h
#define Chiguagua_h
#include <iostream>
#include "Libro.h"
#include "Perro.h"
class Chiguagua:virtual public Libro, public Perro{
public:
  void aprender()override{
    std::cout<<"Chiguagua aprende a cuidar"<<"\n";
  }
  void cuidar()override{
    std::cout<<"Cuidar la casa"<<"\n";
  }
};
#endif
