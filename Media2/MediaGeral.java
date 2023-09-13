import java.util.Scanner;

public class MediaGeral {

    public static void main(String[] args){
    System.out.println("Tudo bem... Vamos calcular sua media geral deste ano");
    Scanner scanner = new Scanner(System.in);

    //Primeiro Bimestre:
    System.out.println("Então... qual foi sua nota do primeiro bimestre?");
    double nota1 = scanner.nextDouble();
    System.out.println("Entendo... Sua primeira nota foi " + nota1);

    //Segundo Bimestre:
    System.out.println("E a do segundo? Qual foi o valor?");
    double nota2 = scanner.nextDouble();
    System.out.println(nota2 +" ? Ok... Vamos prosseguir");

    //Terceiro Bimestre:
    System.out.println("O terceiro agora... Me de a nota");
    double nota3 = scanner.nextDouble();
    System.out.println("Sua nota no terceiro bimestre foi " +nota3 +" ? Então podemos prosseguir");

    //Quarto Bimestre:
    System.out.print("Estamos quase terminando... A do quarto agora");
    double nota4 = scanner.nextDouble();
    System.out.println("Otimo... Podemos iniciar o calculo agora");
    
    scanner.close();

    //Calculo Da Nota:
    double calculo = (nota1 + nota2 + nota3 + nota4)/4.0;
    System.out.println("Sua media geral é " + calculo);

    //Conclusão:
    if (calculo >= 7){
        System.out.println("Aprovado(a)");
    }
    else if(calculo >= 5 && calculo <7){
        System.out.println("Recuperação");
    }
    else{
        System.out.println("Reprovado(a)");
    }


    }
    
}
