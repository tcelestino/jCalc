/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * modelo.java
 *
 * Created on 25/04/2012, 18:44:24
 */

package calculadora;

/**
 *
 * @author tfarias01
 */
public class modelo extends javax.swing.JFrame {

    /** Creates new form modelo */
    public modelo() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op = new javax.swing.ButtonGroup();
        value1 = new javax.swing.JTextField();
        value2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        somar = new javax.swing.JRadioButton();
        subtrair = new javax.swing.JRadioButton();
        multiplicar = new javax.swing.JRadioButton();
        dividir = new javax.swing.JRadioButton();
        expoante_raiz = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        value1.setFont(new java.awt.Font("Tahoma", 0, 18));

        value2.setFont(new java.awt.Font("Tahoma", 0, 18));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("Valor 1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel2.setText("Valor 2");

        op.add(somar);
        somar.setFont(new java.awt.Font("Tahoma", 0, 12));
        somar.setText("Somar");
        somar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somarActionPerformed(evt);
            }
        });

        op.add(subtrair);
        subtrair.setFont(new java.awt.Font("Tahoma", 0, 12));
        subtrair.setText("Subtrair");

        op.add(multiplicar);
        multiplicar.setFont(new java.awt.Font("Tahoma", 0, 12));
        multiplicar.setText("Multiplicar");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        op.add(dividir);
        dividir.setFont(new java.awt.Font("Tahoma", 0, 12));
        dividir.setText("Dividir");

        op.add(expoante_raiz);
        expoante_raiz.setFont(new java.awt.Font("Tahoma", 0, 12));
        expoante_raiz.setText("Expoante/Raiz");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12));
        jLabel3.setText("Resultado:");

        calcular.setFont(new java.awt.Font("Tahoma", 0, 12));
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(somar)
                            .addComponent(expoante_raiz)
                            .addComponent(dividir)
                            .addComponent(multiplicar)
                            .addComponent(subtrair)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(value1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(value2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(result, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(calcular)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(value2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(value1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(somar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subtrair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(multiplicar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dividir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(expoante_raiz)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(calcular)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void somarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_somarActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplicarActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
       double value_1;
       double value_2;
       value_1 = Double.parseDouble(value1.getText());
       if(value2.getText().isEmpty()) {
             value_2 = 0;
       } else {
            value_2 = Double.parseDouble(value2.getText());
        }

       if(op.isSelected(somar.getModel())) {
           double operacao = Main.somar(value_1, value_2);
           
           result.setText(String.valueOf(operacao));
       } else if(op.isSelected(subtrair.getModel())) {
           double operacao = Main.subtrair(value_1, value_2);

           result.setText(String.valueOf(operacao));
       } else if(op.isSelected(multiplicar.getModel())) {
           double operacao = Main.multiplicar(value_1, value_2);
           result.setText(String.valueOf(operacao));
       } else if(op.isSelected(dividir.getModel())) {
           double operacao = Main.dividir(value_1, value_2);
           result.setText(String.valueOf(operacao));
       } else if(op.isSelected(expoante_raiz.getModel())) {
           double operacao = Main.expoente_raiz(value_1, value_2);
           result.setText(String.valueOf(operacao));
    }//GEN-LAST:event_calcularActionPerformed

    }
    public static void main(String args[]) {
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcular;
    private javax.swing.JRadioButton dividir;
    private javax.swing.JRadioButton expoante_raiz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton multiplicar;
    private javax.swing.ButtonGroup op;
    private javax.swing.JTextField result;
    private javax.swing.JRadioButton somar;
    private javax.swing.JRadioButton subtrair;
    private javax.swing.JTextField value1;
    private javax.swing.JTextField value2;
    // End of variables declaration//GEN-END:variables

}