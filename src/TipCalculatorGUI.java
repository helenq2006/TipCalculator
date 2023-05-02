import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipCalculatorGUI extends JFrame {

    private JLabel billLabel, tipPercentageLabel, numberOfPeopleLabel, totalLabel, tipPerPersonLabel, totalPerPersonLabel;
    private JTextField billField, tipPercentageField, numberOfPeopleField;
    private JButton calculateButton;
    private JPanel TipCalculator;

    public TipCalculatorGUI() {
        super("Tip Calculator");

        // initialize labels and text fields
        billLabel = new JLabel("Bill:");
        billField = new JTextField(10);
        tipPercentageLabel = new JLabel("Tip Percentage:");
        tipPercentageField = new JTextField(10);
        numberOfPeopleLabel = new JLabel("Number of People:");
        numberOfPeopleField = new JTextField(10);

        // initialize calculate button
        calculateButton = new JButton("Calculate");

        // initialize labels for total, tip per person, and total per person
        totalLabel = new JLabel("");
        tipPerPersonLabel = new JLabel("");
        totalPerPersonLabel = new JLabel("");

        // set layout
        setLayout(new GridLayout(5, 2));

        // add components to the frame
        add(billLabel);
        add(billField);
        add(tipPercentageLabel);
        add(tipPercentageField);
        add(numberOfPeopleLabel);
        add(numberOfPeopleField);
        add(new JLabel(""));
        add(calculateButton);
        add(new JLabel("Total:"));
        add(totalLabel);
        add(new JLabel("Tip per Person:"));
        add(tipPerPersonLabel);
        add(new JLabel("Total per Person:"));
        add(totalPerPersonLabel);

        // add action listener to calculate button
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get input values from text fields
                double bill = Double.parseDouble(billField.getText());
                int tipPercentage = Integer.parseInt(tipPercentageField.getText());
                int numberOfPeople = Integer.parseInt(numberOfPeopleField.getText());

                // create tip calculator object
                TipCalculator tipCalculator = new TipCalculator(bill, tipPercentage, numberOfPeople);

                // calculate tip, total, tip per person, and total per person
                double tip = tipCalculator.calculateTip();
                double total = tipCalculator.totalBill();
                double tipPerPerson = tipCalculator.tipPerPerson();
                double totalPerPerson = tipCalculator.totalPerPerson();

                // display results
                totalLabel.setText(String.format("$%.2f", total));
                tipPerPersonLabel.setText(String.format("$%.2f", tipPerPerson));
                totalPerPersonLabel.setText(String.format("$%.2f", totalPerPerson));
            }
        });

        // set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TipCalculatorGUI();
    }
}
