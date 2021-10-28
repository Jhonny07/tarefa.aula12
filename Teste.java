public class Teste { 
     public static void main(String args[]){
    //criando o objeto empregado 
    Empregado empregado=new Empregado();

    empregado.setcodigoSetor(1);
    empregado.setsalarioBase(5000);
    empregado.setimposto(500);
    empregado.setNome("Jonathan Jacinto de Jesus");
    empregado.setEndereco("Pompeia-SP rua kajiro tahira n:28");
    empregado.setTelefone("14998732824");

    //iremos apresentar o salário Líquido 
    System.out.println(empregado.getNome());
    System.out.println(empregado.getEndereco());
    System.out.println(empregado.getTelefone());
    System.out.println(empregado.calcularSalario());

     }
}
