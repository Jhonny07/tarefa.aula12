public class Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

//fazer os métodos gets e sets 
//set
public void setcodigoSetor(int codigoSetor){
    this.codigoSetor=codigoSetor;
} 
// get
public int getcodigoSetor(){
    return this.codigoSetor;
}
//set
public void setsalarioBase(double salarioBase){
    this.salarioBase=salarioBase;
}
//get 
public double getsalarioBase(){
    return this.salarioBase;
}
//set
public void setimposto(double imposto){
    this.imposto=imposto;
}
//get 
public double getimposto(){
     return this.imposto;
}

public double calcularSalario(){
    double salarioLiquido=0;
    salarioLiquido=this.salarioBase-this.imposto;
    //cálculo do salário líquido   
    return salarioLiquido;

}
}