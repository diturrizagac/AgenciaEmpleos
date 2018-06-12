package vista.Empresa;

import entidad.Anuncio;
import entidad.Empresa;
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
import vista.*;

/**
 *
 * @author Diego Iturrizaga
 */
public class JfrmPerfilEmpresa extends javax.swing.JFrame {

    String ruc;
    Empresa empresa = null;

    
    
    public JfrmPerfilEmpresa(String ruc) {
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
        this.ruc = ruc;
        empresa = GestorPrincipal.getGestorUsuarioEmpresa().buscarEmpresa(ruc);
        
        
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
        jLabeDireccion = new javax.swing.JLabel();
        jLabelDireccion1 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelRuc = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelfono = new javax.swing.JLabel();
        JlabelRazonSocial = new javax.swing.JLabel();
        jPanelBuscarPerfil = new javax.swing.JPanel();
        jboxRubro1 = new javax.swing.JComboBox();
        jboxCargo1 = new javax.swing.JComboBox();
        jboxUbicacion1 = new javax.swing.JComboBox();
        btnBuscarPerfil = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblBuscarPerfil = new javax.swing.JTable();
        jPanelPublicarAnuncios = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jboxUbicacion2 = new javax.swing.JComboBox();
        jboxCargo2 = new javax.swing.JComboBox();
        jboxRubro2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        JPublicarAnuncio = new javax.swing.JButton();
        jLabel1razonbuscar = new javax.swing.JLabel();
        jPanelVerAnuncios = new javax.swing.JPanel();
        jButtonMostrarAnuncios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAnuncios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("E-mail:");

        jLabel3.setText("Ruc");

        jLabeDireccion.setText("Direccion");

        jLabelDireccion1.setText("Telefono");

        jLabelEmail.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelEmailAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelRuc.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelRucAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelDireccion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelDireccionAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabelfono.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabelfonoAncestorAdded(evt);
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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabeDireccion)
                    .addComponent(jLabelDireccion1))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelfono, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelRuc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelfono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        JlabelRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JlabelRazonSocial.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                JlabelRazonSocialAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanelPerfilLayout = new javax.swing.GroupLayout(jPanelPerfil);
        jPanelPerfil.setLayout(jPanelPerfilLayout);
        jPanelPerfilLayout.setHorizontalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(JlabelRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPerfilLayout.setVerticalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlabelRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPaneVerPubl.addTab("  Perfil  De Empresa", jPanelPerfil);

        jPanelBuscarPerfil.setLayout(null);

        jboxRubro1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Rubro", "Administracion/Servicios Generales", "Auditoria", "Banca", "Comercial", "Comercio Exterior/Aduanas", "Compras/Logistica", "Consultoria", "Contabilidad", "Finanzas", "Hoteleria/Turismo/Restaurantes", "Ingenieria", "Investigacion y Desarrollo", "Legal", "Marketing/Publicidad", "Medios Digitales / Internet", "Recursos Humanos", "Seguridad Salud Ocupacional y Medio Ambiente", "Sistemas", "Ventas", "Otros" }));
        jboxRubro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxRubro1ActionPerformed(evt);
            }
        });
        jPanelBuscarPerfil.add(jboxRubro1);
        jboxRubro1.setBounds(20, 30, 251, 20);

        jboxCargo1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Cargo", "Analista/Asistente", "Ejecutivo Comercial", "Gerencia", "Jefe / Supervisor", "Practicante", "Tecnicos Operativos", "Formador", "Vendedor", "Otros" }));
        jboxCargo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxCargo1ActionPerformed(evt);
            }
        });
        jPanelBuscarPerfil.add(jboxCargo1);
        jboxCargo1.setBounds(300, 30, 122, 20);

        jboxUbicacion1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ubicacion", "Ate", "Barranco", "Bellavista", "Breña", "Callao", "Carmen de la Legua", "Cercado de Lima", "Chorrillos", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Perla", "La Punta", "La Victoria", "Lince", "Los Olivos", "Magdalena del Mar", "Miraflores", "Pueblo Libre", "Puente Piedra", "Rimac", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martin de Porres", "San Miguel", "Santa Anita", "Santa Rosa", "Santiago de Surco", "Surquillo", "Ventanilla", "Villa El Savador", "Villa María del Triunfo" }));
        jboxUbicacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jboxUbicacion1ActionPerformed(evt);
            }
        });
        jPanelBuscarPerfil.add(jboxUbicacion1);
        jboxUbicacion1.setBounds(440, 30, 139, 20);

        btnBuscarPerfil.setText("Buscar");
        btnBuscarPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPerfilActionPerformed(evt);
            }
        });
        jPanelBuscarPerfil.add(btnBuscarPerfil);
        btnBuscarPerfil.setBounds(605, 30, 90, 23);

        jtblBuscarPerfil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Ap. Paterno", "Ap. Materno", "E-mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtblBuscarPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblBuscarPerfilMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblBuscarPerfil);

        jPanelBuscarPerfil.add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 650, 330);

        jTabbedPaneVerPubl.addTab("Buscar Perfil", jPanelBuscarPerfil);

        jPanelPublicarAnuncios.setLayout(null);

        jboxUbicacion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ubicacion", "Ate", "Barranco", "Bellavista", "Breña", "Callao", "Carmen de la Legua", "Cercado de Lima", "Cercado de Lima", "Chorrillos", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Perla", "La Punta", "La Victoria", "Lince", "Los Olivos", "Magdalena del Mar", "Miraflores", "Pueblo Libre", "Puente Piedra", "Rimac", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martin de Porres", "San Miguel", "Santa Anita", "Santa Rosa", "Santiago de Surco", "Surquillo", "Ventanilla", "Villa El Savador", "Villa María del Triunfo" }));

        jboxCargo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Cargo", "Analista/Asistente", "Ejecutivo Comercial", "Gerencia", "Jefe / Supervisor", "Practicante", "Tecnicos Operativos", "Formador", "Vendedor", "Otros" }));

        jboxRubro2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Rubro", "Administracion/Servicios Generales", "Auditoria", "Banca", "Comercial", "Comercio Exterior/Aduanas", "Compras/Logistica", "Consultoria", "Contabilidad", "Finanzas", "Hoteleria/Turismo/Restaurantes", "Ingenieria", "Investigacion y Desarrollo", "Legal", "Marketing/Publicidad", "Medios Digitales / Internet", "Recursos Humanos", "Seguridad Salud Ocupacional y Medio Ambiente", "Sistemas", "Ventas", "Otros", " " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jboxRubro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jboxCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jboxUbicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboxUbicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxRubro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelPublicarAnuncios.add(jPanel5);
        jPanel5.setBounds(40, 130, 600, 40);

        jLabel4.setText("Telefono");
        jPanelPublicarAnuncios.add(jLabel4);
        jLabel4.setBounds(50, 220, 60, 14);

        jTextDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescripcionActionPerformed(evt);
            }
        });
        jPanelPublicarAnuncios.add(jTextDescripcion);
        jTextDescripcion.setBounds(190, 60, 400, 60);

        jLabel5.setText("Razon Social:");
        jPanelPublicarAnuncios.add(jLabel5);
        jLabel5.setBounds(60, 30, 80, 14);
        jPanelPublicarAnuncios.add(jTextField2);
        jTextField2.setBounds(150, 220, 140, 20);

        jLabel6.setText("Descripcion:");
        jPanelPublicarAnuncios.add(jLabel6);
        jLabel6.setBounds(60, 60, 100, 14);

        jLabel9.setText(" Web");
        jPanelPublicarAnuncios.add(jLabel9);
        jLabel9.setBounds(50, 190, 60, 14);
        jPanelPublicarAnuncios.add(jTextField10);
        jTextField10.setBounds(150, 190, 450, 20);

        JPublicarAnuncio.setText("Publicar Anuncio");
        JPublicarAnuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPublicarAnuncioActionPerformed(evt);
            }
        });
        jPanelPublicarAnuncios.add(JPublicarAnuncio);
        JPublicarAnuncio.setBounds(450, 280, 140, 23);

        jLabel1razonbuscar.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel1razonbuscarAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanelPublicarAnuncios.add(jLabel1razonbuscar);
        jLabel1razonbuscar.setBounds(190, 20, 390, 30);

        jTabbedPaneVerPubl.addTab("Hacer publicaciones", jPanelPublicarAnuncios);

        jPanelVerAnuncios.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanelVerAnunciosComponentAdded(evt);
            }
        });
        jPanelVerAnuncios.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jPanelVerAnunciosAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanelVerAnuncios.setLayout(null);

        jButtonMostrarAnuncios.setText("Mostrar anuncios");
        jButtonMostrarAnuncios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarAnunciosActionPerformed(evt);
            }
        });
        jPanelVerAnuncios.add(jButtonMostrarAnuncios);
        jButtonMostrarAnuncios.setBounds(30, 10, 130, 23);

        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        jtblAnuncios.setModel(new javax.swing.table.DefaultTableModel(
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
                "Empresa", "Rubro", "Cargo", "PagWeb", "Descripcion"
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
        jtblAnuncios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblVerMasClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblAnuncios);

        jPanelVerAnuncios.add(jScrollPane1);
        jScrollPane1.setBounds(70, 50, 600, 360);

        jTabbedPaneVerPubl.addTab("Ver Anuncios", jPanelVerAnuncios);

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
                .addComponent(jTabbedPaneVerPubl, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVerPubl, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jboxRubro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxRubro1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jboxRubro1ActionPerformed

    private void jboxCargo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxCargo1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jboxCargo1ActionPerformed

    private void jboxUbicacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jboxUbicacion1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jboxUbicacion1ActionPerformed

    private void btnBuscarPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPerfilActionPerformed
        
        ExperienciaLaboral experiencia = new ExperienciaLaboral();
        
        experiencia.setRubro(jboxRubro1.getSelectedItem().toString());
        experiencia.setCargo(jboxCargo1.getSelectedItem().toString());
        experiencia.setUbicacion(jboxUbicacion1.getSelectedItem().toString());
        
        ArrayList<Persona> P = GestorPrincipal.getGestorUsuarioPersona().buscarPerfil(experiencia);
 
        try{
        if(P.isEmpty()){
            JOptionPane.showMessageDialog(this, "Aún no hay Postulantes registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Persona persona;
            
            for(int i=0; i<P.size(); i++){
                persona = P.get(i);
                jtblBuscarPerfil.getModel().setValueAt(persona.getNombre(), i, 0);
                jtblBuscarPerfil.getModel().setValueAt(persona.getApPaterno(), i, 1);
                jtblBuscarPerfil.getModel().setValueAt(persona.getApPaterno(), i, 2);
                jtblBuscarPerfil.getModel().setValueAt(persona.getEmail(), i, 3);                            
            }
        }
        }catch(Exception E){
            
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarPerfilActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        JfrmPortadaP P = new JfrmPortadaP();
        setVisible(false);
    }//GEN-LAST:event_jSalirActionPerformed

    private void JlabelRazonSocialAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_JlabelRazonSocialAncestorAdded
        JlabelRazonSocial.setText(empresa.getRazonSocial());
        // TODO add your handling code here:
    }//GEN-LAST:event_JlabelRazonSocialAncestorAdded

    private void jLabelDireccionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelDireccionAncestorAdded
        jLabelDireccion.setText(empresa.getDireccion());
// TODO add your handling code here:
    }//GEN-LAST:event_jLabelDireccionAncestorAdded

    private void jLabelfonoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelfonoAncestorAdded
        jLabelfono.setText(empresa.getTelefono());
// TODO add your handling code here:
    }//GEN-LAST:event_jLabelfonoAncestorAdded

    private void jLabelRucAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelRucAncestorAdded
        jLabelRuc.setText(empresa.getRuc());
