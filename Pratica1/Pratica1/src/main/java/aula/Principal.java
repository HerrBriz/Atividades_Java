package aula;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        
        System.out.println("Exercicio 1");
        for (int x=1; x<=5; ++x){
            System.out.println(x);
        }
        
        
        System.out.println("Exercicio 2");
        int x = 1;
        while (x<=5){
            System.out.println(x);
            ++x;
        }
        
        
        System.out.println("Exercicio 3");
        int y = 1;
        do{
            System.out.println(y);
            ++y;
        } while(y<=5);
        
        
        System.out.println("Exercicio 4");
        for (int numero = 1; numero <=15; ++numero){
            if (numero%2 == 0)
                System.out.println(numero);
        }
        
        
        System.out.println("Exercicio 5");
        int z = 0;
        int s = 0;
        while (z<=10){
            s = s + z;
            ++z;        
        }
        System.out.println(s);
        
        
        System.out.println("Exercicio 6");
        int acumulador = 0;
        int contador;
        for (contador = 0; contador <= 100; ++contador){
            if (contador%2 != 0)
                acumulador+=contador;
        
        }
        System.out.println((float)acumulador/contador);
        
        
        System.out.println("Exercicio 7");
	String nome = JOptionPane.showInputDialog("Entre com um nome: ");
        if (nome != null && nome.equals("")==false)
            System.out.println(nome);
	
	
	System.out.println("Exercicio 8");
        String valor = JOptionPane.showInputDialog("Insira um valor: ");
        int v = Integer.parseInt(valor);
        if (v%2 == 0)
            System.out.println("O valor é par");
        else
            System.out.println("O valor é impar");
        
    }
}

