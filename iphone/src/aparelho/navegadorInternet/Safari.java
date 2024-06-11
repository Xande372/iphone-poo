package aparelho.navegadorInternet;

public abstract class Safari implements Navegador {

    public void exibirPagina(String url) {
        System.out.println("Abrindo página desejada... " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Mais uma aba aberta.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página (f5)");
    }
}
