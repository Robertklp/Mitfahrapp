package de.csbme.mitfahrapp.controller.menu;

/**
 * @Author Felix Meyer
 * This class represents an item in the menu
 * It has attributes for the Font Awesome Icon, the link it points to and the text it has
 */
public class Item {

    private String fontAwesomeIcon;
    private String href;
    private String text;

    public Item(String fontAwesomeIcon, String href, String text){
        this.fontAwesomeIcon = fontAwesomeIcon;
        this.href = href;
        this.text = text;
    }

    public String getFontAwesomeIcon() {
        return fontAwesomeIcon;
    }

    public String getHref() {
        return href;
    }

    public String getText() {
        return text;
    }
}
