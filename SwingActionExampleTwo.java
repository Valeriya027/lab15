package Lab15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingActionExampleTwo extends JFrame{
    private TextField txt;
    private JButton but1;
    private JButton but2;
    private JButton but3;

    public SwingActionExampleTwo(){
        setBounds(400,400,150,300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        txt = new TextField("Click Button");
        txt.setEditable(false);
        add(txt);

        but1 = new JButton("Button1");
        but2 = new JButton("Button2");
        but3 = new JButton("Button3");

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("You press Button1");
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("You press Button2");
            }
        });
        but3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt.setText("You press Button3");
            }
        });

        add(but1);
        add(but2);
        add(but3);
        setVisible(true);
    }

    public static void main(String[] aegs){
        new SwingActionExampleTwo();
    }
}
