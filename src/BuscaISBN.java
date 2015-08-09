
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.*;

public class BuscaISBN extends FENAL {

    private int respuesta;
    private String busqueda;
    private boolean encontrado;

    void buscaIsbn() throws IOException {
        
        do {
            try { 
                acceso = new RandomAccessFile("LIBRO.txt", "rw");
                if(acceso.length()==0){
                    JOptionPane.showMessageDialog(null, "No hay libros Registrados");
                    respuesta = JOptionPane.NO_OPTION;
                } else {
                encontrado = false;
                busqueda = JOptionPane.showInputDialog(null, "Ingresa el ISBN a buscar");

                for (int i = 0; i < acceso.length(); i++) {
                    posInicial = (int) acceso.getFilePointer();
                    ISBN = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    nombreLibro = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    autor = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    editorial = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    genero = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    costo = acceso.readFloat();

                    i = (int) acceso.getFilePointer();

                    if (ISBN.equals(busqueda)) {
                        encontrado = true;
                        JOptionPane.showMessageDialog(null, "Libro encontrado: \n\n"
                                + "ISBN: " + busqueda + "\n"
                                + "Nombre: " + nombreLibro + "\n"
                                + "Autor: " + autor + "\n"
                                + "Editorial: " + editorial + "\n"
                                + "Género: " + genero + "\n"
                                + "Costo: " + costo);
                        
                    } 

                }
                }
            } catch (HeadlessException | IOException e) {

            }
            if (encontrado == false && respuesta != JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "No se encontró el libro.");
            }
            if(respuesta != JOptionPane.NO_OPTION){
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea intentar de nuevo?", "", JOptionPane.YES_NO_OPTION);
            }
            acceso.close();
        } while (respuesta != JOptionPane.NO_OPTION);
    }
}
