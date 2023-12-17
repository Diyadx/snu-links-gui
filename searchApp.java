import javax.swing.*;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.BorderFactory;
import java.awt.event.MouseEvent;
import javax.swing.JSeparator;
import javax.swing.JPanel;


public class searchApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
            
        });
       
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Search Page"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Create a panel with a BorderLayout
        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);

        // Create a blue header panel with a background color
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER,300,10));
        headerPanel.setBackground(new Color(0, 81, 151));
        panel.add(headerPanel, BorderLayout.NORTH);

        // Create a west panel for the image
        ImageIcon headerImage = new ImageIcon("C:\\Users\\diyad\\OneDrive\\Desktop\\snu logo.jpg"); // Provide the path to your image
        JLabel imageLabel = new JLabel(headerImage);
        headerPanel.add(imageLabel);


        // Create a search container panel with the search option
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        searchPanel.setBackground(new Color(0, 81, 151));
        JTextField searchField = new JTextField(20);
        searchField.setText("Search");
        JButton searchButton = new JButton();
        searchButton.setPreferredSize(new Dimension(30,30));
        searchButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\diyad\\OneDrive\\Desktop\\WhatsApp Image 2023-11-06 at 14.54.07_a5c01a24.jpg").getImage().getScaledInstance(35,35,Image.SCALE_SMOOTH)));
        searchPanel.add(searchButton);
        searchPanel.add(searchField);
        headerPanel.add(searchPanel);

        // Create a label for the user's name and set it to right-aligned
        JLabel userNameLabel = new JLabel("Hi, Diya Dugar ▾");
        userNameLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        headerPanel.add(userNameLabel, BorderLayout.EAST);
        userNameLabel.setForeground(Color.WHITE);
        
        // Create a dropdown menu with icons
        JPopupMenu popupMenu = new JPopupMenu();
        popupMenu.setOpaque(true);  // Set to true to allow background color
        popupMenu.setBackground(Color.WHITE);  // Set the background color
        String[] options = {"Logout", "Forgot Password", "Change/Reset Password", "IT Help Desk", "How to Login?"};
        Icon[] icons = {
            new ImageIcon("C:\\Users\\diyad\\OneDrive\\Desktop\\arrow.jpg"),
            new ImageIcon("C:\\Users\\diyad\\OneDrive\\Pictures\\key.jpg"),
            new ImageIcon("C:\\Users\\diyad\\OneDrive\\Pictures\\key.jpg"),
            new ImageIcon("C:\\Users\\diyad\\OneDrive\\Desktop\\mail.jpg"),
            new ImageIcon("C:\\Users\\diyad\\OneDrive\\Desktop\\i.jpg")
        };

       for (int i = 0; i < options.length; i++) {
    JMenuItem menuItem = new JMenuItem(options[i]);
    popupMenu.add(menuItem);

    if (options[i].equals("Change/Reset Password")) {
        // Add a separator after this item
        popupMenu.addSeparator();
    }
// Set the icon for the menu item
    menuItem.setIcon(icons[i]);
       }

        
        // Attach the popup menu to the label
        userNameLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupMenu.show(userNameLabel, e.getX(), e.getY() + userNameLabel.getHeight());
            }
        });
        
        
        // Create a content panel with FlowLayout to display the panels
        JPanel contentPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 10)); // Decreased the gap between components
        contentPanel.setBorder(BorderFactory.createEmptyBorder(30,110,0,0));
        contentPanel.setBackground(Color.WHITE);
        panel.add(contentPanel, BorderLayout.CENTER);


        // Add a MouseListener to the contentPanel to change the cursor
