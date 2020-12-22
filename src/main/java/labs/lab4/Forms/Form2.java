package labs.lab4.Forms;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Form2 extends JFrame
{

    public Form2()
    {
        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 2, 5, 5));

        JLabel label = new JLabel("Введите имя:");
        container.add(label);

        JTextField textField = new JTextField("Джон Сноу");
        container.add(textField);

        JButton button = new JButton("Все готово");
        container.add(button);

        JCheckBox checkBox = new JCheckBox("Согласны?");
        container.add(checkBox);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}