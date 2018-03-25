package Lesson13;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class BlackWhiteImage {

    public static void main(String[] args) throws IOException {

        BufferedImage image = ImageIO.read(new File("image.jpg"));

        WritableRaster raster = image.getRaster();

        int width = raster.getWidth();
        int height = raster.getHeight();

        final int COLOR_COUNT_IN_RGB = 3;
        final double INTENSITY_PERCEPTUAL_RED = 0.3;
        final double INTENSITY_PERCEPTUAL_GREEN = 0.59;
        final double INTENSITY_PERCEPTUAL_BLUE = 0.11;


        int[] pixel = new int[COLOR_COUNT_IN_RGB];

        for (int j = 0; j < height; ++j) {

            for (int i = 0; i < width; ++i) {
                raster.getPixel(i, j, pixel);

                int blackWhitePixel = (int) (pixel[0] * INTENSITY_PERCEPTUAL_RED + pixel[1] * INTENSITY_PERCEPTUAL_GREEN +
                        pixel[2] * INTENSITY_PERCEPTUAL_BLUE);

                for (int k = 0; k < COLOR_COUNT_IN_RGB; ++k) {
                    pixel[k] = blackWhitePixel;
                }

                raster.setPixel(i, j, pixel);
            }
        }

        ImageIO.write(image, "jpg", new File("out.jpg"));
    }
}
