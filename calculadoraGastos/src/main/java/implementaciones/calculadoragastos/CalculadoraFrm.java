
package implementaciones.calculadoragastos;

import implementaciones.control.CalculadoraGastos;
import implementaciones.control.Categoria;
import implementaciones.control.GestorDeGastos;
import implementaciones.control.Gasto;
import implementaciones.control.ConfiguradorDatos;
import implementaciones.multimediaManager.FotosManager;
import implementaciones.multimediaManager.FuentesManager;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * Pantalla encargada de permitir al usuario registrar y resumir sus gastos en
 * distintas categorias
 *
 * @author gamaliel
 */
public class CalculadoraFrm extends javax.swing.JFrame {

    private FotosManager fotosManager;
    private CalculadoraGastos calculadora;
    private Map<String, Categoria> categorias;
    private GestorDeGastos gestorDeGastos;
    private FuentesManager fuentesManager;

    /**
     * Constructor que inicializa sus compoenentes y actualiza las fuentes e
     * imagenes
     */
    public CalculadoraFrm() {
        initComponents();
        fuentesManager = new FuentesManager();
        fuentesManager.cargarFuente();
        inicializarDatos();
        actualizarExplicacion();
        actualizarFuenteTitulo();
        actualizarFuenteCuerpo();
    }
    
    /**
     * Actualiza las fuentes de cuerpo
     */
    private void actualizarFuenteCuerpo() {
        Font fuenteCuerpo = fuentesManager.getFuenteCuerpo();
        if (fuenteCuerpo != null) {
            lblCategoriaRegistro.setFont(fuenteCuerpo);
            lblCategoriaResumen.setFont(fuenteCuerpo);
            lblGastoMXN.setFont(fuenteCuerpo);
            lblTotal.setFont(fuenteCuerpo);
            lblExplicacion.setFont(fuenteCuerpo);
            txtGasto.setFont(fuenteCuerpo);
            txtTotal.setFont(fuenteCuerpo);
            cmbCategoria.setFont(fuenteCuerpo);
            cmbCategoriaResumen.setFont(fuenteCuerpo);
            lstResumen.setFont(fuenteCuerpo);
            btnRegistrar.setFont(fuenteCuerpo);
            btnResumenes.setFont(fuenteCuerpo);
        } else {
            System.out.println("Fuente no cargada correctamente.");
        }
    }
    
    /**
     * Actualiza las fuentes de titulo
     */
    private void actualizarFuenteTitulo() {
        Font fuenteTitulo = fuentesManager.getFuenteTitulo();
        if (fuenteTitulo != null) {
            lblRegistroGastos.setFont(fuenteTitulo);
            lblResumenGastos.setFont(fuenteTitulo);
        } else {
            System.out.println("Fuente no cargada correctamente.");
        }
    }

    /**
     * Inicializa las categorias e imagenes de la pantalla y componentes
     */
    private void inicializarDatos() {
        this.fotosManager = new FotosManager();
        calculadora = new CalculadoraGastos();
        categorias = new HashMap<>();

        lblFondo.setIcon(fotosManager.getFoto(
                ("src/main/java/resources/images/fondoMorado.jpeg")));
                
        // Usar el ConfiguradorDeDatos para inicializar datos
        ConfiguradorDatos.inicializarDatos(calculadora, categorias);

        // Crear la instancia del gestor de gastos
        gestorDeGastos = new GestorDeGastos(calculadora, categorias);

        // Llenar JComboBox con categorías
        for (String nombreCategoria : categorias.keySet()) {
            cmbCategoria.addItem(nombreCategoria);
            cmbCategoriaResumen.addItem(nombreCategoria);
        }
    }
    
