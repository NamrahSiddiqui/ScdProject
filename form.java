
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hp
 */
public class form extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public form() {
        initComponents();
        this.setSize(600,400);
        ImageIcon i=new ImageIcon(getClass().getResource("img.png"));
        Image img=i.getImage();
        Image s=img.getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon icon=new ImageIcon(s);
        l1.setIcon(icon);
        jLabel6.setText("Athlete");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();
        idtxt = new javax.swing.JTextField();
        fnameTxt = new javax.swing.JTextField();
        lnameTxt = new javax.swing.JTextField();
        desTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 240, 15, 20);

        jLabel2.setText("First Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 82, 20);

        jLabel3.setText("Last Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 110, 80, 20);

        jLabel4.setText("Description:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 170, 85, 20);

        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(30, 290, 210, 29);

        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });
        getContentPane().add(viewBtn);
        viewBtn.setBounds(310, 290, 170, 29);

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });
        getContentPane().add(idtxt);
        idtxt.setBounds(60, 240, 46, 26);
        getContentPane().add(fnameTxt);
        fnameTxt.setBounds(120, 50, 169, 26);
        getContentPane().add(lnameTxt);
        lnameTxt.setBounds(120, 110, 170, 26);

        desTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desTxtActionPerformed(evt);
            }
        });
        getContentPane().add(desTxt);
        desTxt.setBounds(120, 170, 170, 26);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Enter Id to retrieve data from Database");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 220, 340, 20);

        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img.png"))); // NOI18N
        getContentPane().add(l1);
        l1.setBounds(0, 0, 580, 360);

        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(240, 0, 51, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        
        
                  
        String firstname=fnameTxt.getText();
        String lastname=lnameTxt.getText();
       String description=desTxt.getText();

        
        
       MyClient client;
        try {
            client= new MyClient(firstname,lastname,description);
            
        } catch(Exception e )
        {
            System.out.println(e);
        }

        
      fnameTxt.setText("");
      lnameTxt.setText("");
      desTxt.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
         try {
          int id=Integer.parseInt(idtxt.getText());

            MyClient c=new MyClient(id);

            if(c.rs.next())
            {

              fnameTxt.setText(c.rs.getString("firstname"));
                          
                          lnameTxt.setText(c.rs.getString("lastname"));
                          desTxt.setText(c.rs.getString("description"));
             
            }       
        
        } catch (SQLException ex) {
            Logger.getLogger(form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewBtnActionPerformed

    private void desTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desTxtActionPerformed

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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField desTxt;
    private javax.swing.JTextField fnameTxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    private javax.swing.JTextField lnameTxt;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
