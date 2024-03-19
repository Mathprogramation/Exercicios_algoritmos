package Aula4;

import java.util.Scanner;



public class Exemplo{

    public static void main(String[]args){
       // Informe ao usuario sobre o proposito do programa
        System.out.println("Este progrsms realiza a soma de dois números inteiros");

        // soicita e recebe o primeiro numero do usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scanner.nextInt();

        // solicite e recebe o segundo numero do usuario
        System.out.print("Digite o segundo número:");
        int segundoNumero = scanner.nextInt();


        int resultadoSoma = primeiroNumero + segundoNumero;


        System.out.println(" A soma de " + primeiroNumero +  " e " + segundoNumero + " é: " + resultadoSoma);

        scanner.close();





    }


}