import br.com.empregados.Empregado;
import br.com.empregados.EmpregadoFisico;
import br.com.empregados.EmpregadoJuridico;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você é pessoa física ou jurídica? Insira F para física, ou J para jurídica: ");
        String pessoa = scanner.nextLine().toLowerCase();
        Empregado empregado = new Empregado();

        System.out.println("Inserir nome: ");
        empregado.setNome(scanner.nextLine());
        System.out.println("Inserir endereço: ");
        empregado.setEndereco(scanner.nextLine());
        System.out.println("Inserir telefone: ");
        empregado.setTelefone(scanner.nextLine());
        System.out.println("Inserir e-mail: ");
        empregado.setEmail(scanner.nextLine());

        if (pessoa.equals("f")) {
            EmpregadoFisico empregadoFisico = new EmpregadoFisico(empregado.getNome(), empregado.getEndereco(), empregado.getTelefone(), empregado.getEmail());
            System.out.println("Inserir CPF: ");
            empregadoFisico.setCpf(scanner.nextLine());
            System.out.println("Inserir sexo: ");
            empregadoFisico.setSexo(scanner.nextLine());
            System.out.println("Imprimindo valores "+ empregadoFisico.getNome() + empregadoFisico.getEndereco() + empregadoFisico.getTelefone() + empregadoFisico.getEmail());
        } else {
            EmpregadoJuridico empregadoJuridico = new EmpregadoJuridico(empregado.getNome(), empregado.getEndereco(), empregado.getTelefone(), empregado.getEmail());
            System.out.println("Inserir CNPJ: ");
            empregadoJuridico.setCnpj(scanner.nextLine());
            System.out.println("Inserir data de admissão: ");
            empregadoJuridico.setDataAdmissao(scanner.nextLine());
            System.out.println("Imprimindo valores "+ empregadoJuridico.getNome() + empregadoJuridico.getEndereco() + empregadoJuridico.getTelefone() + empregadoJuridico.getEmail());
        }
    }
}
