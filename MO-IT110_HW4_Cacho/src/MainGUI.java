import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame {
    public MainGUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(800, 600);
        setVisible(true);
        setTitle("Total Sales");
        setContentPane(mainPanel);

        //<---calculating phone sales--->
        btnCalculateSales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTotalSales.setText(String.valueOf(Integer.parseInt(tfSalesPrice.getText()) * Integer.parseInt(tfSalesQuantity.getText())));
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfSalesQuantity.setText("");
                tfSalesPrice.setText("");
            }
        });

        //<---calculating phone repairs--->
        btnCalculateRepairs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblTotalRepairs.setText(String.valueOf(Integer.parseInt(tfRepairPrice.getText()) * Integer.parseInt(tfRepairQuantity.getText())));
            }
        });
        btnClearRepairs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfRepairQuantity.setText("");
                tfRepairPrice.setText("");
            }
        });
    }
    private JPanel mainPanel;
    private JPanel phoneSalePanel;
    private JLabel lblPhoneSaleQuantity;
    private JLabel lblPhoneSales;
    private JTextField tfSalesQuantity;
    private JLabel lblSalesPrice;
    private JTextField tfSalesPrice;
    private JButton btnCalculateSales;
    private JButton btnClear;
    private JPanel repairSalePanel;
    private JLabel lblPhoneRepairQuantity;
    private JTextField tfRepairQuantity;
    private JLabel lblRepairPrice;
    private JTextField tfRepairPrice;
    private JPanel pnlButtonsPanel;
    private JButton btnCalculateRepairs;
    private JButton btnClearRepairs;
    private JLabel totalSalesLabel;
    private JLabel lblTotalSales;
    private JLabel totalRepairsLabel;
    private JLabel lblTotalRepairs;
}
