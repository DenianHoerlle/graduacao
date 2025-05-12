import java.util.Scanner;

public class provaGrauA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bem vindo à FakeIT!");
        
        int option = 0;
        int jrs = 0, mds = 0, srs = 0, specs = 0;
        
        while (option != 9) {
            mostraMenu();
            option = scan.nextInt();
    
            if (option == 1) {
                jrs += insereDev(option);
            } else if (option == 2) {
                mds += insereDev(option);
            } else if (option == 3) {
                srs += insereDev(option);
            } else if (option == 4) {
                specs += insereDev(option);
            } else if (option == 5) {
                if (jrs == 0 && mds == 0 && srs == 0 && specs == 0) {
                    System.out.println("Infelizmente, não é possível fazer um orçamento sem antes ter adicionado ao menos um desenvolvedor");
                } else {
                    calculaOrcamento(jrs, mds, srs, specs);
                }
            } else if (option == 9) {
                System.out.println("A FakeIT agradece sua visita!");
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }
    }
    
    public static void mostraMenu() {
        System.out.println("\n1 - Adicionar dev. Jr. - Valor hora: R$ 30");
        System.out.println("2 - Adicionar dev. Pl. - Valor hora: R$ 50");
        System.out.println("3 - Adicionar dev. Sr. - Valor hora: R$ 70");
        System.out.println("4 - Adicionar dev. Esp. - Valor hora: R$ 100");
        System.out.println("5 - Fazer orçamento");
        System.out.println("9 - Sair");
    }
    
    public static int insereDev(int option) {
        Scanner scan = new Scanner(System.in);
        
        String tipoDeDev = "especialista";
        if (option == 1) {
            tipoDeDev = "junior";
        } else if (option == 2) {
            tipoDeDev = "pleno";
        } else if (option == 3) {
            tipoDeDev = "senior";
        }
        
        System.out.println("Quantos devs " + tipoDeDev + " você quer adicionar ao projeto?");
        
        return scan.nextInt();
    }
    
    public static void calculaOrcamento(int jrs, int mds, int srs,int specs) {
        int hourlyCost = 0, hourlyProfit = 0;
        
        hourlyCost = (jrs * 45) + (mds * 75) + (srs * 140) + (specs * 250);
        hourlyProfit = (jrs * 15) + (mds * 25) + (srs * 70) + (specs * 150);
        
        System.out.println("O custo mensal da equipe é de R$" + hourlyCost * 160);
        System.out.println("O lucro mensal da FakeIT é de R$" + hourlyProfit * 160);
    }
}