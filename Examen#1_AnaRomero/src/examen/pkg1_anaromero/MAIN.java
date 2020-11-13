package examen.pkg1_anaromero;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ana Romero
 */
public class MAIN extends javax.swing.JFrame {

    public MAIN() {
        initComponents();

        //-----------------------------------------------------------------------------------------
        //comboBox opciones de armas
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) CB_ARMA.getModel();
        modelo.addElement(new ARMAS("Hacha", 70));
        modelo.addElement(new ARMAS("Pistola", 90));
        modelo.addElement(new ARMAS("Bate", 40));
        modelo.addElement(new ARMAS("Pala", 35));
        modelo.addElement(new ARMAS("Sierra eléctrica", 100));
        modelo.addElement(new ARMAS("Puños", 25));
        CB_ARMA.setModel(modelo);
        CB_ARMA2.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SEXO = new javax.swing.ButtonGroup();
        ESTADO_VIDA = new javax.swing.ButtonGroup();
        TIPOCAMPISTA = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TF_EDAD = new javax.swing.JFormattedTextField();
        TF_NOMBRE = new javax.swing.JTextField();
        RB_F = new javax.swing.JRadioButton();
        RB_M = new javax.swing.JRadioButton();
        RB_VIVO = new javax.swing.JRadioButton();
        RB_MUERTO = new javax.swing.JRadioButton();
        RB_SUPERVISOR = new javax.swing.JRadioButton();
        RB_CAMPISTA = new javax.swing.JRadioButton();
        CB_ARMA = new javax.swing.JComboBox<>();
        BTN_CREAR = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TF_NOMBRE2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TF_EDAD2 = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        RB_M2 = new javax.swing.JRadioButton();
        RB_F2 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        CB_ARMA2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        BTN_CREAR2 = new javax.swing.JButton();
        TF_SECUESTRADOS = new javax.swing.JFormattedTextField();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        BTN_ELIMINARVIVOS = new javax.swing.JButton();
        BTN_MODIFICARVIVOS = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        BTN_MODIFICARDESA = new javax.swing.JButton();
        BTN_ELIMINARDESA = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTable();
        BTN_MODBOOGIES = new javax.swing.JButton();
        BTN_ELIMINARBOOGIES = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creación de campista:");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Sexo:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Arma:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Tipo:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setText("Estado de vida:");

        TF_EDAD.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        SEXO.add(RB_F);
        RB_F.setText("F");

        SEXO.add(RB_M);
        RB_M.setText("M");

        ESTADO_VIDA.add(RB_VIVO);
        RB_VIVO.setText("vivo");

        ESTADO_VIDA.add(RB_MUERTO);
        RB_MUERTO.setText("desaparecido");

        TIPOCAMPISTA.add(RB_SUPERVISOR);
        RB_SUPERVISOR.setText("Supervisor");

        TIPOCAMPISTA.add(RB_CAMPISTA);
        RB_CAMPISTA.setText("Campista");

