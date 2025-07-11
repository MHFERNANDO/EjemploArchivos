/**
 * Ejemplo.0
 *Documentacion del Maven, son comentarios de documentacion para eso del html maven
 *
 * @Author Fernando Martinez
 * @since 11 de junio de 2025
 * @Version 1.0.2
 *
 * Tambien hay que documentar los constructores, todos los metodos tambien
 * La primera linea simpre en relacion al codigo
 */

package ec.edu.ups.poo;

import java.io.*;

public class Main {

    public static void main(String args[]) {
        /*File raiz = new File("D:\\CP\\Universidad\\POO\\CarritoDeCompras");
        File[] elementos = raiz.listFiles();

        for (File elemento : elementos) {
            System.out.println(elemento.getAbsolutePath());
            File[] subElementos = elemento.listFiles();


            try {
                for (File subElemento : subElementos) {
                    System.out.println("--" + subElemento.getName());
                }
            } catch (NullPointerException e) {
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
        } catch (IOException ex) {
            System.err.println("Error de lectura/escritura ");
        }

        try {
            String ruta = "c:/carpeta1/archivoTexto.txt";
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            BufferedWriter escritura = new BufferedWriter(archivoEscritura);
            escritura.append("Hola mundo" + "\n");
            escritura.close();
            archivoEscritura.close();
        } catch (FileNotFoundException e1) {
            System.out.println("Ruta de archivo no encontrada");
        } catch (IOException e2) {
            System.out.println("Error de escritura");
        } catch (Exception e3) {
            System.out.println("Error General");
        }*/
        guardarAleatorio();
        mostrarAleatorio();

    }

    public static void guardarAleatorio(){
        try
        {
            String ruta = "C:\\Users\\ferma.LEGION\\OneDrive\\Desktop\\ruta\\archivoRandomico.dat";
            RandomAccessFile archivoEscritura;
            archivoEscritura = new RandomAccessFile(ruta,"rw");
            archivoEscritura.writeInt(80);
            archivoEscritura.writeDouble(100.2);
            archivoEscritura.writeDouble(90.1);
            archivoEscritura.writeInt(80);
            archivoEscritura.close();
        }
        catch(FileNotFoundException e1){
            System.out.println("Ruta de archivos no encontrada");
        }catch(IOException e1){
            System.out.println("Error de escritura");
        }catch(Exception e1){
            System.out.println("Error General");
        }
    }
    public static void mostrarAleatorio(){
        try
        {
            String ruta = "C:\\Users\\ferma.LEGION\\OneDrive\\Desktop\\ruta\\archivoRandomico.dat";
            RandomAccessFile archivoLectura;
            archivoLectura = new RandomAccessFile(ruta, "r");
            archivoLectura.seek(12);
            double r = archivoLectura.readDouble();
            System.out.println(r);
            archivoLectura.close();
        }
        catch (FileNotFoundException e1){
            System.out.println("Ruta de archivo no encontrada");
        }
        catch(IOException e1){
            System.out.println("Error de escritura");
        }catch (Exception e1){
            System.out.println("Error General");
        }
    }

}


