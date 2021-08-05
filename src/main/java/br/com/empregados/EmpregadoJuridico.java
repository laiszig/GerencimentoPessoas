package br.com.empregados;

public class EmpregadoJuridico extends Empregado{

    private String cnpj;
    private String dataAdmissao;

    public EmpregadoJuridico(String cnpj, String dataAdmissao) {
        this.cnpj = cnpj;
        this.dataAdmissao = dataAdmissao;
    }

    public EmpregadoJuridico(String nome, String endereco, String telefone, String email) {
        super(nome, endereco, telefone, email);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
}
