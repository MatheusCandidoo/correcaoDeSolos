# correcaoDeSolos

### Cloc GERAL do projeto antes das melhorias

| Language | files | blank | comment | code |
| -------- | ----- | ----- | ------- | ---- |
| Java     | 10    | 81    | 10      | 315  |
| Maven    | 1     | 6     | 4       | 65   |
| XML      | 1     | 0     | 0       | 16   |
| SUM:     | 12    | 87    | 14      | 396  |

### Problemas identificados

- Removido validações que ocorriam na planilha - [commit](https://github.com/LuizHNRQ/correcaoDeSolos/commit/ae1489649c926b0c0f7612f4174cd21ee1e0a999)
- Removido validação condicional do enum - [commit](https://github.com/LuizHNRQ/correcaoDeSolos/commit/d98d90bfe6e60b25105bdc73539263f2b1a8600b)
- Removido validação de retorno condicional else - [commit](https://github.com/LuizHNRQ/correcaoDeSolos/commit/6c2055762c3b665dabc4ba50f6a727260b7db72e)
- Removido código desnecessário de dados da análise - [commit](https://github.com/LuizHNRQ/correcaoDeSolos/commit/6c2055762c3b665dabc4ba50f6a727260b7db72e)

### Cloc GERAL do projeto depois das melhorias

| Language | files | blank | comment | code |
| -------- | ----- | ----- | ------- | ---- |
| Java     | 9     | 60    | 10      | 226  |
| Maven    | 1     | 6     | 4       | 65   |
| XML      | 1     | 0     | 0       | 16   |
| Markdown | 1     | 4     | 0       | 8    |
| SUM:     | 12    | 70    | 14      | 315  |

---

### Cloc ESPECÍFICO do código criado antes das melhorias

| Language | files | blank | comment | code |
| -------- | ----- | ----- | ------- | ---- |
| Java     | 7     | 56    | 4       | 304  |
| SUM:     | 7     | 56    | 4       | 304  |

### Problema identificado

- Refatorado a função de calculo dos custos da correcao - [commit](https://github.com/LuizHNRQ/correcaoDeSolos/commit/69d0298bb6d0f3c83b8f6d423d37d5fcff269fcc)

Descrição do problema: A funcão não utilizava do switch que retornava a o teor do Pentoxido de Fosforo, portanto assim que aplicado pode ser reduzido a inserção manual, assim evitando erros e melhorando a manutenabilidade.

### Cloc ESPECÍFICO do código criado depois das melhorias

| Language | files | blank | comment | code |
| -------- | ----- | ----- | ------- | ---- |
| Java     | 7     | 57    | 4       | 279  |
| SUM:     | 7     | 57    | 4       | 279  |

## Atividade 4

As minhas principais dificuldades foram que os metódos com nomes relativos as funcionalidades da tabela não implementavam de forma completa o que era pedido e precisei terminar os cálculos.
E também algumas coisas foram planejadas de uma forma que ficou confusa, como para a textura de solo, que existe um enum para cada tipo de solo, mas em controle de qualidade se usa um switch para cada elemento e dentro de cada elemento um if para saber a textura do solo. E me atrapalhou ainda mais utilizar muitas variáveis de escopo global no lugar de pedir paramêtros nos métodos.
