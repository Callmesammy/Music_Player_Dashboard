
package Model;

import javax.swing.Icon;


public class Model_Music {

    /**
     * @return the image
     */
    public Icon getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Icon image) {
        this.image = image;
    }

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
     * @return the list
     */
    public String getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(String list) {
        this.list = list;
    }
    private Icon image;
    private String title;
    private String list; 

    public Model_Music(Icon image, String title, String list) {
        this.image = image;
        this.title = title;
        this.list = list;
    }

    public Model_Music() {
    }
    
}
