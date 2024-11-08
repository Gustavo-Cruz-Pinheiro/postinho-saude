package DTO;

import java.time.LocalDate;

public class PacienteDTO {
    private int codigo;
    private String nome;
    private LocalDate datanasc;
    private String endereco;
    private String telefone;
    private String celular;
    private String rg;
    private String estado;
    private String cidade;
    private String bairro;
    private String certidao;
    private String sexo;

    public PacienteDTO() {}

    public PacienteDTO(int codigo, String nome, LocalDate datanasc, String endereco, String telefone, String celular, String rg, String estado, String cidade, String bairro, String certidao, String sexo) {
        this.codigo = codigo;
        this.nome = nome;
        this.datanasc = datanasc;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
        this.rg = rg;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.certidao = certidao;
        this.sexo = sexo;
    }

    public PacienteDTO(String nome, LocalDate datanasc, String endereco, String telefone, String celular, String rg, String estado, String cidade, String bairro, String certidao, String sexo) {
        this.nome = nome;
        this.datanasc = datanasc;
        this.endereco = endereco;
        this.telefone = telefone;
        this.celular = celular;
        this.rg = rg;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.certidao = certidao;
        this.sexo = sexo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(LocalDate datanasc) {
        this.datanasc = datanasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCertidao() {
        return certidao;
    }

    public void setCertidao(String certidao) {
        this.certidao = certidao;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }   
}
