public class Articoli {
    private String nome;
    private Double prezzo;
    public Articoli(String nome, Double prezzo){
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public java.lang.Double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(java.lang.Double prezzo) {
        this.prezzo = prezzo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Articoli{" +
                "nome=" + nome +
                ", prezzo=" + prezzo +
                '}';
    }
}
