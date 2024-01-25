package src;

import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
//        System.out.println("Hello, Java!");
        //create new window, with value for title bar
        JFrame frame = new JFrame("Hello, Java!");
        //instance of JLabel is like physical label, holds text at particular position
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER );
        //use method add(), to place label inside JFrame (JFrame acts as a container)
        frame.add(label);
        //use method setSize() to set size of JLabel
        frame.setSize(300, 300 );
        //show frame window and its contents, default is invisible, use setVisible() method to see
        frame.setVisible(true);
    }
}
