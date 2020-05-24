package academy.pocu.comp2500.lab3;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<ListItem> list = new ArrayList<>();

        ListItem listItem1 = new ListItem("My first item");

        ListItem sublistItem1 = new ListItem("This is sublist item1", '>');
        ListItem sublistItem2 = new ListItem("This is sublist item2", '>');

        listItem1.addSublistItem(sublistItem1);
        listItem1.addSublistItem(sublistItem2);

        ListItem listItem2 = new ListItem("My second item");

        ListItem listItem3 = new ListItem("My third item");

        ListItem sublistItem3 = new ListItem("This is sublist item3", '>');
        ListItem subSublistItem1 = new ListItem("This is sub-sublist item1", '-');

        sublistItem3.addSublistItem(subSublistItem1);
        listItem3.addSublistItem(sublistItem3);

        list.add(listItem1);
        list.add(listItem2);
        list.add(listItem3);

        String actual = toString(list);

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("* My first item%s", System.lineSeparator()));
        sb.append(String.format("    > This is sublist item1%s", System.lineSeparator()));
        sb.append(String.format("    > This is sublist item2%s", System.lineSeparator()));
        sb.append(String.format("* My second item%s", System.lineSeparator()));
        sb.append(String.format("* My third item%s", System.lineSeparator()));
        sb.append(String.format("    > This is sublist item3%s", System.lineSeparator()));
        sb.append(String.format("        - This is sub-sublist item1%s",
                System.lineSeparator()));

        String expected = sb.toString();

        System.out.println(expected);
        System.out.println(actual);

        assert expected.equals(actual);

        System.out.print(actual);
    }

    private static String toString(ArrayList<ListItem> list) {
        StringBuilder sb = new StringBuilder();
        for (ListItem item : list) {
            sb.append(item);
        }

        return sb.toString();
    }
}
