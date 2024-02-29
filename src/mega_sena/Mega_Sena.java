/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mega_sena;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Suporte
 */
public class Mega_Sena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       List<Integer> num_sorteados = new ArrayList<>();
       List<Integer> num_palpites = new ArrayList<>();
       
        while (num_sorteados.size() < 6) {
            
           int num_ale = (int) (Math.random() * 60) + 1;
           
           if (!num_sorteados.contains(num_ale)) {
               
                num_sorteados.add(num_ale);     
           } 
        }
        
       Scanner ler = new Scanner(System.in);
       
       System.out.println("Bem vindo ao Sistema de Palpites da Mega-Sena");
       System.out.println("Por favor, Informe seu Palpite de 6 Números:");
       
        for (int i = 1; i < 7; i++) {
            System.out.print("Palpite 0" + i + "=> ");
            int num = ler.nextInt();
            
            if(num_palpites.contains(num)) {
                
                System.out.println("Você inseriu um número repetido!");
                System.out.println("Digite novamente..");
                i--;

            } else if(num >= 60){
                
                System.out.println("Números maiores que 60 são inválidos!");
                System.out.println("Digite novamente..");
                i--;
                
            } else {
                
                num_palpites.add(num);
            }
             
        }
        
        int acertos = 0;
        
        for (int i = 0; i < num_sorteados.size(); i++) {
            
            if (num_sorteados.contains(num_palpites.get(i))) {
                
                acertos++;
                
            } 
            
        }
        
        System.out.println("Números Sorteados: "+ num_sorteados.toString());
        System.out.println("Seu Palpite: " + num_palpites.toString());
        
        switch (acertos) {
            case 6:
                System.out.println("Parabéns!! Você acertou os " + acertos + " números!");
                System.out.println("Se isso fosse real, estaria milhonário!");
                System.out.println("Infelizmente não é! Você segue pobre!");
                break;
            case 5:
                System.out.println("Parabéns!! Você acertou " + acertos + " números!");
                System.out.println("Se isso fosse real, teria acertado a Quina e talvez rico!");
                System.out.println("Infelizmente não é! Você segue pobre!");
                break;
            case 4:
                System.out.println("Parabéns!! Você acertou " + acertos + " números!");
                System.out.println("Se isso fosse real, teria feito a quadra e garantia um dinheiro extra!");
                System.out.println("Infelizmente não é! Você segue pobre!");
                break;
            case 3:
                System.out.println("Você acertou " + acertos + " números!");
                System.out.println("Se isso fosse real, não iria ganhar nada!");
                System.out.println("Infelizmente! Você segue pobre!");
                break;
            case 2:
                System.out.println("Você acertou somente " + acertos + " números!");
                System.out.println("Você não é bom em palpites!");
                System.out.println("Se isso fosse real, não iria ganhar nada!");
                System.out.println("Infelizmente! Você segue pobre!");
                break;
            case 1:
                System.out.println("Você acertou somente " + acertos + " número!");
                System.out.println("Você é péssimo em palpites!");
                System.out.println("Se isso fosse real, não iria ganhar nada!");
                System.out.println("Infelizmente! Você segue pobre!");
                break;
            case 0:
                System.out.println("Você acertou nenhum número!");
                System.out.println("Se isso fosse real, teria gastado dinheiro atoa e não iria ganhar nada!");
                System.out.println("Infelizmente! Você segue pobre!");
                break;
            default:
                break;
        }
        
    }
    
}
