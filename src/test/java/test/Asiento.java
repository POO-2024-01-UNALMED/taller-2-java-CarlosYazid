package test;

public class Asiento { //Clase Asiento

  //Atributos
  String color;
  int precio;
  int registro;

  //Metodos
  void cambiarColor(String color) {

    //Verificamos que el color que se quiere cambiar este en los disponibles
    
    if (color == "amarillo" || color == "rojo" || color == "negro" || color == "blanco" || color == "verde") {
      this.color = color;
    }
    
  }
}
//Anti - copy: Creador Carlos Padilla