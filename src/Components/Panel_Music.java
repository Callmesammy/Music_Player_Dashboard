package Components;

import Model.Model_Music;
import Swing.ScrollBar;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Panel_Music extends javax.swing.JLayeredPane {

    /**
     * Creates new form Panel_Music
     */
    public Panel_Music() {
        initComponents();
        setOpaque(false);
//        sp.setHorizontalScrollBar(new ScrollBar());
       
    }
    
   public void addItem(Model_Music data){
       MusicItem item = new MusicItem();
       item.setImage(data);
       Panel.add(item);
       Panel.repaint();
       Panel.revalidate();
   }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();

        sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setLayout(new java.awt.GridLayout(1, 0, 4, 0));
        sp.setViewportView(Panel);

        setLayer(sp, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 protected void paintComponent(Graphics g) {
         Graphics2D g2 = (Graphics2D)g.create();
        g2.setColor(new Color(255,255,255,80));
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
 }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
