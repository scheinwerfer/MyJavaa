import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class States extends JFrame implements ItemListener {

    String[] styles = { "В глубокой форме" , "Для гурманов" , "Тонкая" } ;

    JComboBox<String> box = new JComboBox<String>(styles);

    JRadioButton rad1 = new JRadioButton("Красное");
    JRadioButton rad2 = new JRadioButton("Белое");
    ButtonGroup wines = new ButtonGroup();

    JCheckBox chk = new JCheckBox("Пеперони");

    JTextArea txtArea = new JTextArea(5, 38);

    JPanel pnl = new JPanel();

    public void itemStateChanged (ItemEvent event) {

        if (event.getItemSelectable() == rad1 ) {
            txtArea.setText("Выбрано красное вино");
        }

        if (event.getItemSelectable() == rad2) {
            txtArea.setText("\nВыбрано белое вино");
        }

        if ((event.getItemSelectable() == chk) && (event.getStateChange() == ItemEvent.SELECTED)) {
            txtArea.append("\nВыбрана пеперони\n");
        }

        if ((event.getItemSelectable() == box) && (event.getStateChange() == ItemEvent.SELECTED)) {
            txtArea.append("Выбрана " +event.getItem().toString());
        }

    }

    public States() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        wines.add(rad1);
        wines.add(rad2);

        pnl.add(box);
        pnl.add(rad1);
        pnl.add(rad2);
        pnl.add(chk);
        pnl.add(txtArea);

        rad1.addItemListener(this);
        rad2.addItemListener(this);
        box.addItemListener(this);
        chk.addItemListener(this);

        setVisible(true);
    }

    public static void main(String[] args) {

        States gui = new States();

    }
}
