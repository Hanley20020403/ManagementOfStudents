package student;



import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAP
 */
public class MainApp extends javax.swing.JFrame {

    public static ArrayList<Student> studentList;
    private static User user; 
    
    /**
     * Creates new form MainApp
     */
    public MainApp() {
        initComponents();
        readUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("the Management of Students' Infomation");
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        lblUsername.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblUsername.setText("username:");

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPassword.setText("password:");

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("The Management of Students' Information");

        btnLogin.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnLogin.setText("Sign in");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panMainLayout = new javax.swing.GroupLayout(panMain);
        panMain.setLayout(panMainLayout);
        panMainLayout.setHorizontalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsername)
                            .addComponent(lblPassword))
                        .addGap(30, 30, 30)
                        .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)))
                    .addGroup(panMainLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panMainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(224, 224, 224))
        );
        panMainLayout.setVerticalGroup(
            panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMainLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(38, 38, 38)
                .addGroup(panMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnLogin)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        if (txtUsername.getText().trim().equals(user.getUsername()) && new String(txtPassword.getPassword()).equals(user.getPassword())) 
        {
            //if log in correctly, load Manager panel
            this.remove(panMain);
            JPanel panel = new JPanel();
            this.setLayout(new BorderLayout());
            this.add(panel);
            Manager  manager = new Manager();
            panel.add(manager);
            panel.repaint();
            panel.revalidate();
            this.add(panel);
            this.setSize(900, 600);
            this.repaint();
            this.getContentPane().repaint();

            
            //load students' information ,and store them into the arraylist studentList
            studentList = new ArrayList<Student>();
            readStudentInfo(studentList);
            
           //fill in the student table, and display 
            manager.setStudentTable(studentList);
         }
        else 
        {
            //if log in uncorrectly
            JOptionPane.showMessageDialog((Container) evt
                .getSource(), "Error username / password !", "Waring", 2);
        
            return;
        }

      
    }//GEN-LAST:event_btnLoginActionPerformed

 private static void readUser()
 {
     user = new User();
     try {
             FileReader file = new FileReader("user.txt");
             BufferedReader buffer = new BufferedReader(file);
              
             String line = "";
              
             while((line = buffer.readLine()) != null)
             {
                  String[] values = line.split(";");
                 //////////////////////////////// System.out.println(Arrays.toString(values));
                  user.setUsername(values[0]);
                  user.setPassword(values[1]);
                   
             }
     
              buffer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
       
     
 }
    
      public static void readStudentInfo(ArrayList<Student> studentList) {
        
        try {
             FileReader file = new FileReader("student.txt");
             BufferedReader buffer = new BufferedReader(file);
              
             String line = "";
              
             while((line = buffer.readLine()) != null)
             {
                    String[] values = line.split(";");
                    Student stu = new Student();
                    stu.setId(Long.parseLong(values[0]));
                    stu.setName(values[1]);
                    
                    stu.setAge(Integer.parseInt(values[2]));
                    stu.setGender(values[3]);
                    stu.setGrade(Integer.parseInt(values[4]));

                    studentList.add(stu);
                    
                   
             }
     
              buffer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
       

    }
    
    
    
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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel panMain;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}