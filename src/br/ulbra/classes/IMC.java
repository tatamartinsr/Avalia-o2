package br.ulbra.classes;

public class IMC 
{

    private String nome;
    private double altura;
    private double pesoAtual;

    public IMC() 
            
    {
        
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getPesoAtual() 
    {
        return pesoAtual;
    }

    public void setPesoAtual(double pesoAtual) 
    {
        this.pesoAtual = pesoAtual;
    }

    public void calcularIMC ()
    {
       pesoAtual = pesoAtual / (altura * altura);
       
       if (pesoAtual < 18.5)
       {
       System.out.println("Você está abaixo do peso");
       }
       else if ((pesoAtual >= 18.5 ) && (pesoAtual <= 24.9))
       {
       System.out.println("Parabéns!!! Você está em seu peso normal!");
       }
       else if ((pesoAtual >=25.0)&& (pesoAtual <=29.9))
       {
           System.out.println("Você está acima do seu peso ideal");
       }
       else if ((pesoAtual >=30.0)&& (pesoAtual <=34.9))
       {
           System.out.println("Obesidade grau I");
       }
       else if ((pesoAtual >=35.0)&& (pesoAtual <=39.9))
       {
           System.out.println("Obesidade grau II");
       }
       else if (pesoAtual >=40.0)
       {
           System.out.println("Obesidade grau III");
       }
    }
}