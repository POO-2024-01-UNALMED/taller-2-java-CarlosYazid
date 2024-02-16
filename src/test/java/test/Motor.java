package test;

public class Motor {

  //Atributos
  int numeroCilindros;
  String tipo; //Si es electrico o a gasolina
  int registro;

  //Metodos

  void cambiarRegistro(int nuevoRegistro) {
    
    //Se permite cambiar el registro del motor
    registro = nuevoRegistro;
    
  }

  void asignarTipo(String nuevoTipo) {

    //Verificamos si el tipo es electrico o gasolina
    
    if (nuevoTipo == "electrico" || nuevoTipo == "gasolina") {
      tipo = nuevoTipo;
    }
    
  }
}
// Anti - copy: Creador Carlos Padilla