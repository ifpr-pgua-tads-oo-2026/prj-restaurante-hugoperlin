public class App {
    
    public static void main(String[] args) {

        Usuario usuario = new Usuario("000.000.000-11", 
                                      "Zé", "ze@teste.com", 
                                      "123-456", 50.0);

        usuario.inserirCredito(100.0);
        usuario.consumirRefeicao(50.0);

        System.out.println(usuario.gerarExtrato());



    }


}
