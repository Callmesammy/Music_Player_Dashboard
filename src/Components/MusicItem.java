
package Components;

import Model.Model_Music;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.Icon;
import javax.swing.ImageIcon;


public class MusicItem extends javax.swing.JPanel {

  
    public MusicItem() {
        initComponents();
        init();
    }
    
    private void init(){
        setOpaque(false);
        setPreferredSize(new Dimension(350,200));
        setMinimumSize(new Dimension(350,200));
        setMaximumSize(new Dimension(350,200));
    }

    private Model_Music data;
    
    public void setImage(Model_Music data){
        this.data = data;
        ibititle.setText(data.getTitle());
        ibidescriptoon.setText(data.getDescription());
        
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        if (data != null){
            Graphics2D g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            Rectangle size = getAutoSize(data.getImage());
            g2.drawImage(toImage(data.getImage()), size.x,size.y,size.width, size.height, null);
        }
        super.paintComponent(g);     }
    
    public Image toImage(Icon image){
        return ((ImageIcon)image).getImage();
    }
   
       private Rectangle getAutoSize(Icon image) {
        int w = getWidth();
        int h = getHeight();
        int iw = image.getIconWidth();
        int ih = image.getIconHeight();
        double xScale = (double) w / iw;
        double yScale = (double) h / ih;
        double scale = Math.max(xScale, yScale);
        int width = (int) (scale * iw);
        int height = (int) (scale * ih);
        int x = (w - width) / 2;
        int y = (h - height) / 2;
        return new Rectangle(new Point(x, y), new Dimension(width, height));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ibititle = new javax.swing.JLabel();
        ibidescriptoon = new javax.swing.JLabel();

        ibititle.setBackground(new java.awt.Color(255, 255, 255));
        ibititle.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ibititle.setForeground(new java.awt.Color(255, 255, 255));
        ibititle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibititle.setText("Title");

        ibidescriptoon.setBackground(new java.awt.Color(255, 255, 255));
        ibidescriptoon.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ibidescriptoon.setForeground(new java.awt.Color(255, 255, 255));
        ibidescriptoon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ibidescriptoon.setText("Description");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ibititle, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addComponent(ibidescriptoon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(ibititle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(ibidescriptoon)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ibidescriptoon;
    private javax.swing.JLabel ibititle;
    // End of variables declaration//GEN-END:variables
}