    /**
     * Actualiza las categorias y su descripcion
     */
    private void actualizarExplicacion() {
        String nombreCategoria = (String) cmbCategoria.getSelectedItem();
        if (nombreCategoria != null) {
            Categoria categoria = categorias.get(nombreCategoria);
            if (categoria != null) {
                lblExplicacion.setText(categoria.getDescripcion());
            } else {
                lblExplicacion.setText("No hay descripción disponible.");
            }
        } else {
            lblExplicacion.setText("Seleccione una categoría.");
        }
    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlBack = new javax.swing.JPanel();
        lblFondo = new javax.swing.JLabel();
        lblRegistroGastos = new javax.swing.JLabel();
        lblGastoMXN = new javax.swing.JLabel();
        txtGasto = new javax.swing.JTextField();
        lblCategoriaRegistro = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        lblExplicacion = new javax.swing.JLabel();
        lblCategoriaResumen = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstResumen = new javax.swing.JList<>();
        cmbCategoriaResumen = new javax.swing.JComboBox<>();
        btnResumenes = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblResumenGastos = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMaximumSize(new java.awt.Dimension(600, 700));
        setUndecorated(true);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(58, 1, 92));
        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBack.setBackground(new java.awt.Color(53, 1, 44));
        pnlBack.setMaximumSize(new java.awt.Dimension(100, 350));
        pnlBack.setPreferredSize(new java.awt.Dimension(100, 350));

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlPrincipal.add(pnlBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 700));

        lblRegistroGastos.setFont(new java.awt.Font("NATS", 0, 42)); // NOI18N
        lblRegistroGastos.setForeground(new java.awt.Color(221, 255, 240));
        lblRegistroGastos.setText("Registro de Gastos");
        pnlPrincipal.add(lblRegistroGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        lblGastoMXN.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        lblGastoMXN.setForeground(new java.awt.Color(221, 255, 240));
        lblGastoMXN.setText("Gasto en MXN");
        pnlPrincipal.add(lblGastoMXN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        txtGasto.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        txtGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGastoActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtGasto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 210, 40));

        lblCategoriaRegistro.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        lblCategoriaRegistro.setForeground(new java.awt.Color(221, 255, 240));
        lblCategoriaRegistro.setText("Categoria");
        pnlPrincipal.add(lblCategoriaRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        cmbCategoria.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });
        pnlPrincipal.add(cmbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 210, -1));

        lblExplicacion.setFont(new java.awt.Font("NATS", 0, 10)); // NOI18N
        lblExplicacion.setForeground(new java.awt.Color(221, 255, 240));
        lblExplicacion.setText("Ejemplo");
        pnlPrincipal.add(lblExplicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 450, 50));

        lblCategoriaResumen.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        lblCategoriaResumen.setForeground(new java.awt.Color(221, 255, 240));
        lblCategoriaResumen.setText("Categoria");
        pnlPrincipal.add(lblCategoriaResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        txtTotal.setEnabled(false);
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });
        pnlPrincipal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, 210, -1));

        lstResumen.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        jScrollPane1.setViewportView(lstResumen);

        pnlPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 440, 210, -1));

        cmbCategoriaResumen.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        cmbCategoriaResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaResumenActionPerformed(evt);
            }
        });
        pnlPrincipal.add(cmbCategoriaResumen, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 210, -1));

        btnResumenes.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        btnResumenes.setText("Resumir");
        btnResumenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumenesActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnResumenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 640, -1, -1));

        btnRegistrar.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        lblTotal.setFont(new java.awt.Font("NATS", 0, 20)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(221, 255, 240));
        lblTotal.setText("Total");
        pnlPrincipal.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, -1, -1));

        lblResumenGastos.setFont(new java.awt.Font("NATS", 0, 42)); // NOI18N
        lblResumenGastos.setForeground(new java.awt.Color(221, 255, 240));
        lblResumenGastos.setText("Resumen de Gastos");
        pnlPrincipal.add(lblResumenGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, -1, -1));

        btnCerrar.setBackground(new java.awt.Color(167, 1, 37));
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });

        lblCerrar.setFont(new java.awt.Font("NATS", 0, 48)); // NOI18N
        lblCerrar.setForeground(new java.awt.Color(221, 255, 240));
        lblCerrar.setText("X");

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblCerrar)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCerrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrincipal.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 70, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Muestra el total de gastos dependiendo de la categoria seleccionada
     */
    private void resumir(){
        // Obtener la categoría seleccionada
        String nombreCategoria = (String) cmbCategoriaResumen.getSelectedItem();
        if (nombreCategoria != null) {
            Categoria categoria = categorias.get(nombreCategoria);
            if (categoria != null) {
                // Crear el modelo para la JList
                DefaultListModel<String> model = new DefaultListModel<>();

                // Iterar sobre la lista de gastos y agregar cada gasto al modelo
                for (Gasto gasto : categoria.getGastos()) {
                    // Formatear el monto
                    String montoFormateado = String.format("$ %.2f MXN", gasto.getMonto());
                    // Agregar el monto al modelo
                    model.addElement(montoFormateado);
                }

                // Asignar el modelo a la JList
                lstResumen.setModel(model);

                // Calcular y mostrar el total de gastos
                double total = categoria.getGastos().stream().mapToDouble(Gasto::getMonto).sum();
                txtTotal.setText(String.format("$%.2f MXN", total));
            } else {
                JOptionPane.showMessageDialog(this, "Categoría no encontrada.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una categoría.");
        }
    }

    /**
     * Registra un nuevo gasto dependiendo de la categoria que esta seleccionada
     */
    private void registrar() {
        String descripcionGasto = txtGasto.getText();
        String nombreCategoria = (String) cmbCategoria.getSelectedItem();

        // Usar el GestorDeGastos para registrar el gasto
        gestorDeGastos.registrarGasto(descripcionGasto, nombreCategoria, txtGasto.getText());

        // Limpiar el campo de texto
        txtGasto.setText("");
        
        //Resumir el gasto registrado
        cmbCategoriaResumen.setSelectedIndex(cmbCategoria.getSelectedIndex());
        resumir();
    }
    
    /**
     * Cierra la aplicacion
     */
    private void cerrar(){
        System.exit(0);
    }
    
    /**
     * Cambia el color del boton cerrar cuando entra el cursor
     */
    private void cursorEntraBotonCerrar(){
        btnCerrar.setBackground(new Color(206, 66, 87));
    }
    
    /**
     * Cambia el color del boton cerrar cuando sale el cursor
     */
    private void cursorSaleBotonCerrar(){
         btnCerrar.setBackground(new Color(167, 1, 37));
    }
    private void btnResumenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumenesActionPerformed
        resumir();

    }//GEN-LAST:event_btnResumenesActionPerformed

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed
        actualizarExplicacion();
    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbCategoriaResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaResumenActionPerformed
        resumir();
    }//GEN-LAST:event_cmbCategoriaResumenActionPerformed

    private void txtGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGastoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGastoActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        cerrar();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseEntered
        cursorEntraBotonCerrar();
    }//GEN-LAST:event_btnCerrarMouseEntered

    private void btnCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseExited
       cursorSaleBotonCerrar();
    }//GEN-LAST:event_btnCerrarMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnResumenes;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbCategoriaResumen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoriaRegistro;
    private javax.swing.JLabel lblCategoriaResumen;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblExplicacion;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblGastoMXN;
    private javax.swing.JLabel lblRegistroGastos;
    private javax.swing.JLabel lblResumenGastos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> lstResumen;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtGasto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