// TODO add your handling code here:
    }//GEN-LAST:event_jLabelRucAncestorAdded

    private void jLabel1razonbuscarAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel1razonbuscarAncestorAdded
        jLabel1razonbuscar.setText(empresa.getRazonSocial());
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1razonbuscarAncestorAdded

    private void JPublicarAnuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPublicarAnuncioActionPerformed
        Anuncio anuncio= new Anuncio();
        
        anuncio.setDescripcion(jTextDescripcion.getText());
        anuncio.setRubro(jboxRubro2.getSelectedItem().toString());
        anuncio.setCargo(jboxCargo2.getSelectedItem().toString());
        anuncio.setLugar(jboxUbicacion2.getSelectedItem().toString());
        anuncio.setEmpresa(empresa);
        anuncio.setPagWeb(jTextField10.getText());
 
        if (anuncio.getDescripcion().trim().equals("") == true) {
            System.out.println("La descripcion no puede estar vacia");
        } else if (anuncio.getRubro().trim().equalsIgnoreCase("Selecione un Area") == true) {
            System.out.println("Debes elegir el area");
        } else if (anuncio.getCargo().trim().equalsIgnoreCase("Selecione Puesto") == true) {
            System.out.println("Elija su puesto");
        } else if (anuncio.getLugar().trim().equalsIgnoreCase("Seleccione Ubicacion") == true) {
            System.out.println("Elija su ubicacion");
        } else if (anuncio.getEmpresa().equals(null) == true) {
            System.out.println("elija su empresa");
        } else {
           
            GestorPrincipal.getGestorUsuarioEmpresa().publicarAnuncio(anuncio, empresa);
            

            
            int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios efectuados?", "Guardar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                boolean estad = GestorPrincipal.getGestorBaseDeDatos().guardarCambios();
                jTextDescripcion.getText();
            } else if (respuesta == JOptionPane.NO_OPTION) {

            }
            Limpiar L = new Limpiar();
            L.limpiar(jPanelPublicarAnuncios);

        }
