#ifndef Pastor_h
#define Pastor_h
#include <iostream>
#include "Libro.h"
#include "Perro.h"

class Pastor:virtual public Libro, public Perro{
public:
  void aprender()override{
    std::cout<<"Pastor aprende a cuidar"<<"\n";
  }  
  void cuidar()override{
    std::cout<<"Pastor cuidando"<<"\n";
  }
};
#endif
