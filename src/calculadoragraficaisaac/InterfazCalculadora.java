package calculadoragraficaisaac;

public class InterfazCalculadora extends javax.swing.JFrame {
    
    private String cadenaNumeros = "";
    private float numero1, numero2;
    private int operacion = 0;
    
    public InterfazCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextPane();
        btnCinco = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnCero = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnComa = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtResultado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtResultado.setEnabled(false);
        jScrollPane1.setViewportView(txtResultado);

        btnCinco.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCinco.setText("5");
        btnCinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCincoMouseClicked(evt);
            }
        });

        btnUno.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnUno.setText("1");
        btnUno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUnoMouseClicked(evt);
            }
        });

        btnNueve.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnNueve.setText("9");
        btnNueve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNueveMouseClicked(evt);
            }
        });

        btnMas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMas.setText("+");
        btnMas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMasMouseClicked(evt);
            }
        });

        btnDos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDos.setText("2");
        btnDos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDosMouseClicked(evt);
            }
        });

        btnMultiplicar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMultiplicar.setText("*");
        btnMultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMultiplicarMouseClicked(evt);
            }
        });

        btnSeis.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSeis.setText("6");
        btnSeis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeisMouseClicked(evt);
            }
        });

        btnMenos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnMenos.setText("-");
        btnMenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenosMouseClicked(evt);
            }
        });

        btnCero.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCero.setText("0");
        btnCero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCeroMouseClicked(evt);
            }
        });

        btnOcho.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnOcho.setText("8");
        btnOcho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOchoMouseClicked(evt);
            }
        });

        btnSiete.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnSiete.setText("7");
        btnSiete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSieteMouseClicked(evt);
            }
        });

        btnTres.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnTres.setText("3");
        btnTres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTresMouseClicked(evt);
            }
        });

        btnComa.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnComa.setText(",");
        btnComa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComaMouseClicked(evt);
            }
        });

        btnIgual.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIgualMouseClicked(evt);
            }
        });

        btnDividir.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnDividir.setText("/");
        btnDividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDividirMouseClicked(evt);
            }
        });

        btnCuatro.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnCuatro.setText("4");
        btnCuatro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuatroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCero, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnComa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTres, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNueveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNueveMouseClicked
        cadenaNumeros += "9";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnNueveMouseClicked

    private void btnCeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCeroMouseClicked
        cadenaNumeros += "0";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnCeroMouseClicked

    private void btnComaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComaMouseClicked
        cadenaNumeros += ".";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnComaMouseClicked

    private void btnIgualMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIgualMouseClicked
        numero2 = Float.parseFloat(cadenaNumeros);
        txtResultado.setText("");
        System.out.println(numero2);
        
        switch(operacion){
            case 1:
                txtResultado.setText("" + (numero1 + numero2));
                break;
            case 2:
                txtResultado.setText("" + (numero1 - numero2));
                break;
            case 3:
                txtResultado.setText("" + (numero1 * numero2));
                break;
            case 4:
                txtResultado.setText("" + (numero1 / numero2));
                break;
        }
        cadenaNumeros="";
    }//GEN-LAST:event_btnIgualMouseClicked

    private void btnCincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCincoMouseClicked
        cadenaNumeros += "5";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnCincoMouseClicked

    private void btnSeisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeisMouseClicked
        cadenaNumeros += "6";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnSeisMouseClicked

    private void btnSieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSieteMouseClicked
        cadenaNumeros += "7";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnSieteMouseClicked

    private void btnOchoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOchoMouseClicked
        cadenaNumeros += "8";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnOchoMouseClicked

    private void btnUnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUnoMouseClicked
        cadenaNumeros += "1";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnUnoMouseClicked

    private void btnDosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDosMouseClicked
        cadenaNumeros += "2";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnDosMouseClicked

    private void btnTresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTresMouseClicked
        cadenaNumeros += "3";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnTresMouseClicked

    private void btnCuatroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuatroMouseClicked
        cadenaNumeros += "4";
        txtResultado.setText(cadenaNumeros);
    }//GEN-LAST:event_btnCuatroMouseClicked

    private void btnMasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMasMouseClicked
        numero1 = Float.parseFloat(cadenaNumeros);
        txtResultado.setText("");
        operacion = 1;
        cadenaNumeros ="";
        System.out.println(numero1);
    }//GEN-LAST:event_btnMasMouseClicked

    private void btnMenosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenosMouseClicked
        numero1 = Float.parseFloat(cadenaNumeros);
        txtResultado.setText("");
        operacion = 2;
        cadenaNumeros ="";
        System.out.println(numero1);
    }//GEN-LAST:event_btnMenosMouseClicked

    private void btnMultiplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMultiplicarMouseClicked
        numero1 = Float.parseFloat(cadenaNumeros);
        txtResultado.setText("");
        cadenaNumeros ="";
        operacion = 3;
        System.out.println(numero1);
    }//GEN-LAST:event_btnMultiplicarMouseClicked

    private void btnDividirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDividirMouseClicked
        numero1 = Float.parseFloat(cadenaNumeros);
        txtResultado.setText("");
        cadenaNumeros ="";
        operacion = 4;
        System.out.println(numero1);
    }//GEN-LAST:event_btnDividirMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InterfazCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnComa;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtResultado;
    // End of variables declaration//GEN-END:variables
}
