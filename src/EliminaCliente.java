
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.*;

public class EliminaCliente extends FENAL {

    private int eliminar, busqueda, respuesta, seguro;
    private boolean encontrado;
    private long noClientePos, nombreClientePos, procedenciaPos, correoPos, celularPos;

    void eliminaCliente() throws IOException {
        do {
            encontrado = false;
            try {

                acceso = new RandomAccessFile("CLIENTE.txt", "rw");
                acceso.seek(0);
                busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número de cliente a borrar:"));

                for (int i = 0; i < acceso.length(); i++) {
                    noCliente = acceso.readInt();
                    noClientePos = acceso.getFilePointer();
                    posInicial = (int) acceso.getFilePointer();
                    nombreCliente = acceso.readUTF();
                    nombreClientePos = acceso.getFilePointer();
                    acceso.seek(posInicial + 50);
                    posInicial = (int) acceso.getFilePointer();
                    procedencia = acceso.readUTF();
                    procedenciaPos = acceso.getFilePointer();
                    acceso.seek(posInicial + 50);
                    posInicial = (int) acceso.getFilePointer();
                    correo = acceso.readUTF();
                    correoPos = acceso.getFilePointer();
                    acceso.seek(posInicial + 50);
                    celular = acceso.readInt();
                    celularPos = acceso.getFilePointer();

                    i = (int) acceso.getFilePointer();

                    if (noCliente == busqueda) {

                        JOptionPane.showMessageDialog(null, "Cliente a borrar\n\n"
                                + "Número de cliente: " + noCliente + "\n"
                                + "Nombre del cliente: " + nombreCliente + "\n"
                                + "Ciudad de procedencia: " + procedencia + "\n"
                                + "Correo electrónico: " + correo + "\n"
                                + "Número telefónico: " + celular);

                        seguro = JOptionPane.showConfirmDialog(null, "¿Estas seguro de borrar el registro del cliente con número de cliente " + busqueda + "?", "", JOptionPane.YES_NO_OPTION);

                        if (seguro == JOptionPane.YES_OPTION) {
                            acceso.seek(noClientePos - 4);
                            for (int j = 0; j < 4; j++) {
                                acceso.writeByte(0);
                            }
                            acceso.seek(noClientePos);
                            for (int j = 0; j < nombreClientePos - noClientePos; j++) {
                                acceso.writeByte(0);
                            }
                            acceso.seek(nombreClientePos);
                            for (int j = 0; j < procedenciaPos - nombreClientePos; j++) {
                                acceso.writeByte(0);
                            }
                            acceso.seek(procedenciaPos);
                            for (int j = 0; j < correoPos - procedenciaPos; j++) {
                                acceso.writeByte(0);
                            }
                            acceso.seek(correoPos);
                            for (int j = 0; j < celularPos - correoPos; j++) {
                                acceso.writeByte(0);
                            }

                            JOptionPane.showMessageDialog(null, "Registro de cliente con número de cliente: " + busqueda + "\n"
                                    + "Borrado exitosamente.");
                        }
                        encontrado = true;
                    }
                }
            } catch (HeadlessException | NumberFormatException | IOException e) {

            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "No se encontró el cliente.");
            }

            respuesta = JOptionPane.showConfirmDialog(null, "¿Desea borrar otro cliente?", "", JOptionPane.YES_NO_OPTION);

            acceso.close();

        } while (respuesta != JOptionPane.NO_OPTION);

    }
}
