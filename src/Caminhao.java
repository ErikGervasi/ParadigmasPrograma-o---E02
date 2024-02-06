public class Caminhao extends Automoveis{
        private int eixos;
@Override
    public void emitirSom(){
        System.out.println("Raaaan Tchuuuuu");
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        if (eixos > 1) {
            this.eixos = eixos;
        } else {
            System.out.println("Não é um caminhão");
        }
    }
}
