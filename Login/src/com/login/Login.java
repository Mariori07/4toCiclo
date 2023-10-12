package com.login;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    public Login() {
        initComponents();
    }@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        LbMnsj1 = new javax.swing.JLabel();
        LbMnsj2 = new javax.swing.JLabel();
        LbEmail = new javax.swing.JLabel();
        LbContraseña = new javax.swing.JLabel();
        PLogo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        Sp1 = new javax.swing.JSeparator();
        PsContraseña = new javax.swing.JPasswordField();
        Pbtn = new javax.swing.JPanel();
        LbIniciar = new javax.swing.JLabel();
        Sp3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 500));

        Fondo.setBackground(new java.awt.Color(0, 0, 0));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LbMnsj1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        LbMnsj1.setForeground(new java.awt.Color(255, 255, 255));
        LbMnsj1.setText("Bienvenido a Institución Educativa");
        Fondo.add(LbMnsj1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, -1, -1));

        LbMnsj2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LbMnsj2.setForeground(new java.awt.Color(102, 102, 102));
        LbMnsj2.setText("¿Has olvidado tu contraseña?");
        Fondo.add(LbMnsj2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        LbEmail.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LbEmail.setForeground(new java.awt.Color(255, 255, 255));
        LbEmail.setText("Email");
        Fondo.add(LbEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        LbContraseña.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LbContraseña.setForeground(new java.awt.Color(255, 255, 255));
        LbContraseña.setText("Contraseña");
        Fondo.add(LbContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        PLogo.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/Logo.png"))); // NOI18N
        lbLogo.setText("l");

        javax.swing.GroupLayout PLogoLayout = new javax.swing.GroupLayout(PLogo);
        PLogo.setLayout(PLogoLayout);
        PLogoLayout.setHorizontalGroup(
            PLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        );
        PLogoLayout.setVerticalGroup(
            PLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PLogoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(PLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 500));

        txtUsuario.setBackground(new java.awt.Color(0, 0, 0));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        Fondo.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 340, 30));

        Sp1.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.add(Sp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 340, 10));

        PsContraseña.setBackground(new java.awt.Color(0, 0, 0));
        PsContraseña.setForeground(new java.awt.Color(102, 102, 102));
        PsContraseña.setText("**********");
        PsContraseña.setBorder(null);
        PsContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PsContraseñaMousePressed(evt);
            }
        });
        Fondo.add(PsContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 262, 340, 30));

        Pbtn.setBackground(new java.awt.Color(0, 102, 204));
        Pbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LbIniciar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LbIniciar.setForeground(new java.awt.Color(0, 0, 0));
        LbIniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LbIniciar.setText("Iniciar sesión");
        LbIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LbIniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbIniciarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LbIniciarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LbIniciarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PbtnLayout = new javax.swing.GroupLayout(Pbtn);
        Pbtn.setLayout(PbtnLayout);
        PbtnLayout.setHorizontalGroup(
            PbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LbIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
        );
        PbtnLayout.setVerticalGroup(
            PbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbtnLayout.createSequentialGroup()
                .addComponent(LbIniciar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Fondo.add(Pbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 340, 30));

        Sp3.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.add(Sp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 340, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LbIniciarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbIniciarMouseEntered
        LbIniciar.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_LbIniciarMouseEntered

    private void LbIniciarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbIniciarMouseExited
        LbIniciar.setBackground(new Color(0, 102, 204));
    }//GEN-LAST:event_LbIniciarMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario")){
           txtUsuario.setText("");
           txtUsuario.setForeground(Color.WHITE);
        }
        if(String.valueOf(PsContraseña.getPassword()).isEmpty()){
           PsContraseña.setText("**********");
           PsContraseña.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void PsContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PsContraseñaMousePressed
        if(String.valueOf(PsContraseña.getPassword()).equals("**********")){           
           PsContraseña.setText("");
           PsContraseña.setForeground(Color.WHITE);
        }
        if(txtUsuario.getText().isEmpty()){
           txtUsuario.setText("Ingrese su nombre de usuario");
           txtUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_PsContraseñaMousePressed

    private void LbIniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbIniciarMouseClicked
        JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + txtUsuario.getText() +
                                                         "\nContraseña: " + String.valueOf(PsContraseña.getPassword()));
    }//GEN-LAST:event_LbIniciarMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel LbContraseña;
    private javax.swing.JLabel LbEmail;
    private javax.swing.JLabel LbIniciar;
    private javax.swing.JLabel LbMnsj1;
    private javax.swing.JLabel LbMnsj2;
    private javax.swing.JPanel PLogo;
    private javax.swing.JPanel Pbtn;
    private javax.swing.JPasswordField PsContraseña;
    private javax.swing.JSeparator Sp1;
    private javax.swing.JSeparator Sp3;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
