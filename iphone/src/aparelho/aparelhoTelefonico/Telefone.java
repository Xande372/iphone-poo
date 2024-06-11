package aparelho.aparelhoTelefonico;

public abstract class Telefone implements AparelhoTelefonico {

    public void ligar(String numero) {
        System.out.println("Ligando... " + numero);
    }

    public void atender(String numero) {
        System.out.println("Chamando... " + numero);
    }

    public void iniciarCorreioVoz(String numero) {
        System.out.println("Um novo recado... " + numero);
    }
}
