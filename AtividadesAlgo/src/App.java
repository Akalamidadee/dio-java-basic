import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int idadeTotal = LerIdade();
        System.out.println(+idadeTotal);
    }
    //7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade 
    //dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 
    //1.fazer uma função para o usuario digitar 
    //1.1ler a idade da pessoa em anos,meses e dias
    //1.2 retornar essa idade 
    public static int LerIdade() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite sua idade em anos");
        System.out.println("Digite sua em meses ");
        System.out.println("Digite sua em dias");
        int idadeTotal = teclado.nextInt();
        return idadeTotal;

    }
    
}

// -> DICA: Nome de variaveis sempre comecam com letra minuscula :D
// -> DICA: Nome de funcoes sempre devem seguir o padrao CamelCase (ex: LerIdade, VerificarSeExisteOuNao) :D
// -> DICA: Lembrar do ESCOPO (uma variavel so existe onde ela foi declarada)
// -> 