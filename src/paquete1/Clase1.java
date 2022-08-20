package paquete1;

/*Modificador de acceso PUBLIC*/
    /*Aplica a:
        CLASE-SI
        VARIABLE-SI
        MÉTODO-SI
        CONSTRUCTOR-SI
    */

//CLASE: La clase public puede ser utilizada por otra clase ya sea en el mismo paquete o en un paquete externo
public class Clase1 {
    //ATRIBUTO: Acceder y modificar su valor sin restriccion
    public String atributoPublico = "Valor atributo público";
    
    //CONSTRUCTOR: Se puede acceder desde otra clase sin restricciones para crear objetos de esta clase
    public Clase1(){
        System.out.println("Constructor público");
    }
    
    //METODOS: Se puede mandar llamar desde cualquier clase sin restricciones
    public void metodoPublico(){
        System.out.println("Metodo público");
    }
   
}
