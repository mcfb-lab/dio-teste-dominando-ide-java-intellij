package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n1;
        int n2;

        String  operacao = "";
        int control=0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a operação desejada (+, -, *, /): ");
        operacao = entrada.nextLine();

        System.out.println("Digite um valor: ");
        n1 = entrada.nextInt();

        System.out.println("Digite um valor: ");
        n2 = entrada.nextInt();

        if(operacao.equals("+")) {
            System.out.println("O resultado da adição é: " +(n1 + n2));
            control++;
        }

        if(operacao.equals("-")) {
            System.out.println("O resultado da subtração é: " +(n1 - n2));
            control++;
        }

        if(operacao.equals("*")) {
            System.out.println("O resultado da multiplicação é: " +(n1 * n2));
            control++;
        }

        if(operacao.equals("/")) {
            System.out.println("O resultado da divisão é: " + (n1 / n2));
            control++;
        }

        if(control == 0) {
            System.out.println("Oopração inválida, Tente novamente!");

        }
    }
}
