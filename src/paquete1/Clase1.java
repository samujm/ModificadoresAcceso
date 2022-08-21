package paquete1;
/*---------------------------------------------------------------------------- PUBLIC --------------------------------------------------------------------------------------------*/

/*Modificador de acceso PUBLIC*/
    /*Aplica a:
        CLASE-SI
        VARIABLE-SI
        MÉTODO-SI
        CONSTRUCTOR-SI
    */

//CLASE: La clase public puede ser utilizada por otra clase ya sea en el mismo paquete o en un paquete externo
//public class Clase1 {
//    //ATRIBUTO: Acceder y modificar su valor sin restriccion
//    public String atributoPublico = "Valor atributo público";
//    
//    //CONSTRUCTOR: Se puede acceder desde otra clase sin restricciones para crear objetos de esta clase
//    public Clase1(){
//        System.out.println("Constructor público");
//    }
//    
//    //METODOS: Se puede mandar llamar desde cualquier clase sin restricciones
//    public void metodoPublico(){
//        System.out.println("Metodo público");
//    }
//
//}

/*------------------------------------------------------------------------------- PROTECTED -----------------------------------------------------------------------------------------*/

/*Modificador de acceso PROTECTED*/
    /*Aplica a:
        CLASE-NO
        VARIABLE-SI
        MÉTODO-SI
        CONSTRUCTOR-SI
    */

public class Clase1 {
    //ATRIBUTO: Acceder desde las clases padres e hijas y dentro del mismo paquete
    protected String atributoProtected = "Valor atributo protected";
    
    //CONSTRUCTOR: 
    protected Clase1(){
        System.out.println("Constructor protected");
    }
    public Clase1(String arg){
        System.out.println("Constructor publico");
    }
    
    //METODOS: 
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }

}