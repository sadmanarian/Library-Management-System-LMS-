import javax.swing.*;
import java.awt.event.*;

public class MemberManagement extends JFrame {
    public MemberManagement() {
        setTitle("Member Management");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);

        
        JButton addMemberButton = new JButton("Add Member");
        addMemberButton.setBounds(100, 50, 200, 30);
        addMemberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AddMember();
                dispose();
            }
        });
        add(addMemberButton);

        JButton removeMemberButton = new JButton("Remove Member");
        removeMemberButton.setBounds(100, 100, 200, 30);
        removeMemberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new RemoveMember();
                dispose();
            }
        });
        add(removeMemberButton);

        
        JButton backButton = new JButton("Back");
        backButton.setBounds(100, 150, 200, 30);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MainMenu();
                dispose();
            }
        });
        add(backButton);

        setVisible(true);
    }
}
