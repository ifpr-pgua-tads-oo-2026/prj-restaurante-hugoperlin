public class AppTeste {
    
    private static void permiteCadastrarUsuario(){
        Restaurante restaurante = new Restaurante();


        boolean ret = restaurante.cadastrarUsuario("Zé", "ze@teste.com", "12345", "000.000.000-00");

        if(ret == true){
            System.out.println("Cadastrou usuario");
            restaurante.listar();
        }
    }


    public static void main(String[] args) {
        permiteCadastrarUsuario();
    }



}
