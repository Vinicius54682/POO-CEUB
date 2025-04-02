import java.util.Scanner;

public class CalculadoraIMC {

    // Função para calcular o IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Função para analisar o IMC
    public static String analisarIMC(double imc) {
        if (imc < 18.5) {
            return "Baixo peso. É recomendado procurar um médico para avaliação criteriosa do resultado.";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal.";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso. O sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Consulte um médico.";
        } else if (imc >= 30 && imc <= 34.9) {
            return "Obesidade grau I. Busque orientação médica e nutricional.";
        } else if (imc >= 35 && imc <= 39.9) {
            return "Obesidade grau II. Não se deve atrasar a busca por orientação médica e nutricional.";
        } else {
            return "Obesidade grau III. A chance de doenças associadas é mais elevada. É fundamental buscar orientação médica.";
        }
    }

    // Função principal
    public static void main(String[] args) {
        // Scanner para ler dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar dados ao usuário
        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = calcularIMC(peso, altura);

        // Análise do IMC
        String analise = analisarIMC(imc);

        // Exibição do resultado
        System.out.println("\nResultado do IMC:");
        System.out.println("Nome: " + nome);
        System.out.printf("IMC: %.2f\n", imc);
        System.out.println("Análise: " + analise);

        // Fechar o scanner
        scanner.close();
    }
}