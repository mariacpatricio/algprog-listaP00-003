import java.util.Scanner;

public class Ex01 {
    
    private String nome, sobrenome;
    private int idade;
    private double altura, peso, imc;
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    
    public int setIdade(int idade) {
        return this.idade = idade;
    }
    
    public double setAltura(double altura) {
        return this.altura = altura;
    }
    
    public double setPeso(double peso) {
        return this.peso = peso;
    }
    
    public Pessoa(String nome, String sobrenome, int idade, double peso, double altura) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double calculaIMC(double peso, double altura) {
        return this.imc = peso / Math.pow(altura, 2);
    }
    
    public void informaObesidade() {
        if(this.imc < 18.5) {
            System.out.println("Abaixo do peso.");
        }
        
        else if(this.imc < 25) {
            System.out.println("Peso normal");
        }
        
        else if(this.imc < 30) {
            System.out.println("Sobrepeso");
        }
        
        else if(this.imc < 35) {
            System.out.println("Obesidade Grau 1");
        }
        
        else if(this.imc < 40) {
            System.out.println("Obesidade Grau 2");
        }
        
        else {
            System.out.println("Obesidade Grau 3");
        }
        
    }
   
    public static void main(String[] args) {
        
          String nome, sobrenome;
          int idade;
          double altura, peso;
          
          Scanner veja = new Scanner(System.in);
          
          System.out.println("Qual seu nome?");
          nome = veja.nextLine();
          
          System.out.println("Qual seu sobrenome?");
          sobrenome = veja.nextLine();
          
          System.out.println("Qual sua idade?");
          idade = veja.nextInt();
          
          System.out.println("Qual seu peso?");
          peso = veja.nextDouble();
          
          System.out.println("Qual sua altura?");
          altura = veja.nextDouble();
          
          Pessoa pessoa = new Pessoa(nome, sobrenome, idade, peso, altura);
          
          System.out.println("Seu IMC é: " + pessoa.calculaIMC(peso, altura));
          pessoa.informaObesidade();
          
          veja.close();

    }
}
