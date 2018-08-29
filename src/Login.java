import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textUserLogin;
    private JTextField pwdUserPassword;
    private JButton submitButton;
    private JButton clearButton;
    private JPasswordField txtpassword;
    private JPanel MainPanel;

    public Login() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUserLogin.getText()+ " " +new String(txtpassword.getPassword()));

            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtpassword.setText("");
                textUserLogin.setText("");
            }
        });
    }
    public JPanel getNamePanel(){
        return MainPanel;
    }
}
