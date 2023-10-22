package CreationalPatterns.FactoryMethod.Example.buttons;

import CreationalPatterns.FactoryMethod.Example.buttons.Button;
import CreationalPatterns.FactoryMethod.Example.buttons.ButtonFunction;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static CreationalPatterns.FactoryMethod.Example.buttons.ButtonFunction.TEST_BUTTON;

public class WindowsButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;
    @Override
    public void render() {
        System.out.println("Testing Windows Button...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Testing Windows Button...");
        frame.getContentPane().add(panel);
        panel.add(label);
        onClick(TEST_BUTTON);
        panel.add(button);

        frame.setSize(320,320);
        frame.setVisible(true);
        onClick(TEST_BUTTON);

    }

    @Override
    public void onClick(ButtonFunction function) {
        button = new JButton("Testing Windows Button...");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
    }
}
