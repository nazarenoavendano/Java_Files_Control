import java.io.*;
import java.util.Scanner;

public class CreadorDeArchivosTxT {
    public static void main(String[] args) {

        String ruta = "C:\\Users\\nazar\\OneDrive\\Escritorio\\misArchivos\\archivo";
        String mensaje = "Guaymallen de fruta es el caviar!!!";

        System.out.println("Mis manejos de archivos con Java");
        System.out.println("--------------------------------");

        Scanner scUno = new Scanner(System.in);

        System.out.println("Por favor, ingrese la cantidad de archivos que desee crear: ");
        int numArchivos = scUno.nextInt();
        scUno.close();

        for (int i = 1; i <= numArchivos ; i++) {
            try {
                FileWriter writer = new FileWriter(ruta + i + ".txt");
                writer.write(mensaje);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("--------------------------------");
                System.out.println("Malió sal :( ");
                System.out.println("--------------------------------");
            }
        }
        System.out.println("--------------------------------");
        System.out.println("Se crearon los: " + numArchivos + " archivos exitosamente!!!");
        System.out.println("--------------------------------");
    }
}