packge test;

public class Asiento { //Clase Asiento

  //Atributos
  String color;
  int precio;
  int registro;

  //Metodos
  void cambiaColor(String nuevoColor) {

    //Verificamos que el color que se quiere cambiar este en los disponibles
    
    if (color == "amarillo" || color == "rojo" || color == "negro" || color == "blanco" || color == "verde") {
      color = nuevoColor;
    }
    
  }
}
//Anti - copy: Creador Carlos Padilla