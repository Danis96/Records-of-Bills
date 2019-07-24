package bills;


import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class BillsR extends javax.swing.JFrame {

    Racuni r;
    public Session session = HibernateUtil.getSessionFactory().openSession();
    public Transaction tx = null;
    boolean state = true;

    public BillsR() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SBill = new javax.swing.JFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSVI = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        SDate = new javax.swing.JFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        podatumu = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textSVI2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        SPay = new javax.swing.JFrame();
        jPanel8 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        selectp = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        SAmount = new javax.swing.JFrame();
        jPanel9 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        textareaamunt = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        panelEnter = new javax.swing.JPanel();
        iznosracunaU = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        racuni = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        platio = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        datumU = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        panelSearch = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        panelMail = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        recipient = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        subject = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        messageText = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        SBill.setBounds(new java.awt.Rectangle(350, 100, 730, 500));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBounds(new java.awt.Rectangle(350, 100, 730, 447));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/find.png"))); // NOI18N
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Select the Bill");
        jPanel5.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        comboBox.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elektricna energija", "Vodovod i kanalizacija", "KJKP Rad", "BH-Telecom", "SarajevoGas", "Sarajevostan" }));
        jPanel5.add(comboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        textSVI.setColumns(20);
        textSVI.setRows(5);
        jScrollPane1.setViewportView(textSVI);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 710, 260));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton2.setText("Search all");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 150, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 150, 50));

        javax.swing.GroupLayout SBillLayout = new javax.swing.GroupLayout(SBill.getContentPane());
        SBill.getContentPane().setLayout(SBillLayout);
        SBillLayout.setHorizontalGroup(
            SBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        SBillLayout.setVerticalGroup(
            SBillLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        SDate.setBounds(new java.awt.Rectangle(350, 100, 730, 500));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/find.png"))); // NOI18N
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 0, 0));
        jLabel40.setText("Enter the Date");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        podatumu.setColumns(10);
        jPanel7.add(podatumu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, -1));

        textSVI2.setColumns(20);
        textSVI2.setRows(5);
        jScrollPane2.setViewportView(textSVI2);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 700, 280));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 440, 150, 50));

        javax.swing.GroupLayout SDateLayout = new javax.swing.GroupLayout(SDate.getContentPane());
        SDate.getContentPane().setLayout(SDateLayout);
        SDateLayout.setHorizontalGroup(
            SDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SDateLayout.setVerticalGroup(
            SDateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        SPay.setBounds(new java.awt.Rectangle(350, 100, 730, 500));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/find.png"))); // NOI18N
        jPanel8.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 0, 0));
        jLabel42.setText("Choose person");
        jPanel8.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton5.setText("Search");
        jButton5.setMaximumSize(new java.awt.Dimension(77, 35));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 160, 50));

        selectp.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        selectp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danis Preldzic", "Mirha Sarihodzic" }));
        jPanel8.add(selectp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, -1));

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane3.setViewportView(textarea);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 144, 710, 270));

        javax.swing.GroupLayout SPayLayout = new javax.swing.GroupLayout(SPay.getContentPane());
        SPay.getContentPane().setLayout(SPayLayout);
        SPayLayout.setHorizontalGroup(
            SPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        SPayLayout.setVerticalGroup(
            SPayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        SAmount.setBounds(new java.awt.Rectangle(350, 100, 730, 510));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/find.png"))); // NOI18N
        jPanel9.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jLabel45.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 0, 0));
        jLabel45.setText("Enter amount");
        jPanel9.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jPanel9.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        amount.setColumns(8);
        jPanel9.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, 30));

        textareaamunt.setColumns(20);
        textareaamunt.setRows(5);
        jScrollPane4.setViewportView(textareaamunt);

        jPanel9.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 710, 270));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 120, 50));

        javax.swing.GroupLayout SAmountLayout = new javax.swing.GroupLayout(SAmount.getContentPane());
        SAmount.getContentPane().setLayout(SAmountLayout);
        SAmountLayout.setHorizontalGroup(
            SAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        SAmountLayout.setVerticalGroup(
            SAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setSize(new java.awt.Dimension(809, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill-4.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/payment-method-3.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 70, 60));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Enter Bill");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptySq.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptySq.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptySq.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptySq.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptySq.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 80));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill-5.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 70, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-address.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Home Bills");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/emptySq.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        panelEnter.setBackground(new java.awt.Color(255, 255, 255));
        panelEnter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iznosracunaU.setColumns(6);
        iznosracunaU.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        panelEnter.add(iznosracunaU, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Iznos racuna:");
        panelEnter.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("KM");
        panelEnter.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Racun:");
        panelEnter.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        racuni.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        racuni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elektricna energija", "Vodovod i kanalizacija", "KJKP Rad", "BH-Telecom", "SarajevoGas", "Sarajevostan" }));
        panelEnter.add(racuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jButton1.setText("Unesi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelEnter.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 406, 190, 40));

        platio.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        platio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Danis Preldzic", "Mirha Sarihodzic" }));
        panelEnter.add(platio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Platio:");
        panelEnter.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        datumU.setColumns(6);
        datumU.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        panelEnter.add(datumU, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Datum:");
        panelEnter.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        panelEnter.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 122, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(106, 6));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        panelEnter.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(106, 6));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        panelEnter.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 252, -1, -1));

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(106, 6));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        panelEnter.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, -1, -1));

        jPanel1.add(panelEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 600, 530));

        panelSearch.setBackground(new java.awt.Color(255, 255, 255));
        panelSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search-2.png"))); // NOI18N
        panelSearch.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 31, -1, -1));

        jLabel21.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Search by the Amount");
        panelSearch.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        panelSearch.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 200, 68));
        panelSearch.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 40, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        panelSearch.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, -1, 68));

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Search by the Bill");
        panelSearch.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archive.png"))); // NOI18N
        panelSearch.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 40, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26MouseClicked(evt);
            }
        });
        panelSearch.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, 68));

        jLabel27.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Search by the Date");
        panelSearch.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/calendar.png"))); // NOI18N
        panelSearch.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 40, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notes.png"))); // NOI18N
        panelSearch.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lineBlue.png"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        panelSearch.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, 68));

        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("Search by the Payer");
        panelSearch.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/target.png"))); // NOI18N
        panelSearch.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jPanel1.add(panelSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 590, 530));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail-2.png"))); // NOI18N
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, -1));

        jLabel47.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(0, 0, 0));
        jLabel47.setText("to:");
        jPanel11.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        recipient.setColumns(12);
        jPanel11.add(recipient, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel48.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(0, 0, 0));
        jLabel48.setText("Subject:");
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        subject.setColumns(12);
        jPanel11.add(subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel49.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(0, 0, 0));
        jLabel49.setText("Message:");
        jPanel11.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        messageText.setColumns(20);
        messageText.setRows(5);
        jScrollPane5.setViewportView(messageText);

        jPanel11.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 284, 178));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton7.setText("Send Bill Reports");
        jPanel11.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jButton8.setText("Send");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, -1, -1));

        javax.swing.GroupLayout panelMailLayout = new javax.swing.GroupLayout(panelMail);
        panelMail.setLayout(panelMailLayout);
        panelMailLayout.setHorizontalGroup(
            panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMailLayout.setVerticalGroup(
            panelMailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(panelMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 580, 530));

        jLabel33.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Search  ");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Send Bill");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        panelEnter.show();
        panelSearch.hide();
        panelMail.hide();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        panelEnter.hide();
        panelSearch.show();
        panelMail.hide();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Thread t = new Thread() {

            @Override
            public void run() {

                if (state == true) {

//                  racun
                    String imer = (String) racuni.getSelectedItem();

//                  datum
                    String dat = datumU.getText();

//                  iznos
                    String iznos = iznosracunaU.getText();
                    float izn = Integer.parseInt(iznos);

//                  payer
                    String pay = (String) platio.getSelectedItem();

                    r = new Racuni(imer, izn, dat, pay);

                    try {

                        tx = session.beginTransaction();

                        session.persist(r);

                        tx.commit();

                        JOptionPane.showMessageDialog(null, "Enter was succesfull");

                    } catch (HibernateException e) {
                        if (tx != null) {
                            tx.rollback();
                        }

                    } finally {
//                        HibernateUtil.close();
                    }

                }

            }

        };
        t.start();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        SBill.show();
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseClicked
        SDate.show();
    }//GEN-LAST:event_jLabel26MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//       select all

        Thread t1 = new Thread() {

            @Override
            public void run() {

                if (state == true) {

                    String hql = "from Racuni rac";

                    Query query = session.createQuery(hql);

                    List<Racuni> rac = null;

                    try {

                        tx = session.beginTransaction();

                        rac = query.list();

                        tx.commit();

                    } catch (HibernateException ex) {

                        if (tx != null) {
                            tx.rollback();
                        }

                    } finally {
//                        HibernateUtil.close();
                    }

                    StringBuilder sb = new StringBuilder();

                    for (Racuni rac1 : rac) {

                        sb.append(rac1.getRacuniId());
                        sb.append(".  ");
                        sb.append(rac1.getRacIme());
                        sb.append("  ");
                        sb.append(rac1.getRacDatum());
                        sb.append("  ");
                        sb.append(rac1.getRacIznos());
                        sb.append("  ");
                        sb.append("KM  ");
                        sb.append(rac1.getRacPlatio());
                        sb.append("\n");

                    }

                    textSVI.setText(sb.toString());

                }

            };

        };
        t1.start();


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
//      po datumu

            Thread t3 = new Thread()
            {
                
                @Override
                public void run()
                {
                    
                    if(state == true)
                    {
                        
                        String dat = podatumu.getText();
                        
                        String hql = "from Racuni rac where rac.racDatum '" + dat + "'";
                        Query query = session.createQuery(hql);
                        
                        List<Racuni> rac = null;
                        
                        try {
                            
                            tx = session.beginTransaction();
                            
                            rac = query.list();
                            
                            tx.commit();
                            
                        } 
                        catch(HibernateException e)
                        {
                            if(tx != null)
                            {
                                tx.rollback();
                            }
                            
                        } 
                        finally {
                            
                        }
                        
                        StringBuilder sb = new StringBuilder();

                    for (Racuni rac1 : rac) {

                        sb.append(rac1.getRacuniId());
                        sb.append(".  ");
                        sb.append(rac1.getRacIme());
                        sb.append("  ");
                        sb.append(rac1.getRacDatum());
                        sb.append("  ");
                        sb.append(rac1.getRacIznos());
                        sb.append("  ");
                        sb.append("KM  ");
                        sb.append(rac1.getRacPlatio());
                        sb.append("\n");

                    }
                        textSVI2.setText(sb.toString());
                        
                    }
                    
                };
                
            };
            t3.start();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
