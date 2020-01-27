package screenshot;

import net.sourceforge.tess4j.Tesseract;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;
import net.sourceforge.tess4j.TesseractException;

public class ScreenShot {

    public static final long serialVersionUID = 1L;

    public static void main(String[] args) throws TesseractException {
        Tesseract tes = new Tesseract();
        try {
            Thread.sleep(120);
            Robot r = new Robot();
            
            
            
            
            String path = "C://Users//camer//Documents//NetBeansProjects//ScreenShot//Shot.jpg";

            
            Rectangle capture = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            
            BufferedImage Image = r.createScreenCapture(capture);
            ImageIO.write(Image, "jpg", new File(path));
            System.out.println("Screenshot saved");
            
            String text = tes.doOCR(new File("C://Users//camer//Documents//NetBeansProjects//ScreenShot//Shot.jpg"));
            
        } catch (AWTException | IOException | InterruptedException ex) {
            System.out.println(ex);
        }

    }

}
