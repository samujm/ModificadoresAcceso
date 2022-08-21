package test;

import paquete1.Clase1;
import paquete2.ClaseHija;

public class TestModificadoresAcceso {

    public static void main(String[] args) {

        /*---------------------------------------------------------------------------- PUBLIC --------------------------------------------------------------------------------------------*/
//        Clase1 clase1 = new Clase1();
//        System.out.println("clase1 = " + clase1);
//        System.out.println("clase1 = " + clase1.atributoPublico);
//        clase1.metodoPublico();


        /*---------------------------------------------------------------------------- PROTECTED --------------------------------------------------------------------------------------------*/
        //No se puede acceder a nada por que es protegido, tiene que ser una subclase publica
        //No se heredan constructores pero si se puede mandar a llamar super para mandar a llamar un costructor desde una clase hija
        //Clase1 clase1 = new Clase1("Publico");
//        System.out.println("clase1 = " + clase1.atributoProtected);
//        clase1.metodoProtected();
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);

    }
}
