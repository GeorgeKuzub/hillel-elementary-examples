package say_hello;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {
    Welcome(){
        JButton jButton = new JButton("say hello");
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello)))");
            }
        });
        Container contentPane = getContentPane();
        setBounds(100, 100, 100, 100);
        contentPane.add(jButton);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Welcome();
    }

}
