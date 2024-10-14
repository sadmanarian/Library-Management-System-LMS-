import javax.swing.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;

public class ViewTransactions extends JFrame {
    private JTable transactionTable;
    private DefaultTableModel tableModel;

    public ViewTransactions() {
        setTitle("View Transactions");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        
        String[] columnNames = {"Transaction ID", "Book ID", "Member ID", "Date", "Type"};
        tableModel = new DefaultTableModel(columnNames, 0);
        transactionTable = new JTable(tableModel);

        
        tableModel.addRow(new Object[]{"T001", "B001", "M001", "2024-10-11", "Issued"});
        tableModel.addRow(new Object[]{"T002", "B002", "M002", "2024-10-12", "Returned"});

        JScrollPane scrollPane = new JScrollPane(transactionTable);
        scrollPane.setBounds(50, 50, 500, 200);
        add(scrollPane);

        
        JButton backButton = new JButton("Back");
        backButton.setBounds(470, 300, 80, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new TransactionManagement();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }
}
