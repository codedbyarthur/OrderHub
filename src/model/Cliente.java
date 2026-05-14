public class Cliente {
    private String nome;
    private String telefone;
    private String endereço;

    public Cliente (String nome, String telefone, String endereço) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
    }

    public String getNome(){
        return nome;
    } 

    public String getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereço;
    }
}   