import javax.swing.*;
import java.awt.event.*;

public class AddBook extends JFrame {
    private JTextField bookIDField, bookTitleField, authorField;

    public AddBook() {
        setTitle("Add Book");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        
        JLabel bookIDLabel = new JLabel("Book ID:");
        bookIDLabel.setBounds(50, 50, 100, 20);
        add(bookIDLabel);
        bookIDField = new JTextField();
        bookIDField.setBounds(150, 50, 200, 20);
        add(bookIDField);

        
        JLabel bookTitleLabel = new JLabel("Book Title:");
        bookTitleLabel.setBounds(50, 80, 100, 20);
        add(bookTitleLabel);
        bookTitleField = new JTextField();
        bookTitleField.setBounds(150, 80, 200, 20);
        add(bookTitleField);

        
        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(50, 110, 100, 20);
        add(authorLabel);
        authorField = new JTextField();
        authorField.setBounds(150, 110, 200, 20);
        add(authorField);

        
        JButton addButton = new JButton("Add Book");
        addButton.setBounds(150, 150, 100, 30);
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String bookID = bookIDField.getText();
                String bookTitle = bookTitleField.getText();
                String author = authorField.getText();

                if (bookID.isEmpty() || bookTitle.isEmpty() || author.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Book added successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clearFields();
                }
            }
        });
        add(addButton);

        
        JButton backButton = new JButton("Back");
        backButton.setBounds(270, 150, 80, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new BookManagement();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }

    private void clearFields() {
        bookIDField.setText("");
        bookTitleField.setText("");
        authorField.setText("");
    }
}
