/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SearchOperation;

import static SearchOperation.HSNSACCodeList.tablename;
import TableOperation.InsertDataToTable;
import TableOperation.InsertHSNDataToTable;
import TableOperation.InsertPartyNameToTable;

import dboperation.HSNSACCODEDBOperation;
import dboperation.PurchaseDBOperation;
import java.awt.Color;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import staffGUI.AddClientFrame;
import staffGUI.NewPurchaseFrame;
import validation.GSTStateCode;


public class PartyNameSearchFilter extends javax.swing.JFrame {

   
    public PartyNameSearchFilter() {
        initComponents();
        ((DefaultTableCellRenderer)jTable1.getTableHeader().getDefaultRenderer())
           .setHorizontalAlignment((int) TOP_ALIGNMENT);
        
         int rowheight=30; 
         ArrayList partylist = new PurchaseDBOperation().getPartyNames();
         
      //   System.out.println("PartyList: "+partylist);
        int columncount = jTable1.getColumnCount();
        InsertPartyNameToTable it = new InsertPartyNameToTable();
        it.getDataInserted(jTable1, columncount, partylist,rowheight);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(250, 450));
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setText("Search:");

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/select.png"))); // NOI18N
        jButton1.setText("Select");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Party Name", "GSTIN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTable1FocusLost(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 51, 102));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addcompany.png"))); // NOI18N
        jButton2.setText("Add New Party");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        String sword=jTextField1.getText();
        sword=sword.trim();

        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(((DefaultTableModel) jTable1.getModel()));
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + sword));
        jTable1.setRowSorter(sorter);
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         String pstr=jTextField1.getText();
         if(pstr.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Please Select the Party From the given List");
         }
         else
         {
             
         
             
        
        NewPurchaseFrame.jLabel2.setText(jTextField1.getText().toUpperCase());
        String pname=jTextField1.getText();
        NewPurchaseFrame.jTextField5.setText(pname);
        ArrayList partyinfo= new PurchaseDBOperation().getPartyInfo(pname);
     //   ArrayList centers=new PurchaseDBOperation().getCostCentersNames();
        
      //  System.out.println("Centers: "+centers);
        
        String gst=(String) partyinfo.get(4);
        
       if(gst.equals("Unregistered")) 
       {
           
           String bankinfo="";
            String bankdetails=(String) partyinfo.get(7);
            
            if(bankdetails.equals("No Bank Info"))
            {
                bankinfo="No Bank info";
                NewPurchaseFrame.jLabel14.setText(bankinfo);
                NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>" + (String) partyinfo.get(0) + "<br>" + (String) partyinfo.get(1) + "<br>" + (String) partyinfo.get(2) + "<br>" + (String) partyinfo.get(3) + "</div></html>");
                NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
               // NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
               // NewPurchaseFrame.jComboBox3.setSelectedItem(gst);
            }
           else
            {
                
           
                  
        //  System.out.println(bankdetails);
        String []bdetails =bankdetails.split(",");
        String dbankacc=bdetails[0];
        String bank="";

        for (int i = 1; i <bdetails.length; i++)
        {
            String str=bdetails[i];
            if(str.contains(dbankacc))
            bank=str;

        }
    
        String bstr[]=bank.split("#");

        //    System.out.println("Bank: "+bank);

        NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>"+(String) partyinfo.get(0)+"<br>"+(String) partyinfo.get(1)+"<br>"+(String) partyinfo.get(2)+"<br>"+(String) partyinfo.get(3)+"</div></html>");
        NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
      //  NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
       // NewPurchaseFrame.jComboBox3.setSelectedItem(gst);
        NewPurchaseFrame.jLabel14.setText("<html><div style='text-align: left;'>"+"Bank Name: "+bstr[0]+"<br>"+"Account Number: "+bstr[1]+"<br>"+"IFSC Code: "+bstr[2]+"<br>"+"Account Name: "+bstr[3]+"<br>"+"Account Type: "+bstr[4]+"</div></html>");
        
         bankinfo=bstr[0]+"#"+bstr[1]+"#"+bstr[2]+"#"+bstr[3]+"#"+bstr[4];
    
        
            }
              NewPurchaseFrame.bankdetails=bankinfo;
           
       }
       
       else
       {
           String substr1="" ;
        gst = gst.trim();

        String scode = "";

        if (gst.length()>2)
        {
            substr1 = gst.substring(0, 2);
        }
        substr1=substr1.trim();
     //  System.out.println("GST 1: " + substr1);
NewPurchaseFrame.partygstcode=Integer.parseInt(substr1);
        ArrayList statecode = new GSTStateCode().getStateCode();
        for (int i = 0; i < statecode.size(); i++)
        {   
            String str = (String) statecode.get(i);
            String substr2 = str.substring(0, 2);
            substr2=substr2.trim();
          //  System.out.println("GST 1: " + substr1);
          //  System.out.println("GST 2: " + substr2);
            if (substr2.equals(substr1))
            {
                scode = str;
                break;
            }
          }
       
        
           String bankinfo="";
            String bankdetails=(String) partyinfo.get(7);
            
            if(bankdetails.equals("No Bank Info"))
            {
                bankinfo="No Bank info";
                NewPurchaseFrame.jLabel14.setText(bankinfo);
                NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>" + (String) partyinfo.get(0) + "<br>" + (String) partyinfo.get(1) + "<br>" + (String) partyinfo.get(2) + "<br>" + (String) partyinfo.get(3) + "</div></html>");
                NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
               // NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
               // NewPurchaseFrame.jComboBox3.setSelectedItem(gst);
            }
           else
            {
                  //  System.out.println(bankdetails);
        String []bdetails =bankdetails.split(",");
        String dbankacc=bdetails[0];
        String bank="";

        for (int i = 1; i <bdetails.length; i++)
        {
            String str=bdetails[i];
            if(str.contains(dbankacc))
            bank=str;

        }

        String bstr[]=bank.split("#");

        //    System.out.println("Bank: "+bank);

        NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>"+(String) partyinfo.get(0)+"<br>"+(String) partyinfo.get(1)+"<br>"+(String) partyinfo.get(2)+"<br>"+(String) partyinfo.get(3)+"</div></html>");
        NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
      //  NewPurchaseFrame.jComboBox3.setSelectedItem(scode);
        
      //  NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
        NewPurchaseFrame.jLabel14.setText("<html><div style='text-align: left;'>"+"Bank Name: "+bstr[0]+"<br>"+"Account Number: "+bstr[1]+"<br>"+"IFSC Code: "+bstr[2]+"<br>"+"Account Name: "+bstr[3]+"<br>"+"Account Type: "+bstr[4]+"</div></html>");
        
         bankinfo=bstr[0]+"#"+bstr[1]+"#"+bstr[2]+"#"+bstr[3]+"#"+bstr[4];

         
            }
        
                NewPurchaseFrame.bankdetails=bankinfo;
       
      
           
       }
      
        
        
        this.dispose();
        NewPurchaseFrame.partyselectionframevalue=0;
         }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
        // TODO add your handling code here:
        
         
      
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
        String pstr=jTextField1.getText();
         if(pstr.isEmpty())
         {
             JOptionPane.showMessageDialog(null, "Please Select the Party From the given List");
         }
         else
         {
             
         
             
        
        NewPurchaseFrame.jLabel2.setText(jTextField1.getText().toUpperCase());
        String pname=jTextField1.getText();
        NewPurchaseFrame.jTextField5.setText(pname);
        ArrayList partyinfo= new PurchaseDBOperation().getPartyInfo(pname);
     //   ArrayList centers=new PurchaseDBOperation().getCostCentersNames();
        
      //  System.out.println("Centers: "+centers);
        
        String gst=(String) partyinfo.get(4);
        
       if(gst.equals("Unregistered")) 
       {
           
           String bankinfo="";
            String bankdetails=(String) partyinfo.get(7);
            
            if(bankdetails.equals("No Bank Info"))
            {
                bankinfo="No Bank info";
                NewPurchaseFrame.jLabel14.setText(bankinfo);
                NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>" + (String) partyinfo.get(0) + "<br>" + (String) partyinfo.get(1) + "<br>" + (String) partyinfo.get(2) + "<br>" + (String) partyinfo.get(3) + "</div></html>");
                NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
               // NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
               // NewPurchaseFrame.jComboBox3.setSelectedItem(gst);
            }
           else
            {
                
           
                  
        //  System.out.println(bankdetails);
        String []bdetails =bankdetails.split(",");
        String dbankacc=bdetails[0];
        String bank="";

        for (int i = 1; i <bdetails.length; i++)
        {
            String str=bdetails[i];
            if(str.contains(dbankacc))
            bank=str;

        }
    
        String bstr[]=bank.split("#");

        //    System.out.println("Bank: "+bank);

        NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>"+(String) partyinfo.get(0)+"<br>"+(String) partyinfo.get(1)+"<br>"+(String) partyinfo.get(2)+"<br>"+(String) partyinfo.get(3)+"</div></html>");
        NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
      //  NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
       // NewPurchaseFrame.jComboBox3.setSelectedItem(gst);
        NewPurchaseFrame.jLabel14.setText("<html><div style='text-align: left;'>"+"Bank Name: "+bstr[0]+"<br>"+"Account Number: "+bstr[1]+"<br>"+"IFSC Code: "+bstr[2]+"<br>"+"Account Name: "+bstr[3]+"<br>"+"Account Type: "+bstr[4]+"</div></html>");
        
         bankinfo=bstr[0]+"#"+bstr[1]+"#"+bstr[2]+"#"+bstr[3]+"#"+bstr[4];
    
        
            }
              NewPurchaseFrame.bankdetails=bankinfo;
           
       }
       
       else
       {
           String substr1="" ;
        gst = gst.trim();

        String scode = "";

        if (gst.length()>2)
        {
            substr1 = gst.substring(0, 2);
        }
        substr1=substr1.trim();
     //  System.out.println("GST 1: " + substr1);
NewPurchaseFrame.partygstcode=Integer.parseInt(substr1);
        ArrayList statecode = new GSTStateCode().getStateCode();
        for (int i = 0; i < statecode.size(); i++)
        {   
            String str = (String) statecode.get(i);
            String substr2 = str.substring(0, 2);
            substr2=substr2.trim();
          //  System.out.println("GST 1: " + substr1);
          //  System.out.println("GST 2: " + substr2);
            if (substr2.equals(substr1))
            {
                scode = str;
                break;
            }
          }
       
        
           String bankinfo="";
            String bankdetails=(String) partyinfo.get(7);
            
            if(bankdetails.equals("No Bank Info"))
            {
                bankinfo="No Bank info";
                NewPurchaseFrame.jLabel14.setText(bankinfo);
                NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>" + (String) partyinfo.get(0) + "<br>" + (String) partyinfo.get(1) + "<br>" + (String) partyinfo.get(2) + "<br>" + (String) partyinfo.get(3) + "</div></html>");
                NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
               // NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
               // NewPurchaseFrame.jComboBox3.setSelectedItem(gst);
            }
           else
            {
                  //  System.out.println(bankdetails);
        String []bdetails =bankdetails.split(",");
        String dbankacc=bdetails[0];
        String bank="";

        for (int i = 1; i <bdetails.length; i++)
        {
            String str=bdetails[i];
            if(str.contains(dbankacc))
            bank=str;

        }

        String bstr[]=bank.split("#");

        //    System.out.println("Bank: "+bank);

        NewPurchaseFrame.jLabel5.setText("<html><div style='text-align: left;'>"+(String) partyinfo.get(0)+"<br>"+(String) partyinfo.get(1)+"<br>"+(String) partyinfo.get(2)+"<br>"+(String) partyinfo.get(3)+"</div></html>");
        NewPurchaseFrame.jLabel6.setText((String) partyinfo.get(4));
      //  NewPurchaseFrame.jComboBox3.setSelectedItem(scode);
        
      //  NewPurchaseFrame.jComboBox4.setModel(new DefaultComboBoxModel<String>((String[]) centers.toArray(new String[0])));
        NewPurchaseFrame.jLabel14.setText("<html><div style='text-align: left;'>"+"Bank Name: "+bstr[0]+"<br>"+"Account Number: "+bstr[1]+"<br>"+"IFSC Code: "+bstr[2]+"<br>"+"Account Name: "+bstr[3]+"<br>"+"Account Type: "+bstr[4]+"</div></html>");
        
         bankinfo=bstr[0]+"#"+bstr[1]+"#"+bstr[2]+"#"+bstr[3]+"#"+bstr[4];

         
            }
        
                NewPurchaseFrame.bankdetails=bankinfo;
       
      
           
       }
      
        
        
        this.dispose();
        NewPurchaseFrame.partyselectionframevalue=0;
         }

        
        }

    }//GEN-LAST:event_jButton1KeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int index1=jTable1.getSelectedRow();

        String code=(String) jTable1.getValueAt(index1, 0);
        jTextField1.setText(code);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            int index1=jTable1.getSelectedRow();

            String code=(String) jTable1.getValueAt(index1, 0);
            jTextField1.setText(code);
           
        }
         if(evt.getKeyCode()==KeyEvent.VK_TAB)
        {
            if (evt.getModifiers() > 0) {
                        jTable1.transferFocusBackward();
                    } else {
                        jTable1.transferFocus();
                    }
                    evt.consume();
        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
             NewPurchaseFrame.partyselectionframevalue=0;
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        // TODO add your handling code here:
       this.dispose();
        NewPurchaseFrame.partyselectionframevalue=0;
    }//GEN-LAST:event_jLabel2KeyPressed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
        // TODO add your handling code here:
        Color clr = new Color(51,161,222);
        jTable1.setBorder(new LineBorder(clr,1));
    }//GEN-LAST:event_jTable1FocusGained

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {

            this.dispose();
            Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
            AddClientFrame af=new AddClientFrame();
            af.setVisible(true);
            af.setSize(d);
        }
    }//GEN-LAST:event_jButton2KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();

        AddClientFrame af=new AddClientFrame();
        af.setVisible(true);
        af.setSize(d);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
        // TODO add your handling code here:
        jButton1.transferFocusDownCycle();
    }//GEN-LAST:event_jButton1FocusGained

    private void jTable1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusLost
        // TODO add your handling code here:
        jTable1.setBorder(new EtchedBorder());
    }//GEN-LAST:event_jTable1FocusLost

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
            java.util.logging.Logger.getLogger(PartyNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartyNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartyNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartyNameSearchFilter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartyNameSearchFilter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}