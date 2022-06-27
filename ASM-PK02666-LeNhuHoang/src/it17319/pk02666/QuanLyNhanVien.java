/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it17319.pk02666;

import ClassQL.Employee;
import ClassQL.XFile;
import interfacepack.DAO;
import interfacepack.Sort;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hoang
 */
public class QuanLyNhanVien extends javax.swing.JFrame implements DAO {

    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnToFirst = new javax.swing.JButton();
        btnGoRight = new javax.swing.JButton();
        btnToEnd = new javax.swing.JButton();
        btnGoLeft = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmployeeManage = new javax.swing.JTable();
        txtLine = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();
        cbxSort = new javax.swing.JComboBox<>();
        chkRev = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel2.setText("MÃ NHÂN VIÊN");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel3.setText("HỌ VÀ TÊN");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel4.setText("TUỔI");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel5.setText("EMAIL");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 20)); // NOI18N
        jLabel6.setText("LƯƠNG");

        txtID.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtAge.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtEmail.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        txtSalary.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnToFirst.setText("|<");
        btnToFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToFirstActionPerformed(evt);
            }
        });

        btnGoRight.setText(">>");
        btnGoRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoRightActionPerformed(evt);
            }
        });

        btnToEnd.setText(">|");
        btnToEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToEndActionPerformed(evt);
            }
        });

        btnGoLeft.setText("<<");
        btnGoLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoLeftActionPerformed(evt);
            }
        });

        tblEmployeeManage.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        tblEmployeeManage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployeeManage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeManageMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmployeeManage);
        if (tblEmployeeManage.getColumnModel().getColumnCount() > 0) {
            tblEmployeeManage.getColumnModel().getColumn(0).setPreferredWidth(5);
            tblEmployeeManage.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblEmployeeManage.getColumnModel().getColumn(2).setPreferredWidth(5);
            tblEmployeeManage.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblEmployeeManage.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        txtLine.setForeground(new java.awt.Color(255, 0, 0));
        txtLine.setText("Record: ");

        txtTime.setForeground(new java.awt.Color(255, 0, 0));
        txtTime.setText("10:22 AM");

        cbxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "Age", "Salary" }));
        cbxSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSortActionPerformed(evt);
            }
        });

        chkRev.setText("Revert");
        chkRev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRevActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(433, 433, 433)
                        .addComponent(jLabel1)
                        .addGap(193, 193, 193)
                        .addComponent(txtTime))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnToFirst)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnGoLeft)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnGoRight)
                                            .addGap(18, 18, 18)
                                            .addComponent(btnToEnd)
                                            .addGap(17, 17, 17)
                                            .addComponent(txtLine)
                                            .addGap(51, 51, 51)
                                            .addComponent(chkRev)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cbxSort, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(103, 103, 103))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(687, 687, 687)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(37, 37, 37)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(37, 37, 37)
                                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(442, 442, 442))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel5))
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGap(81, 81, 81)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1027, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTime))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnToFirst)
                            .addComponent(btnGoLeft)
                            .addComponent(btnGoRight)
                            .addComponent(btnToEnd)
                            .addComponent(txtLine)
                            .addComponent(cbxSort, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkRev))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        thTime.start();
    }//GEN-LAST:event_formWindowOpened

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        newForm();
        newRec = true;
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try {
            save();
            fillToTable();
            XFile.writeFile(path, arrEmploy);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "You haven't data in table you need to click open button.");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            delete();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Dien id de xoa thong tin");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        find();
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed

        tblModel = (DefaultTableModel) tblEmployeeManage.getModel();
        getEmploy();
        open();
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnToFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToFirstActionPerformed
        // TODO add your handling code here:
        index = 0;
        setLineAndShow();
    }//GEN-LAST:event_btnToFirstActionPerformed

    private void btnGoLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoLeftActionPerformed
        // TODO add your handling code here:
        if (index > 0) {
            index--;
            setLineAndShow();
        }
    }//GEN-LAST:event_btnGoLeftActionPerformed

    private void btnGoRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoRightActionPerformed
        // TODO add your handling code here:
        if (index < arrEmploy.size() - 1) {
            index++;
            setLineAndShow();
        }
    }//GEN-LAST:event_btnGoRightActionPerformed

    private void btnToEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToEndActionPerformed
        // TODO add your handling code here:
        index = arrEmploy.size() - 1;
        setLineAndShow();
    }//GEN-LAST:event_btnToEndActionPerformed

    private void tblEmployeeManageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeManageMouseClicked
        // TODO add your handling code here:
        try {
            index = tblEmployeeManage.getSelectedRow();
            showDetail();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "It not have value, please fill your information");
        }
    }//GEN-LAST:event_tblEmployeeManageMouseClicked

    private void cbxSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSortActionPerformed
        // TODO add your handling code here:
        sortList(cbxSort.getSelectedIndex());
        fillToTable();
    }//GEN-LAST:event_cbxSortActionPerformed

    private void chkRevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRevActionPerformed
        // TODO add your handling code here:
        try {
            if (chkRev.isSelected() == true) {
                revert();
            }else{
                revert();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_chkRevActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnGoLeft;
    private javax.swing.JButton btnGoRight;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnToEnd;
    private javax.swing.JButton btnToFirst;
    private javax.swing.JComboBox<String> cbxSort;
    private javax.swing.JCheckBox chkRev;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblEmployeeManage;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtLine;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JLabel txtTime;
    // End of variables declaration//GEN-END:variables

    int index = -1;

    ArrayList<Employee> arrEmploy = new ArrayList<>();
    DefaultTableModel tblModel;
    DecimalFormat df = new DecimalFormat("#");
    String path = "objEmployee.dat";
    private String emailPatten = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    boolean newRec = false;

    public void getEmploy() {
        arrEmploy.add(new Employee("nv1", "Ho Nhat Dung", 20, "dunghn@gmail.com", 10000000.00));
        arrEmploy.add(new Employee("nv2", "Tran Quan Truong", 27, "truonghq@gmail.com", 20000000.00));
        arrEmploy.add(new Employee("nv3", "Hoang Van Thuong", 25, "thuonghv@gmail.com", 17000000.00));
        arrEmploy.add(new Employee("nv4", "Ngo Tien Dat", 45, "datnt@gmail.com", 43000000.00));
        arrEmploy.add(new Employee("nv5", "Nguyen Thi Hong", 22, "hongnt@gmail.com", 14000000.00));
    }

    private void fillToTable() {
        tblModel.setRowCount(0);
        for (Employee employ : arrEmploy) {
            Object[] rowData = {employ.getID(), employ.getName(), employ.getAge(), employ.getEmail(), df.format(employ.getSalary())};
            tblModel.addRow(rowData);
        }
    }

    private void showDetail() {
        try {
            Employee employee = arrEmploy.get(index);
            setLine(index);
            String salary = df.format(employee.getSalary());

            String employAge = Integer.toString(employee.getAge());
            String employSalary = Double.toString(employee.getSalary());

            txtID.setText(employee.getID());
            txtName.setText(employee.getName());
            txtAge.setText(employAge);
            txtEmail.setText(employee.getEmail());
            txtSalary.setText(salary);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    private int getIndexByID(String id) {
        for (int i = 0; i < arrEmploy.size(); i++) {
            if (arrEmploy.get(i).getID().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void insert() {
        int age = Integer.parseInt(txtAge.getText());
        double salary = Double.parseDouble(txtSalary.getText());
        if (age < 0 || age > 100) {
            JOptionPane.showMessageDialog(this, "Invalid age.");
        } else if (!txtEmail.getText().matches(emailPatten)) {
            JOptionPane.showMessageDialog(this, "Invalid email with patten email.");
        } else {
            arrEmploy.add(new Employee(txtID.getText(), txtName.getText(), age, txtEmail.getText(), salary));
        }
    }

    @Override
    public void newForm() {
        txtID.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmail.setText("");
        txtSalary.setText("");
        index = 0;
        setLineAndShow();
    }

    @Override
    public void delete() {
        try {
            if (JOptionPane.showConfirmDialog(this, "Do you Want to delete?", "Delete File", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                String id = txtID.getText();
                index = getIndexByID(id);
                arrEmploy.remove(index);
                fillToTable();
                index = 0;
                setLineAndShow();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    @Override
    public void find() {
        try {
            String idEmploy = JOptionPane.showInputDialog("ID: ");
            index = getIndexByID(idEmploy);
            if (index >= 0) {
                showDetail();
                tblEmployeeManage.setRowSelectionInterval(index, index);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

    @Override
    public void save() {
        try {
            if (newRec == true) {
                insert();
                newRec = false;
                index = arrEmploy.size() - 1;
            } else {
                update();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please enter all information.");
        }
    }

    @Override
    public void exit() {
        if (JOptionPane.showConfirmDialog(this, "Do you Want to Exit", "Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private void setLineAndShow() {
        showDetail();
        tblEmployeeManage.setRowSelectionInterval(index, index);
    }

    private void update() {
        try {
            index = getIndexByID(txtID.getText());
            int age = Integer.parseInt(txtAge.getText());
            double salary = Double.parseDouble(txtSalary.getText());
            if (age < 0 || age > 100) {
                JOptionPane.showMessageDialog(this, "Invalid age.");
            } else if (!txtEmail.getText().matches(emailPatten)) {
                JOptionPane.showMessageDialog(this, "Invalid email with patten email.");
            } else {
                arrEmploy.remove(index);
                arrEmploy.add(index, new Employee(txtID.getText(), txtName.getText(), age, txtEmail.getText(), salary));
                setLineAndShow();
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "can't update. you must enter id and information.");
        }
    }

    @Override
    public void open() {
        arrEmploy = (ArrayList<Employee>) XFile.readFile(path);
        fillToTable();
    }

    Thread thTime = new Thread() {
        @Override
        public void run() {
            while (true) {
                try {
                    Date now = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat();
                    sdf.applyPattern("hh:mm:ss aa");
                    String time = sdf.format(now);
                    txtTime.setText(time);
                    Thread.sleep(1000);
                } catch (Exception ex) {
                    break;
                }
            }
        }
    };

    void setLine(int index) {
        txtLine.setText("Record:" + (index + 1) + " of " + arrEmploy.size());
    }

    public void sortList(int valueOfCombobox) {
        Comparator<Employee> comp = new Comparator<>() {
            @Override
            public int compare(Employee t, Employee t1) {
                switch (valueOfCombobox) {
                    case 0:
                        return t.getName().compareTo(t1.getName());
                    case 1:
                        return t.getID().compareTo(t1.getID());
                    case 2:
                        return Integer.valueOf(t.getAge()).compareTo(t1.getAge());
                    case 3:
                        return Double.valueOf(t.getSalary()).compareTo(t1.getSalary());
                    default:
                        return t.getName().compareTo(t1.getName());
                }
            }
        };
        Collections.sort(arrEmploy, comp);
    }
    
    public void revert(){
        Collections.reverse(arrEmploy);
        fillToTable();
    }
}
