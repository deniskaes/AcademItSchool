package Lesson13;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;

public class Blurring {

    private static int sat(int value) {
        final int MAX_RGB = 255;

        if (value <= 0) {
            return 0;
        } else if (value <= MAX_RGB) {
            return value;
        } else {
            return MAX_RGB;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedImage imageOriginal = ImageIO.read(new File("image.jpg"));
        BufferedImage imageBlurring = ImageIO.read(new File("image.jpg"));

        WritableRaster rasterOriginal = imageOriginal.getRaster();
        WritableRaster rasterModified = imageBlurring.getRaster();

        int width = rasterOriginal.getWidth();
        int height = rasterOriginal.getHeight();
        final int COLOR_COUNT_IN_RGB = 3;
        double[][] blurring = {{1 / 9d, 1 / 9d, 1 / 9d}, {1 / 9d, 1 / 9d, 1 / 9d}, {1 / 9d, 1 / 9d, 1 / 9d}};

        for (int j = 1; j < height - 1; ++j) {

            for (int i = 1; i < width - 1; ++i) {

                int[] pixel = new int[COLOR_COUNT_IN_RGB];
                double resultRed = 0;
                double resultGreen = 0;
                double resultBlue = 0;
                int h = 0;

                for (int k = j - 1; k < j + 2; ++k) {
                    int w = 0;

                    for (int m = i - 1; m < i + 2; ++m) {

                        rasterOriginal.getPixel(m, k, pixel);
                        resultRed += pixel[0] * blurring[w][h];
                        resultGreen += pixel[1] * blurring[w][h];
                        resultBlue += pixel[2] * blurring[w][h];
                        w++;
                    }

                    h++;
                }

                int[] pixelResult = {sat((int) Math.round(resultRed)), sat((int) Math.round(resultGreen)),
                        sat((int) Math.round(resultBlue))};
                rasterModified.setPixel(i, j, pixelResult);
            }
        }

        ImageIO.write(imageBlurring, "jpg", (new File("out4.jpg")));
    }
}