//        PO racunu

         Thread t2 = new Thread(){
             
             @Override
             public void run(){
                 
                 if(state==true)
                 {
                     String racun = (String) comboBox.getSelectedItem();
                     
                     String hql = "from Racuni rac where rac.racIme = '" + racun + "'";
                     Query query = session.createQuery(hql);
                     
                     List<Racuni> rac = null;
                     
                     try {
                            tx = session.beginTransaction();
                            
                             rac = query.list();
                             
                             tx.commit();
                     }
                     catch(HibernateException e)
                     {
                         if(tx != null){
                             tx.rollback();
                         }
                         
                     } finally {
                                            
                     }
                     
                     StringBuilder sb = new StringBuilder();

                    for (Racuni rac1 : rac) {

                        sb.append(rac1.getRacuniId());
                        sb.append(".  ");
                        sb.append(rac1.getRacIme());
                        sb.append("  ");
                        sb.append(rac1.getRacDatum());
                        sb.append("  ");
                        sb.append(rac1.getRacIznos());
                        sb.append("  ");
                        sb.append("KM  ");
                        sb.append(rac1.getRacPlatio());
                        sb.append("\n");

                    }

                    textSVI.setText(sb.toString());
                     
                 }
                 
                 
             };
             
         };
         t2.start();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
