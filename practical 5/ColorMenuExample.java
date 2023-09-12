import java.awt.*;

public class ColorMenuExample {
    private Frame frame;
    private MenuBar menuBar;
    private Menu colorMenu;
    private MenuItem[] colorItems;

    public ColorMenuExample() {
        frame = new Frame("Color Menu Example");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        menuBar = new MenuBar();
        colorMenu = new Menu("Color");

        String[] colors = {"Red", "Green", "Blue", "Black"};
        colorItems = new MenuItem[colors.length];

        for (int i = 0; i < colors.length; i++) {
            colorItems[i] = new MenuItem(colors[i]);
            colorMenu.add(colorItems[i]);

            if (colors[i].equals("Black")) {
                colorItems[i].setEnabled(false);
            }


        }

        menuBar.add(colorMenu);
        frame.setMenuBar(menuBar);

        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new ColorMenuExample();
    }
}
