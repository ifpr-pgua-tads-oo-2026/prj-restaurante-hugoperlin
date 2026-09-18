import br.edu.ifpr.pgua.eic.tads.entidades.Coordenador;
import br.edu.ifpr.pgua.eic.tads.entidades.Funcionario;
import br.edu.ifpr.pgua.eic.tads.entidades.Pessoa;
import br.edu.ifpr.pgua.eic.tads.entidades.Usuario;

public class AppHeranca{


    public static void main(String[] args) {
        
        Usuario u = new Usuario("000.000.001-11", "Zé Usuario", "zeusuario@teste.com", "123456", 0.0);

        Funcionario f = new Funcionario("Zé Funcionario", "zefuncionario@teste.com", "000.000.002-22", 100, "Cozinheiro", "Tarde");

        Coordenador c = new Coordenador("Zé Coordenador", "zecoordenador@teste.com", "000.000.003-33", 100, "Coordenador", "Manhã", 50);


        System.out.println(u.toString());

        System.out.println(f.toString());

        System.out.println(c.toString());

        System.out.println(c instanceof Coordenador);
        System.out.println(c instanceof Funcionario);
        System.out.println(c instanceof Pessoa);


        System.out.println(c instanceof Object);

        System.out.println("Funcionario:"+f.calcularSalario());
        System.out.println("Coordenador:"+c.calcularSalario());








    }


}