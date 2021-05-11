import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ttest {
    public static void main(String[] args) throws IOException, AWTException {
        BufferedImage image = ImageIO.read(new File("C:\\Users\\Владислав\\Desktop\\", "ScreenShot.png"));

        int h = image.getHeight();
        int w = image.getWidth();

        outLoop:
        for (int i = 265; i < h; i += 7) {
            for (int j = 455; j < w; j += 7) {
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
}
