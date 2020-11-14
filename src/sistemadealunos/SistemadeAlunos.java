
package sistemadealunos;

import java.util.ArrayList;
import java.util.Scanner;


public class SistemadeAlunos {
    
  static ArrayList<Aluno> cadastroDeAlunos=new ArrayList<Aluno>();
  static ArrayList<Professor> cadastroDeProfessores=new ArrayList<Professor>();
   
    public static void main(String[] args) 
    {
        
         menu();
         
        
    }
    
    public static void menu()
    {
        Scanner ler = new Scanner (System.in);
        System.out.println("----- Sistema Professores/Alunos -----");
        System.out.println("----------------------------------------------------------");
        System.out.println("------- [1] - Cadastrar Novo Aluno -----------------------");
        System.out.println("------- [2] - Cadastrar Novo Professor -------------------");
        System.out.println("------- [3] - Exibir Cadastro de Aluno -------------------");
        System.out.println("------- [4] - Exibir Cadastro de Professor ---------------");
        System.out.println("------- [5] - Excluir Cadastro de Alunos -----------------");
        System.out.println("------- [6] - Excluir Cadastro de Professor ------------- ");
        System.out.println("------- [7] - Modificar Cadastro de Aluno --------------- ");
        System.out.println("------- [8] - Modificar Cadastro de Professor ----------- ");
        System.out.println("------- [9] - Modificar Notas de Aluno ------------------ ");
        System.out.println("----------------------------------------------------------");
        
        int select;
                
        System.out.print(" ---- Selecione uma Opcao: ");
        select = ler.nextInt();
            
            switch (select){
                case 1: cadastrarAlunos();
                break;
                case 2: cadastrarProfessores();
                break;
                case 3: exibirCadastroDeAlunos();
                break;
                case 4: exibirCadastroDeProfessores();
                break;
                case 5: excluirCadastroDeAlunos();
                break;
                case 6: excluirCadastroDeProfessores();
                break;
                case 7: modificarCadastroDeAlunos();
                break;
                case 8: modificarCadastroDeProfessores();
                break;
                case 9: modificarNotasDeAlunos();
                break;
                
                default : {
                    System.out.println("\n!Opcao Invalida!\n");
                    menu();
                    }
            }
    }


    public static void cadastrarProfessores() 
    {
        Scanner ler = new Scanner (System.in);

       System.out.println("\n\n --------------- CADASTRAR NOVO PROFESSOR ------------------");
            
        Professor professor = new Professor();
        
        System.out.print("\n\nNome do Professor: ");
        professor.nome = ler.nextLine().toUpperCase();
        System.out.print("RA: ");
        professor.RA = ler.nextInt();   
        System.out.print("Salario: ");
        professor.salario = ler.nextFloat();
        
        cadastroDeProfessores.add(professor);
        
                    System.out.println("Professor cadastrado com sucesso! Voltando ao menu inicial . . .\n");
                    menu();
    }
    
    public static void cadastrarAlunos()
    {
        Scanner ler = new Scanner (System.in);    
        
        System.out.println("\n\n --------------- CADASTRAR NOVO ALUNO ------------------");    
        
        Aluno aluno = new Aluno();
        
        System.out.print("\nNome do Aluno:");
        aluno.nome = ler.nextLine().toUpperCase();
        System.out.print("Matricula: ");
        aluno.matricula = ler.nextInt();
        System.out.print("\nNota da AV1: ");
        aluno.nota1 = ler.nextFloat();
        System.out.print("\nNota da AV2: ");
        aluno.nota2 = ler.nextFloat();
        System.out.print("\nNota da AV3: ");
        aluno.nota3 = ler.nextFloat();
        
        aluno.media();
        
        cadastroDeAlunos.add(aluno);
        
        System.out.println("Aluno cadastrado com sucesso! Voltando ao menu inicial . . .\n");
        menu();
                
            }
       
        
        
    
            
    public static void exibirCadastroDeAlunos(){
        
        if(cadastroDeAlunos.size() == 0){
            System.out.println("\n ****Nenhum aluno cadastrado!**** \nPor favor, selecione a Opcao [1] para cadastrar novos alunos.\n\n");
            menu();
            }else{
            
            System.out.println("\n..................... Cadastro de Alunos ....................\n");
            
            for (int i=0; i<cadastroDeAlunos.size();i++){
                    cadastroDeAlunos.get(i).Exibir();
                    cadastroDeAlunos.get(i).media();
            }
            System.out.println("\n..............................................................\n");
        }
        menu();
        
}
    public static void exibirCadastroDeProfessores(){
        
        if(cadastroDeProfessores.size() == 0){
            System.out.println("\n ****Nenhum Professor cadastrado!**** \nPor favor, selecione a Opcao [2] para cadastrar novos Professores.\n\n");
            menu();
            
            }else{
            
            System.out.println("\n..................... Cadastro de Professores ....................\n");
            
            for (int i=0; i<cadastroDeProfessores.size();i++){
                    cadastroDeProfessores.get(i).Exibir();          
            }
            System.out.println("\n..............................................................\n");
        }
        menu();
        
}
    
