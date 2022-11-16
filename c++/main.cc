#include <iostream>
#include "Libro.h"
#include "Perro.h"
#include "Chiguagua.h"
#include "Pastor.h"
#include "Caballo.h"
int main(){
  //Chiguagua* petLearn = new Chiguagua;
  Libro* libro = new Libro;
  Libro* petLearn = new Chiguagua();
  petLearn->aprender();
  //no permite usar la funcion cuidar, no esta definido en Libro
  //petLearn->cuidar();
  petLearn = new Pastor();
  petLearn->aprender();
  //Perro* petLearn = new Caballo();
}
