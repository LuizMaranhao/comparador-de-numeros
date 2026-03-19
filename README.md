# 🔢 Comparador de Números

Aplicativo de linha de comando (CLI) desenvolvido em Java que compara dois números inteiros e informa qual é o maior — ou se são iguais. Ao final de cada comparação, o usuário pode reiniciar sem precisar fechar o programa.

---

## 📋 Funcionalidades

- Recebe dois números inteiros digitados pelo usuário
- Compara os valores usando lógica `if / else if / else`
- Informa qual número é maior, ou se são iguais
- Permite reiniciar a comparação sem fechar o programa (loop `do-while`)
- Aceita números negativos e zero

---

## 🖥️ Exemplo de uso

```
================================
   === Sistema de Comparação ===
================================
Digite o primeiro número: 15
Digite o segundo número: 8

Resultado: O maior número é: 15.

Deseja comparar novamente? (s/n): s

================================
   === Sistema de Comparação ===
================================
Digite o primeiro número: 4
Digite o segundo número: 4

Resultado: Os dois números são iguais: 4.

Deseja comparar novamente? (s/n): n

Obrigado por usar o Sistema de Comparação. Até logo!
```

---

## 🚀 Como executar

### Pré-requisitos

- [JDK 17 ou 21](https://www.oracle.com/java/technologies/downloads/) instalado
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (recomendado)

### Passo a passo no IntelliJ

1. Crie um novo projeto Java no IntelliJ
2. Dentro da pasta `src/`, adicione o arquivo `ComparadorNumeros.java`
3. Clique com o botão direito no arquivo → **Run 'ComparadorNumeros.main()'**
4. Interaja com o programa no painel **Run** (terminal inferior)

---

## 🧠 Conceitos utilizados

| Conceito | Onde foi aplicado |
|---|---|
| `Scanner` | Leitura de dados digitados pelo usuário |
| `int` | Armazenamento dos números informados |
| `if / else if / else` | Lógica de comparação entre os valores |
| `do-while` | Loop de reinício sem fechar o programa |
| `.trim()` / `.toLowerCase()` | Tratamento da resposta do usuário |

---

## 📁 Estrutura do projeto

```
comparador-de-numeros/
├── src/
│   └── ComparadorNumeros.java
├── .gitignore
└── README.md
```

---

## 📌 Histórico de versões

| Versão | Descrição |
|---|---|
| 1.0 | Comparação simples entre dois números |
| 2.0 | Adicionado loop de reinício com `do-while` |

---

## 👨‍💻 Autor

Desenvolvido como exercício prático do curso **Java** da [EBAC](https://ebaconline.com.br/).