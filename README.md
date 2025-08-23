Sistema de Pedidos de Pizza com Padrão Decorator

Este projeto demonstra a aplicação do padrão de design Decorator em um sistema simples de pedidos de pizza. O objetivo principal é ilustrar como funcionalidades adicionais (ingredientes) podem ser adicionadas dinamicamente a um objeto base (pizza) sem alterar sua estrutura original, promovendo flexibilidade e extensibilidade.

Funcionalidades
Criação de Pizzas Base: Definição de pizzas com diferentes tipos de massa (fina, grossa) e preço base.
Adição Dinâmica de Ingredientes: Utilização do padrão Decorator para adicionar ingredientes como queijo extra, bacon e ovo, modificando a descrição e o preço da pizza em tempo de execução.
Cálculo de Preço e Descrição: Cada ingrediente adicionado atualiza o preço total e a descrição da pizza de forma incremental.

Estrutura do Projeto
O projeto é organizado da seguinte forma:
com.pizzariachief.pedidos.application: Contém a classe Main para demonstrar o uso do sistema.
com.pizzariachief.pedidos.model: Define a interface Pizza, a classe PizzaBase e o enum TipoDeMassa.
com.pizzariachief.pedidos.model.decorators: Contém a classe abstrata IngredienteDecorator e as implementações concretas dos decoradores para cada ingrediente (Bacon, Ovo, Queijo).

Tecnologias Utilizadas:
Java

Padrão de Design: Decorator
