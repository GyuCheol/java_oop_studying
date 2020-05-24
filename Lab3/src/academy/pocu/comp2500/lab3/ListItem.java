package academy.pocu.comp2500.lab3;

import java.util.ArrayList;

public class ListItem {

    private String text;
    private char bulletStyle;
    private ArrayList<ListItem> subItems = new ArrayList<>();

    public ListItem(String text) {
        this(text, '*');
    }

    public ListItem(String text, char bulletStyle) {
        this.text = text;
        this.bulletStyle = bulletStyle;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public char getBulletStyle() {
        return this.bulletStyle;
    }

    public void setBulletStyle(char bulletStyle) {
        this.bulletStyle = bulletStyle;
    }

    public void addSublistItem(ListItem item) {
        subItems.add(item);
    }

    public void removeSublistItem(int index) {
        this.subItems.remove(index);
    }

    public ListItem getSublistItem(int index) {
        return subItems.get(index);
    }

    private String getListText(int depth) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < depth; i++) {
            sb.append("    ");
        }
        
        sb.append(this.bulletStyle);
        sb.append(' ');
        sb.append(this.text);
        sb.append(System.lineSeparator());

        for (ListItem item : this.subItems) {
            sb.append(item.getListText(depth + 1));
        }

        return sb.toString();
    }

    @Override
    public String toString() {
        return getListText(0);
    }
}
