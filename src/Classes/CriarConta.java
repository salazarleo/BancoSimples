package Classes;

import java.util.Scanner;

public class CriarConta {

    Scanner scanner = new Scanner(System.in);

    private String nome;
    private String cpf;


    public void criarConta(){
        System.out.print("Digite seu Nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite seu CPF: ");
        cpf = scanner.nextLine();
        System.out.println("Conta Criada com Sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }



}
