/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones.control;

import java.util.HashMap;
import java.util.Map;

public class ConfiguradorDatos {
    public static void inicializarDatos(CalculadoraGastos calculadora, Map<String, Categoria> categorias) {
        // Crear categorías con descripciones
        Categoria comida = new Categoria("Alimentación", "Gastos relacionados con alimentos y bebidas.");
        Categoria ropa = new Categoria("Vestimenta", "Gastos en prendas de vestir y accesorios.");
        Categoria salud = new Categoria("Salud", "Gastos médicos y de salud.");
        Categoria vivienda = new Categoria("Vivienda", "Gastos relacionados en el mantenimiento de la vivienda.");
        Categoria agua = new Categoria("Agua", "Pago del servicio de agua pública.");
        Categoria luz = new Categoria("Luz", "Pago del servicio de electricidad pública.");
        Categoria gas = new Categoria("Gas", "Pago del servicio de gas LP.");
        Categoria telefonia = new Categoria("Telefonía", "Gastos de servicio de telefonía celular.");
        Categoria internet = new Categoria("Internet", "Gastos de uso de internet.");
        Categoria entretenimiento = new Categoria("Entretenimiento", "Gastos en funciones de entretenimiento como cine, conciertos, entre otros.");
        Categoria deudas = new Categoria("Deudas", "Pago de deudas varias.");
        Categoria transporte = new Categoria("Transporte", "Gastos de transporte, incluidos pasajes de autobús.");
        Categoria otros = new Categoria("Otros", "Gastos varios no registrados como golosinas o.");

        // Agregar categorías a la calculadora
        calculadora.agregarCategoria(comida);
        calculadora.agregarCategoria(ropa);
        calculadora.agregarCategoria(salud);
        calculadora.agregarCategoria(vivienda);
        calculadora.agregarCategoria(agua);
        calculadora.agregarCategoria(luz);
        calculadora.agregarCategoria(gas);
        calculadora.agregarCategoria(telefonia);
        calculadora.agregarCategoria(internet);
        calculadora.agregarCategoria(entretenimiento);
        calculadora.agregarCategoria(deudas);
        calculadora.agregarCategoria(transporte);
        calculadora.agregarCategoria(otros);

        // Agregar categorías al mapa
        categorias.put(comida.getNombre(), comida);
        categorias.put(ropa.getNombre(), ropa);
        categorias.put(salud.getNombre(), salud);
        categorias.put(vivienda.getNombre(), vivienda);
        categorias.put(agua.getNombre(), agua);
        categorias.put(luz.getNombre(), luz);
        categorias.put(gas.getNombre(), gas);
        categorias.put(telefonia.getNombre(), telefonia);
        categorias.put(internet.getNombre(), internet);
        categorias.put(entretenimiento.getNombre(), entretenimiento);
        categorias.put(deudas.getNombre(), deudas);
        categorias.put(transporte.getNombre(), transporte);
        categorias.put(otros.getNombre(), otros);
    }
}
