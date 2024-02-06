public class Onibus extends Automoveis{

    private int qtdPassageiros;
    @Override
    public void emitirSom(){
        System.out.println("Rump-Rump Bi Bi");
    }

    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        this.qtdPassageiros = qtdPassageiros;
    }
}
