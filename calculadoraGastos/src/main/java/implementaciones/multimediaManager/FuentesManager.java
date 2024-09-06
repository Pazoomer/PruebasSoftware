package implementaciones.multimediaManager;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 * Administra las fuentes de texto
 *
 * @author gamaliel
 */
public class FuentesManager {

    private Font fuenteCuerpo;
    private Font fuenteTitulo;

    /**
     * Carga de un arhivo las fuentes de texto y las convierte para ser utilizables
     */
    public void cargarFuente() {
        try {
            // Carga la fuente del archivo
            File fontFile = new File("src/main/java/resources/fonts/Montserrat-Light.ttf");      
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, fontFile);
                        
            // Registra la fuente con el ambiente grafico
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            // Create fuentes derivadas
            fuenteCuerpo = customFont.deriveFont(16f); // Tamaño del cuerpo
            fuenteTitulo = customFont.deriveFont(30f); // Tamaño de subtitulos
            
        } catch (FontFormatException | IOException e) {
            System.out.println("No cargaron las fuentes de texto");
        }
    }

    public Font getFuenteCuerpo() {
        return fuenteCuerpo;
    }

    public Font getFuenteTitulo() {
        return fuenteTitulo;
    }
}
