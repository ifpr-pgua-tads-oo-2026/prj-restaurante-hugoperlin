public class Funcionario {
    
    private String nome;
    private String email;
    private String cpf;
    private double salario;
    private String cargo;
    private String turno;
    
    public Funcionario(String nome, String email,
                       String cpf, double salario,
                       String cargo, String turno){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.cargo = cargo;
        this.turno = turno;
        this.salario = salario;
    }

    public Funcionario(String nome, String email,
                       String cpf,String cargo, String turno){
        
        this(nome,email,cpf,0.0,cargo,turno);
        /*this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.turno = turno;
        this.cargo = cargo;*/

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", salario=" + salario + ", cargo="
                + cargo + ", turno=" + turno + "]";
    }

    


}
