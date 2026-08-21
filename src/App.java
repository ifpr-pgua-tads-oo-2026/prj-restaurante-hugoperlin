public class App {
    
    public static void main(String[] args) {
        
        //definição de um objeto
        Usuario user;

        String nome = "Hugo";
        String email = "hugo@teste.com";
        String telefone = "99999999";
        double saldo = 10;

        //instanciação
        user = new Usuario(nome, email, telefone,saldo);

        //inicializados

        System.out.println(user);

        user.inserirCredito(100);

        System.out.println(user);

        user.consumirRefeicao(3.5);

        System.out.println(user);

        user.setEmail("hugo@teste2.com");

        System.out.println(user);


    }


}
