## Exercício Composição

Foi requisitado um simples sistema de pedidos de compras (orders). Sabe-se que um pedido está relacionado com um cliente e que nesse pedido
podemos ter vários itens. Cada item do pedido está relacionado com um produto.

Considerando o domínio descrito, um analista de sistemas realizou as modelagens iniciais de diagramas de classes e objetos que seguem abaixo.

![class diagram](class_diagram.PNG)

![object diagram](object_diagram.PNG)

Pede-se um projeto java com a criação das classes e seus relacionamentos, assim como um programa com metódo main() que faça as instanciações
mínimas tal que sejam instanciados pelo menos 1 cliente, 1 pedido, 2 itens e 2 produtos. Note que as instanciações podem ser realizadas de acordo
com o diagrama de objetos, sem a necessidade de leitura de dados via teclado. Se desejar realizar impressões dos dados, gere automaticamente o método
toString() via IDE. Os status do pedido podem ser: "Pending payment", "Processing", "Shipped", "Delivered".
Destaca-se também a necessidade implementar os métodos para adicionar e remover itens, assim como calcular o subtotal de cada item e calcular o total do pedido.