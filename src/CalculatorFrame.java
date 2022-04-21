import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javafx.stage.Window;

public class CalculatorFrame extends JFrame{

    //Calculator

    private JTextField textField;
    private JButton button0;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonEquals;
    private JButton buttonClear;
    
    public CalculatorFrame() {
        setTitle("Calculator");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        textField = new JTextField();
        textField.setBounds(10, 10, 280, 30);
        add(textField);
        
        button0 = new JButton("0");
        button0.setBounds(10, 250, 50, 30);
        add(button0);
        
        button1 = new JButton("1");
        button1.setBounds(10, 210, 50, 30);
        add(button1);
        
        button2 = new JButton("2");
        button2.setBounds(70, 210, 50, 30);
        add(button2);
        
        button3 = new JButton("3");
        button3.setBounds(130, 210, 50, 30);
        add(button3);
        
        button4 = new JButton("4");
        button4.setBounds(10, 170, 50, 30);
        add(button4);
        
        button5 = new JButton("5");
        button5.setBounds(70, 170, 50, 30);
        add(button5);
        
        button6 = new JButton("6");
        button6.setBounds(130, 170, 50, 30);
        add(button6);
        
        button7 = new JButton("7");
        button7.setBounds(10, 130, 50, 30);
        add(button7);
        
        button8 = new JButton("8");
        button8.setBounds(70, 130, 50, 30);
        add(button8);
        
        button9 = new JButton("9");
        button9.setBounds(130, 130, 50, 30);
        add(button9);
        
        buttonAdd = new JButton("+");
        buttonAdd.setBounds(190, 130, 50, 30);
        add(buttonAdd);

        buttonSubtract = new JButton("-");
        buttonSubtract.setBounds(190, 170, 50, 30);
        add(buttonSubtract);

        buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(190, 210, 50, 30);
        add(buttonMultiply);

        buttonDivide = new JButton("/");
        buttonDivide.setBounds(190, 250, 50, 30);
        add(buttonDivide);

        buttonEquals = new JButton("=");
        buttonEquals.setBounds(250, 130, 50, 60);
        add(buttonEquals);

        buttonClear = new JButton("C");
        buttonClear.setBounds(250, 70, 50, 60);
        add(buttonClear);

    }
    public static void main(String[] args) throws Exception {
        new CalculatorFrame();
    }
    

}
