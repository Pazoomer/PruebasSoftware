/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones.control;

/**
 *
 * @author gamaliel
 */
import implementaciones.control.Categoria;
import java.util.HashMap;
import java.util.Map;

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
