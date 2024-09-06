package implementaciones.control;

import java.util.Map;
import javax.swing.JOptionPane;

/**
 * Clase encargada de registrar gastos
 * 
 * @author gamaliel
 */
public class GestorDeGastos {

    private CalculadoraGastos calculadora;
    private Map<String, Categoria> categorias;

    public GestorDeGastos(CalculadoraGastos calculadora, Map<String, Categoria> categorias) {
        this.calculadora = calculadora;
        this.categorias = categorias;
    }
    
    /**
     * Agrega el gasto del parametro a la categoria
     * @param descripcionGasto Descripcion del gasto
     * @param nombreCategoria Nombre de la categoria
     * @param montoTexto Monto del gasto
     */
    public void registrarGasto(String descripcionGasto, String nombreCategoria, String montoTexto) {
        try {
            double montoGasto = Double.parseDouble(montoTexto);
            Categoria categoria = categorias.get(nombreCategoria);
            if (categoria != null) {
                categoria.agregarGasto(new Gasto(descripcionGasto, montoGasto));
                JOptionPane.showMessageDialog(null, "Gasto registrado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Categoría no encontrada.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un monto válido.");
        }
    }
}
