
package br.ulbra.classes;

import java.util.Scanner;

public class Principal 
{
 public static void main(String[] args) 
         
    {
        Scanner ler = new Scanner (System.in);
        IMC imc = new IMC();
        
        System.out.println("Digite aqui o seu nome: ");
        imc.setNome(ler.nextLine());
        
        System.out.println("Digite aqui a sua altura: ");
        imc.setAltura(ler.nextDouble());
        
        System.out.println("Digite aqui o seu peso: ");
        imc.setPesoAtual(ler.nextDouble());
        
        imc.calcularIMC();
    }
 
}    

