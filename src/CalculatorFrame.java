import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import javafx.event.ActionEvent;
import javafx.stage.Window;

public class CalculatorFrame extends JFrame{

    //Calculator
    private JLabel lblCalculator;
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
    private JButton buttonClearEntry;
    
    public CalculatorFrame() {
        setTitle("Calculator");
        setSize(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        //Calculator
        lblCalculator = new JLabel("Calculator");
        lblCalculator.setBounds(200, 10, 100, 20);
        add(lblCalculator);
        
        textField = new JTextField();
        textField.setBounds(30, 30, 280, 30);
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

        buttonClearEntry = new JButton("CE");
        buttonClearEntry.setBounds(190, 70, 50, 60);
        add(buttonClearEntry);
    }

    public JLabel getLblCalculator() {
        return lblCalculator;
    }

    public void setLblCalculator(JLabel lblCalculator) {
        this.lblCalculator = lblCalculator;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JButton getButton0() {
        return button0;
    }

    public void setButton0(JButton button0) {
        this.button0 = button0;
    }

    public JButton getButton1() {
        return button1;
    }

    public void setButton1(JButton button1) {
        this.button1 = button1;
    }

    public JButton getButton2() {
        return button2;
    }

    public void setButton2(JButton button2) {
        this.button2 = button2;
    }

    public JButton getButton3() {
        return button3;
    }

    public void setButton3(JButton button3) {
        this.button3 = button3;
    }

    public JButton getButton4() {
        return button4;
    }

    public void setButton4(JButton button4) {
        this.button4 = button4;
    }

    public JButton getButton5() {
        return button5;
    }

    public void setButton5(JButton button5) {
        this.button5 = button5;
    }

    public JButton getButton6() {
        return button6;
    }

    public void setButton6(JButton button6) {
        this.button6 = button6;
    }

    public JButton getButton7() {
        return button7;
    }

    public void setButton7(JButton button7) {
        this.button7 = button7;
    }

    public JButton getButton8() {
        return button8;
    }

    public void setButton8(JButton button8) {
        this.button8 = button8;
    }

    public JButton getButton9() {
        return button9;
    }

    public void setButton9(JButton button9) {
        this.button9 = button9;
    }

    public JButton getButtonAdd() {
        return buttonAdd;
    }

    public void setButtonAdd(JButton buttonAdd) {
        this.buttonAdd = buttonAdd;
    }

    public JButton getButtonSubtract() {
        return buttonSubtract;
    }

    public void setButtonSubtract(JButton buttonSubtract) {
        this.buttonSubtract = buttonSubtract;
    }

    public JButton getButtonMultiply() {
        return buttonMultiply;
    }

    public void setButtonMultiply(JButton buttonMultiply) {
        this.buttonMultiply = buttonMultiply;
    }

    public JButton getButtonDivide() {
        return buttonDivide;
    }

    public void setButtonDivide(JButton buttonDivide) {
        this.buttonDivide = buttonDivide;
    }

    public JButton getButtonEquals() {
        return buttonEquals;
    }

    public void setButtonEquals(JButton buttonEquals) {
        this.buttonEquals = buttonEquals;
    }

    public JButton getButtonClear() {
        return buttonClear;
    }

    public void setButtonClear(JButton buttonClear) {
        this.buttonClear = buttonClear;
    }

    public JButton getButtonClearEntry() {
        return buttonClearEntry;
    }

    public void setButtonClearEntry(JButton buttonClearEntry) {
        this.buttonClearEntry = buttonClearEntry;
    }

    // button actions click events
    public void button0ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("0");
        } else {
            textField.setText(textField.getText() + "0");
        }
    }

    public void button1ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("1");
        } else {
            textField.setText(textField.getText() + "1");
        }
    }

    public void button2ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("2");
        } else {
            textField.setText(textField.getText() + "2");
        }
    }

    public void button3ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("3");
        } else {
            textField.setText(textField.getText() + "3");
        }
    }

    public void button4ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("4");
        } else {
            textField.setText(textField.getText() + "4");
        }
    }

    public void button5ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("5");
        } else {
            textField.setText(textField.getText() + "5");
        }
    }

    public void button6ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("6");
        } else {
            textField.setText(textField.getText() + "6");
        }
    }

    public void button7ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("7");
        } else {
            textField.setText(textField.getText() + "7");
        }
    }

    public void button8ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("8");
        } else {
            textField.setText(textField.getText() + "8");
        }
    }

    public void button9ActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("9");
        } else {
            textField.setText(textField.getText() + "9");
        }
    }

    public void buttonAddActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("0");
        } else {
            textField.setText(textField.getText() + "+");
        }
    }

    public void buttonSubtractActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("0");
        } else {
            textField.setText(textField.getText() + "-");
        }
    }

    public void buttonMultiplyActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("0");
        } else {
            textField.setText(textField.getText() + "*");
        }
    }

    public void buttonDivideActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("0");
        } else {
            textField.setText(textField.getText() + "/");
        }
    }

    public void buttonEqualsActionPerformed(ActionEvent e) {
        if (textField.getText().equals("0")) {
            textField.setText("0");
        } else {
            textField.setText(textField.getText() + "=");
        }
    }

    public void buttonClearActionPerformed(ActionEvent e) {
        textField.setText("0");
    }

    public void buttonClearEntryActionPerformed(ActionEvent e) {
        textField.setText("0");
    }
    
    public static void main(String[] args) throws Exception {
        new CalculatorFrame();
    }
    

}
