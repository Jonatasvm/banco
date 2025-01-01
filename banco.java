public class banco {
    private String nome;
    private int conta;
    private int agencia; 
    private float saldo; 
    private float valor;

    public void sacar(){
        if saldo < valor{
            System.out.println ("O seu saldo é insuficiente ")

            else {
            saldo -= valor 
                System.out.println("O seu novo saldo sera no valor de" + saldo)
                }
            
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
