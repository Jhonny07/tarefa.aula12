public class Administrador extends Operario{
    private double ajudaCusto;
    //get e set
    public double getAjudaCusto(){
        return this.ajudaCusto;
    }
    public void setAjudaCusto(double ajudaCusto){
        this.ajudaCusto=ajudaCusto;
    }
    @Override
    public double calcularSalario(){
        return super.calcularSalario()+this.ajudaCusto;
    }
}