public class Fruit {
    private String nome;

    public Fruit(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
