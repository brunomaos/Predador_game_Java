package Project;

public class Atirador {
    String nome = "";
    int numberShot = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumberShot() {
        return numberShot;
    }

    public void setNumberShot(int numberShot) {
        this.numberShot += numberShot;
    }
    
    
}
