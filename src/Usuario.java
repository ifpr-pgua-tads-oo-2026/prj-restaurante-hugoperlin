public class Usuario{

    //atributos
    private String nome;
    private String email;
    private String telefone;
    private double saldo;
    private final String cpf;
    private RegistroOperacoes movimentacoes;

    public Usuario(String cpf, String pnome, String pemail, String ptelefone, double psaldo){
        nome = pnome;
        email = pemail;
        telefone = ptelefone;
        saldo = psaldo;
        this.cpf = cpf;
        this.movimentacoes = new RegistroOperacoes();
    }

    public String getCpf(){
        return cpf;
    }


    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }

    public boolean inserirCredito(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            movimentacoes.registrar("crédito", valor);
            return true;
        }
        return false;
        
    }

    public double consultarCredito(){
        return saldo;
    }

    public boolean consumirRefeicao(double valor){
        if(valor > 0){
            saldo = saldo - valor;
            movimentacoes.registrar("débito", valor);
            return true;
        }
        return false;
    }

    public String gerarExtrato(){
        return movimentacoes.listar();
    }

    public String toString(){
        String str = "";

        str += "Nome:"+nome;
        str += " Email:"+email;
        str += " Telefone:"+telefone;
        str += " Saldo R$:"+saldo;

        return str;
    }

}
