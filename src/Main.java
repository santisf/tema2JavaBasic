import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un precio \nRecuerde que los decimales van despues de una coma");
        try{
            double precio= scanner.nextDouble();
            System.out.println("El precio con IVA es: "+getPriceIVA(precio));
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{
            System.out.println("Cierre de recursos");

        }


    }


    static double getPriceIVA(double precio) {

        return precio*21/100+precio;

    }
}
