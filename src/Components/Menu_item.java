
package Components;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 *
 * @author user
 */
public class Menu_item extends javax.swing.JPanel {

  
    private boolean selected;
    
    private Model_Menu data;
    
    public Menu_item(Model_Menu data) {
        initComponents();
        setOpaque(false);
        if (data.getType()==Model_Menu.MenuType.MENU){
            ibicon.setIcon(data.toIcon());
            ibiname.setText(data.getText());
            
        }else if (data.getType()==Model_Menu.MenuType.TITLE){
            ibicon.setText(data.getText());
            ibicon.setFont(new Font("sansserif", 1, 12));
            ibiname.setVisible(false);
        }else{
            ibiname.setText(" ");
        }
    }

    
  
     public void setSelected(boolean selected) {
        this.selected = selected;
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibicon = new javax.swing.JLabel();
        ibiname = new javax.swing.JLabel();

        ibicon.setForeground(new java.awt.Color(255, 255, 255));

        ibiname.setForeground(new java.awt.Color(255, 255, 255));
        ibiname.setText("Data Plans");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ibicon)
                .addGap(15, 15, 15)
                .addComponent(ibiname, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ibicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ibiname, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    @Override
    protected void paintComponent(Graphics g) {   
        Graphics2D g2 = (Graphics2D)g;
         if (selected){
        g2.setColor(new Color(255,255,255,80));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(10, 0, getWidth()-22, getHeight(), 5, 5);
         }
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibicon;
    private javax.swing.JLabel ibiname;
    // End of variables declaration//GEN-END:variables
}
