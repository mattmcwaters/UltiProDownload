import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;

class Login extends JFrame implements ActionListener
{
    UltiProNavigator ultiProNavigator = new UltiProNavigator();
    JButton SUBMIT;
    JPanel panel;
    JLabel label1,label2;
    final JTextField  text1,text2;
    Login()
    {

        label1 = new JLabel();
        label1.setText("Username:");
        text1 = new JTextField(15);

        label2 = new JLabel();
        label2.setText("Password:");
        text2 = new JPasswordField(15);

        SUBMIT=new JButton("START");

        panel=new JPanel(new GridLayout(3,1));
        panel.add(label1);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);
        panel.add(SUBMIT);
        add(panel,BorderLayout.CENTER);
        SUBMIT.addActionListener(this);
        setTitle("UltiProDownload user info");
    }
    public void actionPerformed(ActionEvent ae)
    {
        String value1=text1.getText();
        String value2=text2.getText();
        try {
            ultiProNavigator.login(value1,value2);
            ultiProNavigator.payStubs();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
class LoginDemo
{
    public static void main(String arg[])
    {
        try
        {
            Login frame=new Login();
            frame.setSize(300,100);
            frame.setVisible(true);
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());}
    }
}