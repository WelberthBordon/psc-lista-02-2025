import java.util.Scanner;
    

    public class ViagemEurotrip {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço da viagem para a Alemanha: ");
        double precoAlemanha = scanner.nextDouble();

        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();

        System.out.print("Digite o preço da viagem para a Itália: ");
        double precoItalia = scanner.nextDouble();

        System.out.print("Digite a quantidade de pessoas que irão para a Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.print("Digite a quantidade de pessoas que irão para Portugal: ");
        int pessoasPortugal = scanner.nextInt();

        System.out.print("Digite a quantidade de pessoas que irão para a Itália: ");
        int pessoasItalia = scanner.nextInt();

        
        double totalViagem = (precoAlemanha * pessoasAlemanha) + 
                             (precoPortugal * pessoasPortugal) + 
                             (precoItalia * pessoasItalia);

        // Exibe o resultado
        System.out.println("O custo total da viagem para todos os destinos é: R$ " + totalViagem);

        scanner.close();
    }
}
