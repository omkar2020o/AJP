import javax.swing.*;
import java.awt.*;

/*
JProgressBar

>what is JProgrssBar?
>How to create JProgressBar?

JProgrssBar is used to display the progress of some specified task.
JProgressBar is a part of java swing package.
JProgressBar shows the percentage of completion of specified task
the progress bar fills up as the task reaches its completion
in addition to show the percentage of completion of task, it can also display some text

types
1.horizontal progressbar
2.vertical progressbar
3.progressbar with some string

Constructor of JProgressBar:
1.JProgressBar(): create an progress bar with no text on it;
2.JProgressBar(int orientation): creates an progress bar with a specified orientation.
                                    if SwingConstant.Vertical is passed argument a vertical progress bar is created,
                                    if swingConstant.Horizontal is passed as argument a horizontal progress bar is created.
3.JProgressBar(int min,int max): creates an progress bar with specified minmum and maximum value.
4. JProgressBar(int oriented,int min,int max)

Commonly used methods of JProgressBar are:

1. void setMaximum(int n): set the progress bar's maximum value to the value n.
2. void setMinmum(int n): sets the progress bar's minimum value to the value n.
3.void setValue(int n ): set progress bar's current value to the value n.
4. void setString(String s): set the value of the progress String to the String s.
5. void setStringPainted(boolean b): decides whether string should be displayed or not in progressbar.

when to use:
1.Downloading a file from internet
2.loading the database
3.initializing the application
4.saving the file
5.opening the file
6.closing the window

programs:
1.how to create a simple progress bar
2.how to create a vertical progress bar
3. how to set specific string to progress bar

 */
public class Swing36JProgressBar {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame=new JFrame("JProgressBar");
        frame.setLayout(new FlowLayout());
        frame.setSize(500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JProgressBar pb=new JProgressBar(0,100);
        frame.add(pb);
        pb.setStringPainted(true);
        pb.setOrientation(SwingConstants.HORIZONTAL);

        //to increace progress
        int i=0;
        while(1<100)
        {
            if(i>=0&&i<=50)
            {
                pb.setString("processing");
            }
            if(i>=50&&i<=60)
            {
                pb.setString("processing best");
            }
            if(i>=60&&i<=100)
            {
                pb.setString("100%");
            }

            pb.setValue(i);
            try{
                Thread.sleep(100);
            }
            catch(Exception e){}
            i=2+i++;
        }


    }
}