# Sistema de Loja (Herança e Polimorfismo)


#### Sistema de loja em Java com 3 tipos de usuários: `Vendedor`, `Atendente` e `Gerente`, que compartilham uma classe mãe chamada `Usuario`.
#### Projeto de herança e polimorfismo do Bootcamp Itaú - Java com IA da DIO

## O que o projeto pratica

- Herança (`Gerente`, `Vendedor` e `Atendente` estendem `Usuario`)
- Encapsulamento (atributos `private`, sem setters soltos)
- Interface (`ConsultorDeVendas`)
- Polimorfismo (array de `Usuario` com 3 tipos diferentes)

## Estrutura de Classes

```
Usuario
  ├── Gerente  (implementa ConsultorDeVendas)
  ├── Vendedor (implementa ConsultorDeVendas)
  └── Atendente
```





## Como rodar

1. Clone o repositório.
2. Abra o projeto no IntelliJ IDEA (JDK 21).
3. Execute a classe `Main`


## Exemplo de saída
```
--- Gerente ---

Você não está logado!
Login realizado com sucesso!
Relatório gerado com sucesso!
```
