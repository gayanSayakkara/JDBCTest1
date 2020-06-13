package item;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import thogakade.DBConnection;

public class UpdateItemForm extends javax.swing.JFrame {

    public UpdateItemForm() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemCodeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        itemDesTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        itemUnitPriceTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        itemQtdOnHandlTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Item");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Item");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Item Code ");

        itemCodeTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemCodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCodeTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item Description");

        itemDesTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemDesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemDesTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Item Unit Price ");

        itemUnitPriceTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemUnitPriceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemUnitPriceTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Quantity on Hand    ");

        itemQtdOnHandlTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        itemQtdOnHandlTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemQtdOnHandlTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText(":");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText(":");

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(itemDesTextField)
                                    .addComponent(itemCodeTextField)
                                    .addComponent(itemUnitPriceTextField)
                                    .addComponent(itemQtdOnHandlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(itemCodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(itemDesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(itemUnitPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(itemQtdOnHandlTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(updateButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemCodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCodeTextFieldActionPerformed
        try {
            String code = itemCodeTextField.getText();
            Item item = ItemController.searchItem(code);
            
            if (item!=null) {
                itemDesTextField.setText(item.getDescription());
                itemUnitPriceTextField.setText(item.getUnitPrice()+"");
                itemQtdOnHandlTextField.setText(item.getQtyOnHand()+"");
                
            }else{
                itemCodeTextField.setText("");
                itemDesTextField.setText("");
                itemUnitPriceTextField.setText("");
                itemQtdOnHandlTextField.setText("");
                JOptionPane.showMessageDialog(this, "No item found");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_itemCodeTextFieldActionPerformed

    private void itemDesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemDesTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemDesTextFieldActionPerformed

    private void itemUnitPriceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemUnitPriceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemUnitPriceTextFieldActionPerformed

    private void itemQtdOnHandlTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemQtdOnHandlTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemQtdOnHandlTextFieldActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try {
            String code = itemCodeTextField.getText();
            String description = itemDesTextField.getText();
            double unitPrice = Double.parseDouble(itemUnitPriceTextField.getText());
            int qtyOnHand = Integer.parseInt(itemQtdOnHandlTextField.getText());
            
            Item item = new Item(code, description, unitPrice, qtyOnHand);
            boolean isUpdated = ItemController.updateItem(item);
            
            if (isUpdated) {
                JOptionPane.showMessageDialog(this, "Update Success");
            }else{
                itemCodeTextField.setText("");
                itemDesTextField.setText("");
                itemUnitPriceTextField.setText("");
                itemQtdOnHandlTextField.setText("");
                JOptionPane.showMessageDialog(this, "Update Fail");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
        
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        //System.exit(0);
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField itemCodeTextField;
    private javax.swing.JTextField itemDesTextField;
    private javax.swing.JTextField itemQtdOnHandlTextField;
    private javax.swing.JTextField itemUnitPriceTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
