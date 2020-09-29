import java.util.ArrayList;
import java.util.Scanner;
import Project.*;

/**
 *  Uma vez estruturada as classes, o usuário terá como escolher qual o 
 *  tipo de projeto (Hardware ou Software) ele deseja, em seguida o usuário fará 
 *  o cadastro de 3 projetos variados em um Vetor de Projetos. 
 *  As informações do vetor dos projetos serão impressas na tela ao final da execução. 
 */

public class App {
    static ArrayList<Project> Projects;
    static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int contador = 0;
        Projects = new ArrayList<Project>();

        String tiposDeProjetosPossiveis = "[Software ou Hardware]";
        System.out.println("Bem vindo usuário, vamos armazenar e listar seus projetos!");
        System.out.println();
        System.out.println("Vamos entrar em um looping onde você irá informar 3 projetos");
        System.out.println("*******************************************************************");

        while(contador < 3) {
            System.out.println("Preciso que você escolha algum tipo de projeto");
            System.out.print(tiposDeProjetosPossiveis + ": ");
            
            String opcao = sc.nextLine();
            
            if(opcao.isBlank()) continue;

            boolean deucerto = CriarProjeto(opcao);

            if(!deucerto) continue;

            contador++;
        }

        sc.close();

        ImprimirResultado();
    }

    public static boolean CriarProjeto(String tipo) {
        System.out.println("");
        System.out.print("Nome do projeto: ");
        String name = sc.nextLine();
        System.out.println("");
        System.out.print("Valor da hora trabalhada: ");
        double LabourHour = sc.nextDouble();
        System.out.println("");
        System.out.print("Horas trabalhadas: ");
        int hours = sc.nextInt();
        System.out.println("");

        switch (tipo.toLowerCase()) {
            case "software":
                System.out.print("Preço da lincença: ");
                double LicensesCost = sc.nextDouble();

                SoftwareProj softwareProject = new SoftwareProj(name, LabourHour, LicensesCost);
                softwareProject.setHours(hours);
                Projects.add(softwareProject);
                return true;
            case "hardware":
                System.out.print("Preço da lincença: ");
                double ComponentsCost = sc.nextDouble();

                HardwareProj hardwareProject = new HardwareProj(name, LabourHour, ComponentsCost);
                hardwareProject.setHours(hours);
                Projects.add(hardwareProject);
                return true;
            default:
                System.err.println("Opção inválida de projeto");
                return false;
        }
    }

    public static void ImprimirResultado() {
        Projects.forEach(projeto -> {
            System.out.println(projeto.Info());
        });
    }
}