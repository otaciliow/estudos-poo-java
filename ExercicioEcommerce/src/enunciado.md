# [PROJ-1024] Implementação do Módulo Core do Carrinho e Precificação de Pedidos

**Tipo:** Story (História de Usuário)  
**Epic:** Módulo de Vendas & Checkout  
**Prioridade:** Média  
**Estimativa:** 5 Story Points / 3 Dias  
**Assignee:** [Seu Nome]

---

### 📖 Descrição da Demanda
Como **cliente da plataforma de E-commerce**,  
Eu quero **adicionar produtos (físicos e digitais) ao meu carrinho e visualizar o cálculo correto do valor final de cada item**,  
Para que **eu possa fechar um pedido com transparência nos custos de frete e descontos aplicados.**

---

### 🎯 Objetivos Técnicos
Estruturar o domínio inicial do sistema de catálogo e checkout em Java, aplicando boas práticas de Programação Orientada a Objetos para garantir que novos tipos de produtos e regras de pagamento possam ser adicionados futuramente sem impacto na arquitetura existente.

---

### ⚙️ Regras de Negócio (Business Rules)

1. **Gestão de Produtos:**
    * **Produtos Físicos:** O valor final é composto pelo `preço base` + `taxa de frete base` + (`peso em kg` × R$ 2,00 por kg adicional acima de 1kg).
    * **Produtos Digitais:** Não possuem custo de envio, e produtos digitais recebem um `desconto fixo automático de 10%` sobre o preço base.
    * **Segurança e Consistência:** Um produto não pode ter preço base negativo nem zero.

2. **Gestão de Pedidos e Clientes:**
    * Um pedido deve obrigatoriamente ter um `Cliente` associado e uma lista de itens.
    * O pedido deve recalcular e retornar o total acumulado somando o valor final de todos os seus itens.

---

### 📋 Critérios de Aceite (Definition of Done - DoD)

- [ ] **Encapsulamento:** Todos os atributos de domínio (`Produto`, `Cliente`, `Pedido`) devem ser privados com acessores/modificadores adequados e validações de integridade nos *setters* ou *constructors*.
- [ ] **Modelo de Dados Abstrato:** A classe `Produto` deve ser abstrata, garantindo que nenhum produto "genérico" seja instanciado diretamente no sistema.
- [ ] **Polimorfismo:** O método `calcularPrecoFinal()` deve ser sobrescrito em `ProdutoFisico` e `ProdutoDigital`, respeitando suas respectivas regras de negócio sem chamadas explícitas de `if/else` ou verificação de tipo (`instanceof`).
- [ ] **Testes de Integração / Execução (Main ou Testes Unitários):** Criar um fluxo básico instanciando um cliente, 2 produtos físicos e 1 produto digital, vinculando-os a um pedido e imprimindo o extrato do pedido no console.
- [ ] **Repositório:** Código commitado no Git seguindo a convenção de commits (`feat: adiciona modelo de produtos e cálculo de pedido`).

---

### 📐 Arquitetura / Arquivo de Referência
> 💡 *Dica do Tech Lead:* Verifique o arquivo de modelagem `uml_ecommerce.md` disponível no diretório `/docs` do repositório para conferir os nomes dos métodos e o relacionamento das entidades antes de iniciar o código.