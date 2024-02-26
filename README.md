# Hangman Game

- [ ] O Jogo da Forca é uma implementação simples do clássico jogo de adivinhação de palavras onde o jogador tenta adivinhar uma palavra, letra por letra, antes de exceder o número máximo de erros permitidos.
## Features

- [ ] O jogo sorteia uma palavra aleatória de um banco de palavras predefinido.

- [ ] O jogador tenta adivinhar a palavra digitando uma letra por vez.

- [ ] Cada vez que o jogador acerta uma letra, ela é revelada na palavra.

- [ ] Se o jogador errar uma letra, um contador de erros é incrementado.

- [ ] O jogador tem um número máximo de erros permitidos antes de perder o jogo.

- [ ] O jogo continua até que o jogador adivinhe todas as letras corretamente ou exceda o número máximo de erros.

## Componentes do Projeto

 * O projeto é dividido em várias classes Java que desempenham funções específicas:

* _*BancoDePalavras*_: Responsável por armazenar uma lista de palavras que podem * ser sorteadas para o jogo.

* _*Palavra*_: Representa uma palavra a ser adivinhada pelo jogador. Fornece métodos para obter informações sobre a palavra, como quantidade de letras, posição de ocorrências, etc.

* _*Tracinhos*_: Representa a palavra durante o jogo, com algumas letras ocultas por tracinhos. Fornece métodos para revelar letras corretas e verificar se ainda há tracinhos na palavra.

* _*ControladorDeErros*_: Controla o número de erros que o jogador comete durante o jogo.

* _*ControladorDeLetrasJaDigitadas*_: Controla as letras que o jogador já tentou adivinhar.

* _*Forca*_: Classe principal que coordena o fluxo do jogo. É responsável por iniciar o jogo, interagir com o jogador e determinar o resultado do jogo.

## Como Jogar

  1. Clone o repositório para seu ambiente de desenvolvimento ou faça o download do projeto.
  2. Na classe _*Forca*_, vá até a `main` e clique em `run`.
  3. Siga as instruções apresentadas no console para jogar.
  4. Tente adivinhar a palavra digitando uma letra por vez.
  5. Continue jogando até adivinhar todas as letras corretamente ou exceder o número máximo de erros permitidos.

> Uma demonstração da gameplay pode ser encontrado [](_)

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
