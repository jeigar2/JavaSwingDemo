package es.comepiedras.retosprogramacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JFrame {
    private JPanel mainPanel;
    private JLabel lblUsuario;
    private JTextField txtUsuario;
    private JButton btnSaludo;
    private JLabel lblClave;
    private JButton salirButton;
    private JPasswordField pssClave;

    private JMenuBar menuBar;
    private JMenu mnuArchivo;
    private JMenuItem mnuItemSalir;

    public LoginPanel() {
        menuBar = new JMenuBar();
        mnuArchivo = new JMenu("Archivo");
        mnuItemSalir = new JMenuItem("Salir");
        menuBar.add(mnuArchivo);
        mnuArchivo.add(mnuItemSalir);
        setJMenuBar(menuBar);

        btnSaludo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (pssClave.getText().isBlank()) {
                    JOptionPane.showMessageDialog(null, "No ha introducido una clave correcta", "Error clave incorrecta", JOptionPane.ERROR_MESSAGE);
                } else if (txtUsuario.getText().isBlank()) {
                    JOptionPane.showMessageDialog(null, "No ha introducido un usuario correcto", "Error usuario incorrecto", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(btnSaludo, "¡Bienvenido! " + txtUsuario.getText());
                }
            }
        });
        mnuItemSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.out.println("salir de la aplicación por el menú");
                System.exit(0);
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.out.println("salir de la aplicación por el boton");
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
//        JFrame frame = new JFrame("mainPanel");
        LoginPanel frame = new LoginPanel();
        frame.setTitle("Saludo");
        frame.setContentPane(new LoginPanel().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