//        po payeru
        Thread t3 = new Thread()
        {
            @Override
            public void run()
            {
                if(state == true)
                {
                    String payer = (String) selectp.getSelectedItem();
                    
                    String hql = "from Racuni rac where rac.racPlatio = '" + payer + "'";
                    Query query = session.createQuery(hql);
                    
                    List<Racuni> rac = null;
                    
                    try 
                    {
                        tx = session.beginTransaction();
                        
                        rac = query.list();
                        
                        tx.commit();
                        
                    }
                    catch(HibernateException e)
                    {
                        if(tx!=null)
                        {
                           tx.rollback();
                        }
                            
                    } 
                    finally 
                    {
                        
                    }
                    
                    StringBuilder sb = new StringBuilder();
                    
                    for(Racuni rac1 : rac) {

                        sb.append(rac1.getRacuniId());
                        sb.append(".  ");
                        sb.append(rac1.getRacIme());
                        sb.append("  ");
                        sb.append(rac1.getRacDatum());
                        sb.append("  ");
                        sb.append(rac1.getRacIznos());
                        sb.append("  ");
                        sb.append("KM  ");
                        sb.append(rac1.getRacPlatio());
                        sb.append("\n");

                    }

                    textarea.setText(sb.toString());
                }
                
            };
            
            
        };
        t3.start();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        SPay.show();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        SAmount.show();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Thread t4 = new Thread()
        {
            
            @Override
            public void run()
            {
               
                if(state == true)
                {
                    String am = amount.getText();
                    float amm = Integer.parseInt(am);
                    
                    String hql = "from Racuni rac where rac.racIznos = '" + amm + "'";
                    Query query = session.createQuery(hql);
                    
                    List<Racuni> rac = null;
                    
                    try 
                    {
                        tx = session.beginTransaction();
                        
                        rac = query.list();
                        
                        tx.commit();
                        
                    }
                    catch(HibernateException e)
                    {
                        if(tx!=null)
                        {
                            tx.rollback();
                        }
                    }
                    finally 
                    {
                        
                    }
                    
                    StringBuilder sb = new StringBuilder();
                    
                    for(Racuni rac1 : rac) {

                        sb.append(rac1.getRacuniId());
                        sb.append(".  ");
                        sb.append(rac1.getRacIme());
                        sb.append("  ");
                        sb.append(rac1.getRacDatum());
                        sb.append("  ");
                        sb.append(rac1.getRacIznos());
                        sb.append("  ");
                        sb.append("KM  ");
                        sb.append(rac1.getRacPlatio());
                        sb.append("\n");

                    }

                    textareaamunt.setText(sb.toString());
             
                }
                
            };
            
        };
        t4.start();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        panelMail.show();
        panelSearch.hide();
        panelEnter.hide();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
