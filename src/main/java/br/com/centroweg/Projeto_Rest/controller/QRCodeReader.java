package br.com.centroweg.Projeto_Rest.controller;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class QRCodeReader {

    public static String decodeQRCode(BufferedImage qrCodeimage) throws IOException {
        BufferedImage bufferedImage = qrCodeimage;
        LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
        BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

        try {
            Result result = new MultiFormatReader().decode(bitmap);
            return result.getText();
        } catch (NotFoundException e) {
            return "There is no QR code in the image";
        }
    }

    /*public static void read(String path) {
        try {
            File file = new File(path);
            String decodedText = decodeQRCode(file);
            if(decodedText == null) {
                System.out.println("No QR Code found in the image");
            } else {
                System.out.println("Decoded = " + decodedText);
            }
        } catch (IOException e) {
            System.out.println("Could not found the image, IOException :: " + e.getMessage());
        }
    }*/
}