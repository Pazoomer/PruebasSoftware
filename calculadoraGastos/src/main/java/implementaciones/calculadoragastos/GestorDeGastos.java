/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones.calculadoragastos;

import java.util.Map;
import javax.swing.JOptionPane;

public class GestorDeGastos {
    private CalculadoraGastos calculadora;
    private Map<String, Categoria> categorias;

    public GestorDeGastos(CalculadoraGastos calculadora, Map<String, Categoria> categorias) {
        this.calculadora = calculadora;
        this.categorias = categorias;
    }

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
