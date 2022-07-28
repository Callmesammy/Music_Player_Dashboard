/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.Icon;

/**
 *
 * @author user
 */
public class Model_Music {

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the Image
     */
    public Icon getImage() {
        return Image;
    }

    /**
     * @param Image the Image to set
     */
    public void setImage(Icon Image) {
        this.Image = Image;
    }

    public Model_Music(String title, String description, Icon Image) {
        this.title = title;
        this.description = description;
        this.Image = Image;
    }
    
    private String title;
    private String description;
    private Icon Image;

    public Model_Music() {
    }
    
}
