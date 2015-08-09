
import java.awt.HeadlessException;
import java.io.*;
import javax.swing.*;

public class ModificarRegistro extends FENAL {

    private String respuesta, respuesta1, textoNuevo, busqueda1, respuesta2;
    private int busqueda, i = 0, guardaPocision, valorNuevo, salir, salir1;
    private boolean encontrado = false;
    private float valorNuevo1;

    void ModificaRegistro() {

        try {
            do {
                String menu[] = {"Modificar Clientes", "Modificar Libros"};
                respuesta = (String) JOptionPane.showInputDialog(null, "¿Qué desea modificar?",
                        "Modificación de Atributos",
                        JOptionPane.PLAIN_MESSAGE,
                        new ImageIcon(),
                        menu, menu[0]);

                switch (respuesta) {
                    case "Modificar Clientes":
                        i = 0;
                        acceso = new RandomAccessFile("CLIENTE.txt", "rw");
                        busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de cliente a modificar:"));
                        while (i < acceso.length()) {
                            acceso.seek(i);
                            noCliente = acceso.readInt();
                            if (noCliente == busqueda) {
                                nombreCliente = acceso.readUTF();
                                acceso.seek(i + 54);
                                procedencia = acceso.readUTF();
                                acceso.seek(i + 104);
                                correo = acceso.readUTF();
                                acceso.seek(i + 154);
                                celular = acceso.readInt();
                                JOptionPane.showMessageDialog(null, "Cliente a modificar encontrado\n\n"
                                        + "Número de cliente: " + noCliente + "\n"
                                        + "Nombre del cliente: " + nombreCliente + "\n"
                                        + "Ciudad de procedencia: " + procedencia + "\n"
                                        + "Correo electrónico: " + correo + "\n"
                                        + "Número telefónico: " + celular);
                                encontrado = true;
                                guardaPocision = i;
                            }
                            i += 158;
                        }
                        if (encontrado) {
                            do {
                                String menu1[] = {"Modificar no. cliente", "Modificar nombre del cliente",
                                    "Modificar ciudad de procedencia", "Modificar correo del cliente",
                                    "Modificar número telefónico"};
                                respuesta1 = (String) JOptionPane.showInputDialog(null, "¿Que desea modificar?", "Modificación de Clientes",
                                        JOptionPane.PLAIN_MESSAGE,
                                        new ImageIcon(),
                                        menu1, menu1[0]);
                                switch (respuesta1) {
                                    case "Modificar no. cliente":
                                        acceso.seek(guardaPocision);
                                        valorNuevo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo número de cliente"));
                                        acceso.writeInt(valorNuevo);
                                        break;
                                    case "Modificar nombre del cliente":
                                        acceso.seek(guardaPocision + 4);
                                        textoNuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del cliente");
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar ciudad de procedencia":
                                        acceso.seek(guardaPocision + 54);
                                        textoNuevo = JOptionPane.showInputDialog(null, "Ingrese la nueva ciudad de procedencia del cliente");
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar correo del cliente":
                                        acceso.seek(guardaPocision + 104);
                                        textoNuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo electrónico del cliente");
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar número telefónico":
                                        acceso.seek(guardaPocision + 154);
                                        valorNuevo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo correo electrónico del cliente"));
                                        acceso.writeInt(valorNuevo);
                                        break;
                                }

                                salir = JOptionPane.showConfirmDialog(null, "Atributo modificado con exito,\n\n"
                                        + "¿Desea modificar algo más del Cliente?",
                                        "Fin de la modificación", JOptionPane.YES_NO_OPTION);
                            } while (salir != JOptionPane.NO_OPTION);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el cliente", "Lo sentimos", JOptionPane.WARNING_MESSAGE);
                        }
                        encontrado = false;
                        acceso.close();
                        break;
                    case "Modificar Libros":
                        i = 0;
                        acceso = new RandomAccessFile("LIBRO.txt", "rw");
                        busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el ISBN del libro a modificar:");
                        while (i < acceso.length()) {
                            acceso.seek(i);
                            ISBN = acceso.readUTF();
                            if (ISBN.equals(busqueda1)) {
                                acceso.seek(i + 50);
                                nombreLibro = acceso.readUTF();
                                acceso.seek(i + 100);
                                autor = acceso.readUTF();
                                acceso.seek(i + 150);
                                editorial = acceso.readUTF();
                                acceso.seek(i + 200);
                                genero = acceso.readUTF();
                                acceso.seek(i + 250);
                                costo = acceso.readFloat();
                                JOptionPane.showMessageDialog(null, "Libro a modificar encontrado: \n\n"
                                        + "ISBN: " + ISBN + "\n"
                                        + "Nombre: " + nombreLibro + "\n"
                                        + "Autor: " + autor + "\n"
                                        + "Editorial: " + editorial + "\n"
                                        + "Género: " + genero + "\n"
                                        + "Costo: " + costo);
                                encontrado = true;
                                guardaPocision = i;
                            }
                            i += 254;
                        }
                        if (encontrado) {
                            do {
                                String menu2[] = {"Modificar ISBN",
                                    "Modificar nombre de libro",
                                    "Modificar autor",
                                    "Modificar editorial",
                                    "Modificar género",
                                    "Modificar costo"};
                                respuesta2 = (String) JOptionPane.showInputDialog(null, "¿Que desea modificar?",
                                        "Modificar Registros de Libros",
                                        JOptionPane.PLAIN_MESSAGE,
                                        new ImageIcon(),
                                        menu2, menu2[0]);
                                switch (respuesta2) {
                                    case "Modificar ISBN":
                                        acceso.seek(guardaPocision);
                                        textoNuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo ISBN:");
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar nombre de libro":
                                        acceso.seek(guardaPocision + 50);
                                        textoNuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre del libro:");
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar autor":
                                        acceso.seek(guardaPocision + 100);
                                        textoNuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo autor del libro:");
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar editorial":
                                        acceso.seek(guardaPocision + 150);
                                        textoNuevo = JOptionPane.showInputDialog(null, "Ingrese la nueva editorial del libro:");
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar género":
                                        acceso.seek(guardaPocision + 200);
                                        String generos[] = {"Suspenso", "Terror", "Ficción", "Educación", "Programación", "Otros"};
                                        textoNuevo = (String) JOptionPane.showInputDialog(null, "Ingresa el género", "Géneros", JOptionPane.PLAIN_MESSAGE,
                                                new ImageIcon(), generos, generos[0]);
                                        acceso.writeUTF(textoNuevo);
                                        break;
                                    case "Modificar costo":
                                        acceso.seek(guardaPocision + 250);
                                        valorNuevo1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el nuevo costo del libro"));
                                        acceso.writeFloat(valorNuevo1);
                                        break;
                                }
                                salir = JOptionPane.showConfirmDialog(null, "Atributo modificado con exito,\n\n"
                                        + "¿Desea modificar algo más del Libro?",
                                        "Fin de la modificación", JOptionPane.YES_NO_OPTION);
                            } while (salir != JOptionPane.NO_OPTION);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el libro", "Lo sentimos", JOptionPane.WARNING_MESSAGE);
                        }
                        encontrado = false;
                        acceso.close();
                        break;
                }
                salir1 = JOptionPane.showConfirmDialog(null, "¿Desea modificar otro registro de Clientes o Libros?",
                        "", JOptionPane.YES_NO_OPTION);
            } while (salir1 != JOptionPane.NO_OPTION);
        } catch (HeadlessException | NumberFormatException | IOException e) {

        }
    }
}
