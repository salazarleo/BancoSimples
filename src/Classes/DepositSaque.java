package Classes;

import java.util.Scanner;

public class DepositSaque {

    Scanner scanner = new Scanner(System.in);

    public void Deposito(ConsultarSaldo consultarSaldo){
        System.out.print("Qual Valor voce deseja depositar: ");
        double valordep = scanner.nextDouble();

        double saldoAtual = consultarSaldo.getsaldo();
        consultarSaldo.setSaldo(saldoAtual + valordep);

        System.out.println("Depósito realizado com sucesso!");

    }

    public void Saque(ConsultarSaldo consultarSaldo){
        System.out.print("Qual Valor voce deseja sacar: ");
        double valorsac = scanner.nextDouble();

        double saldoAtual = consultarSaldo.getsaldo();

if (valorsac > saldoAtual){
    System.out.println("Saldo insuficiente");
}else{
    consultarSaldo.setSaldo(saldoAtual - valorsac);
    System.out.println("Saque realizado com sucesso!");
}


    }

}
