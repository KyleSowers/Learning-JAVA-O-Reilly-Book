package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class HelloComponent extends JComponent {
    public void paintComponent( Graphics g ) {
        g.drawString( "Hello, Java!", 125, 95);
    }

    static class HelloComponent2 extends JComponent
            implements MouseMotionListener {
        String theMessage;
        int messageX = 125, messageY = 95; //Coordinates of the message

        public HelloComponent2( String message ) {
            theMessage = message;
            addMouseListener((MouseListener) this);
        }

        public void paintComponent( Graphics g ) {
            g.drawString( theMessage, messageX, messageY );
        }

        public void mouseDragged(MouseEvent e) {
    //        Save the mouse coordinates and paint the message.
            messageX = e.getX();
            messageY = e.getY();
            repaint();
        }

        public void mouseMoved(MouseEvent e) {

        }

    }
}
