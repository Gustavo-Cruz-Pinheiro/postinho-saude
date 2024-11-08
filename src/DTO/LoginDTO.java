package DTO;

public class LoginDTO {
    private int codigo;
    private String usuario;
    private String senha;

    public LoginDTO() {}

    public LoginDTO(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public LoginDTO(int codigo, String usuario, String senha) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
