import javax.swing.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Mon Sep 11 21:40:42 CST 2023
 */



/**
 * @author 17719
 */
public class codeshow extends JFrame {
    public codeshow() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        label1 = new JLabel();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        button1 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));

        //---- label1 ----
        label1.setText("text");
        contentPane.add(label1, "cell 0 1 7 5");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1, "cell 1 7 5 1");

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1, "cell 3 9");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JLabel label1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JButton button1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
