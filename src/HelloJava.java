package src;

import javax.swing.*;
import java.awt.*;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello, Java!");
        //create new window, with value for title bar
        JFrame frame = new JFrame("Hello, Java!");
        //instance of JLabel is like physical label, holds text at particular position
//        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        //use method add(), to place label inside JFrame (JFrame acts as a container)
//        frame.add(label);
        //replaced JLabel lines with this add() method for new instance of class HelloComponent()
        frame.add( new HelloComponent());
        //use method setSize() to set size of JLabel
        frame.setSize(300, 300 );
        //show frame window and its contents, default is invisible, use setVisible() method to see
        frame.setVisible(true);
    }
}
//created a new class seperate of the main file class, extends the generic graphical class JComponent
class HelloComponent extends JComponent {
    //This new typ of JComponent uses a created method, using Graphics as its type, for display/output
    public void paintComponent( Graphics g ) {
        //using argument input g to call drawstring()method to print/display String message
        g.drawString("Hello, Java", 125, 95);
    }
}
