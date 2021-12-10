public class Carro {
    private double velocidade;
    private Condutor Senna;
    private String marca;

    public void acelerar(){
    }
    public void travar(){
    }
    public void mostrarVelocidade(){}

    public String toString(){
        return ("marca:"+marca+"condutor:"+Senna.getNome()+"velocidade:"+velocidade);
    }

    /* Construtores*/

    public Carro(){
        velocidade= 0.0;
    }
    public Carro(double velocidade, Condutor senna, String marca) {
        velocidade = 0.0;
        Senna = senna;
        this.marca = marca;
    }

    /*Getters* e * Setters*/
    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public Condutor getSenna() {
        return Senna;
    }

    public void setSenna(Condutor senna) {
        Senna = senna;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
