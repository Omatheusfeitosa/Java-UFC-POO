# 🥊 Sistema UFC em Java

Sistema de gerenciamento de lutas de UFC desenvolvido em Java utilizando Programação Orientada a Objetos (POO).

O projeto permite:

- Cadastro de lutadores
- Visualização de lutadores
- Cadastro de lutas
- Realização de lutas
- Controle de vitórias, derrotas e empates
- Sistema de categorias por peso
- Controle de árbitros
- Limpeza de console
- Menus interativos no terminal

---

# 📚 Conceitos aplicados

Este projeto utiliza diversos conceitos importantes de Java e POO:

- Herança
- Encapsulamento
- Abstração
- Polimorfismo básico
- Listas (`ArrayList`)
- Métodos estáticos
- Classes abstratas
- Organização em objetos
- Randomização
- Tratamento de responsabilidades

---

# 🗂️ Estrutura do Projeto

```bash
src/
│
├── Main.java
├── Pessoa.java
├── Lutador.java
├── Luta.java
├── Arbitro.java
└── Console.java
```

---

# 🚀 Funcionalidades

## 👊 Lutadores

- Cadastro de lutadores
- Exibição de informações
- Sistema automático de categorias
- Controle de:
  - Vitórias
  - Derrotas
  - Empates

---

## 🥋 Categorias disponíveis

| Categoria | Peso |
|---|---|
| Mosca | até 56.7kg |
| Galo | até 61.2kg |
| Pena | até 65.8kg |
| Leve | até 70.3kg |
| Meio-Médio | até 77.1kg |
| Médio | até 83.9kg |
| Meio-Pesado | até 93kg |
| Pesado | até 120.2kg |

---

## ⚔️ Lutas

- Exibição das lutas
- Realização aleatória da luta
- Controle do vencedor
- Possibilidade de empate
- Controle de status da luta
- Controle de rounds

---

## 👨‍⚖️ Árbitros

- Cadastro de árbitros
- Controle de arbitragens realizadas

---

# 🧠 Estrutura das Classes

## Pessoa

Classe abstrata base do sistema.

### Atributos

- nome
- nacionalidade
- idade
- altura

---

## Lutador

Herda de `Pessoa`.

### Atributos

- id
- categoria
- peso
- vitórias
- derrotas
- empates

### Métodos

- ganharLuta()
- perderLuta()
- empatarLuta()
- apresentarLutador()
- statusLutador()

---

## Luta

Responsável pelas lutas.

### Atributos

- desafiante
- desafiado
- vencedor
- árbitro
- rounds
- status

### Métodos

- realizarLuta()
- verLuta()
- apresentarLuta()
- statusLuta()

---

## Arbitro

Herda de `Pessoa`.

### Métodos

- aumentarArbitragens()
- apresentarArbitro()

---

## Console

Classe utilitária para limpar o terminal.

### Método

- limpar()

---

# ▶️ Como executar

## 1. Clone o repositório

```bash
git clone a https://github.com/Omatheusfeitosa/Java-UFC-POO/tree/main/UFC_POO-main
```

---

## 2. Entre na pasta

```bash
cd nome-do-projeto
```

---

## 3. Compile os arquivos

```bash
javac *.java
```

---

## 4. Execute o sistema

```bash
java Main
```

---

# 💻 Exemplo do Menu

```text
===== MENU PRINCIPAL =====

1 - Mostrar Lutadores
2 - Mostrar Lutas
3 - Realizar Luta
0 - Sair
```

---

# 🔥 Melhorias futuras

- Persistência em arquivos
- Banco de dados MySQL
- JDBC
- Ranking de lutadores
- Cadastro de árbitros pelo sistema
- Interface gráfica JavaFX
- API REST com Spring Boot
- Sistema de cinturões
- Histórico de lutas

---

# 🛠️ Tecnologias utilizadas

- Java
- Programação Orientada a Objetos
- ArrayList
- Scanner
- Random

---

# 📖 Aprendizados

Este projeto foi desenvolvido para praticar:

- Estruturação de projetos Java
- Orientação a Objetos
- Organização de código
- Lógica de programação
- Manipulação de listas
- Menus interativos no terminal

---

# 👨‍💻 Autor

Projeto desenvolvido por Matheus Feitosa.
