import javax.swing.*;

class Buttons extends JFrame {
    JPanel pnl = new JPanel();

    ClassLoader ldr = this.getClass().getClassLoader();

    java.net.URL tickURL = ldr.getResource("tick.png");
    java.net.URL crossURL = ldr.getResource("cross.png");

    ImageIcon tick = new ImageIcon(tickURL);
    ImageIcon cross = new ImageIcon(crossURL);

    JButton btn = new JButton("Нажми на меня");
    JButton tickbtn = new JButton(tick);
    JButton crossbtn = new JButton("СТОП", cross);

    public Buttons() {
        super("Окно Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        pnl.add(btn);
        pnl.add(tickbtn);
        pnl.add(crossbtn);

        setVisible(true);
    }

    public static void main(String[] args) {
        Buttons gui = new Buttons();
    }
}
