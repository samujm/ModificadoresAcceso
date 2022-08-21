package paquete1;
//import paquete1.Clase1;

public class ClaseHija extends Clase1{
    public ClaseHija(){
        /*SUPER:Acceder al constructor protegido de la clase padre, aunque está en otro paquete*/
        //super();
        //this.atributoPrivado = "Modificación atributo privado";
        //System.out.println("atributoDefault = " + atributoPrivado);
        //this.metodoPrivado();
        super("Publico");
    }
}