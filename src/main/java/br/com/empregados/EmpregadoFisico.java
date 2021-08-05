package br.com.empregados;

public class EmpregadoFisico extends Empregado{

    private String cpf;
    private String sexo;

    public EmpregadoFisico() {
    }

    public EmpregadoFisico(String cpf, String sexo) {
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public EmpregadoFisico(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
