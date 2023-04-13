
//package P;
/*import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login() {
        getContentPane().setBackground(Color.WHITE);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        JLabel lblpasssword = new JLabel("Password");
        lblpasssword.setBounds(40, 70, 100, 20);
        add(lblpasssword);

        JPasswordField tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        JButton login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.ORANGE);
        add(login);

        JButton cancel = new JButton("cancel");
        cancel.setBounds(40, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.RED);
        add(cancel);

        /*
         * ImageIcon i1 = new
         * ImageIcon(ClassLoader.getSystemResource("icons/loginBU.jpg"));
         * Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
         * ImageIcon i3 = new ImageIcon(i2);
         * JLabel image = new JLabel(i3);
         * image.setBounds(1000, 100, 200, 300);
         * add(image);
         

        setSize(600, 300);
        setLocation(450, 250);
        setVisible(true);

    }

    public static void main(String args[]) {
        new Login();
    }

}
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JButton login, cancel;

    public Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(40, 20, 100, 20);
        add(lblusername);

        JTextField tfusername = new JTextField();
        tfusername.setBounds(150, 20, 150, 20);
        add(tfusername);

        JLabel lblpasssword = new JLabel("Password");
        lblpasssword.setBounds(40, 70, 100, 20);
        add(lblpasssword);

        JPasswordField tfpassword = new JPasswordField();
        tfpassword.setBounds(150, 70, 150, 20);
        add(tfpassword);

        login = new JButton("Login");
        login.setBounds(40, 140, 120, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.ORANGE);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(190, 140, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.RED);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon adminIcon = new ImageIcon("icons/loginBU.jpg");
        JLabel lblAdminIcon = new JLabel(adminIcon);
        lblAdminIcon.setBounds(310, 20, 64, 64);
        add(lblAdminIcon);

        setSize(400, 250);
        setLocation(500, 280);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login) {

        } else if (ae.getSource() == cancel) {
            setVisible(false);
        }
    }

    public static void main(String args[]) {
        new Login();
    }
}