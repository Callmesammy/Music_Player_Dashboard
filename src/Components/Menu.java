
package Components;

import Model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;


public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setOpaque(false);
        init();
    }

    private void init(){
        list_Menu_Item1.setOpaque(false);
        list_Menu_Item1.addItem(new Model_Menu("", "Music Items", Model_Menu.MenuType.TITLE));
        list_Menu_Item1.addItem(new Model_Menu("1", "Songs", Model_Menu.MenuType.MENU));
        list_Menu_Item1.addItem(new Model_Menu("2", "Play List", Model_Menu.MenuType.MENU));
        list_Menu_Item1.addItem(new Model_Menu("3", "Music Folder", Model_Menu.MenuType.MENU));
        list_Menu_Item1.addItem(new Model_Menu("4", "New Songs", Model_Menu.MenuType.MENU));
        
        list_Menu_Item1.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
         list_Menu_Item1.addItem(new Model_Menu("", "Add New Songs", Model_Menu.MenuType.TITLE));
        list_Menu_Item1.addItem(new Model_Menu("01", "Songs", Model_Menu.MenuType.MENU));
        list_Menu_Item1.addItem(new Model_Menu("02", "Play List", Model_Menu.MenuType.MENU));
        list_Menu_Item1.addItem(new Model_Menu("03", "Music Folder", Model_Menu.MenuType.MENU));
        list_Menu_Item1.addItem(new Model_Menu("04", "New Songs", Model_Menu.MenuType.MENU));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        list_Menu_Item1 = new Components.List_Menu_Item<>();
        PanelMoving = new javax.swing.JLabel();

        PanelMoving.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        PanelMoving.setForeground(new java.awt.Color(255, 255, 255));
        PanelMoving.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cool/image/icons8-dancing-65.png"))); // NOI18N
        PanelMoving.setText("Dancing Kits");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(list_Menu_Item1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(PanelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(list_Menu_Item1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics g) {
         Graphics2D g2 = (Graphics2D)g.create();
        g2.setColor(new Color(255,255,255,80));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g7 = new GradientPaint(0, 0, Color.decode("#00B4DB"), 0, getHeight(), Color.decode("#0083B0"), true);
        g2.setPaint(g7);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.fillRect(15, 0, getWidth(), getHeight()-15);
        g2.fillRect(0, getHeight()-15, getWidth(), getHeight()-15);
    
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PanelMoving;
    private Components.List_Menu_Item<String> list_Menu_Item1;
    // End of variables declaration//GEN-END:variables
}
