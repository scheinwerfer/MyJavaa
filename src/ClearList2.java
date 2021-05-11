import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClearList2 {
    public static final String writeMes = "Написать сообщение";

    // Симуляция нажатия Ctrl + F
    public void ctrlF() throws AWTException {
        Robot ctrlF = new Robot();
        ctrlF.keyPress(KeyEvent.VK_CONTROL);
        ctrlF.keyPress(KeyEvent.VK_F);
        ctrlF.keyRelease(KeyEvent.VK_F);
        ctrlF.keyRelease(KeyEvent.VK_CONTROL);
    }

    // Симуляция нажатия Ctrl + V
    public void ctrlV() throws AWTException {
        Robot ctrlV = new Robot();
        ctrlV.keyPress(KeyEvent.VK_CONTROL);
        ctrlV.keyPress(KeyEvent.VK_V);
        ctrlV.keyRelease(KeyEvent.VK_V);
        ctrlV.keyRelease(KeyEvent.VK_CONTROL);
    }

    // Снимок экрана
    public void getScreenShot() throws AWTException, IOException {

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("C:\\Users\\Владислав\\Desktop", "ScreenShot.png"));
    }

    // Цикл для поиска пикселя на 1ом скрине
    public void loop1() throws IOException, AWTException {

        BufferedImage image = ImageIO.read(new File("C:\\Users\\Владислав\\Desktop\\", "ScreenShot.png"));

        outLoop:
        for (int i = 265; i < 730; i += 5) {
            for (int j = 455; j < 700; j += 5) {

                int pixel = image.getRGB(j, i);
                int red = (pixel & 0x00ff0000) >> 16; // Преобразование в красный 255
                int green = (pixel & 0x0000ff00) >> 8; // Преобразование в зеленый 255
                int blue = pixel & 0x000000ff; // Преобразование в синий 255

                System.out.println("Red Color value = " + red);
                System.out.println("Green Color value = " + green);
                System.out.println("Blue Color value = " + blue);

                if (red == 255 && green == 150 && blue == 50) {
                    Robot mm2 = new Robot();
                    mm2.mouseMove(j, i);
                    mm2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    mm2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    break outLoop;
                }
            }
        }
    }

    // Цикл для поиска пикселя на 2ом скрине
    public void loop2() throws IOException, AWTException {

        BufferedImage image = ImageIO.read(new File("C:\\Users\\Владислав\\Desktop\\", "ScreenShot.png"));

        outLoop:
        for (int i = 300; i < 560; i += 5) {
            for (int j = 335; j < 585; j += 5) {

                int pixel = image.getRGB(j, i);
                int red = (pixel & 0x00ff0000) >> 16; // Преобразование в красный 255
                int green = (pixel & 0x0000ff00) >> 8; // Преобразование в зеленый 255
                int blue = pixel & 0x000000ff; // Преобразование в синий 255

                System.out.println("Red Color value = " + red);
                System.out.println("Green Color value = " + green);
                System.out.println("Blue Color value = " + blue);

                if (red == 255 && green == 150 && blue == 50) {
                    Robot mm2 = new Robot();
                    mm2.mouseMove(j, i);
                    mm2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    mm2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                    break outLoop;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException, AWTException, InterruptedException {

        if (args.length == 0) { // Проверяет наличие аргументов
            System.out.println("Текст введи, чепуха"); // Если аргументов нет
        } else {
            String name = args[0] + " ";                                // Имя
            String lastName = args[1];                                  // Фамилия
            String userName = name + lastName;                          // Соединяет имя и фамилию
            StringBuilder text = new StringBuilder();                   // Отправляемый текст
            String pathToInk = "C:\\Users\\Владислав\\Desktop\\Clicker.url"; //Путь до ярлыка

            File ink = new File(pathToInk);
            Desktop.getDesktop().open(ink);                                  // Запускает ярлык

            for (int i = 2; i < args.length; i++) {                     // Присваивает переменной text текст из введенных аргументов
                text.append(args[i]).append(" ");
            }
            Thread.sleep(7000);                                   // Ожидание 7 сек

            ClearList2 ctrlF1 = new ClearList2();                      // Вызывает метод симулирующий нажание Ctrl + F
            ctrlF1.ctrlF();

            // Копирует "Имя пользователя" в буфер обмена
            StringSelection selectionUserName = new StringSelection(userName);
            Clipboard copyUserName = Toolkit.getDefaultToolkit().getSystemClipboard();
            copyUserName.setContents(selectionUserName, null);

            ClearList2 ctrlV1 = new ClearList2();                      // Вызывает метод симулирующий нажатие Ctrl + V
            ctrlV1.ctrlV();
            Thread.sleep(1000);

            ClearList2 screen1 = new ClearList2();                      // Вызывает метод, который делает снимок экрана
            screen1.getScreenShot();

            ClearList2 loop1 = new ClearList2();                      // Вызывает метод запускающий цикл поиска пикселя по скриншоту в 1ой области
            loop1.loop1();
            Robot mm = new Robot();
            mm.mouseMove(0, 0);
            Thread.sleep(2000);

            ClearList2 ctrlF2 = new ClearList2();
            ctrlF2.ctrlF();
            Thread.sleep(1000);

            // Копирует "Написать сообщение" в буфер обмена
            StringSelection selectionWriteMes = new StringSelection(writeMes);
            Clipboard copyWriteMes = Toolkit.getDefaultToolkit().getSystemClipboard();
            copyWriteMes.setContents(selectionWriteMes, null);

            ClearList2 ctrlV2 = new ClearList2();
            ctrlV2.ctrlV();
            Thread.sleep(1000);

            ClearList2 screen2 = new ClearList2();                        // Делает новый снимок экрана
            screen2.getScreenShot();

            ClearList2 loop2 = new ClearList2();       // Вызывает метод запускающий цикл поиска пикселя по скриншоту во 2ой области (по второму скрину)
            loop2.loop2();
            Thread.sleep(1000);

            // Копирует текст для отправки в буфер обмена
            StringSelection selectionText = new StringSelection(text.toString());
            Clipboard copyText = Toolkit.getDefaultToolkit().getSystemClipboard();
            copyText.setContents(selectionText, null);

            ClearList2 ctrlV3 = new ClearList2();
            ctrlV3.ctrlV();

            // Симуляция движения мыши на заданные координаты и клик ЛКМ
            Robot mm2 = new Robot();
            mm2.mouseMove(850, 500);
            mm2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            mm2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        }
    }
}
