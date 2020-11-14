
package sistemadealunos;

import java.util.Arrays;

public class Aluno {
//Criação dos atributos da classe 'Alunos'
   int matricula;
    String nome;
   float nota1;
   float nota2;
   float nota3;
   String disciplina;
   private boolean aprovado = false;
   private float mediaCalculada;
    

public void setMatricula(int mat){
    this.matricula = mat;
}

public int getMatricula()
{
    return matricula;
}

public void setNome (String nome){
    this.nome = nome;
}

public void setNota1 (float n1){
    this.nota1 = n1;
}

public float getNota1 (){
    return nota1;
}

public void setNota2 (float n2){
    this.nota2 = n2;
}

public float getNota2(){
    return nota2;
}

public void setNota3 (float n3){
    this.nota3 = n3;
}

public float getNota3 ()
{
    return nota3;
}

public void setAprovado(){
    this.aprovado = true;
}

public boolean getAprovado(){
    return aprovado;
} 



public void media (){   //Este método irá excluir a menor nota e fazer a media entre as duas maiores, sendo 'soma1' sempre a maior nota. No fim, definirá se o aluno está aprovado ou reprovado
    float []notas = new float [3]; //vetor para arranjar as 3 notas
    float menorNota = 0, maiorNota = 0, notaSomada = 0; // variavel para guardar a menor nota deste as 3
    float soma1 = nota1, soma2 = 0; // variaveis para guardar as duas notas que serão consideradas na media
    
    notas[0] = nota1; // posição 0 do vetor recebe o valor da nota1
    notas[1] = nota2; // posição 1 do vetor recebe o valor da nota2
    notas[2] = nota3; // posição 2 do vetor recebe o valor da nota3
    
    Arrays.sort(notas); // Organizar as notas em ordem crescente
    
    menorNota = notas[0]; maiorNota = notas[2]; notaSomada = notas[1];
    
    mediaCalculada = (maiorNota + notaSomada) / 2;
    
    System.out.println("\nNota Excluída: " + menorNota);
    System.out.println("Maior Nota: " + maiorNota + "          Nota Somada: " + notaSomada);
    System.out.println("media: " + mediaCalculada + "\n");
    
    
    if (mediaCalculada >7){
        setAprovado();
        System.out.println(nome + " Está Aprovado!\n");
    }else{
        System.out.println(nome + " Está Reprovado!\n");
    }
    
    
    
    
}

public void Exibir(){
    System.out.println("\nNome do Aluno: "+ this.nome);
    System.out.println("Matricula: " + this.matricula);
    System.out.println("Nota da AV1: "+ this.nota1);
    System.out.println("Nota da AV2: "+ this.nota2);
    System.out.println("Nota da AV3: "+ this.nota3);
}

}