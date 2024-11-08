package DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class PlantaoDTO {
    private int codigo;
    private LocalDate data;
    private LocalTime horaEntrada;
    private LocalTime horaSaida;
    private int condigoEnfermeira;
    private int codigoMedico;
    private String nomeMedico;
    private String nomeEnfermeira;

    public PlantaoDTO() {}

    public PlantaoDTO(int codigo, LocalDate data, LocalTime horaEntrada, LocalTime horaSaida, int condigoEnfermeira, int codigoMedico) {
        this.codigo = codigo;
        this.data = data;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.condigoEnfermeira = condigoEnfermeira;
        this.codigoMedico = codigoMedico;
    }

    public PlantaoDTO(LocalDate data, LocalTime horaEntrada, LocalTime horaSaida, int condigoEnfermeira, int codigoMedico) {
        this.data = data;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.condigoEnfermeira = condigoEnfermeira;
        this.codigoMedico = codigoMedico;
    }

    public PlantaoDTO(int codigo, LocalDate data, LocalTime horaEntrada, LocalTime horaSaida, int condigoEnfermeira, int codigoMedico, String nomeMedico, String nomeEnfermeira) {
        this.codigo = codigo;
        this.data = data;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
        this.condigoEnfermeira = condigoEnfermeira;
        this.codigoMedico = codigoMedico;
        this.nomeMedico = nomeMedico;
        this.nomeEnfermeira = nomeEnfermeira;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public int getCondigoEnfermeira() {
        return condigoEnfermeira;
    }

    public void setCondigoEnfermeira(int condigoEnfermeira) {
        this.condigoEnfermeira = condigoEnfermeira;
    }

    public int getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(int codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getNomeEnfermeira() {
        return nomeEnfermeira;
    }

    public void setNomeEnfermeira(String nomeEnfermeira) {
        this.nomeEnfermeira = nomeEnfermeira;
    }
    
    
}
