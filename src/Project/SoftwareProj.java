package Project;

/**
 * 
* Elabore uma classe chamada **SoftwareProj** subclasse de Project acordo com as informações abaixo:


**Variáveis da Classe:**
```
LicensesCost= armazena o custo gasto com aquisição de licenças de software;
```

**Métodos da Classe:**
```
CurrentCost= função override que retorna o custo atual do projeto de 
Hardware (Horas Trabalhadas x Custo da Hora + Custos de Licenças);
Info= função override que retorna uma string contendo todas as informações 
referentes ao projeto (Nome, Custo da Hora, Horas Trabalhadas e Custo Atual);
 */

public class SoftwareProj extends Project {
    protected double LicensesCost;

    public SoftwareProj(String name, double LabourHour) {
        super(name, LabourHour);
    }

    public SoftwareProj(String name, double LabourHour, double LicensesCost) {
        super(name, LabourHour);
        this.LicensesCost = LicensesCost;
    }

    @Override
    public double CurrentCost() {
        return ((this.Hours * this.LabourHour) + this.LicensesCost);
    }

    @Override
    public String Info() {
        return "[ " 
            + this.name + " ] = Custo Hora(" + this.LabourHour + ")" 
            + ", Horas Trabalhadas(" + this.Hours + ")" 
            + " e Custo Atual(" + this.CurrentCost() + ")";
    }

    public double getLicensesCost() {
        return LicensesCost;
    }

    public void setLicensesCost(double licensesCost) {
        LicensesCost = licensesCost;
    }

}
