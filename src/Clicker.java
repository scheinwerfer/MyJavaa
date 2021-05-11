import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Clicker {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        String path = "C:\\Users\\Владислав\\Desktop\\Clicker.url"; // Путь до ярлыка
        File ink = new File(path);
        String name = args[0] + " ";
        String lastName = args[1];
        String nName = name + lastName;
        String writeMes = "Написать сообщение";
        StringBuilder frndss = new StringBuilder();

        //Проверяет наличие аргументов, если они есть - исполняется
        if (args.length == 0) {
            System.out.println("Текст введи, чепуха"); // Если аргументов нет
        } else {
            for (int i = 2; i < args.length; i++) {
                frndss.append(args[i]).append(" ");
            }

            Desktop.getDesktop().open(ink); // Запускает ярлык
            Thread.sleep(13000); // Ожидание 13 сек

            // Копирование имени и фамилии в буфер
            StringSelection select2 = new StringSelection(nName);
            Clipboard clpbrd2 = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd2.setContents(select2, null);
            Thread.sleep(500);

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
            Thread.sleep(2000);

            // ctrl v
            Robot ctrl0 = new Robot();
            ctrl0.keyPress(KeyEvent.VK_CONTROL);
            ctrl0.keyPress(KeyEvent.VK_V);
            ctrl0.keyRelease(KeyEvent.VK_V);
            ctrl0.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(1000);

            BufferedImage imagee = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(imagee, "png", new File("C:\\Users\\Владислав\\Desktop\\", "scrn.png"));

            String path1 = "C:\\Users\\Владислав\\Desktop\\scrn.png"; // Путь до файла
            File pic = new File(path1);
            BufferedImage image = ImageIO.read(pic);

            int i = 0;
            int j = 0;
            int pixel = 0;
            int red = 0;
            int green = 0;
            int blue = 0;
            int h = image.getHeight();
            int w = image.getWidth();
            Robot rb = new Robot();

            outLoop:    for (i = 0; i < h; i+=2) // Внешний цикл для прохода по высоте
            {
                for (j = 0; j < w; j+=2) // Внутренний цикл для прохода по ширине
                {
                    pixel = image.getRGB(j, i); // Получение цвета пикселя
                    red = (pixel & 0x00ff0000) >> 16; // Преобразование в красный 255
                    green = (pixel & 0x0000ff00) >> 8; // Преобразование в зеленый 255
                    blue = pixel & 0x000000ff; // Преобразование в синий 255
                    System.out.println("Red Color value = " + red);
                    System.out.println("Green Color value = " + green);
                    System.out.println("Blue Color value = " + blue);

                    if (red == 255 && green == 150 && blue == 50) {
                        break outLoop;
                    }

                }
            }

                System.out.println("X = " + j + " Y = " + i);
                rb.mouseMove(j, i); // Сдвиг мыши на координаты указанного цвета
                Thread.sleep(1000); // Задержка в 1 сек

                // Клик ЛКМ
                rb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                rb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                Thread.sleep(5000);

            // Копируем "Написать сообщение"
            StringSelection sennd = new StringSelection(writeMes);
            Clipboard cpSendMes = Toolkit.getDefaultToolkit().getSystemClipboard();
            cpSendMes.setContents(sennd, null);

            // Ctrl + F
            Robot cf = new Robot();
            cf.keyPress(KeyEvent.VK_CONTROL);
            cf.keyPress(KeyEvent.VK_F);
            cf.keyRelease(KeyEvent.VK_F);
            cf.keyRelease(KeyEvent.VK_CONTROL);

            // Crtl + V
            Robot cv = new Robot();
            cv.keyPress(KeyEvent.VK_CONTROL);
            cv.keyPress(KeyEvent.VK_V);
            cv.keyRelease(KeyEvent.VK_V);
            cv.keyRelease(KeyEvent.VK_CONTROL);
            Thread.sleep(2000);

            BufferedImage imageeee = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            ImageIO.write(imageeee, "png", new File("C:\\Users\\Владислав\\Desktop\\", "scrn2.png"));

            String pathh = "C:\\Users\\Владислав\\Desktop\\scrn2.png"; // Путь до файла
            File picc = new File(pathh);
            BufferedImage imageee = ImageIO.read(picc);

            int h2 = imageee.getHeight();
            int w2 = imageee.getWidth();
            Robot rbb = new Robot();

            outLoop1:    for (int a = 0; a < h2; a++) // Внешний цикл для прохода по высоте
            {
                for (int b = 0; b < w2; b++) // Внутренний цикл для прохода по ширине
                {
                    int pxl = imageee.getRGB(b, a); // Получение цвета пикселя
                    int r = (pxl & 0x00ff0000) >> 16; // Преобразование в красный 255
                    int g = (pxl & 0x0000ff00) >> 8; // Преобразование в зеленый 255
                    int bl = pxl & 0x000000ff; // Преобразование в синий 255
                    System.out.println("R Color value = " + r);
                    System.out.println("G Color value = " + g);
                    System.out.println("B Color value = " + b);

                    // Здесь указываете цвет который нужно найти в RGB
                    if (r == 255 && g == 150 && bl == 50) {
                        System.out.println("X1 = " + b + " Y2 = " + a);
                        rbb.mouseMove(b, a); // Сдвиг мыши на координаты указанного цвета
                        Thread.sleep(1000); // Задержка в 1 сек

                        // Клик ЛКМ
                        rbb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                        rbb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                        break outLoop1;
                    }
                }
            }


                   /* Thread.sleep(5000);




                    // Ctrl + F
                    Robot cf = new Robot();
                    cf.keyPress(KeyEvent.VK_CONTROL);
                    cf.keyPress(KeyEvent.VK_F);
                    cf.keyRelease(KeyEvent.VK_F);
                    cf.keyRelease(KeyEvent.VK_CONTROL);

                    // Crtl + V
                    Robot cv = new Robot();
                    cv.keyPress(KeyEvent.VK_CONTROL);
                    cv.keyPress(KeyEvent.VK_V);
                    cv.keyRelease(KeyEvent.VK_V);
                    cv.keyRelease(KeyEvent.VK_CONTROL);
                    Thread.sleep(2000);

                    BufferedImage imageee = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                    ImageIO.write(imageee, "png", new File("C:\\Users\\Владислав\\Desktop\\", "scrn2.png"));

                    String pathh = "C:\\Users\\Владислав\\Desktop\\scrn2.png"; // Путь до файла
                    File picc = new File(pathh);
                    BufferedImage imageeee = ImageIO.read(picc);

                    int h2 = imageeee.getHeight();
                    int w2 = imageeee.getWidth();
                    Robot rbb = new Robot();

                    outLoop1:    for (int a = 0; a < h2; a++) // Внешний цикл для прохода по высоте
                    {
                        for (int b = 0; b < w2; b++) // Внутренний цикл для прохода по ширине
                        {
                            int pxl = imageeee.getRGB(b, a); // Получение цвета пикселя
                            int r = (pxl & 0x00ff0000) >> 16; // Преобразование в красный 255
                            int g = (pxl & 0x0000ff00) >> 8; // Преобразование в зеленый 255
                            int bl = pxl & 0x000000ff; // Преобразование в синий 255
                            System.out.println("R Color value = " + r);
                            System.out.println("G Color value = " + g);
                            System.out.println("B Color value = " + b);

                            // Здесь указываете цвет который нужно найти в RGB
                            if (r == 255 && g == 150 && bl == 50) {
                                System.out.println("X1 = " + b + " Y2 = " + a);
                                rbb.mouseMove(b, a); // Сдвиг мыши на координаты указанного цвета
                                Thread.sleep(1000); // Задержка в 1 сек

                                // Клик ЛКМ
                                rbb.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                                rbb.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                                StringSelection str3 = new StringSelection(frndss.toString());
                                Clipboard css = Toolkit.getDefaultToolkit().getSystemClipboard();
                                css.setContents(str3, null);

                                Robot cvv = new Robot();
                                cvv.keyPress(KeyEvent.VK_CONTROL);
                                cvv.keyPress(KeyEvent.VK_V);
                                cvv.keyRelease(KeyEvent.VK_V);
                                cvv.keyRelease(KeyEvent.VK_CONTROL);
                                Thread.sleep(1500);

                                Robot send = new Robot(); // Кликает на "отправить"
                                send.mouseMove(841, 503);
                                send.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                                send.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                                break outLoop1;
                            }
                        }
                    } */


        }
    }
}