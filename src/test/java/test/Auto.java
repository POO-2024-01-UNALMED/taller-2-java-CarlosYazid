package test;
public class Auto { //Clase Auto

  // Atributos
  String modelo;
  int precio;
  Asiento [] asientos;
  String marca;
  Motor motor;
  int registro;
  static int cantidadCreados;

  //Metodos
  int cantidadAsientos() {

    int numAsientos = 0;

    //Si un valor del arreglo no es nulo (no hay asiento), se suma 1 a la variable numAsientos
    
    for (int i = 0; i < asientos.length; i++) {
      if (asientos[i] != null) {
        numAsientos++; 
      }
    }
    return numAsientos;
  }

  String verificarIntegridad() {

  // Primero se verifica que el motor sea original, si efectivamente no lo es, se retorna "El coche no es original, el motor no es el de fabrica"
    
    if (registro == this.motor.registro) {

      //Ahora por cada asiento se verifica que su registro concuerda con el del coche, si concuerdan, se retorna "El coche es 100% original
      
      for (int i = 0; i < asientos.length; i++) {

        if (asientos[i] != null) {

          //En caso contrario retorna "Hay piezas no originales en el coche"

          if (asientos[i].registro != registro) {
            return "Hay piezas no originales en el coche";
          }
          
        }
        
      }
      return "El coche es 100% original";
      
    } else {
      return "El coche no es original, el motor no es el de fabrica";
    }
    
  }
  
}
// Anti - copy: Creador Carlos Padilla