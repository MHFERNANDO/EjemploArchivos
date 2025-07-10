package ec.edu.ups.poo;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main (String args[]){
        File raiz = new File("D:\\CP\\Universidad\\POO\\CarritoDeCompras");
        File [] elementos = raiz.listFiles();

        for(File elemento: elementos){
            System.out.println(elemento.getAbsolutePath());
            File [] subElementos = elemento.listFiles();


            try {
                for (File subElemento : subElementos){
                    System.out.println("--" + subElemento.getName());
                }
            } catch (NullPointerException e){
                System.err.println("No contiene archivos ");
            }

        }

        //Crear archivo

        try {
            File ruta = new File("D:\\CP\\Universidad\\POO\\Ejemplos");
            if (ruta.exists() == false) {
                ruta.mkdir();
            }
            File archivo = new File("hola.txt");
            archivo.createNewFile();
        }catch (IOException ex) {
            System.err.println("Error de lectura/escritura ");
        }

        try{
            String ruta="c:/carpeta1/archivoTexto.txt";
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            escritura.append("Hola mundo"+’\n’);
            escritura.close();
            archivoEscritura.close();
        } catch(FileNotFoundException e1){
            System.out.println("Ruta de archivo no encontrada");
        } catch(IOException e2) {
            System.out.println("Error de escritura");
        } catch(Exception e3) {
            System.out.println("Error General");
        }
    }

    }

}
