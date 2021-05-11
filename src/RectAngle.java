import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RectAngle {
    public static void main(String[] args) throws AWTException, IOException {
        BufferedImage image = new Robot().createScreenCapture(new Rectangle(440,200,460,160));
        ImageIO.write(image, "png", new File("C:\\Users\\Владислав\\Desktop", "test.png"));
    }
}
