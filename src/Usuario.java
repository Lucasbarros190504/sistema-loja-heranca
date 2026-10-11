import java.sql.SQLOutput;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private boolean administrador;
    private boolean logado;

    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
        this.logado = false;
    }

    public boolean realizarLogin(String email, String senha){
        if(isLogado()){
            System.out.println("Você já está logado");
            return true;
        }

        if(!this.email.equals(email) || !this.senha.equals(senha)){
            System.out.println("Erro!! Senha ou email invalído");
            return false;
        }



       this.logado = true;
       System.out.println("Login realizado com sucesso!");
       return true;

    }

    public void realizarLogoff(){
        if(logado){
            this.logado = false;
            System.out.println("Logoff realizado com sucesso!");
        } else {
            System.out.println("Você não está logado!");
        }
    }

    public boolean alterarSenha(String senha, String novaSenha){
        if(!logado){
            System.out.println("Você não está logado!");
            return false;
        }

        if (senha == null || novaSenha == null ||senha.isBlank() || novaSenha.isBlank()) {
            System.out.println("Campo vazio!");
            return false;
        }

        if (!senha.equals(this.senha)) {
            System.out.println("Senha incorreta!");
            return false;
        }

        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!");
        return true;

    }

    public boolean alterarDados(String nome, String email){
        if(!logado){
            System.out.println("Você não está logado!");
            return false;
        }

        if (nome == null || email == null ||nome.isBlank() || email.isBlank()) {
            System.out.println("Nome ou email vazio!");
            return false;
        }

        this.nome = nome;
        this.email = email;
        System.out.println("Dados alterados com sucesso!");
        return true;

    }


    public boolean isLogado() {
        return logado;
    }


    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public boolean isAdministrador(){
        return administrador;
    }




}
