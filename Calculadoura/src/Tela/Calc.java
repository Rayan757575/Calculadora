/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Operações.Operacoes;
import javax.swing.JOptionPane;

/**
 *
 * @author Rayan
 */
public class Calc extends javax.swing.JFrame {

    String numero1 = "", numero2 = ""; // recebe o valor a ser exibido na tela
    Double num1, num2; // recebe o valor das variaveis numero1 e numero2 passados para inteiro
    boolean operacaoSelecionada = false; //variavel para auxiliar a verificar se o usuário já selecionou a operação 
    int operacoes;
    boolean ligado = true; //verifica se a calculadora está ligada ou não

    public Calc() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnOn = new javax.swing.JButton();
        btnLImpar = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnMultiplicacao = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnSubtracao = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnSoma = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnVirgula = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        visor = new javax.swing.JLabel();
        visor1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setEnabled(false);
        jPanel4.setLayout(new java.awt.GridLayout(5, 4));

        btnOn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOn.setText("ON/OFF");
        btnOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnActionPerformed(evt);
            }
        });
        jPanel4.add(btnOn);

        btnLImpar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnLImpar.setText("C");
        btnLImpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLImparActionPerformed(evt);
            }
        });
        jPanel4.add(btnLImpar);

        btnRaiz.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRaiz.setText("√");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        jPanel4.add(btnRaiz);

        btnDivisao.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnDivisao.setText("÷");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });
        jPanel4.add(btnDivisao);

        btn7.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel4.add(btn7);

        btn8.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel4.add(btn8);

        btn9.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel4.add(btn9);

        btnMultiplicacao.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnMultiplicacao.setText("x");
        btnMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel4.add(btnMultiplicacao);

        btn4.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel4.add(btn4);

        btn5.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel4.add(btn5);

        btn6.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel4.add(btn6);

        btnSubtracao.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnSubtracao.setText("-");
        btnSubtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtracaoActionPerformed(evt);
            }
        });
        jPanel4.add(btnSubtracao);

        btn1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1);

        btn2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2);

        btn3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn3);

        btnSoma.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnSoma.setText("+");
        btnSoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomaActionPerformed(evt);
            }
        });
        jPanel4.add(btnSoma);

        btnPonto.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnPonto.setText(".");
        btnPonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPontoActionPerformed(evt);
            }
        });
        jPanel4.add(btnPonto);

        btn0.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel4.add(btn0);

        btnVirgula.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnVirgula.setText(",");
        btnVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVirgulaActionPerformed(evt);
            }
        });
        jPanel4.add(btnVirgula);

        btnIgual.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });
        jPanel4.add(btnIgual);

        visor.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        visor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        visor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        visor1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        visor1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        visor1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(visor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(visor1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(visor1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpar();
        visor.setVisible(true);
        visor1.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('2', numero1);
        } else {
            numero2 = entradaNumero('2', numero2);
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('0', numero1);
        } else {
            numero2 = entradaNumero('0', numero2);
        }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('1', numero1);
        } else {
            numero2 = entradaNumero('1', numero2);
        }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('3', numero1);
        } else {
            numero2 = entradaNumero('3', numero2);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('4', numero1);
        } else {
            numero2 = entradaNumero('4', numero2);
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('5', numero1);
        } else {
            numero2 = entradaNumero('5', numero2);
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('6', numero1);
        } else {
            numero2 = entradaNumero('6', numero2);
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('7', numero1);
        } else {
            numero2 = entradaNumero('7', numero2);
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('8', numero1);
        } else {
            numero2 = entradaNumero('8', numero2);
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('9', numero1);
        } else {
            numero2 = entradaNumero('9', numero2);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnPontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPontoActionPerformed
        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('.', numero1);
        } else {
            numero2 = entradaNumero('.', numero2);
        }
    }//GEN-LAST:event_btnPontoActionPerformed

    private void btnVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVirgulaActionPerformed

        if (operacaoSelecionada == false) {
            numero1 = entradaNumero('.', numero1);
        } else {
            numero2 = entradaNumero('.', numero2);
        }
    }//GEN-LAST:event_btnVirgulaActionPerformed

    private void btnMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacaoActionPerformed
        if (operacaoSelecionada == false) {
            entradaOperacao(2);
        } else {
            JOptionPane.showMessageDialog(this, "Só é permitida a operação entre dois numeros");
        }
    }//GEN-LAST:event_btnMultiplicacaoActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        if (operacaoSelecionada == false) {
            entradaOperacao(1);
        } else {
            JOptionPane.showMessageDialog(this, "Só é permitida a operação entre dois numeros");
        }
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnSubtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtracaoActionPerformed
        if (operacaoSelecionada == false) {
            entradaOperacao(4);
        } else {
            JOptionPane.showMessageDialog(this, "Só é permitida a operação entre dois numeros");
        }
    }//GEN-LAST:event_btnSubtracaoActionPerformed

    private void btnSomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomaActionPerformed
        if (operacaoSelecionada == false) {
            entradaOperacao(3);
        } else {
            JOptionPane.showMessageDialog(this, "Só é permitida a operação entre dois numeros");
        }
    }//GEN-LAST:event_btnSomaActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        try {
            operacao(operacoes);
        } catch (Exception ex) {
            if (operacoes == 0) {
                JOptionPane.showMessageDialog(this, "A operacao nao foi inserida, Insira-o:");
            } else {
                JOptionPane.showMessageDialog(this, "O segundo numero nao foi inserido, Insira-o:");
            }
        }

    }//GEN-LAST:event_btnIgualActionPerformed

    private void btnLImparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLImparActionPerformed
        limpar();
    }//GEN-LAST:event_btnLImparActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        try {
            Operacoes op = new Operacoes();
            double raiz = Double.parseDouble(numero1);
            visor.setText(Double.toString(op.raiz(raiz)));
            zerar();
            numero1 = Double.toString(op.raiz(raiz));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "O numero deve ser inserido antes do botao da raiz");
        }
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnActionPerformed
        powerChange();
    }//GEN-LAST:event_btnOnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLImpar;
    private javax.swing.JButton btnMultiplicacao;
    private javax.swing.JButton btnOn;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSoma;
    private javax.swing.JButton btnSubtracao;
    private javax.swing.JButton btnVirgula;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel visor;
    private javax.swing.JLabel visor1;
    // End of variables declaration//GEN-END:variables
    public String entradaNumero(char btn, String numero) {
        if (numero.length() < 12) {
            numero = numero + btn;
            visor.setText(numero);
        } else {
            JOptionPane.showMessageDialog(this, "Limete maximo do número atingido, selecione a operação");
        }

        return numero;
    }

    public void entradaOperacao(int op) {
        operacaoSelecionada = true;
        visor.setText("");
        operacoes = op;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void powerChange() {
        if (ligado == true) {
            desligar();
        } else {
            ligar();
        }
        OnOff();
    }

    public void OnOff() {
        if (ligado == false) {
            zerar();
            visor.setVisible(false);
            visor1.setVisible(true);
        } else {
            limpar();
            visor.setVisible(true);
            visor1.setVisible(false);
        }
    }

    private void zerar() {
        numero1 = "";
        numero2 = "";
        operacoes = 0;
        operacaoSelecionada = false;
    }

    private void limpar() {
        zerar();
        visor.setText("0");
    }

    public void operacao(int opcao) {

        Operacoes op = new Operacoes();
        num1 = Double.parseDouble(numero1);
        num2 = Double.parseDouble(numero2);
        double resultado = 0;

        switch (opcao) {
            case 1:
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(this, "Tentaiva de divisão por 0");
                } else {
                    resultado = op.divisao(num1, num2);
                    visor.setText(Double.toString(resultado));
                }
                break;
            case 2:
                resultado = op.multiplicacao(num1, num2);
                visor.setText(Double.toString(resultado));
                break;
            case 3:

                resultado = op.soma(num1, num2);
                visor.setText(Double.toString(resultado));
                break;
            case 4:
                resultado = op.subtracao(num1, num2);
                visor.setText(Double.toString(resultado));
                break;
        }
        zerar();
        numero1 = Double.toString(resultado);
    }

}
