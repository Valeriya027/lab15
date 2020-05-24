package Lab15;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab15 extends JFrame {
    private TextField txt;
    private JButton but1;
    private JButton but2;
    double a = 0;

    public Lab15(){
        setBounds(400,400,300,300);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Label a1 = new Label("Число");
        add(a1);
        txt = new TextField("0");
        txt.setEditable(false);
        add(txt);


        but1 = new JButton("+1");
        but2 = new JButton("-1");

        but1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a1 = Double.parseDouble(txt.getText());
                if(a1<3){
                    a1++;
                }
                txt.setText(Double.toString(a1));
            }
        });
        but2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a1 = Double.parseDouble(txt.getText());
                if(a1>-5){
                    a1--;
                }
                txt.setText(Double.toString(a1));
            }
        });

        add(but1);
        add(but2);
        setVisible(true);
    }


    public static void main(String[] args){
        new Lab15();
    }
}
