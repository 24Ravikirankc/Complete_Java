//package Applet;
// import java.applet;
// import java.awt;

// public class HelloApplet {

//     public void paint(Graphics g)
//     {
//         g.drawString("Hello Applet", 60, 40);
//     }
    
// }
import java.applet.Applet; // Correct import statement for Applet
import java.awt.Graphics; // Correct import statement for Graphics

public class HelloApplet extends Applet { // Extend Applet class

    public void paint(Graphics g) {
        g.drawString("Hello Applet", 60, 40);
    }
}
