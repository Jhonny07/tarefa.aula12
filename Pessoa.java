public class Pessoa{
    private String nome;
    private String telefone;
    private String endereco;
// fazer os metodos de acesso público
// set 
public void setNome(String nome){
    this.nome=nome;
} 
// get
public String getNome(){
    return this.nome;
}
//set
public void setTelefone(String telefone){
    this.telefone=telefone;
}
//get 
public String getTelefone(){
    return this.telefone;
}
//set
public void setEndereco(String endereco){
    this.endereco=endereco;
}
//get 
public String getEndereco(){
    return this.endereco;
}
// Construtor padrão,tem o nome da classe e sem parametros 
public Pessoa(){

}
// Construtor com um parametro
public Pessoa(String nome){
    this.nome=nome;
}
// Construtor com dois parametro 
public Pessoa(String nome, String telefone){
    this.nome=nome;
    this.telefone=telefone; 
}
}