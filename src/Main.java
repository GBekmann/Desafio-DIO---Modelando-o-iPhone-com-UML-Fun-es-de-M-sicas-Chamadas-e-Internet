import interfaces.iPhone;

public class Main {
    public static void main(String[] args) {

        //Instanciação do iPhone para validação

        iPhone iPhone16 = new iPhone();

        //Validando NavegadorInternet
        iPhone16.atualizarPagina();
        iPhone16.exibirPagina();
        iPhone16.adicionarNovaAba();

        System.out.println("\n");

        //Validando ReprodutorMusical
        iPhone16.tocar();
        iPhone16.pausar();
        iPhone16.selecionarMusica();

        System.out.println("\n");

        //Validando Telefone
        iPhone16.atender();
        iPhone16.ligar();
        iPhone16.iniciarCorreioVoz();

    }
}
