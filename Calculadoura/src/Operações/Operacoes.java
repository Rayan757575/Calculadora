/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operações;

/**
 *
 * @author Rayan
 */
public class Operacoes {

    public double divisao(double a, double b) {
        return a / b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double soma(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double restoDivisao(double divisor, double dividendo) {
        double resto = divisor % dividendo;
        return resto;
    }

    public int proximonumero(int numero) {
        return numero++;
    }

    public int anteriornumero(int numero) {
        return numero --;
    }
    public double raiz(double numero) {
        return  Math.sqrt(numero);
    }
    
}
