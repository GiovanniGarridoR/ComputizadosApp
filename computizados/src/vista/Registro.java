/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.Controladorusuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Usuario;

/**
 *
 * @author giool
 */
public class Registro extends javax.swing.JFrame {
fondopanel fondo= new fondopanel();
private ImageIcon imagen;
private Icon icono;
    /**
     * Creates new form Registro
     */
    public Registro() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(this);
        //declarar la foto
        this.imagenicono(this.lbl_loginicono, "src/vista/iconopnglogin.png");
        btn_guardarusuario.setEnabled(false);
    }

    public void validar()
    {
          if(txt_nombre_usureg.getText().isEmpty())
       {
           lbl_camponombre.setText("*campo requerido*");
       }else{
              lbl_camponombre.setText("");
          }
          
          if(txt_contraseñareg.getText().isEmpty())
          {
              lbl_campocontraseña.setText("*campo requerido*");
          }
          else{
              lbl_campocontraseña.setText("");
          }
          
          if(txt_nombre_usureg.getText().isEmpty() || txt_contraseñareg.getText().isEmpty())
          {
              btn_guardarusuario.setEnabled(false);
          }else{
              btn_guardarusuario.setEnabled(true);
          }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_tituloregistro = new javax.swing.JLabel();
        lbl_nombre_usuario = new javax.swing.JLabel();
        lbl_contraseñareg = new javax.swing.JLabel();
        txt_nombre_usureg = new javax.swing.JTextField();
        lbl_loginicono = new javax.swing.JLabel();
        btn_guardarusuario = new javax.swing.JButton();
        txt_contraseñareg = new javax.swing.JPasswordField();
        btn_volverreg = new javax.swing.JButton();
        lbl_textoinformatico = new javax.swing.JLabel();
        lbl_camponombre = new javax.swing.JLabel();
        lbl_campocontraseña = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_tituloregistro.setBackground(new java.awt.Color(255, 255, 255));
        lbl_tituloregistro.setFont(new java.awt.Font("Gabriola", 3, 48)); // NOI18N
        lbl_tituloregistro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloregistro.setText("Registro Usuario");
        lbl_tituloregistro.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lbl_nombre_usuario.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre_usuario.setText("Nombre:");

        lbl_contraseñareg.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        lbl_contraseñareg.setForeground(new java.awt.Color(255, 255, 255));
        lbl_contraseñareg.setText("Contraseña:");

        txt_nombre_usureg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombre_usuregActionPerformed(evt);
            }
        });

        btn_guardarusuario.setText("Guardar Usuario");
        btn_guardarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarusuarioActionPerformed(evt);
            }
        });

        txt_contraseñareg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseñaregActionPerformed(evt);
            }
        });

        btn_volverreg.setText("Volver");
        btn_volverreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverregActionPerformed(evt);
            }
        });

        lbl_textoinformatico.setFont(new java.awt.Font("Leelawadee", 3, 14)); // NOI18N
        lbl_textoinformatico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_textoinformatico.setText("Estas en la ventana de registro, Procura no equivocarte.");

        lbl_camponombre.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_camponombre.setForeground(new java.awt.Color(102, 255, 255));

        lbl_campocontraseña.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        lbl_campocontraseña.setForeground(new java.awt.Color(51, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_tituloregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 242, Short.MAX_VALUE)
                        .addComponent(btn_volverreg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_textoinformatico, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addComponent(txt_nombre_usureg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_nombre_usuario)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_contraseñareg)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_contraseñareg, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_campocontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_loginicono, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(btn_guardarusuario)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_volverreg)
                    .addComponent(lbl_tituloregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103)
                .addComponent(lbl_textoinformatico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(lbl_nombre_usuario)
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_contraseñareg)
                                    .addComponent(txt_contraseñareg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_campocontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_loginicono, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addComponent(btn_guardarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre_usureg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_camponombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_usuregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombre_usuregActionPerformed
        validar();
    }//GEN-LAST:event_txt_nombre_usuregActionPerformed

    private void btn_guardarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarusuarioActionPerformed

      //Obtenemos la informacion que ingreso el usuario en la vista
      String username = txt_nombre_usureg.getText();
        if(txt_nombre_usureg.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese un nombre de usuario", "validacion",ERROR );
        }else{
            JOptionPane.showMessageDialog(this, "correcto", "validacion",ICONIFIED);
            
        }
        String contraseña = txt_contraseñareg.getText();
          if(txt_contraseñareg.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese una contraseña", "validacion",ERROR );
        }else{
            JOptionPane.showMessageDialog(this, "correcto", "validacion",ICONIFIED);
        }
        //Instanciar un usuario y le pasamos los atibutos que ingreso el usuario en la vista
        Usuario userNuevo = new Usuario(1, username, contraseña);
        
        //instanciar el controlador
        Controladorusuario cu = new Controladorusuario();
        
        cu.agregarUsuario(userNuevo);
        JOptionPane.showMessageDialog(this,"Usuario "+username+ " y contraseña registrado");
        
        Login log = new Login();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_guardarusuarioActionPerformed

    private void btn_volverregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverregActionPerformed
       Menu menureg = new Menu();
       menureg.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btn_volverregActionPerformed

    private void txt_contraseñaregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseñaregActionPerformed
       validar();
    }//GEN-LAST:event_txt_contraseñaregActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
     private void imagenicono(JLabel lbl, String ruta)
{
    this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(
                this.imagen.getImage().getScaledInstance(
                        lbl.getWidth(),
                        lbl.getHeight(),
                        Image.SCALE_DEFAULT)
        );
        lbl.setIcon(this.icono);
        this.repaint();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardarusuario;
    private javax.swing.JButton btn_volverreg;
    private javax.swing.JLabel lbl_campocontraseña;
    private javax.swing.JLabel lbl_camponombre;
    private javax.swing.JLabel lbl_contraseñareg;
    private javax.swing.JLabel lbl_loginicono;
    private javax.swing.JLabel lbl_nombre_usuario;
    private javax.swing.JLabel lbl_textoinformatico;
    private javax.swing.JLabel lbl_tituloregistro;
    private javax.swing.JPasswordField txt_contraseñareg;
    private javax.swing.JTextField txt_nombre_usureg;
    // End of variables declaration//GEN-END:variables


class fondopanel extends JPanel
    {
        private Image fondoimagen;
        
        @Override
        public void paint(Graphics g)
        {
            fondoimagen = new ImageIcon(getClass().getResource("/imagen/fondoregistro.jpg")).getImage();
            
            g.drawImage(fondoimagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
