public class User {
    private String nome;
    private int anni;

    public User(String nome, int anni) {
        this.nome = nome;
        this.anni = anni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnni() {
        return anni;
    }

    public void setAnni(int anni) {
        this.anni = anni;
    }
    public void stampa(){
        System.out.println(nome);
        System.out.println(anni);
    }
}
