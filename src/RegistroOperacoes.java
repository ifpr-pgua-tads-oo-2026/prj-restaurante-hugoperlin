public class RegistroOperacoes {
    private static final int MAX = 50; //constante

    private Operacao[] operacoes;
    private int posicaoLivre;

    public RegistroOperacoes(){
        this.operacoes = new Operacao[MAX];
        this.posicaoLivre = 0;
    }

    public boolean registrar(String tipoOperacao, double valor){

        if(posicaoLivre < MAX){
            this.operacoes[posicaoLivre] = new Operacao(tipoOperacao,valor);
            this.posicaoLivre += 1;
            return true;
        }
        
    
        return false;
        
    }

    public String listar(){
        String texto="";

        for(int i=0;i<posicaoLivre;i++){
            texto = texto +"\n"+operacoes[i].toString();
        }

        return texto;
    }

}
