public class Empregado extends Pessoa{

    private int codigoSetor;
    private double salarioBase;
    private double imposto;

//fazer os métodos gets e sets 
public void setcodigoSetor(String codigoSetor){
    this.codigoSetor=codigoSetor;
} 
// get
public String getcodigoSetor(){
    return this.codigoSetor;
}
//set
public void setcodigoSetor(String codigoSetor){
    this.codigoSetor=codigoSetor;
}
//get 
public String getTelefone(){
    return this.endereco;
}
//set
public void setEndereco(String endereco){
    this.endereco=endereco;
}
//get 
public String getEndereco(){
    return this.endereco;
}
}