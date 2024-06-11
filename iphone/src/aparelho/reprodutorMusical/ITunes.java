package aparelho.reprodutorMusical;

public abstract class ITunes implements Reprodutor{

    public void tocar() {
        System.out.println("Tocando última música em andamento...");
    }

    public void pausar() {
        System.out.println("Pausando música...");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Tocando música: " + musica);
    }
}
