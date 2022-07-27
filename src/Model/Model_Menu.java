/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import javax.swing.Icon;
import javax.swing.ImageIcon;


public class Model_Menu {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * @return the Type
     */
    public MenuType getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(MenuType Type) {
        this.Type = Type;
    }

    public Model_Menu(String icon, String text, MenuType Type) {
        this.icon = icon;
        this.text = text;
        this.Type = Type;
    }
    
    private String icon;
    private String text;
    private MenuType Type;

    public Model_Menu() {
    }
    public Icon toIcon(){
        return new ImageIcon(getClass().getResource("/cool/image/" +icon+ ".png"));
    }
    public static enum MenuType{
    MENU, TITLE, EMPTY
}
    
}
