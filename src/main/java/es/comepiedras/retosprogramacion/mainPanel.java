package es.comepiedras.retosprogramacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainPanel {
    private JPanel mainPanel;
    private JLabel lblNombre;
    private JTextField txtNombre;
    private JButton btnSaludo;

    public mainPanel() {
        btnSaludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnSaludo, "¡Hola! " + txtNombre.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("mainPanel");
        frame.setContentPane(new mainPanel().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
