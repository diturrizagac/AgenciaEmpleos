package vista.Persona;

import entidad.Anuncio;
import entidad.EstudiosRealizados;
import entidad.ExperienciaLaboral;
import entidad.Persona;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import negocio.GestorPrincipal;
import util.Limpiar;
import util.UtilFecha;
import vista.*;

/**
 *
 * @author Diego Iturrizaga
 */
public class JfrmPerfilPersona extends javax.swing.JFrame {

    String dni;
    Persona persona = null;
    EstudiosRealizados estudios = new EstudiosRealizados();
    ExperienciaLaboral expLaboral = new ExperienciaLaboral();

    /**
     * Creates new form JfrmPerfilPersona
     */
    public JfrmPerfilPersona(String dni) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Agencia de Empleos");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo3.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        iniciarComponentes();
        this.dni = dni;

        persona = GestorPrincipal.getGestorUsuarioPersona().buscarPersona(dni);
    }

    public void iniciarComponentes() {
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneVerPubl = new javax.swing.JTabbedPane();
        jPanelPerfil = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabelnacimiento = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelemail = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabeDireccion1 = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jNombrePerfil = new javax.swing.JLabel();
        jPanelexp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jboxCargo3 = new javax.swing.JComboBox();
        jboxRubro3 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jAño = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jAño1 = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jMes = new javax.swing.JSpinner();
        jDia = new javax.swing.JSpinner();
        jDia1 = new javax.swing.JSpinner();
        jMes1 = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jboxUbicacion3 = new javax.swing.JComboBox();
        btnGuardarExpLab = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblMostrarExpLaboral = new javax.swing.JTable();
        jPanelEstudios = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanelInstitucion = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jTextCentrodeestudios = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBoxGrados = new javax.swing.JComboBox();
        jPanelFechas = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jDia2 = new javax.swing.JSpinner();
        jMes2 = new javax.swing.JSpinner();
        jAño2 = new javax.swing.JSpinner();
        jDia3 = new javax.swing.JSpinner();
        jMes3 = new javax.swing.JSpinner();
        jAño3 = new javax.swing.JSpinner();
        jPanelCarrera = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        btnGuardarEstRealiza = new javax.swing.JButton();
        jPanelPublic = new javax.swing.JPanel();
        jboxRubro4 = new javax.swing.JComboBox();
        jboxCargo4 = new javax.swing.JComboBox();
        jboxUbicacion4 = new javax.swing.JComboBox();
        btnBuscarTrabajo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("E-mail:");

        jLabel3.setText("DNI:");

        jLabel9.setText("Sexo:");

        jLabel10.setText("Estado civil:");

        jLabel8.setText("Fecha de Nacimiento");

        jLabelnacimiento.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelnacimientoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 324, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(162, 162, 162)
                    .addComponent(jLabelnacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(15, 15, 15))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jLabelnacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(13, 13, 13)))
        );

        jLabelDireccion.setText("Direccion");

        jLabelemail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelemailAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelDni.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelDniAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabeDireccion1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabeDireccion1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelSexo.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelSexoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelEstado.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelEstadoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabelDireccion))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabeDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelemail, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(287, 287, 287)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelemail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabeDireccion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(17, 17, 17)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jNombrePerfil.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jNombrePerfil.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jNombrePerfilAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanelPerfilLayout = new javax.swing.GroupLayout(jPanelPerfil);
        jPanelPerfil.setLayout(jPanelPerfilLayout);
        jPanelPerfilLayout.setHorizontalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGroup(jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPerfilLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelPerfilLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanelPerfilLayout.setVerticalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jNombrePerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPaneVerPubl.addTab("  Perfil  del postulante", jPanelPerfil);

        jLabel1.setText("No Tengo Experiencia Laboral ");

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel7.setText("*Empresa:");

        jLabel13.setText("Cargo : ");

        jboxCargo3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Cargo", "Analista/Asistente", "Ejecutivo Comercial", "Gerencia", "Jefe / Supervisor", "Practicante", "Tecnicos Operativos", "Formador", "Vendedor", "Otros" }));

        jboxRubro3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Rubro", "Administracion/Servicios Generales", "Auditoria", "Banca", "Comercial", "Comercio Exterior/Aduanas", "Compras/Logistica", "Consultoria", "Contabilidad", "Finanzas", "Hoteleria/Turismo/Restaurantes", "Ingenieria", "Investigacion y Desarrollo", "Legal", "Marketing/Publicidad", "Medios Digitales / Internet", "Recursos Humanos", "Seguridad Salud Ocupacional y Medio Ambiente", "Sistemas", "Ventas", "Otros" }));

        jLabel14.setText("Rubro : ");

        jLabel15.setText("Inicio:");

        jAño.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2014, 1));

        jLabel16.setText("Fin:");

        jAño1.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2014, 1));

        jLabel20.setText("Descripcion : ");

        jMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jDia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jDia1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jMes1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jLabel21.setText("Lugar");

        jboxUbicacion3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ubicacion", "Ate", "Barranco", "Bellavista", "Breña", "Callao", "Carmen de la Legua", "Cercado de Lima", "Chorrillos", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Perla", "La Punta", "La Victoria", "Lince", "Los Olivos", "Magdalena del Mar", "Miraflores", "Pueblo Libre", "Puente Piedra", "Rimac", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martin de Porres", "San Miguel", "Santa Anita", "Santa Rosa", "Santiago de Surco", "Surquillo", "Ventanilla", "Villa El Savador", "Villa María del Triunfo" }));

        btnGuardarExpLab.setText("Guardar Experiencia Laboral");
        btnGuardarExpLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarExpLabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jboxUbicacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxRubro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxCargo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jAño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarExpLab)
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jboxCargo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboxRubro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jboxUbicacion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jDia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jAño1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnGuardarExpLab)
                .addContainerGap())
        );

        jtblMostrarExpLaboral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Cargo", "Rubro", "Ubicación", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtblMostrarExpLaboral);

        javax.swing.GroupLayout jPanelexpLayout = new javax.swing.GroupLayout(jPanelexp);
        jPanelexp.setLayout(jPanelexpLayout);
        jPanelexpLayout.setHorizontalGroup(
            jPanelexpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelexpLayout.createSequentialGroup()
                .addGroup(jPanelexpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelexpLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox1))
                    .addGroup(jPanelexpLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanelexpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanelexpLayout.setVerticalGroup(
            jPanelexpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelexpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelexpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPaneVerPubl.addTab("Experiencia Laboral", jPanelexp);

        jLabel17.setText("No TengoEstudios");

        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        jLabel18.setText("*Nombre de la Institucion:");

        jLabel19.setText("Grado");

        jComboBoxGrados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sellecione un nivel", "Doctorado", "Maestria", "Universitario", "Tecnico", "Secundaria", "Primaria" }));

        javax.swing.GroupLayout jPanelInstitucionLayout = new javax.swing.GroupLayout(jPanelInstitucion);
        jPanelInstitucion.setLayout(jPanelInstitucionLayout);
        jPanelInstitucionLayout.setHorizontalGroup(
            jPanelInstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstitucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(25, 25, 25)
                .addGroup(jPanelInstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCentrodeestudios, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxGrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanelInstitucionLayout.setVerticalGroup(
            jPanelInstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInstitucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextCentrodeestudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInstitucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBoxGrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel25.setText("Inicio:");

        jLabel26.setText("Fin:");

        jDia2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jMes2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jAño2.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2014, 1));

        jDia3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        jMes3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        jAño3.setModel(new javax.swing.SpinnerNumberModel(1950, 1950, 2014, 1));

        javax.swing.GroupLayout jPanelFechasLayout = new javax.swing.GroupLayout(jPanelFechas);
        jPanelFechas.setLayout(jPanelFechasLayout);
        jPanelFechasLayout.setHorizontalGroup(
            jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26))
                .addGap(68, 68, 68)
                .addGroup(jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFechasLayout.createSequentialGroup()
                        .addComponent(jDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jAño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelFechasLayout.createSequentialGroup()
                        .addComponent(jDia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jAño3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanelFechasLayout.setVerticalGroup(
            jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFechasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jAño2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFechasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jAño3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jDia3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel27.setText("Nombre de la Carrera");

        javax.swing.GroupLayout jPanelCarreraLayout = new javax.swing.GroupLayout(jPanelCarrera);
        jPanelCarrera.setLayout(jPanelCarreraLayout);
        jPanelCarreraLayout.setHorizontalGroup(
            jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanelCarreraLayout.setVerticalGroup(
            jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCarreraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCarreraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardarEstRealiza.setText("Guardar Estudios Realizados");
        btnGuardarEstRealiza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarEstRealizaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEstudiosLayout = new javax.swing.GroupLayout(jPanelEstudios);
        jPanelEstudios.setLayout(jPanelEstudiosLayout);
        jPanelEstudiosLayout.setHorizontalGroup(
            jPanelEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstudiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelEstudiosLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jCheckBox2))
                    .addComponent(jPanelInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEstudiosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarEstRealiza)
                .addGap(123, 123, 123))
        );
        jPanelEstudiosLayout.setVerticalGroup(
            jPanelEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEstudiosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEstudiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInstitucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardarEstRealiza)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPaneVerPubl.addTab("Estudios Realizados", jPanelEstudios);

        jPanelPublic.setLayout(null);

        jboxRubro4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Rubro", "Administracion/Servicios Generales", "Auditoria", "Banca", "Comercial", "Comercio Exterior/Aduanas", "Compras/Logistica", "Consultoria", "Contabilidad", "Finanzas", "Hoteleria/Turismo/Restaurantes", "Ingenieria", "Investigacion y Desarrollo", "Legal", "Marketing/Publicidad", "Medios Digitales / Internet", "Recursos Humanos", "Seguridad Salud Ocupacional y Medio Ambiente", "Sistemas", "Ventas", "Otros", " ", " " }));
        jboxRubro4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxRubro4ActionPerformed(evt);
            }
        });
        jPanelPublic.add(jboxRubro4);
        jboxRubro4.setBounds(20, 30, 240, 20);

        jboxCargo4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Cargo", "Analista/Asistente", "Ejecutivo Comercial", "Gerencia", "Jefe / Supervisor", "Practicante", "Tecnicos Operativos", "Formador", "Vendedor", "Otros" }));
        jboxCargo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxCargo4ActionPerformed(evt);
            }
        });
        jPanelPublic.add(jboxCargo4);
        jboxCargo4.setBounds(280, 30, 122, 20);

        jboxUbicacion4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ubicacion", "Ate", "Barranco", "Bellavista", "Breña", "Callao", "Carmen de la Legua", "Cercado de Lima", "Chorrillos", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Perla", "La Punta", "La Victoria", "Lince", "Los Olivos", "Magdalena del Mar", "Miraflores", "Pueblo Libre", "Puente Piedra", "Rimac", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martin de Porres", "San Miguel", "Santa Anita", "Santa Rosa", "Santiago de Surco", "Surquillo", "Ventanilla", "Villa El Savador", "Villa María del Triunfo" }));
        jboxUbicacion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxUbicacion4ActionPerformed(evt);
            }
        });
        jPanelPublic.add(jboxUbicacion4);
        jboxUbicacion4.setBounds(430, 30, 139, 20);

        btnBuscarTrabajo.setText("Buscar");
        btnBuscarTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTrabajoActionPerformed(evt);
            }
        });
        jPanelPublic.add(btnBuscarTrabajo);
        btnBuscarTrabajo.setBounds(600, 30, 80, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Rubro", "Cargo", "PaginaWeb", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanelPublic.add(jScrollPane1);
        jScrollPane1.setBounds(40, 80, 630, 330);

        jTabbedPaneVerPubl.addTab("Buscar Trabajo", jPanelPublic);

        jMenu1.setText("Archivo");

        jSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneVerPubl)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneVerPubl)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarExpLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarExpLabActionPerformed
        expLaboral.setNomEmpresa(jTextField5.getText());
        expLaboral.setRubro(jboxRubro3.getSelectedItem().toString());
        expLaboral.setCargo(jboxCargo3.getSelectedItem().toString());
        expLaboral.setUbicacion(jboxUbicacion3.getSelectedItem().toString());
        expLaboral.setDescripcion(jTextDescripcion.getText());
        expLaboral.setFechaIngreso(UtilFecha.obtenerFecha(jDia.getValue().toString(), jMes.getValue().toString(), jAño.getValue().toString()));
        expLaboral.setFechaSalida(UtilFecha.obtenerFecha(jDia1.getValue().toString(), jMes1.getValue().toString(), jAño1.getValue().toString()));
        if (expLaboral.getNomEmpresa().trim().equals("") == true) {
            JOptionPane.showMessageDialog(this, "La descripcion no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (expLaboral.getRubro().trim().equalsIgnoreCase("") == true) {
            JOptionPane.showMessageDialog(this, "Debe elegir el area", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (expLaboral.getCargo().trim().equalsIgnoreCase("") == true) {
            JOptionPane.showMessageDialog(this, "Elija su puesto", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (expLaboral.getUbicacion().trim().equalsIgnoreCase("") == true) {
            JOptionPane.showMessageDialog(this, "Elija su ubicacion", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (expLaboral.getDescripcion().trim().equals("") == true) {
            JOptionPane.showMessageDialog(this, "", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (expLaboral.getFechaIngreso().toString().trim().equalsIgnoreCase("") == true) {
            JOptionPane.showMessageDialog(this, "Elija fecha de Ingreso a su empresa anterior", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (expLaboral.getFechaSalida().toString().trim().equals("") == true) {
            JOptionPane.showMessageDialog(this, "Elija fecha de Salida a su empresa anterior", "Error", JOptionPane.ERROR_MESSAGE);
        } else {

            GestorPrincipal.getGestorUsuarioPersona().registrarExpLaboral(persona, expLaboral);
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios efectuados?", "Guardar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                boolean estado = GestorPrincipal.getGestorBaseDeDatos().guardarCambios();
            } else if (respuesta == JOptionPane.NO_OPTION) {

            }

            Limpiar L = new Limpiar();
            L.limpiar(jPanel4);
        }
        
        actualizarTabla();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarExpLabActionPerformed

    private void jboxRubro4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxRubro4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxRubro4ActionPerformed

    private void jboxCargo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxCargo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxCargo4ActionPerformed

    private void jboxUbicacion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxUbicacion4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jboxUbicacion4ActionPerformed

    private void btnBuscarTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTrabajoActionPerformed
        ArrayList<Anuncio> A = GestorPrincipal.getGestorUsuarioPersona().buscarTrabajo(jboxRubro4.getSelectedItem().toString(), jboxCargo4.getSelectedItem().toString(), jboxUbicacion4.getSelectedItem().toString());
        ArrayList<Anuncio> B = GestorPrincipal.getGestorUsuarioPersona().buscarTrabajo(jboxRubro4.getSelectedItem().toString(), jboxCargo4.getSelectedItem().toString());
        ArrayList<Anuncio> C = GestorPrincipal.getGestorUsuarioPersona().buscarTrabajo(jboxRubro4.getSelectedItem().toString());
        try{
        if(A.isEmpty() && B.isEmpty() && C.isEmpty()){
            JOptionPane.showMessageDialog(this, "No se encontraron Anuncios", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Anuncio anuncio = null;
            for(int i=0; i<A.size(); i++){
                anuncio = A.get(i);
                jTable1.getModel().setValueAt(anuncio.getEmpresa().getRazonSocial(), i, 0);
                jTable1.getModel().setValueAt(anuncio.getRubro(), i, 1);
                jTable1.getModel().setValueAt(anuncio.getCargo(), i, 2);
                jTable1.getModel().setValueAt(anuncio.getPagWeb(), i, 3);
                jTable1.getModel().setValueAt(anuncio.getDescripcion(), i, 4);
            }        
        }
        }catch(Exception E){
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarTrabajoActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        JfrmPortadaP P = new JfrmPortadaP();
        setVisible(false);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jNombrePerfilAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jNombrePerfilAncestorAdded
        jNombrePerfil.setText(persona.getNombre()+" "+persona.getApPaterno()+" "+persona.getApMaterno());
// TODO add your handling code here:
    }//GEN-LAST:event_jNombrePerfilAncestorAdded

    private void jLabelemailAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelemailAncestorAdded
        jLabelemail.setText(persona.getEmail());
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelemailAncestorAdded

    private void jLabelDniAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelDniAncestorAdded
        jLabelDni.setText(persona.getDni());
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelDniAncestorAdded
    
    private void jLabelSexoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelSexoAncestorAdded
        jLabelSexo.setText(persona.getSexo());
// TODO add your handling code here:
    }//GEN-LAST:event_jLabelSexoAncestorAdded

    private void jLabelEstadoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelEstadoAncestorAdded
        jLabelEstado.setText(persona.getCivil());
// TODO add your handling code here:
    }//GEN-LAST:event_jLabelEstadoAncestorAdded

    private void jLabelnacimientoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelnacimientoAncestorAdded
        jLabelnacimiento.setText(UtilFecha.obtenerDiaDeFecha(persona.getNacimiento())+"/"+
                UtilFecha.obtenerMesDeFecha(persona.getNacimiento())+"/"+
                UtilFecha.obtenerAnioDeFecha(persona.getNacimiento()));
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelnacimientoAncestorAdded

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {
            expLaboral = null;
            jPanel4.setVisible(Boolean.FALSE);
            btnGuardarExpLab.setVisible(Boolean.FALSE);
        }else{
            expLaboral = new ExperienciaLaboral();
            jPanel4.setVisible(Boolean.TRUE);
            btnGuardarExpLab.setVisible(Boolean.TRUE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
         if (jCheckBox2.isSelected()) {
            estudios = null;
            jPanelCarrera.setVisible(false);
            jPanelFechas.setVisible(false);
            jPanelInstitucion.setVisible(false);
            btnGuardarEstRealiza.setVisible(false);
        }else{            
            estudios = new EstudiosRealizados();
            jPanelCarrera.setVisible(true);
            jPanelFechas.setVisible(true);
            jPanelInstitucion.setVisible(true);
            btnGuardarEstRealiza.setVisible(true);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btnGuardarEstRealizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarEstRealizaActionPerformed
        estudios.setCentroEstudios(jTextCentrodeestudios.getText());
        estudios.setGradoInstruccion(jComboBoxGrados.getSelectedItem().toString());
        estudios.setFechaInicio(UtilFecha.obtenerFecha(jDia2.getValue().toString(), jMes2.getValue().toString(), jAño2.getValue().toString()));
        estudios.setFechaFin(UtilFecha.obtenerFecha(jDia3.getValue().toString(), jMes3.getValue().toString(), jAño3.getValue().toString()));
        
        if (estudios.getCentroEstudios().trim().equals("") == true) {
            JOptionPane.showMessageDialog(this, "La descripcion no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (estudios.getGradoInstruccion().trim().equalsIgnoreCase("Sellecione un nivel") == true) {
            JOptionPane.showMessageDialog(this, "Debes elegir un nivel academico", "Error", JOptionPane.ERROR_MESSAGE);
        } else
        
            
        GestorPrincipal.getGestorUsuarioPersona().registrarEstudios(persona, estudios);
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios efectuados?", "Guardar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            boolean estado = GestorPrincipal.getGestorBaseDeDatos().guardarCambios();
        } else if (respuesta == JOptionPane.NO_OPTION) {

        }

        Limpiar L = new Limpiar();
        //L.limpiar(jPanelEstudios);
        L.limpiar(jPanelFechas);
        L.limpiar(jPanelInstitucion);
        L.limpiar(jPanelCarrera);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarEstRealizaActionPerformed

    private void jLabeDireccion1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabeDireccion1AncestorAdded
        // TODO add your handling code here:
        jLabeDireccion1.setText(persona.getDireccion());
    }//GEN-LAST:event_jLabeDireccion1AncestorAdded

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /*ArrayList<Anuncio> A = GestorPrincipal.getGestorUsuarioPersona().buscarTrabajo(jboxRubro4.getSelectedItem().toString(), jboxCargo4.getSelectedItem().toString(), jboxUbicacion4.getSelectedItem().toString());
                
        int fila = jTable1.rowAtPoint(evt.getPoint());
        int colum = jTable1.columnAtPoint(evt.getPoint());
        
        if(fila>=0 && colum==3 && jTable1.isEnabled()){
            System.out.println(fila);
        }*/
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarTrabajo;
    private javax.swing.JButton btnGuardarEstRealiza;
    private javax.swing.JButton btnGuardarExpLab;
    private javax.swing.JSpinner jAño;
    private javax.swing.JSpinner jAño1;
    private javax.swing.JSpinner jAño2;
    private javax.swing.JSpinner jAño3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox jComboBoxGrados;
    private javax.swing.JSpinner jDia;
    private javax.swing.JSpinner jDia1;
    private javax.swing.JSpinner jDia2;
    private javax.swing.JSpinner jDia3;
    private javax.swing.JLabel jLabeDireccion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelemail;
    private javax.swing.JLabel jLabelnacimiento;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSpinner jMes;
    private javax.swing.JSpinner jMes1;
    private javax.swing.JSpinner jMes2;
    private javax.swing.JSpinner jMes3;
    private javax.swing.JLabel jNombrePerfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelCarrera;
    private javax.swing.JPanel jPanelEstudios;
    private javax.swing.JPanel jPanelFechas;
    private javax.swing.JPanel jPanelInstitucion;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelPublic;
    private javax.swing.JPanel jPanelexp;
    public static javax.swing.JMenuItem jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPaneVerPubl;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCentrodeestudios;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox jboxCargo3;
    private javax.swing.JComboBox jboxCargo4;
    private javax.swing.JComboBox jboxRubro3;
    private javax.swing.JComboBox jboxRubro4;
    private javax.swing.JComboBox jboxUbicacion3;
    private javax.swing.JComboBox jboxUbicacion4;
    private javax.swing.JTable jtblMostrarExpLaboral;
    // End of variables declaration//GEN-END:variables
    public void actualizarTabla(){
        ArrayList<ExperienciaLaboral> expeLaboral = GestorPrincipal.getGestorUsuarioPersona().obtenerExpLaboral(persona);
        
        try{
        if(expeLaboral.isEmpty()){
            JOptionPane.showMessageDialog(this, "No se encontraron Trabajos Anteriores", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            ExperienciaLaboral experienciaAux = null;
            for(int i=0; i<expeLaboral.size(); i++){
                experienciaAux = expeLaboral.get(i);
                jtblMostrarExpLaboral.getModel().setValueAt(experienciaAux.getNomEmpresa(), i, 0);
                jtblMostrarExpLaboral.getModel().setValueAt(experienciaAux.getCargo(), i, 1);
                jtblMostrarExpLaboral.getModel().setValueAt(experienciaAux.getRubro(), i, 2);
                jtblMostrarExpLaboral.getModel().setValueAt(experienciaAux.getUbicacion(), i, 3);
                jtblMostrarExpLaboral.getModel().setValueAt(experienciaAux.getDescripcion(), i, 4);
            }  
            
        }
        }catch(Exception E){
            
        } 
    }
}