        BTN_CREAR.setText("Crear");
        BTN_CREAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CREARMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43)
                        .addComponent(TF_EDAD))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TF_NOMBRE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_ARMA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(RB_M)
                                .addGap(18, 18, 18)
                                .addComponent(RB_F)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)))))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RB_VIVO)
                        .addGap(29, 29, 29)
                        .addComponent(RB_MUERTO))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(RB_SUPERVISOR)
                        .addGap(18, 18, 18)
                        .addComponent(RB_CAMPISTA)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_CREAR)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TF_NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TF_EDAD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(RB_F)
                            .addComponent(RB_M))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CB_ARMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_SUPERVISOR)
                            .addComponent(RB_CAMPISTA))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RB_VIVO)
                            .addComponent(RB_MUERTO))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(BTN_CREAR)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Campista", jPanel2);

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Creación de BoogieWoogies:");
        jLabel8.setOpaque(true);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setText("Edad:");

        TF_EDAD2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##"))));

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel11.setText("Sexo:");

        SEXO.add(RB_M2);
        RB_M2.setText("M");

        SEXO.add(RB_F2);
        RB_F2.setText("F");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel12.setText("Arma:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel13.setText("Personas que desaparecio:");

        BTN_CREAR2.setText("Crear");
        BTN_CREAR2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_CREAR2MouseClicked(evt);
            }
        });

        TF_SECUESTRADOS.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BTN_CREAR2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(43, 43, 43)
                                    .addComponent(TF_EDAD2))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(18, 18, 18)
                                    .addComponent(TF_NOMBRE2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(RB_M2)
                                        .addGap(18, 18, 18)
                                        .addComponent(RB_F2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(CB_ARMA2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TF_SECUESTRADOS))))
                .addGap(206, 206, 206))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(TF_NOMBRE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TF_EDAD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(RB_F2)
                            .addComponent(RB_M2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(26, 26, 26)
                        .addComponent(TF_SECUESTRADOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(CB_ARMA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(BTN_CREAR2)
                .addContainerGap())
        );

        jTabbedPane2.addTab("BoogieWoogie", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Crear personas", jPanel1);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));

        BTN_ELIMINARVIVOS.setText("Eliminar");
        BTN_ELIMINARVIVOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ELIMINARVIVOSMouseClicked(evt);
            }
        });

        BTN_MODIFICARVIVOS.setText("Modificar");
        BTN_MODIFICARVIVOS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_MODIFICARVIVOSMouseClicked(evt);
            }
        });

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Tipo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(t1);

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Campistas Vivos");
        jLabel14.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_MODIFICARVIVOS)
                .addGap(18, 18, 18)
                .addComponent(BTN_ELIMINARVIVOS)
                .addContainerGap())
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_MODIFICARVIVOS)
                    .addComponent(BTN_ELIMINARVIVOS))
                .addGap(12, 12, 12))
        );

        jTabbedPane3.addTab("Campistas vivos", jPanel5);

        jPanel6.setBackground(new java.awt.Color(153, 204, 255));

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Tipo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(t2);

        BTN_MODIFICARDESA.setText("Modificar");
        BTN_MODIFICARDESA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_MODIFICARDESAMouseClicked(evt);
            }
        });

        BTN_ELIMINARDESA.setText("Eliminar");
        BTN_ELIMINARDESA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ELIMINARDESAMouseClicked(evt);
            }
        });
        BTN_ELIMINARDESA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ELIMINARDESAActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Campistas Desaparecidos");
        jLabel15.setOpaque(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(BTN_MODIFICARDESA)
                        .addGap(18, 18, 18)))
                .addComponent(BTN_ELIMINARDESA)
                .addGap(15, 15, 15))
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_ELIMINARDESA)
                    .addComponent(BTN_MODIFICARDESA))
                .addGap(18, 18, 18))
        );

        jTabbedPane3.addTab("Campistas desaparecidos", jPanel6);

        jPanel7.setBackground(new java.awt.Color(102, 0, 0));

        t3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Arma", "Desaparecio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(t3);

        BTN_MODBOOGIES.setText("Modificar");
        BTN_MODBOOGIES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_MODBOOGIESMouseClicked(evt);
            }
        });

        BTN_ELIMINARBOOGIES.setText("Eliminar");
        BTN_ELIMINARBOOGIES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_ELIMINARBOOGIESMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("BoogiesWoogies");
        jLabel16.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTN_MODBOOGIES)
                .addGap(18, 18, 18)
                .addComponent(BTN_ELIMINARBOOGIES)
                .addGap(18, 18, 18))
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_ELIMINARBOOGIES)
                    .addComponent(BTN_MODBOOGIES))
                .addGap(24, 24, 24))
        );

        jTabbedPane3.addTab("BoogieWoogies", jPanel7);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Estadisticas", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_CREARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CREARMouseClicked
        //Para crear una persona campista

        try {
            String nombre, sexo = "", tipo = "", estado = "";
            int edad;
            String armas;

            nombre = TF_NOMBRE.getText();
            edad = Integer.parseInt(TF_EDAD.getText());
            armas = CB_ARMA.getSelectedItem().toString();

            if (RB_F.isSelected()) {
                sexo = "F";
            } else {
                sexo = "M";
            }

            if (RB_SUPERVISOR.isSelected()) {
                tipo = "Supervisor";
            } else {
                tipo = "Campista";
            }

            if (RB_VIVO.isSelected()) {
                estado = "Vivo";
            } else {
                estado = "Desaparecido";
            }

            CAMPISTAS x = new CAMPISTAS(tipo, estado, nombre, sexo, edad, armas);
            
            if (x.getEstado().equals("Vivo")) {
                Object[] newrow = {x.getNombre(), x.getEdad(), x.getTipo(), x.getEstado()};
                DefaultTableModel ta1 = (DefaultTableModel) t1.getModel();
                ta1.addRow(newrow);
                t1.setModel(ta1);
            }else  if (x.getEstado().equals("Desaparecido")) {
                Object[] newrow = {x.getNombre(), x.getEdad(), x.getTipo(), x.getEstado()};
                DefaultTableModel ta2 = (DefaultTableModel) t2.getModel();
                ta2.addRow(newrow);
                t2.setModel(ta2);
            }
            
            campistas.add(x);
            JOptionPane.showMessageDialog(this, "El campista se agrego a la lista! ");
            
            //Limpiar lo escrito
            TF_NOMBRE.setText("");
            TF_EDAD.setText("");
            CB_ARMA.setSelectedIndex(0);
            RB_M.setSelected(true);
            RB_SUPERVISOR.setSelected(true);
            RB_VIVO.setSelected(true);           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Algo salio mal, intente nuevamente!\nVerifique si lleno todos los campos");
        }
    }//GEN-LAST:event_BTN_CREARMouseClicked

    private void BTN_CREAR2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_CREAR2MouseClicked
        //Para crear una persona Boogie Woogie
        
        try{
            String nombre, sexo = "",armas;
            int edad,secuestados;
            

            nombre = TF_NOMBRE2.getText();
            edad = Integer.parseInt(TF_EDAD2.getText());
            armas = CB_ARMA2.getSelectedItem().toString();
            secuestados = Integer.parseInt(TF_SECUESTRADOS.getText());

            if (RB_F2.isSelected()) {
                sexo = "F";
            } else {
                sexo = "M";
            }
            
            BoogieWoogie x = new BoogieWoogie(nombre,sexo,edad,armas,secuestados);
            Object[] newrow = {x.getNombre(), x.getEdad(), x.getARMAS(), x.getSecuestrados()};
            DefaultTableModel ta3 = (DefaultTableModel) t3.getModel();
            ta3.addRow(newrow);
            t3.setModel(ta3);
            secuestradores.add(x);
            JOptionPane.showMessageDialog(this, "El BoogieWoogie se agrego a la lista! ");
            
            //limpia
            TF_NOMBRE2.setText("");
            TF_EDAD2.setText("");
            TF_NOMBRE2.setText("");
            CB_ARMA2.setSelectedIndex(0);
            TF_SECUESTRADOS.setText("");
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Algo salio mal, intente nuevamente!\nVerifique si lleno todos los campos");
        }
    }//GEN-LAST:event_BTN_CREAR2MouseClicked

    private void BTN_ELIMINARVIVOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ELIMINARVIVOSMouseClicked
        if (t1.getSelectedRow() >= 0) {
            DefaultTableModel m = (DefaultTableModel) t1.getModel();
            String nombre = (String)m.getValueAt(t1.getSelectedRow(), 0);
            for (int i = 0; i < campistas.size(); i++) {
                CAMPISTAS c = campistas.get(i);
                if (c.getNombre().equals(nombre)) {
                    campistas.remove(i);
                }
            }
            m.removeRow(t1.getSelectedRow());
            t1.setModel(m);
            JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
        }else if(t1.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Error. La tabla esta vacia");
        }else{
            JOptionPane.showMessageDialog(null, "Error, primero seleccione una fila");
        }
    }//GEN-LAST:event_BTN_ELIMINARVIVOSMouseClicked

    private void BTN_MODIFICARVIVOSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MODIFICARVIVOSMouseClicked
        if (t1.getSelectedRow() >= 0) {
            DefaultTableModel m = (DefaultTableModel) t1.getModel();
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad"));
            String nombre = (String)m.getValueAt(t1.getSelectedRow(), 0);
            for (int i = 0; i < campistas.size(); i++) {
                CAMPISTAS c = campistas.get(i);
                if (c.getNombre().equals(nombre)) {
                    c.setEdad(edad);
                }
            }
            m.setValueAt(edad, t1.getSelectedRow(), 1);
            t1.setModel(m);
            JOptionPane.showMessageDialog(null, "Se modifico exitosamente");
        }else if(t1.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Error. La tabla esta vacia");
        }else{
            JOptionPane.showMessageDialog(null, "Error, primero seleccione una fila");
        }
    }//GEN-LAST:event_BTN_MODIFICARVIVOSMouseClicked

    private void BTN_MODIFICARDESAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MODIFICARDESAMouseClicked
        if (t2.getSelectedRow() >= 0) {
            DefaultTableModel m = (DefaultTableModel) t2.getModel();
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad"));
            String nombre = (String)m.getValueAt(t2.getSelectedRow(), 0);
            for (int i = 0; i < campistas.size(); i++) {
                CAMPISTAS c = campistas.get(i);
                if (c.getNombre().equals(nombre)) {
                    c.setEdad(edad);
                }
            }
            m.setValueAt(edad, t2.getSelectedRow(), 1);
            t1.setModel(m);
            JOptionPane.showMessageDialog(null, "Se modifico exitosamente");
        }else if(t2.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Error. La tabla esta vacia");
        }else{
            JOptionPane.showMessageDialog(null, "Error, primero seleccione una fila");
        }
    }//GEN-LAST:event_BTN_MODIFICARDESAMouseClicked

    private void BTN_ELIMINARDESAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ELIMINARDESAMouseClicked
        if (t2.getSelectedRow() >= 0) {
            DefaultTableModel m = (DefaultTableModel) t2.getModel();
            String nombre = (String)m.getValueAt(t2.getSelectedRow(), 0);
            for (int i = 0; i < campistas.size(); i++) {
                CAMPISTAS c = campistas.get(i);
                if (c.getNombre().equals(nombre)) {
                    campistas.remove(i);
                }
            }
            m.removeRow(t2.getSelectedRow());
            t2.setModel(m);
            JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
        }else if(t2.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Error. La tabla esta vacia");
        }else{
            JOptionPane.showMessageDialog(null, "Error, primero seleccione una fila");
        }
    }//GEN-LAST:event_BTN_ELIMINARDESAMouseClicked

    private void BTN_MODBOOGIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_MODBOOGIESMouseClicked
        if (t3.getSelectedRow() >= 0) {
            DefaultTableModel m = (DefaultTableModel) t3.getModel();
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva edad"));
            String nombre = (String)m.getValueAt(t3.getSelectedRow(), 0);
            for (int i = 0; i < secuestradores.size(); i++) {
                BoogieWoogie c = secuestradores.get(i);
                if (c.getNombre().equals(nombre)) {
                    c.setEdad(edad);
                }
            }
            m.setValueAt(edad, t3.getSelectedRow(), 1);
            t3.setModel(m);
            JOptionPane.showMessageDialog(null, "Se modifico exitosamente");
        }else if(t3.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Error. La tabla esta vacia");
        }else{
            JOptionPane.showMessageDialog(null, "Error, primero seleccione una fila");
        }
    }//GEN-LAST:event_BTN_MODBOOGIESMouseClicked

    private void BTN_ELIMINARBOOGIESMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_ELIMINARBOOGIESMouseClicked
        if (t3.getSelectedRow() >= 0) {
            DefaultTableModel m = (DefaultTableModel) t3.getModel();
            String nombre = (String) m.getValueAt(t3.getSelectedRow(), 0);
            for (int i = 0; i < secuestradores.size(); i++) {
                BoogieWoogie c = secuestradores.get(i);
                if (c.getNombre().equals(nombre)) {
                    secuestradores.remove(i);
                }
            }
            m.removeRow(t3.getSelectedRow());
            t3.setModel(m);
            JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
        }else if(t2.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Error. La tabla esta vacia");
        }else{
            JOptionPane.showMessageDialog(null, "Error, primero seleccione una fila");
        }
    }//GEN-LAST:event_BTN_ELIMINARBOOGIESMouseClicked

    private void BTN_ELIMINARDESAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ELIMINARDESAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN_ELIMINARDESAActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_CREAR;
    private javax.swing.JButton BTN_CREAR2;
    private javax.swing.JButton BTN_ELIMINARBOOGIES;
    private javax.swing.JButton BTN_ELIMINARDESA;
    private javax.swing.JButton BTN_ELIMINARVIVOS;
    private javax.swing.JButton BTN_MODBOOGIES;
    private javax.swing.JButton BTN_MODIFICARDESA;
    private javax.swing.JButton BTN_MODIFICARVIVOS;
    private javax.swing.JComboBox<String> CB_ARMA;
    private javax.swing.JComboBox<String> CB_ARMA2;
    private javax.swing.ButtonGroup ESTADO_VIDA;
    private javax.swing.JRadioButton RB_CAMPISTA;
    private javax.swing.JRadioButton RB_F;
    private javax.swing.JRadioButton RB_F2;
    private javax.swing.JRadioButton RB_M;
    private javax.swing.JRadioButton RB_M2;
    private javax.swing.JRadioButton RB_MUERTO;
    private javax.swing.JRadioButton RB_SUPERVISOR;
    private javax.swing.JRadioButton RB_VIVO;
    private javax.swing.ButtonGroup SEXO;
    private javax.swing.JFormattedTextField TF_EDAD;
    private javax.swing.JFormattedTextField TF_EDAD2;
    private javax.swing.JTextField TF_NOMBRE;
    private javax.swing.JTextField TF_NOMBRE2;
    private javax.swing.JFormattedTextField TF_SECUESTRADOS;
    private javax.swing.ButtonGroup TIPOCAMPISTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    private javax.swing.JTable t3;
    // End of variables declaration//GEN-END:variables
    ArrayList<CAMPISTAS> campistas = new ArrayList();
    ArrayList<BoogieWoogie> secuestradores = new ArrayList();
}
