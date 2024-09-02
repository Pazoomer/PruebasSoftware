/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones.tipografia;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *        lblFondo.setIcon(fotosManager.getFoto(("src/main/java/implementaciones/multimedia/fondoMorado.jpeg")));

 * @author gamaliel
 */
public class FuentesManager {
    private Font fuenteCuerpo;
    private Font fuenteTitulo;

    public void cargarFuente() {
        try {
            // Load the font from a file
            File fontFile = new File("src/main/resources/fonts/Montserrat-Light.ttf");
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile);

            // Register the font with the graphics environment
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            // Create derived fonts
            fuenteCuerpo = customFont.deriveFont(24f); // Size for body text
            fuenteTitulo = customFont.deriveFont(32f); // Size for titles
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
    }

    public Font getFuenteCuerpo() {
        return fuenteCuerpo;
    }

    public Font getFuenteTitulo() {
        return fuenteTitulo;
    }
}
