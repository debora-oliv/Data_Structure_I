# Pilhas e Filas - Lista de exercícios 2

### QUESTÃO 1 - Problema "validar expressão"
Dada uma string contendo somente caracteres '(', ')', '{', '}', '[' e ']', determine se a string é
válida. A string é válida se:
- Os símbolos abertos devem ser fechados pelo mesmo tipo de símbolos.
- Os símbolos abertos devem ser fechados na ordem correta.

### QUESTÃO 2 - Problema "remove duplicatas"
Crie um método que remova repetidamente os dois primeiros caracteres adjacentes iguais
em uma string de letras, até que não haja mais dois caracteres adjacentes repetidos.

### QUESTÃO 3 - Problema "ingressos"
Há uma fila de N pessoas que querem comprar ingressos para um evento.

A quantidade de ingressos que cada pessoa deseja comprar deve ser representada por um
array "ingressos". Por exemplo, se há 3 pessoas A, B e C na fila, e o array "ingressos" for
[2, 4, 3], significa que a pessoa A quer comprar 2 ingressos, a pessoa B quer comprar 4
ingressos, e a pessoa C quer comprar 3 ingressos.

Cada pessoa leva exatamente 1 segundo para comprar um ingresso, e pode comprar
apenas um ingresso por vez. Se, após comprar um ingresso, a pessoa ainda quiser comprar
mais ingressos, ela deve ir para o final da fila (despreze o tempo de movimentação na fila).
Quando a pessoa compra o último ingresso que deseja, ela sai da fila.

Faça um método para receber o array "ingressos" e um índice "k". O método deve retornar
quantos segundos a pessoa da posição "k" demora para comprar todos seus ingressos.

### QUESTÃO 4 - Problema "lanche"
Uma fila de N alunos aguarda para comer N lanches disponíveis.
Cada lanche é representado por 0 ou 1, indicando se o lanche é redondo ou quadrado
respectivamente. Cada aluno também é representado por 0 ou 1, indicando se esse aluno
quer comer um lanche redondo ou quadrado respectivamente.

A dinâmica da fila de alunos funciona tal que: o primeiro aluno da fila observa o primeiro
lanche disponível. Se o lanche for do tipo que o aluno quer comer, o aluno pega o lanche e
sai da fila, caso contrário o aluno vai para o final da fila.

O processo se repete até não haver mais lanche, ou até quando a fila de alunos for toda
percorrida e nenhum aluno pegar o primeiro lanche disponível.

Faça um método que receba dois vetores representando a sequência de alunos e a
sequência de lanches disponíveis. O método deve retornar quantos alunos sobraram na fila
sem pegar seu lanche.