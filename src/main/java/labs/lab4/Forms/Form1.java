package labs.lab4.Forms;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Form1 extends JFrame
{

    public Form1()
    {
        Container container = getContentPane();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

        JTextField tf1 = new JTextField("Привет");
        tf1.setPreferredSize(new Dimension(200, 65));
        tf1.setAlignmentX(Component.LEFT_ALIGNMENT);
        container.add(tf1);
        container.add(Box.createVerticalStrut(2));

        JTextField tf2 = new JTextField("Мир!");
        tf2.setPreferredSize(new Dimension(200, 65));
        tf2.setAlignmentX(Component.LEFT_ALIGNMENT);
        container.add(tf2);
        container.add(Box.createVerticalStrut(2));

        JButton button = new JButton("Нажмите");
        button.setMaximumSize(new Dimension(10000, 10000));
        button.setPreferredSize(new Dimension(200, 65));
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        container.add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}