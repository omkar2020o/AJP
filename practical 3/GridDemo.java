import java.awt.*;
public class GridDemo
{
    public static void main( String args[] )
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(400,400);
        f.setLayout(new GridLayout(2,2));

        Font font = new Font("TimesRoman",Font.BOLD,25);
        f.setFont(font);

        Label l[] = new Label[25];

        for(int i = 0 ; i < 25 ; i++)
        {
            String s = "";
            s = s.valueOf(i+1);
            Color c = new Color(i,i+10,i+20);
            l[i] = new Label();
            System.out.println(c);
            l[i].setBackground(c);
            l[i].setText(s);
        }

        for(int i = 0 ; i < 25;i++)
        {
            f.add(l[i]);
        }
    }
}