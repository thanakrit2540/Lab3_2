import javax.swing.*;

public class Main {
    public static void main (String [] boom){
        JFrame frame = new JFrame();
        Login loginPanel = new Login();
        frame.setContentPane(loginPanel.getNamePanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
