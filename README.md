# Geral

Interessantes os `enum`s do Java. Não são exatamente como constantes. São `semelhantes` (não iguais) a classes. Diferenças principais:

- São declarados no início como `enum`e não como `class`;
- Nos exemplos que vi o construtor é setado como `private`;
- Tem métodos diversos setters como as classes;
- Podem ter mais de uma propriedade, ou seja, não é uma lista de diferentes valores string. Veja o `enum` EstadoEnum
- Seus valores são declarados dentro do próprio enum chamando o contrutor privado. Veja o exemplo do EstadoEnum. 
