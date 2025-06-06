package UI;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import Classes.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class Home extends javax.swing.JFrame {
    
    
    public Home() {
        initComponents();
        this.setResizable(false);
        this.setTitle("Grocery Store Management");
        showEmployeesInTable();
        showProductsInTable();
        showCustomersInTable();
        showSuppliersInTable();
    }
    
    public void pClearFields(){
        pId.setValue(0);
        pName.setText("");
        pQuantity.setText("");
        pCategory.setSelectedIndex(0);
        pInPrice.setText("");
        pOutPrice.setText("");
    }
    public void eClearFields(){
        eId1.setValue(0);
        eName.setText("");
        ePhoneNo.setText("");
        eRole.setSelectedIndex(0);
        
    }
    public void cClearFields(){
        cId.setValue(0);
        cName.setText("");
        cPhoneNo.setText("");
        
        
    }
    public void sClearFields(){
        sId.setValue(0);
        sName.setText("");
        sBarCode.setText("");
        
    }
    public boolean pCheckEmptyFields(){
        String name = pName.getText().trim();
        String quantity = pQuantity.getText().trim();
        String inPrice = pInPrice.getText().trim();
        String outPrice = pOutPrice.getText().trim();
        
        if(name.equals("") || quantity.equals("") || inPrice.equals("") || outPrice.equals(""))
        {
            return false;
        }else{
            return true;
        }
        
    }
    public boolean eCheckEmptyFields(){
        String name = eName.getText().trim();
        String phoneNo = ePhoneNo.getText().trim();
        
        
        if(name.equals("") || phoneNo.equals("") )
        {
            return false;
        }else{
            return true;
        }
        
    }
    public boolean cCheckEmptyFields(){
        String name = cName.getText().trim();
        
        String phoneNo = cPhoneNo.getText().trim();
        
        
        if(name.equals("") || phoneNo.equals("") )
        {
            return false;
        }else{
            return true;
        }
        
    }
    public boolean sCheckEmptyFields(){
        String name = sName.getText().trim();
        String barCode = sBarCode.getText().trim();
        
        
        if(name.equals("") || barCode.equals("") )
        {
            return false;
        }else{
            return true;
        }
    }
    
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jPanel12 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        eName = new javax.swing.JTextField();
        ePhoneNo = new javax.swing.JTextField();
        eSave = new javax.swing.JToggleButton();
        eUpdate = new javax.swing.JToggleButton();
        eDelete = new javax.swing.JToggleButton();
        jLabel9 = new javax.swing.JLabel();
        eRole = new javax.swing.JComboBox<>();
        eRef = new javax.swing.JToggleButton();
        eId1 = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        eSearch = new javax.swing.JToggleButton();
        eName1 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pName = new javax.swing.JTextField();
        pSave = new javax.swing.JToggleButton();
        pUpdate = new javax.swing.JToggleButton();
        pDelete = new javax.swing.JToggleButton();
        jLabel13 = new javax.swing.JLabel();
        pOutPrice = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pQuantity = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        pCategory = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        pInPrice = new javax.swing.JTextField();
        pRef = new javax.swing.JToggleButton();
        pId = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jToggleButton9 = new javax.swing.JToggleButton();
        jLabel19 = new javax.swing.JLabel();
        pName1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        cSearch = new javax.swing.JToggleButton();
        cName1 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cName = new javax.swing.JTextField();
        cPhoneNo = new javax.swing.JTextField();
        cSave = new javax.swing.JToggleButton();
        cUpdate = new javax.swing.JToggleButton();
        cDelete = new javax.swing.JToggleButton();
        cRef = new javax.swing.JToggleButton();
        jLabel38 = new javax.swing.JLabel();
        cId = new javax.swing.JSpinner();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        sSearch = new javax.swing.JToggleButton();
        sName1 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        sName = new javax.swing.JTextField();
        sBarCode = new javax.swing.JTextField();
        sSave = new javax.swing.JToggleButton();
        sUpdate = new javax.swing.JToggleButton();
        sDelete = new javax.swing.JToggleButton();
        sRef = new javax.swing.JToggleButton();
        sId = new javax.swing.JSpinner();
        jLabel39 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton1.setText("Customer");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton4.setText("Supplier");
        jToggleButton4.setToolTipText("");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jToggleButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton5.setText("Product");
        jToggleButton5.setToolTipText("");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jToggleButton8.setText("Employee");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 893, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane2.setBackground(new java.awt.Color(0, 102, 102));
        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane2.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Name:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("PhoneNo:");

        eSave.setBackground(new java.awt.Color(0, 102, 102));
        eSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eSave.setForeground(new java.awt.Color(255, 255, 255));
        eSave.setText("Save");
        eSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eSaveActionPerformed(evt);
            }
        });

        eUpdate.setBackground(new java.awt.Color(0, 102, 102));
        eUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eUpdate.setForeground(new java.awt.Color(255, 255, 255));
        eUpdate.setText("Update");
        eUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eUpdateActionPerformed(evt);
            }
        });

        eDelete.setBackground(new java.awt.Color(0, 102, 102));
        eDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eDelete.setForeground(new java.awt.Color(255, 255, 255));
        eDelete.setText("Delete");
        eDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eDeleteActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Role:");

        eRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier", "Warehouse Manager" }));

        eRef.setBackground(new java.awt.Color(0, 102, 102));
        eRef.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eRef.setForeground(new java.awt.Color(255, 255, 255));
        eRef.setText("Refresh");
        eRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eRefActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 102));
        jLabel11.setText("ID:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(eRef, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(eSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eDelete)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(eName, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(ePhoneNo)
                            .addComponent(eRole, 0, 1, Short.MAX_VALUE)
                            .addComponent(eId1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(eId1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ePhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(eRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eSave)
                    .addComponent(eUpdate)
                    .addComponent(eDelete)
                    .addComponent(eRef))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "PhoneNo", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("Search Name:");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Employee's info");

        eSearch.setBackground(new java.awt.Color(0, 102, 102));
        eSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        eSearch.setForeground(new java.awt.Color(255, 255, 255));
        eSearch.setText("Search");
        eSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eSearchActionPerformed(evt);
            }
        });

        eName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eName1ActionPerformed(evt);
            }
        });
        eName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                eName1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(21, 21, 21)
                        .addComponent(eName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eSearch))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(eSearch)
                    .addComponent(eName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Employee", jPanel7);

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Name:");

        pName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pNameActionPerformed(evt);
            }
        });

        pSave.setBackground(new java.awt.Color(0, 102, 102));
        pSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pSave.setForeground(new java.awt.Color(255, 255, 255));
        pSave.setText("Save");
        pSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pSaveActionPerformed(evt);
            }
        });

        pUpdate.setBackground(new java.awt.Color(0, 102, 102));
        pUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pUpdate.setForeground(new java.awt.Color(255, 255, 255));
        pUpdate.setText("Update");
        pUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pUpdateActionPerformed(evt);
            }
        });

        pDelete.setBackground(new java.awt.Color(0, 102, 102));
        pDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pDelete.setForeground(new java.awt.Color(255, 255, 255));
        pDelete.setText("Delete");
        pDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pDeleteActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("outPrice:");

        pOutPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pOutPriceActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Quantity:");

        pQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pQuantityKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Category:");

        pCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Food", "Drink", "ELectronic", "Clothes" }));
        pCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pCategoryActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("inPrice:");

        pInPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pInPriceActionPerformed(evt);
            }
        });
        pInPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pInPriceKeyReleased(evt);
            }
        });

        pRef.setBackground(new java.awt.Color(0, 102, 102));
        pRef.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pRef.setForeground(new java.awt.Color(255, 255, 255));
        pRef.setText("Refresh");
        pRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pRefActionPerformed(evt);
            }
        });

        pId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel37.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 102));
        jLabel37.setText("ID:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(pRef, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pDelete))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pOutPrice)
                                    .addComponent(pInPrice)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pCategory, 0, 180, Short.MAX_VALUE)
                                    .addComponent(pQuantity)
                                    .addComponent(pName, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pId)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(pId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(pInPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(pOutPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pSave)
                    .addComponent(pUpdate)
                    .addComponent(pDelete)
                    .addComponent(pRef))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Category", "Quantity", "inPrice", "outPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jTable2.setShowGrid(true);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel17.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("Product's info");

        jToggleButton9.setBackground(new java.awt.Color(0, 102, 102));
        jToggleButton9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jToggleButton9.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton9.setText("Search");
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 102));
        jLabel19.setText("Search Name:");

        pName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pName1ActionPerformed(evt);
            }
        });
        pName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pName1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pName1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton9)
                        .addGap(20, 20, 20))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pName1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton9)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(0, 1, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 4, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Product", jPanel9);

        jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel21.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Search Name:");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Customer's info");

        cSearch.setBackground(new java.awt.Color(0, 102, 102));
        cSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cSearch.setForeground(new java.awt.Color(255, 255, 255));
        cSearch.setText("Search");
        cSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSearchActionPerformed(evt);
            }
        });

        cName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cName1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cSearch))
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cSearch)
                        .addComponent(cName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel18.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 102));
        jLabel18.setText("Name:");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("PhoneNo:");

        cSave.setBackground(new java.awt.Color(0, 102, 102));
        cSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cSave.setForeground(new java.awt.Color(255, 255, 255));
        cSave.setText("Save");
        cSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cSaveActionPerformed(evt);
            }
        });

        cUpdate.setBackground(new java.awt.Color(0, 102, 102));
        cUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cUpdate.setForeground(new java.awt.Color(255, 255, 255));
        cUpdate.setText("Update");
        cUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUpdateActionPerformed(evt);
            }
        });

        cDelete.setBackground(new java.awt.Color(0, 102, 102));
        cDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cDelete.setForeground(new java.awt.Color(255, 255, 255));
        cDelete.setText("Delete");
        cDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDeleteActionPerformed(evt);
            }
        });

        cRef.setBackground(new java.awt.Color(0, 102, 102));
        cRef.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cRef.setForeground(new java.awt.Color(255, 255, 255));
        cRef.setText("Refresh");
        cRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cRefActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(0, 102, 102));
        jLabel38.setText("ID:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cName, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(cId)
                            .addComponent(cPhoneNo))
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(cRef, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cDelete)
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(cId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(cName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cSave)
                    .addComponent(cUpdate)
                    .addComponent(cDelete)
                    .addComponent(cRef))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "PhoneNo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Customer", jPanel2);

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel26.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Search Name:");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 102));
        jLabel27.setText("Supplier's info");

        sSearch.setBackground(new java.awt.Color(0, 102, 102));
        sSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sSearch.setForeground(new java.awt.Color(255, 255, 255));
        sSearch.setText("Search");
        sSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sSearchActionPerformed(evt);
            }
        });

        sName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sName1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addGap(15, 15, 15)
                        .addComponent(sName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sSearch))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(sSearch)
                    .addComponent(sName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel23.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 102));
        jLabel23.setText("Name:");

        jLabel25.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 102));
        jLabel25.setText("Barcode:");

        sSave.setBackground(new java.awt.Color(0, 102, 102));
        sSave.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sSave.setForeground(new java.awt.Color(255, 255, 255));
        sSave.setText("Save");
        sSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sSaveActionPerformed(evt);
            }
        });

        sUpdate.setBackground(new java.awt.Color(0, 102, 102));
        sUpdate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sUpdate.setForeground(new java.awt.Color(255, 255, 255));
        sUpdate.setText("Update");
        sUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sUpdateActionPerformed(evt);
            }
        });

        sDelete.setBackground(new java.awt.Color(0, 102, 102));
        sDelete.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sDelete.setForeground(new java.awt.Color(255, 255, 255));
        sDelete.setText("Delete");
        sDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sDeleteActionPerformed(evt);
            }
        });

        sRef.setBackground(new java.awt.Color(0, 102, 102));
        sRef.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        sRef.setForeground(new java.awt.Color(255, 255, 255));
        sRef.setText("Refresh");
        sRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sRefActionPerformed(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(0, 102, 102));
        jLabel39.setText("ID:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(sRef, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sDelete)
                .addGap(28, 28, 28))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sId, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sName, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(sBarCode, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(sId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(sName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(sBarCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sSave)
                    .addComponent(sUpdate)
                    .addComponent(sDelete)
                    .addComponent(sRef))
                .addGap(21, 21, 21))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Bar code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable4.setSelectionBackground(new java.awt.Color(51, 153, 0));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(158, 158, 158))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Supplier", jPanel8);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Grocery Store Management System");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //array to create list of employee
    public ArrayList<Employee> getEmployeesList(){
        ArrayList<Employee> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM employee";
        
        Statement st;
        ResultSet rs;
        
        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Employee employee;
            
            while(rs.next()){
                employee = new Employee(rs.getInt("employeeId"),rs.getString("employeeName"),
                                        rs.getString("phoneNo"),rs.getString("role"));
                                        
                list.add(employee);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    
    //function to show products in table
    public void showEmployeesInTable(){
        ArrayList<Employee> employeesList = getEmployeesList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6]; //6 columns
        
        for(int i = 0; i < employeesList.size(); i++){
            
            row[0] = employeesList.get(i).getName();
            row[1] = employeesList.get(i).getPhoneNo();
            row[2] = employeesList.get(i).getRole();
            
            
            model.addRow(row);
        }
    }
    
    //create function to display product data by index
    public void showEmployeeData(int index){
        String searchTerm=eName1.getText();
        eId1.setValue(searchEmployeesList(searchTerm).get(index).getId());
        eName.setText(searchEmployeesList(searchTerm).get(index).getName());
        ePhoneNo.setText(searchEmployeesList(searchTerm).get(index).getPhoneNo());
        eRole.setSelectedItem(searchEmployeesList(searchTerm).get(index).getRole());
        
    }
    public ArrayList<Product> getProductsList(){
        ArrayList<Product> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM product";
        
        Statement st;
        ResultSet rs;
        
        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Product product;
            
            while(rs.next()){
                product = new Product(rs.getInt("productId"),rs.getString("productName"),
                                        rs.getString("category"),rs.getInt("quantity"),
                                        rs.getDouble("inPrice"),rs.getDouble("outPrice"));
                list.add(product);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    public ArrayList<Product> searchProductsList(String searchTerm){
        ArrayList<Product> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM product WHERE productName LIKE '%" + searchTerm + "%'";

        Statement st;
        ResultSet rs;

        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Product product;

            while (rs.next()) {
                product = new Product(rs.getInt("productId"), rs.getString("productName"),
                                        rs.getString("category"), rs.getInt("quantity"),
                                        rs.getDouble("inPrice"), rs.getDouble("outPrice"));
                list.add(product);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    public ArrayList<Employee> searchEmployeesList(String searchTerm){
        ArrayList<Employee> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM employee WHERE employeeName LIKE '%" + searchTerm + "%'";

        Statement st;
        ResultSet rs;

        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Employee employee;

            while (rs.next()) {
                employee = new Employee(rs.getInt("employeeId"), rs.getString("employeeName"),
                                        rs.getString("phoneNo"), rs.getString("role"));
                                        
                list.add(employee);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }
    //function to show products in table
    public void showProductsInTable(){
        ArrayList<Product> productsList = getProductsList();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5]; //6 columns
        
        for(int i = 0; i < productsList.size(); i++){
//            row[0] = productsList.get(i).getId();
            row[0] = productsList.get(i).getName();
            row[1] = productsList.get(i).getCategory();
            row[2] = productsList.get(i).getQuantity();
            row[3] = productsList.get(i).getInPrice();
            row[4] = productsList.get(i).getOutPrice();
            
            model.addRow(row);
        }
    }
    
    public void pShowSearchResult(String searchTerm){
        ArrayList<Product> productsList = searchProductsList(searchTerm);
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5]; //6 columns
        
        for(int i = 0; i < productsList.size(); i++){
//            row[0] = productsList.get(i).getId();
            row[0] = productsList.get(i).getName();
            row[1] = productsList.get(i).getCategory();
            row[2] = productsList.get(i).getQuantity();
            row[3] = productsList.get(i).getInPrice();
            row[4] = productsList.get(i).getOutPrice();
            
            model.addRow(row);
        }
    }
    public void eShowSearchResult(String searchTerm){
        ArrayList<Employee> employeesList = searchEmployeesList(searchTerm);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        Object[] row = new Object[5]; //6 columns
        
        for(int i = 0; i < employeesList.size(); i++){
//            row[0] = employeesList.get(i).getId();
            row[0] = employeesList.get(i).getName();
            row[1] = employeesList.get(i).getPhoneNo();
            row[2] = employeesList.get(i).getRole();
            
            model.addRow(row);
        }
    }
    
    //create function to display product data by index
    public void showProductData(int index){
        String searchTerm=pName1.getText();
        pId.setValue(searchProductsList(searchTerm).get(index).getId());
        pName.setText(searchProductsList(searchTerm).get(index).getName());
        pCategory.setSelectedItem(searchProductsList(searchTerm).get(index).getCategory());
        pQuantity.setText(searchProductsList(searchTerm).get(index).getQuantity().toString());
        pInPrice.setText(searchProductsList(searchTerm).get(index).getInPrice().toString());
        pOutPrice.setText(searchProductsList(searchTerm).get(index).getOutPrice().toString());
    }
    public ArrayList<Customer> getCustomersList(){
        ArrayList<Customer> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM customer";
        
        Statement st;
        ResultSet rs;
        
        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Customer customer;
            
            while(rs.next()){
                customer = new Customer(rs.getInt("customerId"),rs.getString("customerName"),
                                        rs.getString("customerPhoneNo"));
                                        
                list.add(customer);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    
    //function to show products in table
    public void showCustomersInTable(){
        ArrayList<Customer> customersList = getCustomersList();
        DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6]; //6 columns
        
        for(int i = 0; i < customersList.size(); i++){
//            row[0] = customersList.get(i).getId();
            row[0] = customersList.get(i).getName();
            row[1] = customersList.get(i).getPhoneNo();
            
            
            
            model.addRow(row);
        }
    }
    public ArrayList<Customer> searchCustomersList(String searchTerm){
        ArrayList<Customer> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM customer WHERE customerName LIKE '%" + searchTerm + "%'";
        
        Statement st;
        ResultSet rs;
        
        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Customer customer;
            
            while(rs.next()){
                customer = new Customer(rs.getInt("customerId"),rs.getString("customerName"),
                                        rs.getString("customerPhoneNo"));
                                        
                list.add(customer);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    //create function to display product data by index
    public void showCustomerData(int index){
        String searchTerm=cName1.getText();
        cId.setValue(searchCustomersList(searchTerm).get(index).getId());
        cName.setText(searchCustomersList(searchTerm).get(index).getName());
        cPhoneNo.setText(searchCustomersList(searchTerm).get(index).getPhoneNo());
        
    }
    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(2);
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    public ArrayList<Supplier> getSuppliersList(){
        ArrayList<Supplier> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM supplier";
        
        Statement st;
        ResultSet rs;
        
        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Supplier supplier;
            
            while(rs.next()){
                supplier = new Supplier(rs.getInt("supplierId"),rs.getString("supplierName"),
                                        rs.getString("barCode"));
                                        
                list.add(supplier);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    public ArrayList<Supplier> searchSuppliersList(String searchTerm){
        ArrayList<Supplier> list = new ArrayList<>();
        String selectQuery = "SELECT * FROM supplier WHERE supplierName LIKE '%" + searchTerm + "%'";
        
        Statement st;
        ResultSet rs;
        
        try {
            st = DB.getConnection().createStatement();
            rs = st.executeQuery(selectQuery);
            Supplier supplier;
            
            while(rs.next()){
                supplier = new Supplier(rs.getInt("supplierId"),rs.getString("supplierName"),
                                        rs.getString("barCode"));
                                        
                list.add(supplier);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return list;
    }
    
    //function to show products in table
    public void showSuppliersInTable(){
        ArrayList<Supplier> suppliersList = getSuppliersList();
        DefaultTableModel model = (DefaultTableModel) jTable4.getModel();
        model.setRowCount(0);
        Object[] row = new Object[6]; //6 columns
        
        for(int i = 0; i < suppliersList.size(); i++){
//            row[0] = suppliersList.get(i).getId();
            row[0] = suppliersList.get(i).getName();
            row[1] = suppliersList.get(i).getBarCode();
            
            
            
            model.addRow(row);
        }
    }
    
    //create function to display product data by index
    public void showSupplierData(int index){
        String searchTerm=sName1.getText();
        sId.setValue(searchSuppliersList(searchTerm).get(index).getId());
        sName.setText(searchSuppliersList(searchTerm).get(index).getName());
        sBarCode.setText(searchSuppliersList(searchTerm).get(index).getBarCode());
        
        
    }
    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(3);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
        jTabbedPane2.setSelectedIndex(1);
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void eSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eSearchActionPerformed
        
        // TODO add your handling code here:
        //search employee by name
        
            String name = eName1.getText();
            System.out.print(("SELECT employeeName,category,quantity,inPrice,outPrice FROM employee WHERE employeeName = '" + name + "'"));

            try {
//                String selectQuery = "SELECT employeeName,category,quantity,inPrice,outPrice FROM employee WHERE employeeName = ?";
                Statement s = DB.getConnection().createStatement();
                
                ResultSet rs = s.executeQuery("SELECT * FROM employee WHERE employeeName = '" + name + "'");
                
                if(rs.next()){
                    eId1.setValue(rs.getInt("employeeId"));
                    eName.setText(rs.getString("employeeName"));
                    eRole.setSelectedItem(rs.getString("role"));
                    ePhoneNo.setText(rs.getString("phoneNo"));
                    eShowSearchResult(name);
                }else{
                    System.out.println("No employee with this name");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_eSearchActionPerformed

    private void eSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eSaveActionPerformed
        // TODO add your handling code here:
        String name = eName.getText();
        String role = eRole.getSelectedItem().toString();
        String phoneNo = ePhoneNo.getText();
        
        
        
        String insertQuery = "INSERT INTO employee(employeeName,phoneNo,role) VALUES(?,?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1,name);
            ps.setString(2,phoneNo);
            ps.setString(3,role);
            
            if(ps.executeUpdate() > 0)
            {
                showEmployeesInTable();
                System.out.println("New Employee Added");
            
            }
            else{
                System.out.println("Some Error Message here");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_eSaveActionPerformed

    private void eUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eUpdateActionPerformed
        // TODO add your handling code here:
        if(eCheckEmptyFields()){
            Integer id = Integer.valueOf(eId1.getValue().toString());
            String name = eName.getText();
            String phoneNo = ePhoneNo.getText();
            String role = eRole.getSelectedItem().toString();
            

            String updateQuery = "UPDATE employee SET employeeName = ?, phoneNo = ?, role = ? WHERE employeeId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
                ps.setString(1,name);
                ps.setString(2,phoneNo);
                ps.setString(3,role);
                ps.setInt(4, id);

                if(ps.executeUpdate() > 0)
                {
                    showEmployeesInTable();
                    System.out.println("Employee Updated");

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("One or more fields are empty");
        }
    }//GEN-LAST:event_eUpdateActionPerformed

    private void eDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eDeleteActionPerformed
        // TODO add your handling code here:
        
        //remove
        if(Integer.valueOf(eId1.getValue().toString()) > 0){
            Integer id = Integer.valueOf(eId1.getValue().toString());
            
            String deleteQuery = "DELETE FROM employee WHERE employeeId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
                ps.setInt(1, id);

                if(ps.executeUpdate() > 0)
                {
                    showEmployeesInTable();
                    System.out.println("Employee Deleted");
                    pClearFields();

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Employee_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Enter the correc ID");
        }
        
    }//GEN-LAST:event_eDeleteActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // TODO add your handling code here:
        //search product by name
        
            String name = pName1.getText();
            System.out.print(("SELECT productName,category,quantity,inPrice,outPrice FROM product WHERE productName = '" + name + "'"));

            try {
//                String selectQuery = "SELECT productName,category,quantity,inPrice,outPrice FROM product WHERE productName = ?";
                Statement s = DB.getConnection().createStatement();
                
                ResultSet rs = s.executeQuery("SELECT * FROM product WHERE productName = '" + name + "'");
                
                if(rs.next()){
                    pId.setValue(rs.getInt("productId"));
                    pName.setText(rs.getString("productName"));
                    pCategory.setSelectedItem(rs.getString("category"));
                    pQuantity.setText(rs.getString("quantity"));
                    pInPrice.setText(rs.getString("inPrice"));
                    pOutPrice.setText(rs.getString("outPrice"));
                    pShowSearchResult(name);
                }else{
                    System.out.println("No product with this name");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
       
        
        
        
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void pSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pSaveActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if(pCheckEmptyFields()){
            String name = pName.getText();
            String category = pCategory.getSelectedItem().toString();
            Integer quantity = Integer.valueOf(pQuantity.getText());
            Double inPrice = Double.valueOf(pInPrice.getText());
            Double outPrice = Double.valueOf(pOutPrice.getText());

            String insertQuery = "INSERT INTO product(productName, category, quantity, inPrice, outPrice) VALUES(?,?,?,?,?)";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
                ps.setString(1,name);
                ps.setString(2,category);
                ps.setInt(3,quantity);
                ps.setDouble(4,inPrice);
                ps.setDouble(5,outPrice);

                if(ps.executeUpdate() > 0)
                {
                    showProductsInTable();
                    System.out.println("New Product Added");
                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("One or more fields are empty");
        }
        
    }//GEN-LAST:event_pSaveActionPerformed

    private void pUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pUpdateActionPerformed
        // TODO add your handling code here:
        if(pCheckEmptyFields()){
            Integer id = Integer.valueOf(pId.getValue().toString());
            String name = pName.getText();
            String category = pCategory.getSelectedItem().toString();
            Integer quantity = Integer.valueOf(pQuantity.getText());
            Double inPrice = Double.valueOf(pInPrice.getText());
            Double outPrice = Double.valueOf(pOutPrice.getText());

            String updateQuery = "UPDATE product SET productName = ?, category = ?, quantity = ?, inPrice = ?, outPrice = ? WHERE productId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
                ps.setString(1,name);
                ps.setString(2,category);
                ps.setInt(3,quantity);
                ps.setDouble(4,inPrice);
                ps.setDouble(5,outPrice);
                ps.setInt(6, id);

                if(ps.executeUpdate() > 0)
                {
                    showProductsInTable();
                    System.out.println("Product Updated");

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("One or more fields are empty");
        }
        
        
        
    }//GEN-LAST:event_pUpdateActionPerformed

    private void pDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pDeleteActionPerformed
        // TODO add your handling code here:
        //remove
        if(Integer.valueOf(pId.getValue().toString()) > 0){
            Integer id = Integer.valueOf(pId.getValue().toString());
            
            String deleteQuery = "DELETE FROM product WHERE productId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
                ps.setInt(1, id);

                if(ps.executeUpdate() > 0)
                {
                    showProductsInTable();
                    System.out.println("Product Deleted");
                    pClearFields();

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Enter the correc ID");
        }
        
    }//GEN-LAST:event_pDeleteActionPerformed

    private void cSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSearchActionPerformed
        // TODO add your handling code here:
        //search customer by name
        
            String name = cName1.getText();

            try {
                Statement s = DB.getConnection().createStatement();
                
                ResultSet rs = s.executeQuery("SELECT * FROM customer WHERE customerName = '" + name + "'");
                
                if(rs.next()){
                    cName.setText(rs.getString("customerName"));
                    cId.setValue(rs.getInt("customerId"));
                    cPhoneNo.setText(rs.getString("customerPhoneNo"));
                    
                }else{
                    System.out.println("No customer with this name");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_cSearchActionPerformed

    private void cSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cSaveActionPerformed
        // TODO add your handling code here:
        String name = cName.getText();
        
        String phoneNo = cPhoneNo.getText();
        
        
        
        String insertQuery = "INSERT INTO customer(customerName,customerPhoneNo) VALUES(?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1,name);
            
            ps.setString(2,phoneNo);
            
            if(ps.executeUpdate() > 0)
            {
                showCustomersInTable();
                System.out.println("New Customer Added");
            
            }
            else{
                System.out.println("Some Error Message here");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cSaveActionPerformed

    private void cUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUpdateActionPerformed
        // TODO add your handling code here:
        if(cCheckEmptyFields()){
            Integer id = Integer.valueOf(cId.getValue().toString());
            String name = cName.getText();
            String phoneNo = cPhoneNo.getText();
            
            

            String updateQuery = "UPDATE customer SET customerName = ?, customerPhoneNo = ? WHERE customerId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
                ps.setString(1,name);
                ps.setString(2,phoneNo);
                ps.setInt(3, id);

                if(ps.executeUpdate() > 0)
                {
                    showCustomersInTable();
                    System.out.println("Customer Updated");

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("One or more fields are empty");
        }
    }//GEN-LAST:event_cUpdateActionPerformed

    private void cDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDeleteActionPerformed
        // TODO add your handling code here:
        
        //remove
        if(Integer.valueOf(cId.getValue().toString()) > 0){
            Integer id = Integer.valueOf(cId.getValue().toString());
            
            String deleteQuery = "DELETE FROM customer WHERE customerId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
                ps.setInt(1, id);

                if(ps.executeUpdate() > 0)
                {
                    showCustomersInTable();
                    System.out.println("Customer Deleted");
                    pClearFields();

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Customer_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Enter the correc ID");
        }
    }//GEN-LAST:event_cDeleteActionPerformed

    private void sSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sSearchActionPerformed
        // TODO add your handling code here:
        //search supplier by name
        
            String name = sName1.getText();

            try {
                Statement s = DB.getConnection().createStatement();
                
                ResultSet rs = s.executeQuery("SELECT * FROM supplier WHERE supplierName = '" + name + "'");
                
                if(rs.next()){
                    sName.setText(rs.getString("supplierName"));
                    sId.setValue(rs.getInt("supplierId"));
                    sBarCode.setText(rs.getString("barCode"));
                    
                }else{
                    System.out.println("No supplier with this name");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_sSearchActionPerformed

    private void sSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sSaveActionPerformed
        // TODO add your handling code here:
        String name = sName.getText();
        
        String barCode = sBarCode.getText();
        
        
        
        String insertQuery = "INSERT INTO supplier(supplierName,barCode) VALUES(?,?)";
        
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1,name);
            
            ps.setString(2,barCode);
            
            if(ps.executeUpdate() > 0)
            {
                showSuppliersInTable();
                System.out.println("New Supplier Added");
            
            }
            else{
                System.out.println("Some Error Message here");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sSaveActionPerformed

    private void sUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sUpdateActionPerformed
        // TODO add your handling code here:
        if(sCheckEmptyFields()){
            Integer id = Integer.valueOf(sId.getValue().toString());
            String name = sName.getText();
            String barCode = sBarCode.getText();
            
            

            String updateQuery = "UPDATE supplier SET supplierName = ?, barCode = ? WHERE supplierId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
                ps.setString(1,name);
                ps.setString(2,barCode);
                
                ps.setInt(3, id);

                if(ps.executeUpdate() > 0)
                {
                    showSuppliersInTable();
                    System.out.println("Supplier Updated");

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Product_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("One or more fields are empty");
        }
    }//GEN-LAST:event_sUpdateActionPerformed

    private void sDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sDeleteActionPerformed
        // TODO add your handling code here:
        
        //remove
        if(Integer.valueOf(sId.getValue().toString()) > 0){
            Integer id = Integer.valueOf(sId.getValue().toString());
            
            String deleteQuery = "DELETE FROM supplier WHERE supplierId = ?";

            try {
                PreparedStatement ps = DB.getConnection().prepareStatement(deleteQuery);
                ps.setInt(1, id);

                if(ps.executeUpdate() > 0)
                {
                    showSuppliersInTable();
                    System.out.println("Supplier Deleted");
                    pClearFields();

                }
                else{
                    System.out.println("Some Error Message here");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Supplier_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("Enter the correc ID");
        }
    }//GEN-LAST:event_sDeleteActionPerformed

    private void pNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pNameActionPerformed

    private void pCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pCategoryActionPerformed

    private void pInPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pInPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pInPriceActionPerformed

    private void pOutPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pOutPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pOutPriceActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int index = jTable2.getSelectedRow();
        showProductData(index);
    }//GEN-LAST:event_jTable2MouseClicked
    private void pInPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pInPriceKeyReleased
        // TODO add your handling code here:
        try{
            Double.valueOf(pInPrice.getText());
        }
        catch(NumberFormatException ex){
            System.out.println(ex.getMessage());
            pInPrice.setText("");
        }
    }//GEN-LAST:event_pInPriceKeyReleased

    private void pQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pQuantityKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_pQuantityKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        // TODO add your handling code here:
        String searchTearm=eName1.getText();
        int index = jTable1.getSelectedRow();
        showEmployeeData(index);
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        int index = jTable4.getSelectedRow();
        showSupplierData(index);
    }//GEN-LAST:event_jTable4MouseClicked

    private void eRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eRefActionPerformed
        showEmployeesInTable();
        eClearFields();
    }//GEN-LAST:event_eRefActionPerformed

    private void pRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pRefActionPerformed
        // TODO add your handling code here:
        showProductsInTable();
        pClearFields();
    }//GEN-LAST:event_pRefActionPerformed

    private void cRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cRefActionPerformed
        // TODO add your handling code here:
        showCustomersInTable();
        cClearFields();
    }//GEN-LAST:event_cRefActionPerformed

    private void sRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sRefActionPerformed
        // TODO add your handling code here:
        showSuppliersInTable();
        sClearFields();
    }//GEN-LAST:event_sRefActionPerformed

    private void eName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eName1ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int index = jTable3.getSelectedRow();
        showCustomerData(index);
    }//GEN-LAST:event_jTable3MouseClicked

    private void pName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pName1ActionPerformed

    private void pName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pName1KeyReleased
        // TODO add your handling code here:
        String name = pName1.getText();
        try {
        // Clear the existing table data
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        dt.setRowCount(0);

        // Establish a database connection
        Statement s = DB.getConnection().createStatement();

        // Execute the SQL query to filter products based on the search term
        ResultSet rs = s.executeQuery("SELECT * FROM product WHERE productName LIKE '%" + name + "%'");

        // Create an ArrayList to store the filtered product data
        ArrayList<Product> filteredProducts = new ArrayList<>();

        while (rs.next()) {
            // Create a Product object from the retrieved data
            Product product = new Product(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getInt(4), rs.getDouble(5),
                    rs.getDouble(6));

            // Add the Product object to the ArrayList
            filteredProducts.add(product);
        }

        // Update the JTable with the filtered product data
        for (Product product : filteredProducts) {
            Vector v = new Vector();
            v.add(product.getName());
            v.add(product.getCategory());
            v.add(product.getQuantity());
            v.add(product.getInPrice());
            v.add(product.getOutPrice());

            dt.addRow(v);
        }
    } catch (Exception ex) {
        // Handle any exceptions that occur during database operations
        System.out.println("Error retrieving product data: " + ex.getMessage());
    }
    }//GEN-LAST:event_pName1KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame frame = new JFrame("Logout");
        if(jOptionPane.showConfirmDialog(frame, "Confirm if you want to Log Out","Logout", jOptionPane.YES_NO_OPTION) == jOptionPane.YES_NO_OPTION)
        {
            this.dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_eName1KeyReleased
        // TODO add your handling code here:
        
        // TODO add your handling code here:
        String name = eName1.getText();
        try {
        // Clear the existing table data
        DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
        dt.setRowCount(0);

        // Establish a database connection
        Statement s = DB.getConnection().createStatement();

        // Execute the SQL query to filter employees based on the search term
        ResultSet rs = s.executeQuery("SELECT * FROM employee WHERE employeeName LIKE '%" + name + "%'");

        // Create an ArrayList to store the filtered employee data
        ArrayList<Employee> filteredEmployees = new ArrayList<>();

        while (rs.next()) {
            // Create a Employee object from the retrieved data
            Employee employee = new Employee(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4));

            // Add the Employee object to the ArrayList
            filteredEmployees.add(employee);
        }

        // Update the JTable with the filtered employee data
        for (Employee employee : filteredEmployees) {
            Vector v = new Vector();
            v.add(employee.getName());
            v.add(employee.getPhoneNo());
            v.add(employee.getRole());
            

            dt.addRow(v);
        }
    } catch (Exception ex) {
        // Handle any exceptions that occur during database operations
        System.out.println("Error retrieving employee data: " + ex.getMessage());
    }
    }//GEN-LAST:event_eName1KeyReleased

    private void cName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cName1KeyReleased
        // TODO add your handling code here:
                                         
        String name = cName1.getText();
        try {
        // Clear the existing table data
        DefaultTableModel dt = (DefaultTableModel) jTable3.getModel();
        dt.setRowCount(0);

        // Establish a database connection
        Statement s = DB.getConnection().createStatement();

        // Execute the SQL query to filter customers based on the search term
        ResultSet rs = s.executeQuery("SELECT * FROM customer WHERE customerName LIKE '%" + name + "%'");

        // Create an ArrayList to store the filtered customer data
        ArrayList<Customer> filteredCustomers = new ArrayList<>();

        while (rs.next()) {
            // Create a Customer object from the retrieved data
            Customer customer = new Customer(rs.getInt(1), rs.getString(2),rs.getString(3));

            // Add the Customer object to the ArrayList
            filteredCustomers.add(customer);
        }

        // Update the JTable with the filtered customer data
        for (Customer customer : filteredCustomers) {
            Vector v = new Vector();
            v.add(customer.getName());
            v.add(customer.getPhoneNo());
            
            

            dt.addRow(v);
        }
    } catch (Exception ex) {
        // Handle any exceptions that occur during database operations
        System.out.println("Error retrieving customer data: " + ex.getMessage());
    }
    
    }//GEN-LAST:event_cName1KeyReleased

    private void sName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sName1KeyReleased
        // TODO add your handling code here:
        String name = sName1.getText();
        try {
        // Clear the existing table data
        DefaultTableModel dt = (DefaultTableModel) jTable4.getModel();
        dt.setRowCount(0);

        // Establish a database connection
        Statement s = DB.getConnection().createStatement();

        // Execute the SQL query to filter suppliers based on the search term
        ResultSet rs = s.executeQuery("SELECT * FROM supplier WHERE supplierName LIKE '%" + name + "%'");

        // Create an ArrayList to store the filtered supplier data
        ArrayList<Supplier> filteredSuppliers = new ArrayList<>();

        while (rs.next()) {
            // Create a Supplier object from the retrieved data
            Supplier supplier = new Supplier(rs.getInt(1), rs.getString(2),rs.getString(3));

            // Add the Supplier object to the ArrayList
            filteredSuppliers.add(supplier);
        }

        // Update the JTable with the filtered supplier data
        for (Supplier supplier : filteredSuppliers) {
            Vector v = new Vector();
            v.add(supplier.getName());
            v.add(supplier.getBarCode());
            
            

            dt.addRow(v);
        }
    } catch (Exception ex) {
        // Handle any exceptions that occur during database operations
        System.out.println("Error retrieving supplier data: " + ex.getMessage());
    }
    }//GEN-LAST:event_sName1KeyReleased

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Home().setVisible(true);
//            }
//        });
//    }
    private javax.swing.JOptionPane jOptionPane;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton cDelete;
    private javax.swing.JSpinner cId;
    private javax.swing.JTextField cName;
    private javax.swing.JTextField cName1;
    private javax.swing.JTextField cPhoneNo;
    private javax.swing.JToggleButton cRef;
    private javax.swing.JToggleButton cSave;
    private javax.swing.JToggleButton cSearch;
    private javax.swing.JToggleButton cUpdate;
    private javax.swing.JToggleButton eDelete;
    private javax.swing.JSpinner eId1;
    private javax.swing.JTextField eName;
    private javax.swing.JTextField eName1;
    private javax.swing.JTextField ePhoneNo;
    private javax.swing.JToggleButton eRef;
    private javax.swing.JComboBox<String> eRole;
    private javax.swing.JToggleButton eSave;
    private javax.swing.JToggleButton eSearch;
    private javax.swing.JToggleButton eUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
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
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    private javax.swing.JComboBox<String> pCategory;
    private javax.swing.JToggleButton pDelete;
    private javax.swing.JSpinner pId;
    private javax.swing.JTextField pInPrice;
    private javax.swing.JTextField pName;
    private javax.swing.JTextField pName1;
    private javax.swing.JTextField pOutPrice;
    private javax.swing.JTextField pQuantity;
    private javax.swing.JToggleButton pRef;
    private javax.swing.JToggleButton pSave;
    private javax.swing.JToggleButton pUpdate;
    private javax.swing.JTextField sBarCode;
    private javax.swing.JToggleButton sDelete;
    private javax.swing.JSpinner sId;
    private javax.swing.JTextField sName;
    private javax.swing.JTextField sName1;
    private javax.swing.JToggleButton sRef;
    private javax.swing.JToggleButton sSave;
    private javax.swing.JToggleButton sSearch;
    private javax.swing.JToggleButton sUpdate;
    // End of variables declaration//GEN-END:variables
}