    public static void excluirCadastroDeAlunos(){
         Scanner ler = new Scanner(System.in);
         int del;
         
         System.out.println("\n.................... EXCLUIR UM CADASTRO DE ALUNO ......................\n");
         
         if(cadastroDeAlunos.size() == 0){
            System.out.println("\n ****Nenhum aluno cadastrado!**** \nPor favor, selecione a Opcao [1] para cadastrar novos alunos.\n");
            menu();
            }
            
            System.out.print("Digite a Matricula do Aluno: ");
                del = ler.nextInt();
         
         
         for (int i=0; i<cadastroDeAlunos.size();i++){
             if(del == cadastroDeAlunos.get(i).matricula){
                 System.out.println("Aluno "+ cadastroDeAlunos.get(i).nome + " removido com sucesso! Voltando ao Menu Inicial . . ." );
                 cadastroDeAlunos.remove(i);
                 menu();
             }
         }
     
    
    
    }
    public static void excluirCadastroDeProfessores(){
        Scanner ler = new Scanner(System.in);
         int del;
          System.out.println("\n.................... EXCLUIR UM CADASTRO DE PROFESSOR ......................\n");
          
         if(cadastroDeProfessores.size() == 0){
            System.out.println("\n ****Nenhum Professor cadastrado!**** \nPor favor, selecione a Opcao [2] para cadastrar novos Professores.\n\n");
            menu();
            }
            
            System.out.print("Digite o RA do Professor: ");
                del = ler.nextInt();
         
         
         for (int i=0; i<cadastroDeProfessores.size();i++){
             if(del == cadastroDeProfessores.get(i).RA){
                 System.out.println("Professor "+ cadastroDeProfessores.get(i).nome + " removido com sucesso!" );
                 cadastroDeProfessores.remove(i);
                 menu();
             }
         }
    }

    public static void modificarCadastroDeAlunos(){
        
        Scanner ler = new Scanner (System.in);
        
        int modif, select, novaMatricula;
        String novoNome;
        
        if(cadastroDeAlunos.size() == 0){
            System.out.println("\n ****Nenhum Aluno cadastrado!**** \nPor favor, selecione a Opcao [1] para cadastrar novos Alunos.\n\n");
            menu();
            }else{
            
            System.out.println("\n.............. MODIFICAR CADASTRO DE ALUNO ..............\n");
            
            System.out.print("Digite a Matricula do Aluno: ");
            modif = ler.nextInt();
            
            for (int i=0; i<cadastroDeAlunos.size();i++){
                if(modif == cadastroDeAlunos.get(i).matricula){
                    
                    
                    System.out.println("Selecione o campo do cadastro de " + cadastroDeAlunos.get(i).nome + " que deseja modificar: ");
                    System.out.println("-------- [1] - Modificar NOME -");
                    System.out.println("-------- [2] - Modificar MATRICULA -\n");
                    select = ler.nextInt();
                    
                    switch(select){
                        
                        case 1:
                            System.out.println("Digite o novo Nome: ");
                            novoNome = ler.nextLine();
                            cadastroDeAlunos.get(i).setNome(novoNome);
                            
                            System.out.println("Nome Atualizado!");
                            menu();
                        break;    
                        
                        case 2:
                            System.out.print("Didite nova Matricula: " );
                            novaMatricula = ler.nextInt();
                            cadastroDeAlunos.get(i).setMatricula(novaMatricula);
                            
                            System.out.println("Matricula Atualizada! ");
                            menu();
                        break;
                        
                        default :
                            System.out.println("ERRO! Opcao Invalida! Selecione [1] ou [2]\n");
                            modificarCadastroDeAlunos();   
                    }
                    
                    
                
            }else{
                    System.out.println("Matricula nao encontrada! Digite uma Matricula Valida.");
                    modificarCadastroDeAlunos();
                }
        }
    }   
        
   }
    public static void modificarCadastroDeProfessores(){
        
        Scanner ler = new Scanner (System.in);
        
        int modif, select, novoRA = 0;
        String novoNome = null;
        double novoSalario = 0;
        
        if(cadastroDeProfessores.size() == 0){
            System.out.println("\n ****Nenhum Professor cadastrado!**** \nPor favor, selecione a Opcao [2] para cadastrar novos Professores.\n\n");
            menu();
            
            }else{
            
            System.out.println("\n------------------MODOFICAR CADASTRO DE PROFESSORES -------------------\n");
            
            System.out.print("Digite o RA do Professor: ");
            modif = ler.nextInt();
            
            for (int i=0; i<cadastroDeProfessores.size();i++){
                if(modif == cadastroDeProfessores.get(i).RA){
                    
                    
                    System.out.println("Selecione o campo do cadastro de" + cadastroDeProfessores.get(i).nome + " que deseja modificar: ");
                    System.out.println("-------- [1] - Modificar NOME -");
                    System.out.println("-------- [2] - Modificar RA -");
                    System.out.println("-------- [3] - Modificar Salario -");
                    select = ler.nextInt();
                    
                    switch(select){
                        
                        case 1:
                            System.out.print("Digite o novo Nome: ");
                            cadastroDeProfessores.get(i).setNome(novoNome);
                            System.out.println("Nome modificado com sucesso!\n");
                            menu();
                        break;    
                        
                        case 2:
                            System.out.print("Didite nova RA: " );
                            cadastroDeProfessores.get(i).setRA(novoRA);
                            System.out.println("RA modificado com sucesso!");
                            menu();
                        break;
                        
                        case 3:
                            System.out.println("Informe o salario Atualizado: ");
                            cadastroDeProfessores.get(i).setSalario(novoSalario);
                            System.out.println("Salario Atualizado com sucesso!");
                            menu();
                        
                        default :
                            System.out.println("ERRO! Opcao Invalida! Selecione [1] , [2] ou [3]\n");
                            modificarCadastroDeProfessores();   
                    }
                    
                    
                
            }else{
                    System.out.println("Registro nao encontrado! Digite um RA Valido.");
                    modificarCadastroDeProfessores();
                }
        }
    }
    }
    
