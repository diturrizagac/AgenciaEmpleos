package vista;

import entidad.Empresa;
import entidad.Persona;
import negocio.GestorPrincipal;
import javax.swing.*;
import vista.Empresa.JfrmPerfilEmpresa;
import vista.Persona.JfrmPerfilPersona;

/**
 *
 * @author Diego Iturrizaga
 */
public class JfrmInicioDeSesion extends javax.swing.JFrame {

    /**
     * Creates new form JfrmInicioDeSesion
     */
    public JfrmInicioDeSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Agencia de Empleos");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/Fondo2.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxfUsuario = new javax.swing.JTextField();
        btnAceptarIS = new javax.swing.JButton();
        btnCancelarIS = new javax.swing.JButton();
        jpsfPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO DE SESIÓN");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario (DNI o RUC) :");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        btnAceptarIS.setText("Aceptar");
        btnAceptarIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarISActionPerformed(evt);
            }
        });

        btnCancelarIS.setText("Cancelar");
        btnCancelarIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarISActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sesionicon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptarIS)
                        .addGap(23, 23, 23)
                        .addComponent(btnCancelarIS))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfUsuario)
                            .addComponent(jpsfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jpsfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarIS)
                    .addComponent(btnCancelarIS))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarISActionPerformed
        JfrmPortadaP P = new JfrmPortadaP();
        setVisible(false);
        // System.exit(0);
    }//GEN-LAST:event_btnCancelarISActionPerformed

    private void btnAceptarISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarISActionPerformed
        /*Obtenemos los datos*/
        String nombreUsuario = jtxfUsuario.getText();
        String password = jpsfPassword.getText();

        /*Creamos la instancia*/
        try {
            if (nombreUsuario.length() > 8) {
                Empresa empresa = new Empresa();
                empresa.setRuc(nombreUsuario);
                empresa.setPassword(password);
                /*Usamos el "GestorUsuario" para validar los datos*/

                Empresa E = GestorPrincipal.getGestorUsuarioEmpresa().validarEmpresa(nombreUsuario);
                
                if (E !=null) {
                    JfrmPerfilEmpresa perfilE = new JfrmPerfilEmpresa(E.getRuc());
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario y contraseña no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception E) {
            System.out.println("Error");
        }

        try {
            if (nombreUsuario.length() <= 8) {
                Persona persona = new Persona();
                persona.setDni(nombreUsuario);
                persona.setPassword(password);
                /*Usamos el "GestorUsuario" para validar los datos*/
                boolean estado = GestorPrincipal.getGestorUsuarioPersona().iniciarSesion(persona);
                if (estado == true) {
                    Persona A = GestorPrincipal.getGestorUsuarioPersona().validarPersona(nombreUsuario);
                    JfrmPerfilPersona jpanPerfilPersona = new JfrmPerfilPersona(A.getDni());
                    setVisible(false);
                
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario y contraseña no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }


        /*Usamos el "GestorUsuario" para validar los datos*/

    }//GEN-LAST:event_btnAceptarISActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarIS;
    private javax.swing.JButton btnCancelarIS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jpsfPassword;
    public static javax.swing.JTextField jtxfUsuario;
    // End of variables declaration//GEN-END:variables
}
