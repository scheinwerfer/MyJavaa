import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class save2
{
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        String path = "C:\\Users\\Владислав\\Desktop\\Clicker.url"; // Путь до ярлыка
        File ink = new File(path);
        String name = args[0] + " ";
        String lastName = args[1];
        String nName = name + lastName;
        StringBuilder frndss = new StringBuilder();

        //Проверяет наличие аргументов, если они есть - исполняется
        if (args.length == 0) {
            System.out.println("Текст введи, чепуха"); // Если аргументов нет
        } else {
            for (int i = 2;i < args.length; i++ ) {
                frndss.append(args[i]).append(" ") ;
            }

            Desktop.getDesktop().open(ink); // Запускает ярлык
            Thread.sleep(10000); // Ожидание 10 сек

            Robot frnds = new Robot(); // Клик на друзей
            frnds.mouseMove(249, 271);
            frnds.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            frnds.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(3000);



            // Поиск по друзьям
            Robot search = new Robot();
            search.keyPress(KeyEvent.VK_CONTROL);
            search.keyPress(KeyEvent.VK_F);
            search.keyRelease(KeyEvent.VK_F);
            search.keyRelease(KeyEvent.VK_CONTROL);

            // Копирование имени и фамилии в буфер
            StringSelection select2 = new StringSelection(nName);
            Clipboard clpbrd2 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd2.setContents(select2, null);

            // ctrl v
            Robot ctrl0 = new Robot();
            ctrl0.keyPress(KeyEvent.VK_CONTROL);
            ctrl0.keyPress(KeyEvent.VK_V);
            ctrl0.keyRelease(KeyEvent.VK_V);
            ctrl0.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);


            Robot pm = new Robot(); // Клик на "Написать сообщение"
            pm.mouseMove(555, 441);
            pm.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            pm.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            Thread.sleep(1000);

            //Копирует в буфер обмена аргументы
            StringSelection strselec = new StringSelection(frndss.toString()); // Выбирает строку
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard(); // Доступ к системному клипборду
            clpbrd.setContents(strselec, null); // Копирование в клипборд

            //Симуляция ctrl v
            Robot ctrl = new Robot();
            ctrl.keyPress(KeyEvent.VK_CONTROL);
            ctrl.keyPress(KeyEvent.VK_V);
            ctrl.keyRelease(KeyEvent.VK_V);
            ctrl.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(500);

            Robot send = new Robot(); // Кликает на "отправить"
            send.mouseMove(841, 503);
            send.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            send.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }

    }
}