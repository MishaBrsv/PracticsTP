package labs.lab4.Forms;

import javax.swing.*;

import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Form4 extends JFrame
{
    private JTextArea text;

    public Form4()
    {
        Container container = getContentPane();
        container.setLayout(new GridLayout(1, 2, 5, 5));

        text = new JTextArea();
        container.add(text);

        JButton button = new JButton("Отобразить");
        button.addActionListener(new ButtonListiner());
        container.add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class ButtonListiner implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String textStr = text.getText();
            if (!textStr.equals(""))
            {
                JOptionPane.showMessageDialog(
                        new JFrame(),
                        textStr,
                        "Информация",
                        JOptionPane.PLAIN_MESSAGE
                );
            }
        }
    }
}
