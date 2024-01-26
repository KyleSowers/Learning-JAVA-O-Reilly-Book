package src;

import javax.swing.*;
import java.awt.event.MouseMotionListener;

public class HelloJava2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("HelloJava2");
        frame.add( new HelloComponent2("Hello, Java!"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize( 300, 300);
        frame.setVisible( true );
    }
}

class HelloComponent2 extends JComponent implements MouseMotionListener {

    String theMessage;
    int messageX = 125, messageY = 95; //Coordinates of the message
}
