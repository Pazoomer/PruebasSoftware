
package implementaciones.control;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase encargada de administrar el mapa de las categorias
 * 
 * @author gamaliel
 */
public class CalculadoraGastos {

    private Map<String, Categoria> categorias;

    public CalculadoraGastos() {
        categorias = new HashMap<>();
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.put(categoria.getNombre(), categoria);
    }

    public Map<String, Categoria> getCategorias() {
        return categorias;
    }
}
