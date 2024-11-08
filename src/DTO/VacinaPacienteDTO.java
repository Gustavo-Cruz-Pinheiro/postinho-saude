package DTO;

import java.time.LocalDate;

public class VacinaPacienteDTO {
    private int codigo;
    private int codigoVacina;
    private int codigoPaciente;
    private LocalDate data;
    private String dose;
    private String nomePaciente;
    private String nomeVacina;

    public VacinaPacienteDTO() {}

    public VacinaPacienteDTO(int codigoVacina, int codigoPaciente, LocalDate data, String dose) {
        this.codigoVacina = codigoVacina;
        this.codigoPaciente = codigoPaciente;
        this.data = data;
        this.dose = dose;
    }

    public VacinaPacienteDTO(int codigo, int codigoVacina, int codigoPaciente, LocalDate data, String dose) {
        this.codigo = codigo;
        this.codigoVacina = codigoVacina;
        this.codigoPaciente = codigoPaciente;
        this.data = data;
        this.dose = dose;
    }

    public VacinaPacienteDTO(int codigo, int codigoVacina, int codigoPaciente, LocalDate data, String dose, String nomePaciente, String nomeVacina) {
        this.codigo = codigo;
        this.codigoVacina = codigoVacina;
        this.codigoPaciente = codigoPaciente;
        this.data = data;
        this.dose = dose;
        this.nomePaciente = nomePaciente;
        this.nomeVacina = nomeVacina;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoVacina() {
        return codigoVacina;
    }

    public void setCodigoVacina(int codigoVacina) {
        this.codigoVacina = codigoVacina;
    }

    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    public void setCodigoPaciente(int codigoPaciente) {
        this.codigoPaciente = codigoPaciente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }
}
