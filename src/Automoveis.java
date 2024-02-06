

public class Automoveis {

    private String marca;
    private String modelo;
    private String potencia;

    public void emitirSom() {
        System.out.println("Vruuuuuum");
    }

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

        //Moto
        Moto moto1 = new Moto();

        moto1.setMarca("Honda");
        moto1.setModelo("CB Twister");
        moto1.setPotencia("250 CC");

        //Caminhão
        Caminhao caminhao1 = new Caminhao();

        caminhao1.setEixos(2);
        caminhao1.setMarca("volvo");
        caminhao1.setModelo("FH16");
        caminhao1.setPotencia("750 CV");

        //Onibus
        Onibus onibus1 = new Onibus();

        onibus1.setMarca("Mercedes-Benz");
        onibus1.setModelo("O500U");
        onibus1.setPotencia("299 CV");
        onibus1.setQtdPassageiros(100);

        //Carro
        Carro carro1 = new Carro();

        carro1.setMarca("Audi");
        carro1.setModelo("Q3");
        carro1.setPotencia("890 CV");


        System.out.println("\no modelo da moto 1 é a " + moto1.getModelo() + " da " + moto1.getMarca() + " com " + moto1.getPotencia() + " de potência.");
        moto1.emitirSom();

        System.out.println("\no modelo do caminhão 1 é o " + caminhao1.getModelo() + " da " + caminhao1.getMarca() + " com " + caminhao1.getEixos() + " eixos e " + caminhao1.getPotencia() + " de potência.");
        caminhao1.emitirSom();

        System.out.println("\no modelo do onibus 1 é o " + onibus1.getModelo() + " da " + onibus1.getMarca() + " com capacidade para " + onibus1.getQtdPassageiros() + " passageiros e com potencia de " + onibus1.getPotencia() + ".");
        onibus1.emitirSom();

        System.out.println("\no modelo do carro é " + carro1.getModelo() + " da " + carro1.getMarca() + " com " + carro1.getPotencia() + " de potência.");
        carro1.emitirSom();

    }
}