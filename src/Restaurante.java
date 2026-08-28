public class Restaurante {
    
    private static final int MAX=50;

    private Usuario[] usuarios;

    public Restaurante(){
        usuarios = new Usuario[MAX];
    }

    private int posicaoLivre(){
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i] == null){
                return i;
            }
        }
        return -1;
    }

    public Usuario buscarCpf(String cpf){
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i] != null){
                if(usuarios[i].getCpf().equals(cpf)){
                    return usuarios[i];
                }
            }
        }
        return null;
    }

    public Usuario buscarEmail(String email){
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i] != null){
                if(usuarios[i].getEmail().equals(email)){
                    return usuarios[i];
                }
            }
        }
        return null;
    }

    public boolean cadastrarUsuario(String nome, String email, 
                                    String telefone, String cpf){
        
        if((buscarCpf(cpf)==null) && (buscarEmail(email)==null)){
            int pos = posicaoLivre();
            usuarios[pos] = new Usuario(cpf, nome, email, telefone, 0.0);
            return true;
        }
        return false;
        
    }

    public String depositar(String cpf, double valor){
        Usuario usuario = buscarCpf(cpf);
        if(usuario == null){
            return "Usuário não encontrado!";
        }
        if(valor <= 0){
            return "Valor inválido!";
        }

        if(usuario.inserirCredito(valor)){
            return "Depósito realizado!";
        }else{
            return "Valor inválido!";
        }
    }

    public String consumir(String cpf, double valor){
        Usuario usuario = buscarCpf(cpf);
        if(usuario == null){
            return "Usuário não encontrado!";
        }
        if(valor <= 0){
            return "Valor inválido!";
        }

        if(usuario.consumirRefeicao(valor)){
            return "Depósito realizado!";
        }else{
            return "Valor inválido!";
        }
    }

    public String gerarExtrato(String cpf){
        Usuario usuario = buscarCpf(cpf);
        if(usuario == null){
            return "Usuário não encontrado!";
        }
        return usuario.gerarExtrato();
    }

    public String listar(){

        String texto="";

        for(int i=0;i<usuarios.length;i++){
            texto += usuarios[i].toString()+"\n";
        }
        return texto;
        
    }


}