contentPanel.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        contentPanel.setCursor(Cursor.getDefaultCursor());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        contentPanel.setCursor(new Cursor(Cursor.HAND_CURSOR)); 
    }
});

        // Create an array of texts for the panels
        String[] texts = {
            "University ERP", "Assistantship/Award", "Blackboard", "CCT",
            "Certificate Issuance", "Course Evaluation Survey", "Doctoral Portal", "Fastrack",
            "Hostel Management", "ID Card Management", "Mobile App CMS", "On Campus Job", "Student Outbound Mobility",
            "Student Attendance Recording", "Student Attendance Management", "Student Clearance", "Student Payment Centre"
        };

        // Create an array of file paths for the icons
        String[] iconPaths = {
            "C:\\Users\\diyad\\OneDrive\\Desktop\\erp.png", "C:\\Users\\diyad\\OneDrive\\Desktop\\w1.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w2.jpg"
            , "C:\\Users\\diyad\\OneDrive\\Desktop\\w3.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w4.jpg",
             "C:\\Users\\diyad\\OneDrive\\Desktop\\w5.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w6.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w7.jpg",
            "C:\\Users\\diyad\\OneDrive\\Desktop\\w8.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w9.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w10.jpg", 
            "C:\\Users\\diyad\\OneDrive\\Desktop\\w11.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w12.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w13.jpg", 
            "C:\\Users\\diyad\\OneDrive\\Desktop\\w14.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\w15.jpg"
        };

        for (int i = 0; i < Math.min(texts.length, iconPaths.length); i++) {
    // Create a button for the panel and set the text and icon
    JButton linkButton = new JButton(texts[i], new ImageIcon(iconPaths[i]));
    linkButton.setHorizontalAlignment(JButton.LEFT);
    linkButton.setBackground(Color.WHITE);
    if (texts[i].equals("University ERP")) {
        linkButton.setBackground(new Color(0, 81, 151)); // Set the background color to blue
        linkButton.setForeground(Color.WHITE); // Set the text color to white
    } else {
        linkButton.setForeground(Color.BLACK); // Set the text color to blue for other buttons
    }
    linkButton.setPreferredSize(new Dimension(200,47));
    linkButton.setBorder(BorderFactory.createLineBorder(new Color(0, 81, 151)));

    // Enable tooltips for the button
    linkButton.setOpaque(true);
    linkButton.setRolloverEnabled(true);
    linkButton.setToolTipText(texts[i]);


    // Add an action listener to handle the link click
    final int buttonIndex = i; // Capture the index in a final variable
    linkButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Handle the link click here (e.g., open a URL or perform an action)
            JOptionPane.showMessageDialog(frame, "Clicked on: " + texts[buttonIndex]);
        }
    });
    contentPanel.add(linkButton);
}

// Create a footer panel with the color #17141f and the same height as the header
JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10)); // Decreased the gap between footer options
Color footerColor = new Color(23, 20, 31); // #17141f
footerPanel.setBackground(footerColor);
footerPanel.setPreferredSize(new Dimension(0,180));
panel.add(footerPanel, BorderLayout.SOUTH);


// Create options in the footer panel with icons
String[] footerOptions = {"<html><u>Student Policy</u></html>", "<html><u>Student Handbook</u></html>", "<html><u>Academic Research</u></html>", "<html><u>University Library</u></html>", "<html><u>Mess Menu</u></html>", "<html><u>NetID Help</u></html>"};

// Create an array of file paths for the footer icons
String[] footerIconPaths = {
    "C:\\Users\\diyad\\OneDrive\\Desktop\\f1.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\f2.jpg", 
    "C:\\Users\\diyad\\OneDrive\\Desktop\\f3.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\f4.jpg",
    "C:\\Users\\diyad\\OneDrive\\Desktop\\f5.jpg", "C:\\Users\\diyad\\OneDrive\\Desktop\\f6.jpg"
};

for (int i = 0; i < footerOptions.length; i++) {
    JPanel footerOptionPanel = new JPanel();
    footerOptionPanel.setPreferredSize(new Dimension(200, 50)); // Increased the panel width
    footerOptionPanel.setBackground(footerColor); // Set the background color to match the footer

    // Create an icon label for the footer option
    ImageIcon footerIcon = new ImageIcon(footerIconPaths[i]);
    JLabel iconLabel = new JLabel(footerIcon);

    // Create a label for the footer text
    JLabel footerLabel = new JLabel(footerOptions[i]);
    footerLabel.setForeground(Color.WHITE); // Set the text color to white

    // Add the icon and text labels to the footer option panel
    footerOptionPanel.add(iconLabel);
    footerOptionPanel.add(footerLabel);
    footerPanel.add(footerOptionPanel);
}

//Create a separator to act as a horizontal line
JSeparator horizontalSeparator = new JSeparator(SwingConstants.HORIZONTAL);
horizontalSeparator.setPreferredSize(new Dimension(1500,1));
horizontalSeparator.setForeground(Color.WHITE); // Set the separator color to white
footerPanel.add(horizontalSeparator); // Add the horizontal separator here

// Create a footer label for the copyright notice
        JLabel copyrightPrefixLabel = new JLabel("© 2023 - ");
        copyrightPrefixLabel.setForeground(Color.WHITE); // Set the text color to white
        footerPanel.add(copyrightPrefixLabel);

        JLabel copyrightSuffixLabel = new JLabel("<html><u>Shiv Nadar (Institution of Eminence Deemed to be University).</u></html>");
        copyrightSuffixLabel.setForeground(Color.WHITE); // Set the text color to white
        footerPanel.add(copyrightSuffixLabel);

frame.setVisible(true);
    }
}





