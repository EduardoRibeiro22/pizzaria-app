# 🍕 Sistema de Pedidos de Pizza com Padrão Decorator

## 📖 Descrição

Este projeto é uma aplicação desenvolvida em **Java** com o objetivo de demonstrar, de forma prática, a aplicação do **padrão de design Decorator** em um sistema de pedidos de pizza. O foco está em mostrar como funcionalidades adicionais podem ser adicionadas dinamicamente a um objeto base, sem a necessidade de alterar sua estrutura original.

---

## 🎯 Objetivo do Projeto

O projeto tem caráter **educacional**, sendo utilizado para:

* Compreender o funcionamento do **padrão Decorator**
* Aplicar conceitos de **orientação a objetos**
* Promover **flexibilidade e extensibilidade** no código
* Evitar modificações diretas em classes base

---

## 🧭 Funcionalidades

* **Criação de pizzas base**
  Definição de pizzas com diferentes tipos de massa (fina ou grossa) e preço inicial.

* **Adição dinâmica de ingredientes**
  Inclusão de ingredientes como queijo, bacon e ovo utilizando o padrão Decorator, permitindo a combinação livre de adicionais.

* **Cálculo incremental de preço e descrição**
  Cada ingrediente adicionado altera dinamicamente o valor total e a descrição final da pizza.

---

## 🧩 Arquitetura e Padrão de Projeto

O sistema utiliza o **padrão de design Decorator**, permitindo que novos comportamentos sejam adicionados a um objeto em tempo de execução, sem alterar o código existente.

### Benefícios aplicados:

* Baixo acoplamento
* Código extensível
* Facilidade de manutenção

---

## 📂 Estrutura do Projeto

```
com.pizzariachief.pedidos
 ├── application
 │   └── Main.java
 ├── model
 │   ├── Pizza.java
 │   ├── PizzaBase.java
 │   └── TipoDeMassa.java
 └── model.decorators
     ├── IngredienteDecorator.java
     ├── Bacon.java
     ├── Ovo.java
     └── Queijo.java
```

---

## 🛠️ Tecnologias Utilizadas

* **Java**

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone <url-do-repositorio>
```

2. Abra o projeto em sua IDE Java de preferência.

3. Execute a classe `Main` para visualizar o funcionamento do sistema.

---

## 🧠 Exemplo de Uso (Conceitual)

* Criar uma pizza base
* Adicionar ingredientes dinamicamente
* Obter a descrição final e o valor total do pedido

---

## 👤 Autor

**Eduardo Ribeiro**
Projeto desenvolvido para fins de estudo dos padrões de projeto em Java.

---

## 📄 Licença

Este projeto é de uso livre para fins educacionais.
