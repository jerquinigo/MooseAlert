package ulil;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowOptions extends JFrame implements ActionListener {

    public Popup popup;

    public WindowOptions() {
        JFrame frame = new JFrame("Moose Alert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // create a label
        JTextArea textArea = new JTextArea("This is a multiline text area.");
        textArea.setEditable(false); // Set editable to false if you only want to display text
        JScrollPane scrollPane = new JScrollPane(textArea); // Add a scroll pane if needed
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setSize(800, 600);

//        PopupFactory popupFactory = new PopupFactory();
//
//        // create a panel
//        JPanel paneltwo = new JPanel();
//        // set Background of panel
//        paneltwo.setBackground(Color.red);
//        paneltwo.add(label);
//        popup = popupFactory.getPopup(frame, paneltwo, 400, 400);
//        frame.show();

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        popup.show();
    }
}
