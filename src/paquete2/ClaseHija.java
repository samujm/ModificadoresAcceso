package paquete2;
import paquete1.Clase1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
        /*Acceder al constructor protegido de la clase padre, aunque está en otro paquete*/
        super();
        this.atributoProtected = "Modificación atributo protected";
        System.out.println("atributoProtected = " + atributoProtected);
        this.metodoProtected();
    }
}