    public static void modificarNotasDeAlunos(){
       Scanner ler = new Scanner (System.in);
       
      int modif, select;
      
      float novoAV1 = 0 , novoAV2 = 0, novoAV3 = 0;
      
      if(cadastroDeAlunos.size() == 0){
            System.out.println("\n ****Nenhum Aluno cadastrado!**** \nPor favor, selecione a Opcao [1] para cadastrar novos Alunos.\n\n");
            menu();
            }else{
            
            System.out.println(".................. ATUALIZAR NOTAS DE ALUNOS ........................ ");
          
            System.out.print("Digite a Matricula do Aluno: ");
            modif = ler.nextInt();
            
            for (int i=0; i<cadastroDeAlunos.size();i++){
                if(modif == cadastroDeAlunos.get(i).matricula){
                    
                    System.out.print("Selecione a nota de " + cadastroDeAlunos.get(i).nome + " que deseja alterar: ");
                    System.out.print("\n[1] - AV1 \n[2] - AV2 \n[3] - AV3\n");
                    select = ler.nextInt();
                    
                    switch (select){
                        case 1: 
                            System.out.println("Nota atul da AV1: " + cadastroDeAlunos.get(i).nota1);
                            System.out.print("Informe a nota atualizada da AV1: ");
                            novoAV1 = ler.nextFloat();
                            cadastroDeAlunos.get(i).setNota1(novoAV1);
                            System.out.println("Nota da AV1 Atualizada!\n");
                            menu();
                        break;
                        
                        case 2: 
                            System.out.println("Nota atul da AV2: " + cadastroDeAlunos.get(i).nota2);
                            System.out.print("Informe a nota atualizada da AV2: ");
                            novoAV2 = ler.nextFloat();
                            cadastroDeAlunos.get(i).setNota2(novoAV2);
                            System.out.println("Nota da AV2 atualizada!\n");
                            menu();
                        break;
                        
                        case 3: 
                            System.out.println("Nota atul da AV3: " + cadastroDeAlunos.get(i).nota3);
                            System.out.print("Informe a nota atualizada da AV3: ");
                            novoAV3 = ler.nextFloat();
                            cadastroDeAlunos.get(i).setNota3(novoAV3);
                            System.out.println("Nota da AV3 Atualizada!\n");
                            menu();
                        break;
                    
                    
                    }
                    
                }else{
                    System.out.println("Aluno nao encontrado! Por favor, informe uma Matricula valida.");
                    modificarNotasDeAlunos();
                }
                    
                    
      }         
    }
}
}       
        
        
        

        
   
        
    
    

