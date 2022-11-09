/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.system;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class nonveg_win_set extends javax.swing.JFrame {
Connection con;
Statement stmt;
ResultSet rs;
PreparedStatement pst;
  
    public nonveg_win_set() {
        initComponents();
        datesettoday();
        Connect();
         setExtendedState(JFrame.MAXIMIZED_BOTH);
        loadjcombo();
        thaedloading();
        cust_data_load1();
        cust_data_load2();
        cust_data_load3();
    }

public void datesettoday(){
Date date = new Date();
jDateChooser1.setDate(date);
    }
 public void Connect() {
    try{
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurant_management","root","");
      stmt = con.createStatement();
     
    }catch(SQLException ex){
       JOptionPane.showMessageDialog(this,ex.getMessage());
    }
    }
    public void loadjcombo(){
    try{
    String sql = "SELECT * FROM `rest_data`";
    rs = stmt.executeQuery(sql);
    while(rs.next()){
         tbl_serc.addItem(rs.getString("tabel_no"));  
         waiter_serc.addItem(rs.getString("waiter_nam"));
    }}
    
    catch(SQLException ex){
     JOptionPane.showMessageDialog(this, ex.getMessage());
    }
    }
  public void thaedloading(){
 
 roti_search_set.getTableHeader().setBackground(new Color(12, 90, 145));
 roti_search_set.getTableHeader().setOpaque(false);
 roti_search_set.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
 roti_search_set.getTableHeader().setForeground(new Color(255,255,255));
 roti_search_set.setRowHeight(25);

 
 rice_search.getTableHeader().setBackground(new Color(12, 90, 145));
 rice_search.getTableHeader().setOpaque(false);
 rice_search.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
 rice_search.getTableHeader().setForeground(new Color(255,255,255));
 rice_search.setRowHeight(25);
 
 food_name_ser.getTableHeader().setBackground(new Color(12, 90, 145));
 food_name_ser.getTableHeader().setOpaque(false);
 food_name_ser.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
 food_name_ser.getTableHeader().setForeground(new Color(255,255,255));
 food_name_ser.setRowHeight(25);


  }     
   public void cust_data_load1(){
            try{
    String sql = "SELECT * FROM `roti`";
    rs = stmt.executeQuery(sql);
    while(rs.next()){
    String id1 = String.valueOf(rs.getString("food_name"));
    String name = String.valueOf(rs.getString("rate"));
    String tbdata[] ={id1,name};
    DefaultTableModel tblmodel = (DefaultTableModel)roti_search_set.getModel();
    tblmodel.addRow(tbdata);
    }
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(this,ex.getMessage());
    }}      
   
     public void cust_data_load2(){
            try{
    String sql = "SELECT * FROM `rice`";
    rs = stmt.executeQuery(sql);
    while(rs.next()){
    String id1 = String.valueOf(rs.getString("food_name"));
    String name = String.valueOf(rs.getString("rate"));
    String tbdata[] ={id1,name};
    DefaultTableModel tblmodel = (DefaultTableModel)rice_search.getModel();
    tblmodel.addRow(tbdata);
    }
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(this,ex.getMessage());
    }}      
   
    public void cust_data_load3(){
            try{
    String sql = "SELECT * FROM `non_veg_menu`";
    rs = stmt.executeQuery(sql);
    while(rs.next()){
    String id1 = String.valueOf(rs.getString("food_name"));
    String name = String.valueOf(rs.getString("rate"));
    String tbdata[] ={id1,name};
    DefaultTableModel tblmodel = (DefaultTableModel)food_name_ser.getModel();
    tblmodel.addRow(tbdata);
    }
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(this,ex.getMessage());
    }}      
   
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        food_name_ser = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        main_bill_tb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        food_name_search = new javax.swing.JTextField();
        Rate_search_ss = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tbl_serc = new javax.swing.JComboBox<>();
        waiter_serc = new javax.swing.JComboBox<>();
        amt_tot_search = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        rice_search = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        roti_search_set = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        food_name_ser.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        food_name_ser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Item", "Rate"
            }
        ));
        food_name_ser.setShowVerticalLines(false);
        food_name_ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                food_name_serMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(food_name_ser);

        main_bill_tb.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        main_bill_tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Food Item", "Qty", "Rate", "Date", "Tabel", "Waiter", "Amount"
            }
        ));
        main_bill_tb.setRowHeight(30);
        main_bill_tb.setShowVerticalLines(false);
        jScrollPane2.setViewportView(main_bill_tb);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Non Veg Menu");

        food_name_search.setEditable(false);
        food_name_search.setBackground(new java.awt.Color(204, 255, 204));
        food_name_search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        Rate_search_ss.setEditable(false);
        Rate_search_ss.setBackground(new java.awt.Color(204, 255, 204));
        Rate_search_ss.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jSpinner1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton1.setText("Add Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton2.setText("Add To Main Bill");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbl_serc.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        tbl_serc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Table" }));

        waiter_serc.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        waiter_serc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select waiter" }));

        amt_tot_search.setEditable(false);
        amt_tot_search.setBackground(new java.awt.Color(204, 255, 204));
        amt_tot_search.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jDateChooser1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N

        rice_search.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        rice_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rice", "Rate"
            }
        ));
        rice_search.setShowVerticalLines(false);
        rice_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rice_searchMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(rice_search);

        roti_search_set.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        roti_search_set.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Roti", "Rate"
            }
        ));
        roti_search_set.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        roti_search_set.setShowVerticalLines(false);
        roti_search_set.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roti_search_setMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(roti_search_set);

        jButton3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton3.setText("Calculation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton4.setText("Back To Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tbl_serc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(waiter_serc, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(81, 81, 81))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Rate_search_ss, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(amt_tot_search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(26, 26, 26)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(food_name_search, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(86, 86, 86)))))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(food_name_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rate_search_ss)
                            .addComponent(amt_tot_search)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbl_serc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(waiter_serc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void food_name_serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_food_name_serMouseClicked
        //mouse cick show data in veg
        int index = food_name_ser.getSelectedRow();
        TableModel model = food_name_ser.getModel();
        String fno = model.getValueAt(index, 0).toString();
        String d_flight = model.getValueAt(index, 1).toString();

        food_name_search.setText(fno);
        Rate_search_ss.setText(d_flight);
    }//GEN-LAST:event_food_name_serMouseClicked

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked

    }//GEN-LAST:event_jSpinner1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // DATA ADD TABEL
        if(amt_tot_search.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Calculate Amount");
        }else{
            String ff_n =  food_name_search.getText();
            String ras =  Rate_search_ss.getText();
            String sel_tbll = tbl_serc.getSelectedItem().toString();
            String sel_wittt =waiter_serc.getSelectedItem().toString();
            int qty_foff = (int) jSpinner1.getValue();
            String fulamt = amt_tot_search.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String guest_check_in_d = sdf.format( jDateChooser1.getDate());

            DefaultTableModel model3 = (DefaultTableModel)main_bill_tb.getModel();
            model3.addRow(new Object[]{ff_n,qty_foff,ras,guest_check_in_d,sel_tbll,sel_wittt,fulamt});
            food_name_search.setText("");
            Rate_search_ss.setText("");

            jSpinner1.setValue(1);
            amt_tot_search.setText("");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Jtabel data insert database
        DefaultTableModel tbmodelset = (DefaultTableModel)main_bill_tb.getModel();
        if(tbmodelset.getRowCount()==0){
            JOptionPane.showMessageDialog(this,"Table is Empty");
        }else{
            try {
                String fooditem,qty,rate,date,tabel,waiter,amount;
                for(int i=0; i<tbmodelset.getRowCount();i++){
                    fooditem = tbmodelset.getValueAt(i,0).toString();
                    qty = tbmodelset.getValueAt(i,1).toString();
                    rate = tbmodelset.getValueAt(i,2).toString();
                    date = tbmodelset.getValueAt(i,3).toString();
                    tabel = tbmodelset.getValueAt(i,4).toString();
                    waiter = tbmodelset.getValueAt(i,5).toString();
                    amount = tbmodelset.getValueAt(i,6).toString();

                    String sql = "INSERT INTO `billing_tabel`( `food_name`, `waiter_set`, `tabel_no_set`, `qty`, `rate`, `amount_cust`, `bill_date`) VALUES (?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1,fooditem);
                    pst.setString(2,waiter);
                    pst.setString(3,tabel);
                    pst.setString(4,qty);
                    pst.setString(5,rate);
                    pst.setString(6,amount);
                    pst.setString(7,date);
                    pst.execute();
                }
                JOptionPane.showMessageDialog(this,"Data Insert Successfully.");
                tbmodelset.setRowCount(0);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this,ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rice_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rice_searchMouseClicked
        //mouse cick show data in rice
        int index = rice_search.getSelectedRow();
        TableModel model = rice_search.getModel();
        String fno = model.getValueAt(index, 0).toString();
        String d_flight = model.getValueAt(index, 1).toString();

        food_name_search.setText(fno);
        Rate_search_ss.setText(d_flight);
    }//GEN-LAST:event_rice_searchMouseClicked

    private void roti_search_setMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roti_search_setMouseClicked
        //mouse cick show data in roti
        int index = roti_search_set.getSelectedRow();
        TableModel model = roti_search_set.getModel();
        String fno = model.getValueAt(index, 0).toString();
        String d_flight = model.getValueAt(index, 1).toString();
        // String a_flight = model.getValueAt(index, 2).toString();
        food_name_search.setText(fno);
        Rate_search_ss.setText(d_flight);
    }//GEN-LAST:event_roti_search_setMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //calculate
        int sum = 0;
        int s = (int) jSpinner1.getValue();
        int i=Integer.parseInt(Rate_search_ss.getText());
        sum = s*i;
        String a = String.valueOf(sum);
        amt_tot_search.setText(a);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Dashboard dhb = new Dashboard();
        dhb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(nonveg_win_set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nonveg_win_set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nonveg_win_set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nonveg_win_set.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new nonveg_win_set().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Rate_search_ss;
    private javax.swing.JTextField amt_tot_search;
    private javax.swing.JTextField food_name_search;
    private javax.swing.JTable food_name_ser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable main_bill_tb;
    private javax.swing.JTable rice_search;
    private javax.swing.JTable roti_search_set;
    private javax.swing.JComboBox<String> tbl_serc;
    private javax.swing.JComboBox<String> waiter_serc;
    // End of variables declaration//GEN-END:variables
}
