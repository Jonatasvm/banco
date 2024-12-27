public class banco {
    private String nome;
    private int conta;
    private int agencia; 
    private float saldo; 

    public void sacar(){
        //metodo para sacar o dinheiro
    }
    public void depositar(){
        //metodo para depositar o dinheiro 
    }
    public void TrocaAgencia(){
    }

    public void alerta(){
    if (saldo < 100)
        System.out.println ("Gostaria de despositar ?");
    else if (saldo > 300 )
        System.out.println("Gostaria de sacar ?");
    else 
    System.out.println ("Ta precisando depositar ai pai");
        }
    
    

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
