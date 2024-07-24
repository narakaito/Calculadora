import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CalculadoraApp {
    private JPanel Calculadora;
    private JTextField Display;
    private JButton ACButton;
    private JButton MultButton;
    private JButton MinusButton;
    private JButton PlusButton;
    private JButton EqualButton;
    private JButton LeftButton;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton DivButton;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton PlusMinusButton;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton PointButton;


    double a, b, result;

    String op;

    public CalculadoraApp() {

        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText("");
            }
        });

        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a00Button.getText());
            }
        });

        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a0Button.getText());
            }
        });

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a1Button.getText());
            }
        });

        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a2Button.getText());
            }
        });

        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a3Button.getText());
            }
        });

        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a4Button.getText());
            }
        });

        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a5Button.getText());
            }
        });

        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a6Button.getText());
            }
        });

        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a7Button.getText());
            }
        });

        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a8Button.getText());
            }
        });

        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Display.setText(Display.getText() + a9Button.getText());
            }
        });
        PlusMinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Display.getText().contains(".")) {

                    double pm = Double.parseDouble(Display.getText());
                    pm = pm * -1;
                    Display.setText(String.valueOf(pm));
                } else
                {
                    long PM = Long.parseLong(Display.getText());
                    PM = PM*-1;
                    Display.setText(String.valueOf(PM));
                }
            }
        });

        PointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!Display.getText().contains("."))
                {
                    Display.setText(Display.getText() + PointButton.getText());
                }
            }
        });
        PlusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "+";
                Display.setText("");
            }
        });

        MinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "-";
                Display.setText("");

            }
        });

        MultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "*";
                Display.setText("");
            }
        });

        DivButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(Display.getText());
                op = "/";
                Display.setText("");
            }
        });

        LeftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace = null;

                if(Display.getText().length() > 0)
                {
                    StringBuilder strB = new StringBuilder(Display.getText());
                    strB.deleteCharAt(Display.getText().length() - 1);
                    backspace = String.valueOf(strB);
                    Display.setText(backspace);

                }
            }
        });
        EqualButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b = Double.parseDouble(Display.getText());

                if(op == "+")
                {
                    result = a + b;
                    Display.setText(String.valueOf(result));

                }else if(op == "-")
                {
                    result = a - b;
                    Display.setText(String.valueOf(result));

                }else if(op == "*")
                {
                    result = a * b;
                    Display.setText(String.valueOf(result));

                }else if(op == "/")
                {
                    result = a / b;
                    Display.setText(String.valueOf(result));
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CalculadoraApp");
        frame.setContentPane(new CalculadoraApp().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
