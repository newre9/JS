
//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;
import java.awt.*;
class DeneC {
    public static void main(String args[]) {
        //Creating the Frame
        JFrame frame = new JFrame("Cohort2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Help");
        JMenu m3 = new JMenu("Araçlar");
        JMenu m4 = new JMenu("Yardım");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);
        // Text Area at the Center
        JTextArea ta = new JTextArea();
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
}