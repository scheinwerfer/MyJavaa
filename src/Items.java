import javax.swing.*;

class Items extends JFrame {

    JPanel pnl = new JPanel();

    String[] toppings = {"Пеперони", "Грибная", "Томатная", "С ветчиной"};

    JCheckBox chk1 = new JCheckBox(toppings[0]);
    JCheckBox chk2 = new JCheckBox(toppings[1], true);
    JCheckBox chk3 = new JCheckBox(toppings[2]);
    JCheckBox chk4 = new JCheckBox(toppings[3]);

    String[] style = {"В глобокой форме", "Для гурманов", "Тонкая"};

    JComboBox<String> box1 = new JComboBox<String>(style);

    JList<String> lst1 = new JList<String>(toppings);

    public Items() {

        super("Окно Swing");
        setSize(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);

        pnl.add(chk1);
        pnl.add(chk2);
        pnl.add(chk3);
        pnl.add(chk4);

        box1.setSelectedIndex(0);
        pnl.add(box1);

        lst1.setSelectedIndex(1);
        pnl.add(lst1);

        setVisible(true);
    }

    public static void main(String[] args) {
        Items gui = new Items();
    }
}
