import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Sound extends JFrame implements ActionListener {

    JPanel pnl = new JPanel();

    ClassLoader ldr = this.getClass().getClassLoader();

    java.applet.AudioClip audio = JApplet.newAudioClip(ldr.getResource("hospital1.wav"));

    JButton playBtn = new JButton("Воспроизвести");
    JButton stopBtn = new JButton("Стоп");

    public Sound() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        pnl.add(playBtn);
        pnl.add(stopBtn);

        playBtn.addActionListener(this);
        stopBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == playBtn) {
            audio.play();
        }

        if (event.getSource() == stopBtn) {
            audio.stop();
        }

    }

    public static void main(String[] args) {

        Sound gui = new Sound();

    }
}
