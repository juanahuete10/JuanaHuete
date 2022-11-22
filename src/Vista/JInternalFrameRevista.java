
package Vista;

import Modelo.*;
import java.awt.Component;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Time;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author UNAN-Chontales
 */
public class JInternalFrameRevista extends javax.swing.JInternalFrame {

    private Component rootpane;


    public JInternalFrameRevista() {
        initComponents();
        jText_Numero.setEnabled(false);
    }
    
    
    public void LimpiarCampo(){
        jText_Numero.setText("");
        jText_Titulo.setText("");
        jText_ayo.setText("");
        jText_issn.setText("");
        jText_precio.setText("");
        jText_hora_venta.setText("");
    }
     public void obtenerDatos(){
        List<Revista> Revista =new DAORevista ().obtenerDatos();
        
        DefaultTableModel modelo=new DefaultTableModel();
        String[] columns={"numero", "titulo", "ayo",
        "issn", "precio", "Horaventa"};
        
        modelo.setColumnIdentifiers(columns);
        for(Revista re:Revista){
            String[]renglon={Integer.toString(re.getNumero()),re.getTitulo(),
            Integer.toString(re.getAyo()),re.getIssn(),Float.toString(re.getPrecio()),
            re.getHoraventa().toString()};  
            
            modelo.addRow(renglon);
        }
        jTable_Revista.setModel(modelo);
                
    }
      public void actualizarRegistro(){
        int num=Integer.parseInt(this.jText_Numero.getText());
        String tit=this.jText_Titulo.getText();
        int ay=Integer.parseInt(this.jText_ayo.getText());
        String iss=this.jText_issn.getText();
        float pre=Float.parseFloat(this.jText_precio.getText());
        java.sql.Time hv=Time.valueOf(this.jText_hora_venta.getText());
        
        
        DAORevista dao=new DAORevista();
        int res=dao.Actualizar(num, tit, ay, iss, pre, hv);
        if(res == 1){
            JOptionPane.showMessageDialog(rootpane, "¡Revista actualizada!");
        }
        else{
            JOptionPane.showMessageDialog(rootpane, "¡Ocurrio un ERROR!");
        }
       }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jText_precio1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jText_Numero = new javax.swing.JTextField();
        jText_Titulo = new javax.swing.JTextField();
        jText_hora_venta = new javax.swing.JTextField();
        jText_precio = new javax.swing.JTextField();
        jText_ayo = new javax.swing.JTextField();
        jText_issn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton_borrar = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Revista = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        jText_precio1.setBackground(new java.awt.Color(255, 255, 255));
        jText_precio1.setForeground(new java.awt.Color(0, 0, 0));
        jText_precio1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Numero");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Titulo");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Año");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Issn");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Precio");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Hora venta ");

        jText_Numero.setBackground(new java.awt.Color(255, 255, 255));
        jText_Numero.setForeground(new java.awt.Color(0, 0, 0));
        jText_Numero.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jText_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jText_Titulo.setForeground(new java.awt.Color(0, 0, 0));
        jText_Titulo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jText_hora_venta.setBackground(new java.awt.Color(255, 255, 255));
        jText_hora_venta.setForeground(new java.awt.Color(0, 0, 0));
        jText_hora_venta.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jText_precio.setBackground(new java.awt.Color(255, 255, 255));
        jText_precio.setForeground(new java.awt.Color(0, 0, 0));
        jText_precio.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jText_ayo.setBackground(new java.awt.Color(255, 255, 255));
        jText_ayo.setForeground(new java.awt.Color(0, 0, 0));
        jText_ayo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jText_issn.setBackground(new java.awt.Color(255, 255, 255));
        jText_issn.setForeground(new java.awt.Color(0, 0, 0));
        jText_issn.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Registrar / Actualizar");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Agregar Horario");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jText_precio)
                            .addComponent(jText_issn)
                            .addComponent(jText_ayo)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jText_hora_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jText_Numero)
                            .addComponent(jText_Titulo))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jText_Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jText_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jText_ayo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jText_issn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jText_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jText_hora_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Transacciones");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Editar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_editar(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Actualizar");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizar(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Agregar");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregar(evt);
            }
        });

        jButton_borrar.setBackground(new java.awt.Color(255, 255, 255));
        jButton_borrar.setForeground(new java.awt.Color(0, 0, 0));
        jButton_borrar.setText("Borrar");
        jButton_borrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));
        jButton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_borrarActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Buscar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), null));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));

        jComboBox1.setBackground(new java.awt.Color(0, 0, 0));
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jTextField1))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addComponent(jLabel8))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));

        jTable_Revista.setBackground(new java.awt.Color(255, 255, 255));
        jTable_Revista.setForeground(new java.awt.Color(0, 0, 0));
        jTable_Revista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Numero", "Tiutlo", "Año", "ISSN", "Precio", "Hora venta"
            }
        ));
        jScrollPane1.setViewportView(jTable_Revista);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 255));
        jLabel9.setText("Revista / Registro");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_agregar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregar
       String tit=jText_Titulo.getText();
       String ay=jText_ayo.getText();
       String iss=jText_issn.getText();
       String pre=jText_precio.getText();
       String hv=jText_hora_venta.getText();
       
       if(tit.contentEquals("")||ay.contentEquals("")||
               iss.contentEquals("")||pre.contentEquals("")||hv.contentEquals("")){
        JOptionPane.showMessageDialog(rootpane,
        "Todos los campos son obligatorios");
        
  }else{      
        
   try{
       int ayo=Integer.parseInt(ay);
       float precio=Float.parseFloat(pre);
       java.sql.Time ti=Time.valueOf(hv);
       
      Revista re=new DAORevista().Insertar(tit, ayo, iss, precio, ti);
      JOptionPane.showMessageDialog(rootpane, "Registro agregado");
      
  }catch (Exception e){
      e.printStackTrace();
      JOptionPane.showMessageDialog(rootpane, "No se agrego el registro");
       }  
  }
      obtenerDatos();
      LimpiarCampo();
    }                                                     
    {
    }//GEN-LAST:event_jButton_agregar

    private void jButton2_editar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_editar

     int fila=this.jTable_Revista.getSelectedRow();
      if(fila==-1){
      
          JOptionPane.showMessageDialog(rootpane, "Seleccione un registro de la table");
      }
      else{ 
          try{
              int num=Integer.parseInt((String)this.jTable_Revista.getValueAt(fila, 0).toString());
              String tit=(String)this.jTable_Revista.getValueAt(fila,1);
              int ay=Integer.parseInt((String)this.jTable_Revista.getValueAt(fila,2));
              String iss=(String)this.jTable_Revista.getValueAt(fila,3).toString();
              float pre=Float.parseFloat((String)this.jTable_Revista.getValueAt(fila,4));
              java.sql.Time fh=Time.valueOf((String)this.jTable_Revista.getValueAt(fila,5));
              
              jText_Numero.setText(""+num);
              jText_Titulo.setText(tit);
              jText_ayo.setText(String.valueOf(ay));
              jText_issn.setText(iss);
              jText_precio.setText(String.valueOf(pre));
              jText_hora_venta.setText(String.valueOf(fh));
              
          }catch(NumberFormatException e){
              e.printStackTrace();
          }
      }
    }//GEN-LAST:event_jButton2_editar

    private void jButton_actualizar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizar
        actualizarRegistro();
        obtenerDatos();
        LimpiarCampo();
    }//GEN-LAST:event_jButton_actualizar

    private void jButton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_borrarActionPerformed
         int fila = this.jTable_Revista.getSelectedRow();
        if (fila == -1)
        {
            JOptionPane.showMessageDialog(rootpane, "Selecione el registro de la tabla");
      
        } else {

        }
    }//GEN-LAST:event_jButton_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_borrar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Revista;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jText_Numero;
    private javax.swing.JTextField jText_Titulo;
    private javax.swing.JTextField jText_ayo;
    private javax.swing.JTextField jText_hora_venta;
    private javax.swing.JTextField jText_issn;
    private javax.swing.JTextField jText_precio;
    private javax.swing.JTextField jText_precio1;
    // End of variables declaration//GEN-END:variables
}
