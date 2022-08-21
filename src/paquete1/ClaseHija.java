package paquete1;
//import paquete1.Clase1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
        /*Acceder al constructor protegido de la clase padre, aunque está en otro paquete*/
        super();
        this.atributoDefault = "Modificación atributo Default";
        System.out.println("atributoDefault = " + atributoDefault);
        this.metodoDefault();
    }
}