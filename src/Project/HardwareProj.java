package Project;

/**
 * 
**Atributos da Classe:**
```
ComponentsCost = armazena o custo com componentes de hardware;
```

**Métodos da Classe:**
```
CurrentCost= método override que retorna o custo atual do projeto de 
Hardware (Horas Trabalhadas x Custo da Hora + Custos Componentes);

Info = método override que retorna uma string contendo todas as informações 
referentes ao projeto (Nome, Custo da Hora, Horas Trabalhadas e Custo Atual);
 */

public class HardwareProj extends Project {
    protected double ComponentsCost;

    public HardwareProj(String name, double LabourHour) {
        super(name, LabourHour);
    }

    public HardwareProj(String name, double LabourHour, double ComponentsCost) {
        super(name, LabourHour);
        this.ComponentsCost = ComponentsCost;
    }

    @Override
    public double CurrentCost() {
        return ((this.Hours * this.LabourHour) + this.ComponentsCost);
    }

    @Override
    public String Info() {
        return "[ " 
            + this.name + " ] = Custo Hora(" + this.LabourHour + ")" 
            + ", Horas Trabalhadas(" + this.Hours + ")" 
            + " e Custo Atual(" + this.CurrentCost() + ")";
    }

    public double getComponentsCost() {
        return ComponentsCost;
    }

    public void setComponentsCost(double componentsCost) {
        ComponentsCost = componentsCost;
    }
}
