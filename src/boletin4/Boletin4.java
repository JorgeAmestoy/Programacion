
package boletin4;


public class Boletin4 {

   
    public static void main(String[] args) {

        Libros obxLib1 = new Libros("IT", "Stephen King", 1968, (short) 892);
        //por defecto es int y quiero short asi que lo casteo
        obxLib1.mostrar();

    }

}
