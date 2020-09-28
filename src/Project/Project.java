package Project;

/**
 * Project
 */
public abstract class Project{
    protected String name;
    protected double LabourHour;
    protected int Hours;

    /**
     * Construtor = método construtor da classe 
     * (executado para a criação do objeto), nele devem ser atribuídos o nome do projeto e o custo da hora do projeto;
     */

    public Project(String name, double LabourHour) {
        this.name = name;
        this.LabourHour = LabourHour;
        this.Hours = 0;
    }

//   AddHours= método que registrará a hora passada como parâmetro na variável Horas pertencente a classe;
    public void addHours(int hours) {
        this.Hours += hours;
    }

//  CurrentCost= método abstrato que retorna um double*;
    public abstract double CurrentCost();

//  Info = método abstrato que retorna uma String;
    public abstract String Info();

}