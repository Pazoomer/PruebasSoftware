
package implementaciones.control;

/**
 * Representa una categoria con su lista de gastos
 * 
 * @author gamaliel
 */
import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private String nombre;
    private String descripcion;
    private List<Gasto> gastos;

    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.gastos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void agregarGasto(Gasto gasto) {
        gastos.add(gasto);
    }

    public double calcularTotalGastos() {
        double total = 0;
        for (Gasto gasto : gastos) {
            total += gasto.getMonto();
        }
        return total;
    }

    public List<Gasto> getGastos() {
        return gastos;
    }
}

