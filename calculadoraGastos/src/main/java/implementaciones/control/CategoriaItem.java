
package implementaciones.control;

/**
 * Clase deprecated que antes de encargaba de administrar las categorias
 * 
 * @author gamaliel
 */
public class CategoriaItem {
    private String nombre;
    private String descripcion;

    public CategoriaItem(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}