// TODO add your handling code here:
    }//GEN-LAST:event_JPublicarAnuncioActionPerformed

    private void jPanelVerAnunciosAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanelVerAnunciosAncestorAdded

        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelVerAnunciosAncestorAdded

    private void jPanelVerAnunciosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanelVerAnunciosComponentAdded

    }//GEN-LAST:event_jPanelVerAnunciosComponentAdded

    private void jTextDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescripcionActionPerformed

    private void jButtonMostrarAnunciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarAnunciosActionPerformed
        ArrayList<Anuncio> A= GestorPrincipal.getGestorUsuarioEmpresa().verMisAnuncios(empresa);
        
        try{
        if(A.size() == 0){
            JOptionPane.showMessageDialog(this, "Aún no hay Anuncios registrados.", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            Anuncio anuncio = null;
            for(int i=0; i<A.size(); i++){
                anuncio = A.get(i);
                jtblAnuncios.getModel().setValueAt(empresa.getRazonSocial(), i, 0);
                jtblAnuncios.getModel().setValueAt(anuncio.getRubro(), i, 1);
                jtblAnuncios.getModel().setValueAt(anuncio.getCargo(), i, 2);
                jtblAnuncios.getModel().setValueAt(anuncio.getPagWeb(), i, 3);
                jtblAnuncios.getModel().setValueAt(anuncio.getDescripcion(), i, 4);                            
            }
        }
        }catch(Exception E){
            
        }
//       // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMostrarAnunciosActionPerformed

    private void jtblVerMasClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblVerMasClicked
        ArrayList<Anuncio> A = GestorPrincipal.getGestorUsuarioEmpresa().verMisAnuncios(empresa);
                
        int fila = jtblAnuncios.rowAtPoint(evt.getPoint());
        int colum = jtblAnuncios.columnAtPoint(evt.getPoint());
        
        if(fila>=0 && colum==3 && jtblAnuncios.isEnabled()){
            System.out.println(fila);
        }
    }//GEN-LAST:event_jtblVerMasClicked

    private void jLabelEmailAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabelEmailAncestorAdded
        // TODO add your handling code here:
        jLabelEmail.setText(empresa.getEmail());
    }//GEN-LAST:event_jLabelEmailAncestorAdded

    private void jtblBuscarPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblBuscarPerfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblBuscarPerfilMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JPublicarAnuncio;
    private javax.swing.JLabel JlabelRazonSocial;
    private javax.swing.JButton btnBuscarPerfil;
    private javax.swing.JButton jButtonMostrarAnuncios;
    private javax.swing.JLabel jLabeDireccion;
    private javax.swing.JLabel jLabel1razonbuscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDireccion1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelRuc;
    private javax.swing.JLabel jLabelfono;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBuscarPerfil;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelPublicarAnuncios;
    private javax.swing.JPanel jPanelVerAnuncios;
    public static javax.swing.JMenuItem jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPaneVerPubl;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox jboxCargo1;
    private javax.swing.JComboBox jboxCargo2;
    private javax.swing.JComboBox jboxRubro1;
    private javax.swing.JComboBox jboxRubro2;
    private javax.swing.JComboBox jboxUbicacion1;
    private javax.swing.JComboBox jboxUbicacion2;
    private javax.swing.JTable jtblAnuncios;
    private javax.swing.JTable jtblBuscarPerfil;
    // End of variables declaration//GEN-END:variables
}
