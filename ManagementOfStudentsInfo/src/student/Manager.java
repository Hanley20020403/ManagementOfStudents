package student;






import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import static student.MainApp.studentList;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAP
 */
public class Manager extends javax.swing.JPanel {


   
   


   
    /**
     * Creates new form Manager
     */
    public Manager() {
        initComponents();
        
        
        //make table uneditable
        DefaultTableModel model = new DefaultTableModel(
                new Object[][]{
            
               },
                new String[] {
                 "id", "name", "age", "gender", "grade"
                })
        {
             @Override                                   
                public boolean isCellEditable(int row, int column)
                {
                    return false;
                }
        };
        
        tabStudent.setModel(model);
       

        
         
        for(int i =0; i< tabStudent.getColumnCount(); i++)
        {
            TableColumn column=tabStudent.getColumnModel().getColumn(i);
            DefaultTableCellRenderer render = new DefaultTableCellRenderer();
            render.setHorizontalAlignment(SwingConstants.CENTER);
            column.setCellRenderer(render);
        }
  
        
         CardLayout card = (CardLayout)layPaneManager.getLayout();
         card.show(layPaneManager, "panQuery");
    

         
         
    }
         

    
  
    
    public void setStudentTable(ArrayList<Student> stusList) {
   
        DefaultTableModel tm = (DefaultTableModel) tabStudent.getModel();
        //removeall
        int count = tabStudent.getRowCount();
        while(count>0){
            tm.removeRow(count-1);
            count = tabStudent.getRowCount();
        }
        
        for( int i = 0; i < stusList.size(); i++)
        {
                Vector v = new Vector();
                
                v.add(stusList.get(i).getId());
                v.add(stusList.get(i).getName());
                v.add(stusList.get(i).getAge());
                v.add(stusList.get(i).getGender());
                v.add(stusList.get(i).getGrade());
                tm.addRow(v);
                 
        }
        
        lblQueryResult.setText(String.valueOf(stusList.size()));
    }


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpGender = new javax.swing.ButtonGroup();
        layPaneManager = new javax.swing.JLayeredPane();
        panQuery = new javax.swing.JPanel();
        panQueryArea = new javax.swing.JPanel();
        lblQueryId = new javax.swing.JLabel();
        txtQueryName = new javax.swing.JTextField();
        txtQueryId = new javax.swing.JTextField();
        lblQueryName = new javax.swing.JLabel();
        btnQuery = new javax.swing.JButton();
        lblQueryResult = new javax.swing.JLabel();
        lblRecords = new javax.swing.JLabel();
        panBtnArea = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        scrPaneTable = new javax.swing.JScrollPane();
        tabStudent = new javax.swing.JTable();
        panEdit = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        lblIdDisplay = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblGrade = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        comBoxGrade = new javax.swing.JComboBox();
        txtAge = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(890, 590));

        layPaneManager.setLayout(new java.awt.CardLayout());

        panQueryArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblQueryId.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblQueryId.setText("ID:");

        txtQueryName.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N

        txtQueryId.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        txtQueryId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQueryIdKeyTyped(evt);
            }
        });

        lblQueryName.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblQueryName.setText("Name:");

        btnQuery.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnQuery.setText("QUERY");
        btnQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQueryActionPerformed(evt);
            }
        });

        lblQueryResult.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblQueryResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQueryResult.setText("0");

        lblRecords.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        lblRecords.setText("records");

        javax.swing.GroupLayout panQueryAreaLayout = new javax.swing.GroupLayout(panQueryArea);
        panQueryArea.setLayout(panQueryAreaLayout);
        panQueryAreaLayout.setHorizontalGroup(
            panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panQueryAreaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQueryName)
                    .addComponent(lblQueryId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQueryName, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                    .addComponent(txtQueryId))
                .addGap(68, 68, 68)
                .addGroup(panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQuery)
                    .addComponent(lblQueryResult, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblRecords, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panQueryAreaLayout.setVerticalGroup(
            panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panQueryAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQueryId)
                    .addComponent(txtQueryId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQueryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQueryName))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panQueryAreaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQuery)
                .addGap(18, 18, 18)
                .addGroup(panQueryAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQueryResult)
                    .addComponent(lblRecords))
                .addContainerGap())
        );

        panBtnArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAdd.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnDel.setText("DEL");
        btnDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelActionPerformed(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBtnAreaLayout = new javax.swing.GroupLayout(panBtnArea);
        panBtnArea.setLayout(panBtnAreaLayout);
        panBtnAreaLayout.setHorizontalGroup(
            panBtnAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBtnAreaLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnAdd)
                .addGap(40, 40, 40)
                .addComponent(btnEdit)
                .addGap(30, 30, 30)
                .addComponent(btnDel)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panBtnAreaLayout.setVerticalGroup(
            panBtnAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBtnAreaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(panBtnAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnEdit)
                    .addComponent(btnDel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabStudent.setModel(

            new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                    "id", "name", "age", "gender", "grade"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Integer.class
                    ,java.lang.String.class
                    ,java.lang.Integer.class
                    ,java.lang.String.class
                    ,java.lang.String.class
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }
                @Override
                public boolean isCellEditable(int row, int column) {
                    return column==0?false:true;
                }
            }
        );
        scrPaneTable.setViewportView(tabStudent);

        javax.swing.GroupLayout panQueryLayout = new javax.swing.GroupLayout(panQuery);
        panQuery.setLayout(panQueryLayout);
        panQueryLayout.setHorizontalGroup(
            panQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panQueryLayout.createSequentialGroup()
                .addComponent(panQueryArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBtnArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(scrPaneTable)
        );
        panQueryLayout.setVerticalGroup(
            panQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panQueryLayout.createSequentialGroup()
                .addGroup(panQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panQueryArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panBtnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrPaneTable, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        layPaneManager.add(panQuery, "panQuery");

        btnSave.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblId.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblId.setText("id :");

        lblIdDisplay.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblIdDisplay.setText("11");

        lblName.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblName.setText("name :");

        lblAge.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblAge.setText("age :");

        lblGender.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblGender.setText("gender :");

        lblGrade.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        lblGrade.setText("grade :");

        txtName.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N

        btnGrpGender.add(rbtnMale);
        rbtnMale.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        rbtnMale.setSelected(true);
        rbtnMale.setText("M");

        btnGrpGender.add(rbtnFemale);
        rbtnFemale.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        rbtnFemale.setText("F");

        comBoxGrade.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        comBoxGrade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7", "8", "9", "10", "11", "12" }));

        txtAge.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panEditLayout = new javax.swing.GroupLayout(panEdit);
        panEdit.setLayout(panEditLayout);
        panEditLayout.setHorizontalGroup(
            panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditLayout.createSequentialGroup()
                        .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panEditLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSave)
                                .addGap(99, 99, 99))
                            .addGroup(panEditLayout.createSequentialGroup()
                                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panEditLayout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(74, 74, 74)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panEditLayout.createSequentialGroup()
                                        .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblGender)
                                            .addComponent(lblAge)
                                            .addComponent(lblGrade))
                                        .addGap(56, 56, 56)
                                        .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panEditLayout.createSequentialGroup()
                                                .addComponent(rbtnMale)
                                                .addGap(49, 49, 49)
                                                .addComponent(rbtnFemale))
                                            .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comBoxGrade, javax.swing.GroupLayout.Alignment.LEADING, 0, 67, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnCancel))
                    .addGroup(panEditLayout.createSequentialGroup()
                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(lblIdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        panEditLayout.setVerticalGroup(
            panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(lblIdDisplay))
                .addGap(51, 51, 51)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(rbtnMale)
                    .addComponent(rbtnFemale))
                .addGap(31, 31, 31)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGrade)
                    .addComponent(comBoxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addGroup(panEditLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(78, 78, 78))
        );

        layPaneManager.add(panEdit, "panEdit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layPaneManager)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layPaneManager)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelActionPerformed

        DefaultTableModel tm = (DefaultTableModel) tabStudent.getModel();
        int row = tabStudent.getSelectedRow();
        long id = 0;
        
        
        //warning message
        if(row>-1)
        {
            if(JOptionPane.showConfirmDialog(null, "are you sure to delete ?", "Warning", 2) != 0)
            {
                return;
            }
            
        }
        
        while (row > -1) {
            id =  Long.parseLong(tm.getValueAt(row, 0).toString());
            tm.removeRow(row);
           for(int j =0; j < studentList.size(); j++)
           {
               if(id == studentList.get(j).getId())
               {
                   studentList.remove(j);
                   break;
               }
           }
            
            row = tabStudent.getSelectedRow();
            
        }
       
        this.tabStudent.repaint();
        
        lblQueryResult.setText(String.valueOf(tabStudent.getRowCount()));
        
         //save data into data file
       
        saveStudentInfo();
     
    }//GEN-LAST:event_btnDelActionPerformed

     public static void saveStudentInfo() {
        
         try
         {
             //Open the file for writting
            FileWriter fileW =  new FileWriter("student.txt");
            BufferedWriter buffer = new BufferedWriter(fileW);
              
            StringBuilder info = new StringBuilder();
            Student stu ;
            
            for(int i = 0; i < studentList.size(); i++)
            {
                stu = studentList.get(i);
                info.append( stu.getId() +";");
                info.append(stu.getName() +";");
                info.append(stu.getAge() +";");
                info.append(stu.getGender() +";");
                info.append(stu.getGrade() +"\r\n");
                
            }
 
            buffer.write(info.toString());

            buffer.close();
            
         }
         catch(Exception e)
         {
             
         }
     
     }

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
   
        tabStudent.clearSelection();
        long id = 1 ;
       if(studentList.size() >= 1)
       {
           id = studentList.get(studentList.size() -1).getId() +1;
           lblIdDisplay.setText(String.valueOf(id));
       }
      
        
        CardLayout card = (CardLayout)layPaneManager.getLayout();
        card.show(layPaneManager, "panEdit");
        
        txtName.setText("");
        rbtnMale.setSelected(true);
        txtAge.setText("");
        comBoxGrade.setSelectedIndex(0);
         
         
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        CardLayout card = (CardLayout)layPaneManager.getLayout();
         card.show(layPaneManager, "panQuery");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       //check if null
        if(txtName.getText().trim().equals("") ||   txtAge.getText().trim().equals(""))
        {
             JOptionPane.showMessageDialog((Container) evt
                .getSource(), "name / age can not be null !", "Waring", 2);
            
            return;
        }
       
        //save into the student table and display
       DefaultTableModel tm = (DefaultTableModel) tabStudent.getModel();

        Student stu = new Student();
        stu.setId(Long.parseLong(lblIdDisplay.getText()));
        stu.setName(txtName.getText().trim());
        stu.setAge(Integer.parseInt(txtAge.getText().trim()));
        stu.setGrade(Integer.parseInt(comBoxGrade.getSelectedItem().toString()));
         
        Vector v = new Vector();
        v.add(lblIdDisplay.getText());
        v.add(txtName.getText().trim());
        v.add(txtAge.getText().trim());
       if(rbtnMale.isSelected())
        {
             v.add(rbtnMale.getText());
             stu.setGender(rbtnMale.getText());
        }
        else
        {
             v.add(rbtnFemale.getText());
             stu.setGender(rbtnFemale.getText());
        }
        v.add(comBoxGrade.getSelectedItem());
        
        int selectedRow = tabStudent.getSelectedRow();
       
        if(selectedRow == -1)
        {
            
            tm.addRow(v);
          
            studentList.add(stu);
        }
        else
        {
            tm.removeRow(selectedRow);
            tm.insertRow(selectedRow, v);
       
            selectedRow = -1;
             for(int j =0; j < studentList.size(); j++)
           {
               if( stu.getId() == studentList.get(j).getId())
               {
                   studentList.remove(j);
                   studentList.add(j, stu);
                   break;
               }
           }
        }
        
         lblQueryResult.setText(String.valueOf(tabStudent.getRowCount()));
        
        CardLayout card = (CardLayout)layPaneManager.getLayout();
        card.show(layPaneManager, "panQuery");
        
        
        //save into data file
        saveStudentInfo();
    }//GEN-LAST:event_btnSaveActionPerformed

  
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       
         DefaultTableModel tm = (DefaultTableModel) tabStudent.getModel();
       int  selectedRow = tabStudent.getSelectedRow();
        
        if(selectedRow == -1)
            return;
       
        lblIdDisplay.setText( tabStudent.getValueAt(selectedRow, 0).toString());
        txtName.setText( tabStudent.getValueAt(selectedRow, 1).toString());
        txtAge.setText( tabStudent.getValueAt(selectedRow, 2).toString());
        if(tabStudent.getValueAt(selectedRow, 3).toString().equals("M"))
        {
            rbtnMale.setSelected(true);
            rbtnFemale.setSelected(false);
        }
        else
        {
            rbtnMale.setSelected(false);
            rbtnFemale.setSelected(true);
        }

        comBoxGrade.setSelectedItem(tabStudent.getValueAt(selectedRow, 4).toString());
           
        
        CardLayout card = (CardLayout)layPaneManager.getLayout();
        card.show(layPaneManager, "panEdit");
        
     
       
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQueryActionPerformed
      
        String tempStr = txtQueryId.getText().trim();
         long queryId = 0; 
        if(!tempStr.equals("") )
        {
            queryId = Long.parseLong(tempStr);
        }
     
        String queryName = txtQueryName.getText().trim();
        ArrayList<Student> stusList = new ArrayList<Student>();
        
        if (!queryName.equals("") && queryId > 0) 
        {
            for( int i =0; i < studentList.size(); i++)
            {
                Student stu = studentList.get(i);
             
                if(stu.getId() == queryId && stu.getName().contains(queryName))
                {
                    
                    stusList.add(stu);
                }
            }
            
            setStudentTable(stusList);
            
        }
        else if (!queryName.equals("") && queryId == 0)
        {
             for( int i =0; i < studentList.size(); i++)
            {
                Student stu = studentList.get(i);
             
                if( stu.getName().contains(queryName))
                {
                    
                    stusList.add(stu);
                }
            }
            
            setStudentTable(stusList);
        }
        else if (queryName.equals("") && queryId > 0)
        {
            for( int i =0; i < studentList.size(); i++)
            {
                Student stu = studentList.get(i);
             
                if(stu.getId() == queryId )
                {
                    
                    stusList.add(stu);
                }
            }
            
            setStudentTable(stusList);
        }
        else
        {
            setStudentTable(studentList);
        }
        
        
    }//GEN-LAST:event_btnQueryActionPerformed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
      //only numbers from 0 to 9  could  be input.
       char c = evt.getKeyChar();
       if(c <KeyEvent.VK_0||c >KeyEvent.VK_9)
       {
           evt.consume();
           return;
       }
       
      //make sure the length of  age JTextField <= 2
       int len = txtAge.getText().length();
       
      if(len  >= 2)
      {
          if(c== KeyEvent.VK_BACK_SPACE || c== KeyEvent.VK_DELETE || c== KeyEvent.VK_ENTER || c== KeyEvent.VK_TAB || evt.isActionKey())
          {
              return;
          }
          else
          {
           
             evt.consume();
            
          }
      }
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtQueryIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQueryIdKeyTyped
       //only numbers from 0 to 9  could  be input.
       char c = evt.getKeyChar();
       if(c <KeyEvent.VK_0||c >KeyEvent.VK_9)
       {
           evt.consume();
           return;
       }
    }//GEN-LAST:event_txtQueryIdKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.ButtonGroup btnGrpGender;
    private javax.swing.JButton btnQuery;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox comBoxGrade;
    private javax.swing.JLayeredPane layPaneManager;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblIdDisplay;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblQueryId;
    private javax.swing.JLabel lblQueryName;
    private javax.swing.JLabel lblQueryResult;
    private javax.swing.JLabel lblRecords;
    private javax.swing.JPanel panBtnArea;
    private javax.swing.JPanel panEdit;
    private javax.swing.JPanel panQuery;
    private javax.swing.JPanel panQueryArea;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JScrollPane scrPaneTable;
    private javax.swing.JTable tabStudent;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQueryId;
    private javax.swing.JTextField txtQueryName;
    // End of variables declaration//GEN-END:variables
}
