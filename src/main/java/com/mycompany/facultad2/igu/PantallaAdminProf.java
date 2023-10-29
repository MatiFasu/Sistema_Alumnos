
package com.mycompany.facultad2.igu;

import com.mycompany.facultad2.logica.Controladora;
import com.mycompany.facultad2.logica.Curso;
import com.mycompany.facultad2.logica.Profesor;
import com.mycompany.facultad2.logica.Usuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaAdminProf extends javax.swing.JFrame {

    Controladora control;
    
    public PantallaAdminProf(Controladora control) {
        initComponents();
        this.control = control;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProfCursos = new javax.swing.JTable();
        btnAgregarProfesor = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnCargarTabla = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmbProfesores = new javax.swing.JComboBox<>();
        btnSacarProfesor = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabel1.setText("Administrador de Profesores");

        tablaProfCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProfCursos);

        btnAgregarProfesor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAgregarProfesor.setText("Agregar Profesor");
        btnAgregarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProfesorActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnCargarTabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCargarTabla.setText("Cargar Cursos");
        btnCargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Profesores:");

        btnSacarProfesor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnSacarProfesor.setText("Sacar Profesor");
        btnSacarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarProfesorActionPerformed(evt);
            }
        });

        btnBuscar.setText("Ver Materias del Profesor");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCargarTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1)
                            .addComponent(btnAgregarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSacarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSacarProfesor)
                        .addGap(32, 32, 32)
                        .addComponent(btnCargarTabla)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        List<Profesor> profesores = control.traerProfesores();
        for(Profesor p: profesores) {
            cmbProfesores.addItem(p.getNombreProf());
        }
        
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProfesorActionPerformed
        if( tablaProfCursos.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaProfCursos.getSelectedRow() != -1 ) {
                int id_curso = Integer.parseInt(String.valueOf(tablaProfCursos.getValueAt(tablaProfCursos.getSelectedRow(),0)));
                String prof = (String) cmbProfesores.getSelectedItem();
                
                control.agregarProfesor(id_curso, prof);

                mostrarMensaje("Profesor Agregado", "Info", "Agregar Profesor");

                cargarTabla();
            }
            else {
                mostrarMensaje("No selecciono ningun Curso", "Error", "Error");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla", "Error", "Error");
        }
    }//GEN-LAST:event_btnAgregarProfesorActionPerformed

    private void btnCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnCargarTablaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        PantallaAdmin pantallaAdmin = new PantallaAdmin(control);
        pantallaAdmin.setVisible(true);
        pantallaAdmin.setLocationRelativeTo(null);
        
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String profesor = (String) cmbProfesores.getSelectedItem();
        
        cargarTablaProf(profesor);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSacarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarProfesorActionPerformed
        if( tablaProfCursos.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaProfCursos.getSelectedRow() != -1 ) {
                int id_curso = Integer.parseInt(String.valueOf(tablaProfCursos.getValueAt(tablaProfCursos.getSelectedRow(),0)));
                String prof = (String) cmbProfesores.getSelectedItem();
                
                control.sacarProfesor(id_curso, prof);

                mostrarMensaje("Profesor Sacado", "Info", "Sacar Profesor");

                cargarTabla();
            }
            else {
                mostrarMensaje("No selecciono ningun curso", "Error", "Error");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla", "Error", "Error");
        }
    }//GEN-LAST:event_btnSacarProfesorActionPerformed

    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProfesor;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargarTabla;
    private javax.swing.JButton btnSacarProfesor;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbProfesores;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaProfCursos;
    // End of variables declaration//GEN-END:variables

    private void cargarTablaProf(String nombreProfesor) {
        List<Profesor> listaProfesores = control.traerProfesores();
        Profesor prof = null;
        for(Profesor p: listaProfesores) {
            if( p.getNombreProf().equals(nombreProfesor) ) {
                prof = p;
            }
        }
        
        if( prof != null)  {    
            // definir el modelo que queremos que tenga la tabla
            DefaultTableModel modeloTabla = new DefaultTableModel() {

                // que filas y col no sean editables
                @Override
                public boolean isCellEditable (int row, int col) {
                    return false;
                }

            };

            // nombres de las columnas
            String titulos[] = {"Id_Curso","Curso", "profesor"};
            modeloTabla.setColumnIdentifiers(titulos);

            // recorrer la lista y mostrar cada uno de los elementos en la tabla
            if( prof != null ) {

                for(Curso c: prof.getCursosP()) {
                    Object[] objeto = {c.getId(), c.getNombre(), prof.getNombreProf()};

                    modeloTabla.addRow(objeto);
                }

            }

            tablaProfCursos.setModel(modeloTabla);
        } else {
            mostrarMensaje("No existe el profesor", "Error", "No existe");
        }
    }

    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if( tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if( tipo.equals("Error") ) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }

    private void cargarTabla() {
        // definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // que filas y col no sean editables
            @Override
            public boolean isCellEditable (int row, int col) {
                return false;
            }
                   
        };
        
        // nombres de las columnas
        String titulos[] = {"Id", "Curso", "Cant Profesores"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la abse de datos
        List<Curso> listaCursos = control.traerCursos();
        
        // recorrer la lista y mostrar cada uno de los elementos en la tabla
        if( listaCursos != null ) {
            for(Curso c : listaCursos) {
                int cantProfesores = 0;
                for(Profesor p: c.getProfesores()) {
                    cantProfesores++;
                }
                
                Object[] objeto = {c.getId(), c.getNombre(), cantProfesores};

                modeloTabla.addRow(objeto);
            }
        }
        
        tablaProfCursos.setModel(modeloTabla);
    }
    
    
}
