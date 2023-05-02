import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Calc extends JFrame{
    private JTextArea billTextArea;
    private JTextArea totalTextArea;
    private JTextArea tipTextArea;
    private JTextArea percentTextArea;
    private JTextArea numPeopleTextArea;
    private JButton percentAdd;
    private JButton percentMin;
    private JButton peopleAdd;
    private JButton peopleMin;
    private JLabel tipPercent;
    private JLabel numberOfPeople;
    private JLabel tip;
    private JLabel total;
    private JLabel bill;
    private JPanel mainPanel;

    public Calc() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("Tip Calculator GUI");
        setSize(300, 400);
        setLocation(450, 100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
