import java.awt.BorderLayout;
import java.io.*;
import javax.swing.DefaultListModel;
import javax.swing.*;

public class NoLibrosEditorial extends JPanel{
    
    protected DefaultListModel modelo = new DefaultListModel();
    protected JList lista = new JList(modelo);
    protected JScrollPane pane = new JScrollPane(lista);
    protected JFrame frame = new JFrame("Cantidad de libros según editorial");
    protected RandomAccessFile acceso;
    protected int l = 150, canEditoriales, repeticion;
    protected String editorial;

    
    void NoLibrosEditorial() throws IOException {
          try {
              
            acceso = new RandomAccessFile("LIBRO.txt","rw");
            if(acceso.length()==0){
                modelo.addElement("\n\n");
                modelo.addElement("                                                     ***No hay libros registrados***");
            }else {
            while(l < acceso.length()) {
                acceso.seek(l);
                canEditoriales++;
                l+=254;
            }
            
              
            String editoriales[] = new String[canEditoriales];
            
            l = 150;
            int j = 0;
            while (l < acceso.length()) {
                    acceso.seek(l);
                    editoriales[j] = acceso.readUTF();
                    l+=254;
                    j++;
            }
            modelo.addElement("                                              *LISTADO DE LIBROS POR EDITORIAL*");
            modelo.addElement("\n");
              for (String editoriale : editoriales) {
                for (String editoriale1 : editoriales) {
                    if (editoriale.equals(editoriale1)) {
                        repeticion++;
                    }
                }
                  if (!modelo.contains("Nombre de Editorial: " + editoriale + ", Cantidad de Libros: " + repeticion)) {
                      modelo.addElement("Nombre de Editorial: " + editoriale + ", Cantidad de Libros: " + repeticion);
                  }
                  repeticion = 0;
              }
            
            add(pane, BorderLayout.NORTH);
            }
        } catch (Exception e) {
            
        }
          acceso.close();
    }
    void muestraEditoriales(){
        frame.setContentPane(pane);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
