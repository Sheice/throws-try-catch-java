import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            String[] aNombres= new String[6];
            FileInputStream archivo = new FileInputStream("/asdasd");

            System.out.println(archivo);

            System.out.println(aNombres[9]);

            division(1, 0);



        } catch (ArithmeticException e){
            System.out.println("No se pudo dividir");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se puede acceder al índice del array");
        } catch (FileNotFoundException e){
            System.out.println("Fichero no encontrado");
        }
    }

    public static int division(int num1, int num2) throws ArithmeticException{
        return num1 / num2;
    }


}
