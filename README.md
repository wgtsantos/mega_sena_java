# mega_sena_java
Um simulador de palpites da Mega-Sena. A ideia é permitir que o usuário faça seu palpite de seis números, que serão comparados com seis números aleatoriamente gerados pelo programa, simulando um sorteio da Mega-Sena. O objetivo é trabalhar com ArrayList do Java para analisar e comparar dados inseridos nos Arrays.

# Criando um Projeto Java no NetBeans e Utilizando ArrayList

Este guia fornece uma introdução sobre como criar um projeto Java no IDE NetBeans e demonstra o uso de `ArrayList` em Java através de exemplos simples.

## Iniciando com NetBeans

NetBeans é um ambiente de desenvolvimento integrado (IDE) gratuito e de código aberto para desenvolvedores de software em Java, PHP, C++, e outras linguagens.

### Instalação do NetBeans

1. Baixe o instalador do NetBeans do [site oficial](https://netbeans.apache.org/download/index.html).
2. Execute o instalador e siga as instruções na tela para instalar o NetBeans no seu sistema.

### Criando um Novo Projeto Java

1. Abra o NetBeans.
2. Vá em `Arquivo` > `Novo Projeto...`.
3. Na caixa de diálogo `Novo Projeto`, selecione `Java com Ant` > `Projeto Java` e clique em `Próximo`.
4. Dê um nome ao seu projeto e especifique a localização do mesmo. Clique em `Finalizar`.

## Utilizando ArrayList em Java

`ArrayList` é uma parte do framework de coleções em Java, que fornece uma maneira de armazenar elementos de forma dinâmica. Abaixo estão exemplos simples de como utilizar `ArrayList` em Java.

### Exemplo 1: Adicionando Elementos a um ArrayList

```java
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        // Criando um ArrayList
        ArrayList<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        System.out.println(lista);
    }
}

