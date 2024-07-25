package com.example.demo;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da conta!");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        // Solicita e lê a agência
        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do cliente!");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo
        System.out.println("Por favor, digite o saldo!");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem formatada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
