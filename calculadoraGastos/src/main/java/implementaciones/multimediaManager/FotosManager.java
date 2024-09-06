package implementaciones.multimediaManager;

import javax.swing.ImageIcon;

/**
 * Administra las imagenes multimedia
 *
 * @author gamaliel
 */
public class FotosManager {

    public FotosManager() {

    }

    public ImageIcon getFoto(String url) {
        return new ImageIcon(url);
    }
}
