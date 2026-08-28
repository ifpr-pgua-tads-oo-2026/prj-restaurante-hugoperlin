public class AppTeste {
    
    private static void permiteCadastrarUsuario(){
        Restaurante restaurante = new Restaurante();


        boolean ret = restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");

        if(ret == true){
            System.out.println("Cadastrou usuario");
            System.out.println(restaurante.listar());
        }
    }

    private static void naoPermiteCadastrarUsuarioMesmoCpf(){
        Restaurante restaurante = new Restaurante();


        boolean ret = restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        ret = restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");


        if(ret == false){
            System.out.println("Não cadastrou usuario mesmo CPF");
            System.out.println(restaurante.listar());
        }
    }

    private static void naoPermiteCadastrarUsuarioMesmoEmail(){
        Restaurante restaurante = new Restaurante();
        boolean ret = restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        
        ret = restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "100.000.000-00");

        if(ret == false){
            System.out.println("Não cadastrou usuario mesmo email");
            System.out.println(restaurante.listar());
        }
    }

    private static void permiteDepositar(){
        Restaurante restaurante = new Restaurante();
        restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        
        String retorno = restaurante.depositar("000.000.000-00", 100.0);

        System.out.println(retorno);
        System.out.println(restaurante.listar());
    
    }

    private static void naoPermiteDepositarUsuarioNaoEncontrado(){
        Restaurante restaurante = new Restaurante();
        restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        
        String retorno = restaurante.depositar("100.000.000-00", 100.0);

        System.out.println(retorno);
        System.out.println(restaurante.listar());
    
    }

    private static void naoPermiteDepositarValorNegativo(){
        Restaurante restaurante = new Restaurante();
        restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        
        String retorno = restaurante.depositar("000.000.000-00", -100.0);

        System.out.println(retorno);
        System.out.println(restaurante.listar());
    
    }

    private static void permiteConsumir(){
        Restaurante restaurante = new Restaurante();
        restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        restaurante.depositar("000.000.000-00", 100.0);

        String retorno = restaurante.consumir("000.000.000-00", 10.0);
        
        System.out.println(retorno);
        System.out.println(restaurante.listar());
    
    }

    private static void naoPermiteConsumirUsuarioNaoEncontrado(){
        Restaurante restaurante = new Restaurante();
        restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        restaurante.depositar("000.000.000-00", 100.0);

        String retorno = restaurante.consumir("100.000.000-00", 10.0);

        System.out.println(retorno);
        System.out.println(restaurante.listar());
    
    }

    private static void naoPermiteConsumirValorNegativo(){
        Restaurante restaurante = new Restaurante();
        restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");
        restaurante.depositar("000.000.000-00", -100.0);

        String retorno = restaurante.consumir("000.000.000-00", -10.0);

        System.out.println(retorno);
        System.out.println(restaurante.listar());
    
    }






    public static void main(String[] args) {
        permiteCadastrarUsuario();
        naoPermiteCadastrarUsuarioMesmoCpf();
        naoPermiteCadastrarUsuarioMesmoEmail();
        permiteDepositar();
        naoPermiteDepositarValorNegativo();
        naoPermiteDepositarUsuarioNaoEncontrado();
        permiteConsumir();
        naoPermiteConsumirUsuarioNaoEncontrado();
        naoPermiteConsumirValorNegativo();
    }



}
