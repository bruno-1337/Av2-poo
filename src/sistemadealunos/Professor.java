package sistemadealunos;

public class Professor 
{

  String nome;
  public int RA;
  public String especialidade;
  public double salario;


  public String getNome(){
      return nome;
  }
  
  public void setNome(String nome){
      this.nome = nome;
  }
  
  public int getRA(){
  return RA;    
  }
  
  public void setRA(int ra){
      this.RA = ra;
  }

  public double getSalario() {
  return salario;
  }

  public void setSalario(double sal){
  this.salario = sal;
  }
  public void Exibir(){
    System.out.println("\nNome do Professor: "+ this.nome);
    System.out.println("RA:" + this.RA);
    System.out.println("Salario: "+ this.salario);
}
}
