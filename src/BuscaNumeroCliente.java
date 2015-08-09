
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;

public class BuscaNumeroCliente extends FENAL {

    private int busqueda, respuesta, k;
    private boolean encontrado;

    void BuscaNumero() throws IOException {
        do {
            encontrado = false;
            try {

                acceso = new RandomAccessFile("CLIENTE.txt", "rw");
                acceso.seek(0);
                busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de cliente a buscar:"));
                
                k = 1;
                
                for (int i = 0; i < acceso.length(); i++) {
                    
                    noCliente = acceso.readInt();
                    posInicial = (int)acceso.getFilePointer();
                    nombreCliente = acceso.readUTF();
                    acceso.seek(posInicial+50);
                    posInicial = (int)acceso.getFilePointer();
                    procedencia = acceso.readUTF();
                    acceso.seek(posInicial+50);
                    posInicial = (int)acceso.getFilePointer();
                    correo = acceso.readUTF();
                    acceso.seek(posInicial+50);
                    celular = acceso.readInt();
                    
                    i = (int)acceso.getFilePointer();

                    if (noCliente == busqueda) {
                        encontrado = true;
                    JOptionPane.showMessageDialog(null, "Cliente encontrado\n\n"
                                + "Número de cliente: " + noCliente + "\n"
                                + "Nombre del cliente: " + nombreCliente + "\n"
                                + "Ciudad de procedencia: " + procedencia + "\n"
                                + "Correo electrónico: " + correo + "\n"
                                + "Número telefónico: " + celular);

                    }
                }
            } catch (HeadlessException | NumberFormatException | IOException e) {
            }
            if (encontrado == false) {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente.");
            }
            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea buscar otro cliente?", "", JOptionPane.YES_NO_OPTION);

            acceso.close();

        } while (respuesta != JOptionPane.NO_OPTION);
    }
}
