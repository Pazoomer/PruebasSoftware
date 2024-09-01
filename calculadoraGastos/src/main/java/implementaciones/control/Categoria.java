/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones.control;

/**
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

