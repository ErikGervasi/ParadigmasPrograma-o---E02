

public class Automoveis {

    private String marca;
    private String modelo;
    private String potencia;

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static void main(String[] args) {

        Automoveis moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setModelo("CB Twister");

        Caminhao caminhao1 = new Caminhao();
        caminhao1.setEixos(2);
        caminhao1.setMarca("volvo");
        caminhao1.setModelo("Modelo novo");

        System.out.println("o modelo da moto 1 é a " + moto1.getModelo() + " da " + moto1.getMarca());
        System.out.println("o modelo do caminhão 1 é o " + caminhao1.getModelo() + " da " + caminhao1.getMarca() + " com " + caminhao1.getEixos() + " eixos.");


    }
}