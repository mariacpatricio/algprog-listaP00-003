import java.util.Scanner;

public class Ex02 {
    
    String nome, casa;
    int idade, coragem, inteligencia, ambicao, lealdade, criatividade, estrategia, grifinoria, sonserina, corvinal, lufalufa;
    
    public void exibirInformacoes() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Idade do aluno: " + idade);
        System.out.println("Coragem do aluno: " + coragem);
        System.out.println("Inteligência do aluno: " + inteligencia);
        System.out.println("Ambição do aluno: " + ambicao);
        System.out.println("Lealdade do aluno: " + lealdade);
        System.out.println("Criatividade do aluno: " + criatividade);
        System.out.println("Estratégia do aluno: " + estrategia);
    }
    
    public void calcularCasa() {
        grifinoria = (2*coragem) + lealdade;
        sonserina = (2*ambicao) + estrategia;
        corvinal = (2*inteligencia) + criatividade;
        lufalufa = ((2* lealdade) + (coragem)) / 3;
        
        int maior = grifinoria;
        casa = "Grifinória";
        
        if(sonserina > maior) {
            casa = "Sonserina";
            maior = sonserina;
        }
        
        if(corvinal > maior) {
            casa = "Corvinal";
            maior = corvinal;
        }
        
        if(lufalufa > maior) {
            casa = "Lufa-Lufa";
            maior = lufalufa;
        }
        
        System.out.println(nome + " foi enviado para " + casa + ".");
   }
 
    public static void main(String[] args) {
      
      Scanner leia = new Scanner(System.in);
      
      int continuar = 1;
      
      while(continuar == 1) {
          System.out.println("Gostaria de cadastrar um novo aluno? \n1 para SIM. \n0 para NÃO.");
          continuar = leia.nextInt();
          while(continuar != 1 && continuar != 0) {
              System.out.println("Digite 1 ou 0.");
              continuar = leia.nextInt();
          }
          
          if(continuar == 0) {
              break;
          }
          
          
          Hogwarts aluno = new Hogwarts();
          
          leia.nextLine();
          
          System.out.println("Digite o nome do aluno:");
          aluno.nome = leia.nextLine();
          
          System.out.println("Digite a idade do aluno:");
          aluno.idade = leia.nextInt();
          
          System.out.println("Digite a coragem do aluno:");
          aluno.coragem = leia.nextInt();
          
          System.out.println("Digite a inteligência do aluno:");
          aluno.inteligencia = leia.nextInt();
          
          System.out.println("Digite a ambição do aluno:");
          aluno.ambicao = leia.nextInt();
          
          System.out.println("Digite a lealdade do aluno:");
          aluno.lealdade = leia.nextInt();
          
          System.out.println("Digite a criatividade do aluno:");
          aluno.criatividade = leia.nextInt();
          
          System.out.println("Digite a estratégia do aluno:");
          aluno.estrategia = leia.nextInt();
          
          aluno.exibirInformacoes();
          aluno.calcularCasa();
      }
      
      leia.close();
    
    }
}
