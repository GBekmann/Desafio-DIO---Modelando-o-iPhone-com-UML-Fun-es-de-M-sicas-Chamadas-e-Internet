package interfaces;
//Implementação das interfaces
public class iPhone implements ReprodutorMusical, Telefone, NavegadorInternet {


//Abstração dos métodos nas interfaces implementadas

    // ReprodutorMusical ------------------------------------------------------------------------------------------
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }



    // NavegadorInternet ------------------------------------------------------------------------------------------

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada...");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }



    //Telefone ----------------------------------------------------------------------------------------------------

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
