import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ClearList {
    public static void main(String[] args) throws IOException, AWTException, InterruptedException {
        String pathToInk = "C:\\Users\\Владислав\\Desktop\\Clicker.url";
        File ink = new File(pathToInk);
        String name = args[0] + " ";
        String lastName = args[1];
        String userName = name + lastName;
        String writeMes = "Написать сообщение";
        StringBuilder text = new StringBuilder();

        for (int i = 2; i < args.length; i++) {
            text.append(args[i]).append(" ");
        }

                Desktop.getDesktop().open(ink);
                Thread.sleep(7000);

                StringSelection selectionUserName = new StringSelection(userName);
                Clipboard copyUserName = Toolkit.getDefaultToolkit().getSystemClipboard();
                copyUserName.setContents(selectionUserName, null);

                Robot ctrlF1 = new Robot();
                ctrlF1.keyPress(KeyEvent.VK_CONTROL);
                ctrlF1.keyPress(KeyEvent.VK_F);
                ctrlF1.keyRelease(KeyEvent.VK_F);
                ctrlF1.keyPress(KeyEvent.VK_CONTROL);
                Thread.sleep(1000);

                Robot ctrlV1 = new Robot();
                ctrlV1.keyPress(KeyEvent.VK_CONTROL);
                ctrlV1.keyPress(KeyEvent.VK_V);
                ctrlV1.keyRelease(KeyEvent.VK_V);
                ctrlV1.keyRelease(KeyEvent.VK_CONTROL);
                Thread.sleep(2000);

                BufferedImage scrn1 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                ImageIO.write(scrn1, "png", new File("C:\\Users\\Владислав\\Desktop\\", "screenShot.png"));
                BufferedImage image1 = ImageIO.read(new File("C:\\Users\\Владислав\\Desktop\\", "screenShot.png"));

                int heightFistImage = image1.getHeight();
                int widthFirstImage = image1.getWidth();

                outLoop:
                for (int i = 0; i < heightFistImage; i += 2) {
                    for (int j = 0; j < widthFirstImage; j += 2) {

                        int pixelOne = image1.getRGB(j, i);
                        int redOne = (pixelOne & 0x00ff0000) >> 16; // Преобразование в красный 255
                        int greenOne = (pixelOne & 0x0000ff00) >> 8; // Преобразование в зеленый 255
                        int blueOne = pixelOne & 0x000000ff; // Преобразование в синий 255

                        System.out.println("R Color value = " + redOne);
                        System.out.println("G Color value = " + greenOne);
                        System.out.println("B Color value = " + blueOne);

                        if (redOne == 255 && greenOne == 150 && blueOne == 50) {
                            Robot mm = new Robot();
                            mm.mouseMove(j, i);
                            mm.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            mm.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                            break outLoop;
                        }
                    }
                }
                Thread.sleep(3000);
                Robot begin = new Robot();
                begin.mouseMove(0, 0);

                StringSelection selectionWriteMes = new StringSelection(writeMes);
                Clipboard copyWriteMes = Toolkit.getDefaultToolkit().getSystemClipboard();
                copyWriteMes.setContents(selectionWriteMes, null);

                Robot ctrlF2 = new Robot();
                ctrlF2.keyPress(KeyEvent.VK_CONTROL);
                ctrlF2.keyPress(KeyEvent.VK_F);
                ctrlF2.keyRelease(KeyEvent.VK_F);
                ctrlF2.keyRelease(KeyEvent.VK_CONTROL);
                Thread.sleep(3000);

                Robot ctrlV2 = new Robot();
                ctrlV2.keyPress(KeyEvent.VK_CONTROL);
                ctrlV2.keyPress(KeyEvent.VK_V);
                ctrlV2.keyRelease(KeyEvent.VK_V);
                ctrlV2.keyRelease(KeyEvent.VK_CONTROL);
                Thread.sleep(2000);

                BufferedImage scrn2 = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
                ImageIO.write(scrn2, "png", new File("C:\\Users\\Владислав\\Desktop\\", "screenShot2.png"));
                BufferedImage image2 = ImageIO.read(new File("C:\\Users\\Владислав\\Desktop\\", "screenShot2.png"));

                int heightSecImage = image2.getHeight();
                int widthSecImage = image2.getWidth();

                outLoop2:
                for (int i = 0; i < heightSecImage; i += 2) {
                    for (int j = 0; j < widthSecImage; j += 2) {

                        int pixelTwo = image2.getRGB(j, i);
                        int redTwo = (pixelTwo & 0x00ff0000) >> 16; // Преобразование в красный 255
                        int greenTwo = (pixelTwo & 0x0000ff00) >> 8; // Преобразование в зеленый 255
                        int blueTwo = pixelTwo & 0x000000ff; // Преобразование в синий 255

                        System.out.println("Red Color value = " + redTwo);
                        System.out.println("Green Color value = " + greenTwo);
                        System.out.println("Blue Color value = " + blueTwo);

                        if (redTwo == 255 && greenTwo == 150 && blueTwo == 50) {
                            Robot mm2 = new Robot();
                            mm2.mouseMove(j, i);
                            mm2.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                            mm2.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

                            break outLoop2;
                        }
                    }
                }
                StringSelection selectionText = new StringSelection(text.toString());
                Clipboard copyText = Toolkit.getDefaultToolkit().getSystemClipboard();
                copyText.setContents(selectionText, null);

                Robot ctrlV3 = new Robot();
                ctrlV3.keyPress(KeyEvent.VK_CONTROL);
                ctrlV3.keyPress(KeyEvent.VK_V);
                ctrlV3.keyRelease(KeyEvent.VK_V);
                ctrlV3.keyRelease(KeyEvent.VK_CONTROL);
                Thread.sleep(2000);

                Robot mm3 = new Robot();
                mm3.mouseMove(850, 500);
                mm3.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                mm3.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }
        }
