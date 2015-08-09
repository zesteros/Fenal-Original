
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PruebaFENAL extends javax.swing.JFrame {

    public PruebaFENAL() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton6 = new javax.swing.JRadioButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        añadeRegistro = new javax.swing.JButton();
        buscaCliente = new javax.swing.JButton();
        buscaISBN = new javax.swing.JButton();
        eliminaCliente = new javax.swing.JButton();
        listaLibros = new javax.swing.JButton();
        librosEditorial = new javax.swing.JButton();
        modificaAtributos = new javax.swing.JButton();

        jRadioButton6.setText("jRadioButton6");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA DE REGISTRO - FENAL");
        setBackground(new java.awt.Color(51, 102, 255));

        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18)); // NOI18N
        jLabel1.setText("Bienvenido al sistema de registro de la FENAL");

        jLabel2.setFont(new java.awt.Font("BankGothic Lt BT", 0, 18)); // NOI18N
        jLabel2.setText("Por favor, seleccione una opción:");

        añadeRegistro.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        añadeRegistro.setText("AÑADE REGISTRO");
        añadeRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadeRegistroActionPerformed(evt);
            }
        });

        buscaCliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        buscaCliente.setText("BUSCAR INFORMACIÓN POR NÚMERO DE CLIENTE");
        buscaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaClienteActionPerformed(evt);
            }
        });

        buscaISBN.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        buscaISBN.setText("BUSCAR LIBRO POR ISBN");
        buscaISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscaISBNActionPerformed(evt);
            }
        });

        eliminaCliente.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        eliminaCliente.setText("ELIMINAR UN CLIENTE");
        eliminaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminaClienteActionPerformed(evt);
            }
        });

        listaLibros.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        listaLibros.setText("LISTADO DE TODOS LOS LIBROS");
        listaLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaLibrosActionPerformed(evt);
            }
        });

        librosEditorial.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        librosEditorial.setText("LISTADO DE CANT. DE LIBROS POR EDITORIAL");
        librosEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librosEditorialActionPerformed(evt);
            }
        });

        modificaAtributos.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        modificaAtributos.setText("MODIFICAR REGISTRO");
        modificaAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificaAtributosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(modificaAtributos, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(añadeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(buscaCliente)
                                    .addComponent(buscaISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eliminaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(listaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(librosEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(añadeRegistro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscaISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listaLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(librosEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificaAtributos)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadeRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadeRegistroActionPerformed
        try {
        String decision2;
        AñadeRegistro areg = new AñadeRegistro();
        String menu[] = {"Añadir un cliente","Añadir un libro"};
        
        decision2 = (String) JOptionPane.showInputDialog(null, "¿Qué desea hacer?"
                ,"Ingreso de Registro",JOptionPane.PLAIN_MESSAGE,new ImageIcon(),
                menu,menu[0]);
        
        switch (decision2) {
            case "Añadir un cliente": {
                
                    areg.escribeCliente();
                
            }
            break;
            case "Añadir un libro": {
                
                    areg.escribeLibro();
                
            }
            break;
        }
        }catch (HeadlessException | IOException e){
            Logger.getLogger(PruebaFENAL.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_añadeRegistroActionPerformed

    private void buscaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaClienteActionPerformed
        BuscaNumeroCliente bnc = new BuscaNumeroCliente();
        try {
            bnc.BuscaNumero();
        } catch (IOException ex) {
            Logger.getLogger(PruebaFENAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscaClienteActionPerformed

    private void buscaISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaISBNActionPerformed
        BuscaISBN bisbn = new BuscaISBN();
        try {
            bisbn.buscaIsbn();
        } catch (IOException ex) {
            Logger.getLogger(PruebaFENAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscaISBNActionPerformed

    private void eliminaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminaClienteActionPerformed
        EliminaCliente ecli = new EliminaCliente();
        try {
            ecli.eliminaCliente();
        } catch (IOException ex) {
            Logger.getLogger(PruebaFENAL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eliminaClienteActionPerformed

    private void listaLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaLibrosActionPerformed
        ListaLibros lb = null;
        try {
            lb = new ListaLibros();
        } catch (IOException ex) {
            Logger.getLogger(PruebaFENAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        lb.muestraListado();        // TODO add your handling code here:
    }//GEN-LAST:event_listaLibrosActionPerformed

    private void librosEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librosEditorialActionPerformed
        NoLibrosEditorial nole = new NoLibrosEditorial();
        try {
            nole.NoLibrosEditorial();
        } catch (IOException ex) {
            Logger.getLogger(PruebaFENAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        nole.muestraEditoriales();
    }//GEN-LAST:event_librosEditorialActionPerformed

    private void modificaAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificaAtributosActionPerformed
        ModificarRegistro modre = new ModificarRegistro();
        modre.ModificaRegistro();
    }//GEN-LAST:event_modificaAtributosActionPerformed

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new PruebaFENAL().setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadeRegistro;
    private javax.swing.JButton buscaCliente;
    private javax.swing.JButton buscaISBN;
    private javax.swing.JButton eliminaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton librosEditorial;
    private javax.swing.JButton listaLibros;
    private javax.swing.JButton modificaAtributos;
    // End of variables declaration//GEN-END:variables
}
