
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.*;

public class AñadeRegistro extends FENAL {

    void escribeCliente() throws FileNotFoundException, IOException {
        do {
            error = false;
            try {
                noCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de cliente"));
                nombreCliente = JOptionPane.showInputDialog(null, "Ingresa el nombre del cliente");
                procedencia = JOptionPane.showInputDialog(null, "Ingresa la ciudad de procedencia del cliente");
                correo = JOptionPane.showInputDialog(null, "Ingresa el correo electrónico del cliente");
                celular = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el teléfono celular del cliente"));
                

                acceso = new RandomAccessFile("CLIENTE.txt", "rw");

                posInicioRegistro = (int) acceso.length();
                acceso.seek(posInicioRegistro);

                acceso.writeInt(noCliente);

                posInicial = (int) acceso.getFilePointer();
                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicial);
                acceso.writeUTF(nombreCliente);
                acceso.seek(posFinal);

                posInicial = (int) acceso.getFilePointer();
                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicial);
                acceso.writeUTF(procedencia);
                acceso.seek(posFinal);

                posInicial = (int) acceso.getFilePointer();
                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicial);
                acceso.writeUTF(correo);
                acceso.seek(posFinal);

                acceso.writeInt(celular);

                JOptionPane.showMessageDialog(null, "Registro añadido satisfactoriamente");
                error = false;
            } catch (HeadlessException | NumberFormatException | IOException e) {
                
                JOptionPane.showMessageDialog(null, "Ocurrió una excepción, introduzca de nuevo los datos.");
                error = true;
                
            }
            acceso.close();
            
        } while (error != false);
    }

    void escribeLibro() throws FileNotFoundException, IOException {
        do {
            error = false;
            try {
                ISBN = JOptionPane.showInputDialog(null, "Ingresa el ISBN");
                nombreLibro = JOptionPane.showInputDialog(null, "Ingresa el nombre del libro");
                autor = JOptionPane.showInputDialog(null, "Ingresa el autor");
                editorial = JOptionPane.showInputDialog(null, "Ingresa la editorial");
                String generos[] = {"Suspenso","Terror","Ficción","Educación","Programación","Otros"};
                genero = (String) JOptionPane.showInputDialog(null, "Ingresa el género","Géneros",JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon(),generos,generos[0]);
                costo = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingresa el costo"));
                
                acceso = new RandomAccessFile("LIBRO.txt", "rw");
                posInicioRegistro = (int) acceso.length();
                acceso.seek(posInicioRegistro);

                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicioRegistro);
                acceso.writeUTF(ISBN);
                acceso.seek(posFinal);

                posInicial = (int) acceso.getFilePointer();
                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicial);
                acceso.writeUTF(nombreLibro);
                acceso.seek(posFinal);

                posInicial = (int) acceso.getFilePointer();
                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicial);
                acceso.writeUTF(autor);
                acceso.seek(posFinal);

                posInicial = (int) acceso.getFilePointer();
                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicial);
                acceso.writeUTF(editorial);
                acceso.seek(posFinal);

                posInicial = (int) acceso.getFilePointer();
                for (int i = 0; i < 50; i++) {
                    acceso.writeByte(0);
                }
                posFinal = (int) acceso.getFilePointer();
                acceso.seek(posInicial);
                acceso.writeUTF(genero);
                acceso.seek(posFinal);

                acceso.writeFloat(costo);

                JOptionPane.showMessageDialog(null, "Registro añadido satisfactoriamente");
                error = false;
            } catch (HeadlessException | NumberFormatException | IOException e) {
                
                JOptionPane.showMessageDialog(null, "Ocurrió una excepción, introduzca de nuevo los datos.");
                error = true;
                
            }
            
            acceso.close();
        } while (error != false);
    }

}
