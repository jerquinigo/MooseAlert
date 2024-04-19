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
        JTextPane textPane = new JTextPane();
//        JTextArea textArea = new JTextArea("<html>" +
//                "<h1>Moose Alert</h1> " +
//                "<i>Italic Text</i> <font color='red'>Red Text</font>" +
//                "</html>\"");
//        textArea.setEditable(false); // Set editable to false if you only want to display text
//        textArea.set
        textPane.setContentType("text/html");
        textPane.setText("<html>" +
                "<head> " +
                "<style> " +
                 ".flex-item { " +
             "background-color: lightblue; " +
            "padding: 10px; " +
        "} " +
  "</style> " +
                "</head>" +
                "<div style=display: flex; justify-content: center; align-items: center;>" +
                    "<h1>Moose Alert</h1> " +
                   "<font color='red'>Time to take Moose out for a walk</font>" +
                "<div> " +
                "<div style=display: flex; justify-content: center; align-items: center;> " +
                "<img src='https://media.tenor.com/ZrQUcJZ660kAAAAM/rico-ricowestie.gif'> " +
                "</div>" +
                "</html>\"");

        JScrollPane scrollPane = new JScrollPane(textPane); // Add a scroll pane if needed
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
