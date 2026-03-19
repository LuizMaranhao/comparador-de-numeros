import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

/**
 * Aplicativo de linha de comando que compara dois números inteiros
 * e informa qual é o maior, ou se são iguais.
 * Possui loop de reinício: pergunta ao usuário se deseja comparar novamente.
 *
 * @author Seu Nome
 * @version 2.0
 */
public class ComparadorNumeros {

    public static void main(String[] args) {

        // =============================================
        // FASE A: Preparação — criando o Scanner
        // =============================================

        // Scanner é a ferramenta que "ouve" o que o usuário digita no terminal.
        // Criamos ele UMA vez fora do loop para reutilizar em todas as rodadas.
        Scanner teclado = new Scanner(System.in);

        // Variável que controla se o loop deve continuar.
        // Começa como "s" (sim) para garantir que o programa rode ao menos uma vez.
        String resposta = "s";

        // =============================================
        // LOOP PRINCIPAL — do-while
        // =============================================

        // do-while executa o bloco PRIMEIRO e só verifica a condição no final.
        // Isso garante que o programa rode pelo menos uma vez antes de perguntar
        // se o usuário quer repetir.
        do {

            // =========================================
            // FASE B: Coleta de dados
            // =========================================

            System.out.println("\n================================");
            System.out.println("   === Sistema de Comparação ===");
            System.out.println("================================");

            // Pede e armazena o primeiro número
            System.out.print("Digite o primeiro número: ");
            int num1 = teclado.nextInt();

            // Pede e armazena o segundo número
            System.out.print("Digite o segundo número: ");
            int num2 = teclado.nextInt();

            // =========================================
            // FASE C: Lógica de comparação (o "cérebro")
            // =========================================

            if (num1 > num2) {
                // Cenário 1: o primeiro número é estritamente maior que o segundo
                System.out.println("\nResultado: O maior número é: " + num1 + ".");

            } else if (num2 > num1) {
                // Cenário 2: o segundo número é estritamente maior que o primeiro
                System.out.println("\nResultado: O maior número é: " + num2 + ".");

            } else {
                // Cenário 3: se nenhum é maior, os dois são necessariamente iguais
                System.out.println("\nResultado: Os dois números são iguais: " + num1 + ".");
            }

            // =========================================
            // PERGUNTA DE REINÍCIO
            // =========================================

            // Limpa o buffer do teclado antes de ler a resposta (texto).
            // nextInt() deixa um '\n' sobrando — nextLine() o descarta.
            teclado.nextLine();

            System.out.print("\nDeseja comparar novamente? (s/n): ");
            resposta = teclado.nextLine().trim().toLowerCase();
            // .trim()        → remove espaços acidentais antes/depois
            // .toLowerCase() → aceita "S", "Sim", "s" como válidos

        } while (resposta.equals("s")); // continua enquanto o usuário digitar "s"

        // =============================================
        // FASE D: Finalização
        // =============================================

        // Mensagem de encerramento exibida quando o usuário opta por sair
        System.out.println("\nObrigado por usar o Sistema de Comparação. Até logo!");

        // Fecha o Scanner para liberar o recurso do sistema.
        teclado.close();

    } // fim do método main

} // fim da classe ComparadorNumeros