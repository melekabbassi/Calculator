import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    // Declare variables
    private JTextArea textAreaHistory;
    private JTextField textField;
    private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear, buttonClearHistory;
    private double num1, num2, result;
    private int calculation;

    public Calculator() {
        // Set title
        super("Calculator");

        // Set size
        setSize(300, 400);

        // Set layout
        setLayout(null);

        // Initialize variables
        textAreaHistory = new JTextArea();
        textField = new JTextField();
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        buttonAdd = new JButton("+");
        buttonSub = new JButton("-");
        buttonMul = new JButton("*");
        buttonDiv = new JButton("/");
        buttonEqual = new JButton("=");
        buttonClear = new JButton("C");
        buttonClearHistory = new JButton("CE");

        // Set bounds
        textAreaHistory.setBounds(350, 30, 270, 70); 
        textField.setBounds(30, 30, 280, 30);
        button0.setBounds(70, 250, 50, 30);
        button1.setBounds(10, 210, 50, 30);
        button2.setBounds(70, 210, 50, 30);
        button3.setBounds(130, 210, 50, 30);
        button4.setBounds(10, 170, 50, 30);
        button5.setBounds(70, 170, 50, 30);
        button6.setBounds(130, 170, 50, 30);
        button7.setBounds(10, 130, 50, 30);
        button8.setBounds(70, 130, 50, 30);
        button9.setBounds(130, 130, 50, 30);
        buttonAdd.setBounds(190, 130, 50, 30);
        buttonSub.setBounds(190, 170, 50, 30);
        buttonMul.setBounds(190, 210, 50, 30);
        buttonDiv.setBounds(190, 250, 50, 30);
        buttonEqual.setBounds(250, 130, 50, 70);
        buttonClear.setBounds(250, 70, 50, 50);
        buttonClearHistory.setBounds(190, 70, 50, 50);

        // Add components
        add(textAreaHistory);        
        add(textField);
        add(button0);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(buttonAdd);
        add(buttonSub);
        add(buttonMul);
        add(buttonDiv);
        add(buttonEqual);
        add(buttonClear);
        add(buttonClearHistory);

        // Set action listeners
        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("0"));
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("1"));
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("2"));
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("3"));
            }
        });

        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("4"));
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("5"));
            }
        });

        button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("6"));
            }
        });

        button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("7"));
            }
        });

        button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("8"));
            }
        });

        button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText().concat("9"));
            }
        });

        buttonAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                calculation = 1;
                textField.setText("");
            }
        });

        buttonSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                calculation = 2;
                textField.setText("");
            }
        });

        buttonMul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                calculation = 3;
                textField.setText("");
            }
        });

        buttonDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textField.getText());
                calculation = 4;
                textField.setText("");
            }
        });

        buttonEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Double.parseDouble(textField.getText());

                switch (calculation) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        result = num1 / num2;
                        break;
                }

                textField.setText(Double.toString(result));
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("0");
            }
        });

        buttonClearHistory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textAreaHistory.setText("");
            }
        });

        // Set frame visible
        setVisible(true);

    }

    public static void main(String[] args) {
        new Calculator();
    }


}
