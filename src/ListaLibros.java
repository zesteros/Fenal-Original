
import java.awt.*;
import java.io.*;
import java.util.Arrays;
import javax.swing.*;

public class ListaLibros extends JPanel {

    protected DefaultListModel modelo = new DefaultListModel();
    protected JList lista = new JList(modelo);
    protected JScrollPane pane = new JScrollPane(lista);
    protected JFrame frame = new JFrame("Listado de Libros");
    protected RandomAccessFile acceso;
    protected int posInicial;
    protected String ISBN, nombreLibro, autor, editorial, genero;
    protected float costo;

    public ListaLibros() throws IOException {

        try {
            acceso = new RandomAccessFile("LIBRO.txt", "rw");
            acceso.seek(0);
            if(acceso.length()==0){
                modelo.addElement("\n\n");
                modelo.addElement("                                                     ***No hay libros registrados***");
            }else {
            int k = 0;
                int i = 0;
                int r = (int) (acceso.length() / 254);

                String[] registro = new String[6];
                String[] registroCompleto = new String[r];

                while (i < acceso.length()) {
                    posInicial = (int) acceso.getFilePointer();
                    registro[0] = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    registro[1] = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    registro[2] = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    registro[3] = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    posInicial = (int) acceso.getFilePointer();
                    registro[4] = acceso.readUTF();
                    acceso.seek(posInicial);
                    acceso.seek(acceso.getFilePointer() + 50);
                    registro[5] = String.valueOf(acceso.readFloat());
                    registroCompleto[k] = Arrays.toString(registro);
                    i = (int) acceso.getFilePointer();
                    k++;
                }
                modelo.addElement(Arrays.toString(registroCompleto));
            pane.setAlignmentX(CENTER_ALIGNMENT);
            add(pane, BorderLayout.NORTH);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        acceso.close();
    }

    void muestraListado() {

        frame.setContentPane(pane);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

}
