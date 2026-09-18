import br.edu.ifpr.pgua.eic.tads.entidades.Restaurante;

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

    private static void permiteCadastrarFuncionario(){

        Restaurante restaurante = new Restaurante();

        String retorno = restaurante.cadastrarFuncionario("Func", "func@teste.com", "000.000", 10, "cozinheira", "manhã");

        System.out.println(retorno);

    }

    private static void permiteListarFuncionarios(){

        Restaurante restaurante = new Restaurante();

        restaurante.cadastrarFuncionario("Func1", "func1@teste.com", "100.000", 10, "cozinheira", "manhã");
        restaurante.cadastrarFuncionario("Func2", "func2@teste.com", "200.000", 10, "cozinheira", "manhã");
        restaurante.cadastrarFuncionario("Func3", "func3@teste.com", "300.000", 10, "cozinheira", "manhã");

        System.out.println(restaurante.listarFuncionarios());

    }

    private static void naoPermiteCadastrarFuncionarioMesmoCpf(){
        Restaurante restaurante = new Restaurante();
        restaurante.cadastrarFuncionario("Func", "func@teste.com", "000.000", 10, "cozinheira", "manhã");

        String retorno = restaurante.cadastrarFuncionario("Func", "func@teste.com", "000.000", 10, "cozinheira", "manhã");

        System.out.println(retorno);

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
        permiteCadastrarFuncionario();
        naoPermiteCadastrarFuncionarioMesmoCpf();
        permiteListarFuncionarios();
    }



}
