import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Request extends JFrame implements ActionListener {

    JPanel pnl = new JPanel();

    JTextField field = new JTextField(38);
    JButton btn1 = new JButton("Запрос подтверждения");
    JButton btn2 = new JButton("Запрос ввода");

    public Request() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        pnl.add(field);
        pnl.add(btn1);
        pnl.add(btn2);

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed (ActionEvent event) {

        if (event.getSource() == btn1) {
            int n = JOptionPane.showConfirmDialog(this, "Are you agree?", "Confirmation dialog", JOptionPane.YES_NO_CANCEL_OPTION);

            switch (n) {
                case 0 -> field.setText("Agree");
                case 1 -> field.setText("Disagree");
                case 2 -> field.setText("Canceled");
            }
        }
        if (event.getSource() == btn2) {
            field.setText(JOptionPane.showInputDialog(this, "Введите ваш комментарий", "Диалог ввода", JOptionPane.PLAIN_MESSAGE));
        }
    }

    public static void main(String[] args) {

        Request gui = new Request();

    }
}
