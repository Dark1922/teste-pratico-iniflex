# 📌 Teste Prático – Iniflex

Projeto desenvolvido em **Java** para atender ao desafio técnico proposto pela Iniflex.

---

## 🚀 Objetivo
Implementar um sistema simples para gerenciar **funcionários de uma indústria**, aplicando **POO (Programação Orientada a Objetos)**, boas práticas de **Clean Code**, e uso de **Java moderno (Streams, LocalDate, BigDecimal, Optional, etc.)**.

---

## 📂 Estrutura do Projeto

src/
└── br/com/iniflex/
├── domain/model
│ ├── Pessoa.java
│ └── Funcionario.java
│
├── service/
│ ├── FuncionarioService.java
│ └── RelatorioService.java
│
├── util/
│ ├── DataUtil.java
│ └── MoedaUtil.java
│
└── application/
└── Compiler.java


---

## 📝 Requisitos Atendidos

- **1.** Criar classe `Pessoa` com atributos:
  - `nome` (String)  
  - `dataNascimento` (LocalDate)

- **2.** Criar classe `Funcionario` que **herda de Pessoa**, com atributos:
  - `salario` (BigDecimal)  
  - `funcao` (String)

- **3.** Implementar `Principal.java` executando:

  - **3.1** Inserir todos os funcionários (mesma ordem da tabela do enunciado)  
  - **3.2** Remover funcionário **João** da lista  
  - **3.3** Imprimir funcionários com:
    - Data no formato `dd/MM/yyyy`
    - Valores monetários com separador de milhar e vírgula decimal (`#,###.##`)  
  - **3.4** Aplicar aumento de **10%** no salário de todos os funcionários  
  - **3.5** Agrupar funcionários por função em um `Map<String, List<Funcionario>>`  
  - **3.6** Imprimir agrupados por função  
  - **3.8** Listar funcionários que fazem aniversário em **outubro (10)** e **dezembro (12)**  
  - **3.9** Exibir **funcionário mais velho** (nome e idade)  
  - **3.10** Listar funcionários em **ordem alfabética**  
  - **3.11** Calcular **total dos salários**  
  - **3.12** Calcular **quantos salários mínimos** cada funcionário ganha  
    - Considerando salário mínimo = **R$ 1.212,00**

---

## 🛠️ Tecnologias Utilizadas
- **Java 17+**  
- **Paradigma OO (Orientação a Objetos)**  
- **Streams API / Optional / Comparator**  
- **BigDecimal** para cálculos monetários  
- **LocalDate / Period** para manipulação de datas  
- **Map / Collectors** para agrupamentos  

---

## ▶️ Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/iniflex-teste.git

Importe o projeto em sua IDE favorita (Eclipse/IntelliJ/VSCode).

Compile e execute a classe:

br.com.iniflex.application.Compiler.java




---- Funcionários ----
Maria | 18/10/2000 | R$ 2.009,44 | Operador
Caio  | 02/05/1961 | R$ 9.836,14 | Coordenador
...

---- Funcionários agrupados por função ----
Operador:
 - Maria
 - Heitor
...

Mais velho: Caio - 62 anos
Total salários: R$ 56.000,00
