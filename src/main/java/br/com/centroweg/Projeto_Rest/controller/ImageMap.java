package br.com.centroweg.Projeto_Rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.awt.image.BufferedImage;
import java.io.IOException;

@RestController
public class ImageMap {

    @PostMapping("/insert/img")
    public String insert(@RequestBody BufferedImage object) throws IOException {

        return QRCodeReader.decodeQRCode(object);
    }
}
