/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.tix.login;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Germanchoo
 */
public class LoginUI extends javax.swing.JFrame {

    private int xMouse, yMouse;
    ImageIcon img = new ImageIcon(".\\src\\main\\resources\\com\\tix\\images\\favicon.png");

    /**
     * Creates new form LoginUI
     */
    public LoginUI() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(img.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title_lbl = new javax.swing.JLabel();
        icon_image = new javax.swing.JLabel();
        icon_name = new javax.swing.JLabel();
        logo_name = new javax.swing.JLabel();
        logo_image = new javax.swing.JLabel();
        city_image = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exit_btn = new javax.swing.JPanel();
        exit_txt = new javax.swing.JLabel();
        user_lbl = new javax.swing.JLabel();
        user_separator = new javax.swing.JSeparator();
        user_txt = new javax.swing.JTextField();
        password_lbl = new javax.swing.JLabel();
        password_separator = new javax.swing.JSeparator();
        password_txt = new javax.swing.JPasswordField();
        login_btn = new javax.swing.JPanel();
        login_txt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title_lbl.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title_lbl.setText("INICIAR SESIÓN");
        background.add(title_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, 30));

        icon_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/favicon.png"))); // NOI18N
        background.add(icon_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 40, 30));

        icon_name.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        icon_name.setText("LOGO");
        background.add(icon_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 70, 30));

        logo_name.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logo_name.setForeground(new java.awt.Color(255, 255, 255));
        logo_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_name.setText("NOMBRE DE LA EMPRESA");
        background.add(logo_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 290, 40));

        logo_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/logo.png"))); // NOI18N
        background.add(logo_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, 290, 150));

        city_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        city_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/tix/images/city.png"))); // NOI18N
        background.add(city_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 290, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exit_btn.setBackground(new java.awt.Color(255, 255, 255));

        exit_txt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exit_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit_txt.setText("X");
        exit_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit_txtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exit_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exit_txtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exit_btnLayout = new javax.swing.GroupLayout(exit_btn);
        exit_btn.setLayout(exit_btnLayout);
        exit_btnLayout.setHorizontalGroup(
            exit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        exit_btnLayout.setVerticalGroup(
            exit_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 760, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 40));

        user_lbl.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        user_lbl.setText("USUARIO");
        background.add(user_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 70, -1));

        user_separator.setForeground(new java.awt.Color(0, 0, 0));
        background.add(user_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 390, 10));

        user_txt.setFont(new java.awt.Font("Roboto", 0, 13)); // NOI18N
        user_txt.setForeground(new java.awt.Color(204, 204, 204));
        user_txt.setText("Ingrese su nombre de usuario");
        user_txt.setBorder(null);
        user_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                user_txtMousePressed(evt);
            }
        });
        user_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtActionPerformed(evt);
            }
        });
        background.add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 390, 30));

        password_lbl.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        password_lbl.setText("CONTRASEÑA");
        background.add(password_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 100, -1));

        password_separator.setForeground(new java.awt.Color(0, 0, 0));
        background.add(password_separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 333, 390, 10));

        password_txt.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        password_txt.setForeground(new java.awt.Color(204, 204, 204));
        password_txt.setText("*************");
        password_txt.setBorder(null);
        password_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                password_txtMousePressed(evt);
            }
        });
        background.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 302, 390, 30));

        login_btn.setBackground(new java.awt.Color(0, 134, 190));

        login_txt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        login_txt.setForeground(new java.awt.Color(255, 255, 255));
        login_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        login_txt.setText("ENTRAR");
        login_txt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_txtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_txtMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                login_txtMousePressed(evt);
            }
        });

        javax.swing.GroupLayout login_btnLayout = new javax.swing.GroupLayout(login_btn);
        login_btn.setLayout(login_btnLayout);
        login_btnLayout.setHorizontalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        login_btnLayout.setVerticalGroup(
            login_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_btnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(login_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        background.add(login_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txtActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exit_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exit_txtMouseClicked

    private void exit_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseEntered
        exit_btn.setBackground(Color.red);
        exit_txt.setForeground(Color.white);
    }//GEN-LAST:event_exit_txtMouseEntered

    private void exit_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit_txtMouseExited
        exit_btn.setBackground(Color.white);
        exit_txt.setForeground(Color.black);
    }//GEN-LAST:event_exit_txtMouseExited

    private void login_txtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_txtMouseEntered
        login_btn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_login_txtMouseEntered

    private void login_txtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_txtMouseExited
        login_btn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_login_txtMouseExited

    private void user_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_txtMousePressed
        if (user_txt.getText().equals("Ingrese su nombre de usuario")) {
            user_txt.setText("");
            user_txt.setForeground(Color.black);
        }
        if (String.valueOf(password_txt.getPassword()).isEmpty()) {
            password_txt.setText("*************");
            password_txt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_user_txtMousePressed

    private void login_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_txtMousePressed
        javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: " + user_txt.getText() + "\nContraseña: " + String.valueOf(password_txt.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_login_txtMousePressed

    private void password_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMousePressed
        if (String.valueOf(password_txt.getPassword()).equals("*************")) {
            password_txt.setText("");
            password_txt.setForeground(Color.black);
        }
        if (user_txt.getText().isEmpty()) {
            user_txt.setText("Ingrese su nombre de usuario");
            user_txt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_password_txtMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel city_image;
    private javax.swing.JPanel exit_btn;
    private javax.swing.JLabel exit_txt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icon_image;
    private javax.swing.JLabel icon_name;
    private javax.swing.JPanel login_btn;
    private javax.swing.JLabel login_txt;
    private javax.swing.JLabel logo_image;
    private javax.swing.JLabel logo_name;
    private javax.swing.JLabel password_lbl;
    private javax.swing.JSeparator password_separator;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JLabel title_lbl;
    private javax.swing.JLabel user_lbl;
    private javax.swing.JSeparator user_separator;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables
}
