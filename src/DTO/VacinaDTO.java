package DTO;

public class VacinaDTO {
    private int codigo;
    private String nomeVaci;
    private String form_admvaci;
    private String via_admvaci;
    private String lugar_admvaci;
    private String descricao;
    
    public VacinaDTO() {}

    public VacinaDTO(String nomeVaci, String form_admvaci, String via_admvaci, String lugar_admvaci, String descricao) {
        this.nomeVaci = nomeVaci;
        this.form_admvaci = form_admvaci;
        this.via_admvaci = via_admvaci;
        this.lugar_admvaci = lugar_admvaci;
        this.descricao = descricao;
    }

    public VacinaDTO(int codigo, String nomeVaci, String form_admvaci, String via_admvaci, String lugar_admvaci, String descricao) {
        this.codigo = codigo;
        this.nomeVaci = nomeVaci;
        this.form_admvaci = form_admvaci;
        this.via_admvaci = via_admvaci;
        this.lugar_admvaci = lugar_admvaci;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeVaci() {
        return nomeVaci;
    }

    public void setNomeVaci(String nomeVaci) {
        this.nomeVaci = nomeVaci;
    }

    public String getForm_admvaci() {
        return form_admvaci;
    }

    public void setForm_admvaci(String form_admvaci) {
        this.form_admvaci = form_admvaci;
    }

    public String getVia_admvaci() {
        return via_admvaci;
    }

    public void setVia_admvaci(String via_admvaci) {
        this.via_admvaci = via_admvaci;
    }

    public String getLugar_admvaci() {
        return lugar_admvaci;
    }

    public void setLugar_admvaci(String lugar_admvaci) {
        this.lugar_admvaci = lugar_admvaci;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
