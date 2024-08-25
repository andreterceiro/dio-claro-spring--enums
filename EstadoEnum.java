public enum EstadoEnum {
    SAO_PAULO("São Paulo", "SP"),
    PARANA("Paraná", "PR");

    String nome = "";
    String sigla = "";
    
    EstadoEnum(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return this.nome;
    }

    public String getSigla() {
        return this.sigla;
    }
}