//        MAIL SENDING
        
        Thread t5 = new Thread()
        {
            
            @Override
            public void run()
            {
                
                if(state==true)
                {
                    
                    String rec = recipient.getText();
                    String subj= subject.getText();
                    String mess = messageText.getText();
                    
                    
                    Properties props = new Properties();
                    props.setProperty("mail.smtp.host", "smtp.gmail.com");
                    props.setProperty("mail.smtp.socketFactory.port", "465");
                    props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                    props.setProperty("mail.smtp.auth", "true");
                    props.setProperty("mail.smtp.port", "465");
                    
                    Session mailsession = Session.getInstance(props, new Authenticator(){
                        
                    });
                    
                    
                    
                    
                    
                }
                
            };
            
        };
        t5.start();
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(BillsR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillsR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillsR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillsR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillsR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame SAmount;
    private javax.swing.JFrame SBill;
    private javax.swing.JFrame SDate;
    private javax.swing.JFrame SPay;
    private javax.swing.JTextField amount;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField datumU;
    private javax.swing.JTextField iznosracunaU;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea messageText;
    private javax.swing.JPanel panelEnter;
    private javax.swing.JPanel panelMail;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JComboBox<String> platio;
    private javax.swing.JTextField podatumu;
    private javax.swing.JComboBox<String> racuni;
    private javax.swing.JTextField recipient;
    private javax.swing.JComboBox<String> selectp;
    private javax.swing.JTextField subject;
    private javax.swing.JTextArea textSVI;
    private javax.swing.JTextArea textSVI2;
    private javax.swing.JTextArea textarea;
    private javax.swing.JTextArea textareaamunt;
    // End of variables declaration//GEN-END:variables
}
