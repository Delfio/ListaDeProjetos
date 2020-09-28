# Trabalho Project

## Desafios

### Primeiro
* Implemente um programa em java console com as seguintes instruções:  
Uma classe chamada Project de acordo com as informações abaixo:

**Atributos da Classe:**
```
Name = armazena o nome do projeto;
LabourHour = armazena o custo relativo a uma hora trabalhada no projeto;
Hours= armazena a quantidade de horas totais trabalhadas no projeto.
```

**Métodos da Classe:**
```
Construtor = método construtor da classe (executado para a criação do objeto), nele devem ser atribuídos o nome do projeto e o custo da hora do projeto;
AddHours= método que registrará a hora passada como parâmetro na variável Horas pertencente a classe;
CurrentCost= método abstrato que retorna um double*;
Info = método abstrato que retorna uma String*;
```

### Segundo

* Elabore uma classe chamada **HardwareProj** subclasse de Project acordo com as informações abaixo:

**Atributos da Classe:**
```
ComponentsCost = armazena o custo com componentes de hardware;
```

**Métodos da Classe:**
```
CurrentCost= método override que retorna o custo atual do projeto de Hardware (Horas Trabalhadas x Custo da Hora + Custos Componentes);
Info = método override que retorna uma string contendo todas as informações referentes ao projeto (Nome, Custo da Hora, Horas Trabalhadas e Custo Atual);
```

### Terceiro

* Elabore uma classe chamada **SoftwareProj** subclasse de Project acordo com as informações abaixo:


**Variáveis da Classe:**
```
LicensesCost= armazena o custo gasto com aquisição de licenças de software;
```

**Métodos da Classe:**
```
CurrentCost= função override que retorna o custo atual do projeto de Hardware (Horas Trabalhadas x Custo da Hora + Custos de Licenças);
Info= função override que retorna uma string contendo todas as informações referentes ao projeto (Nome, Custo da Hora, Horas Trabalhadas e Custo Atual);
```

### Quarto
* Uma vez estruturada as classes, o usuário terá como escolher qual o tipo de projeto (Hardware ou Software) ele deseja, em seguida o usuário fará o cadastro de 3 projetos variados em um Vetor de Projetos. As informações do vetor dos projetos serão impressas na tela ao final da execução. 