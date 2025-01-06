public class caixa {
    //declarrando variaveis
    private String nome;
    private double saldo;
    private int agencia ;


    //construtor para iniciar atributos
    public caixa(String nome, double saldoInicial, int agencia){
        this.nome = nome;
        this.saldo = saldoInicial;
        this.agencia = agencia ;
    }
    //metodo para realizar saque
    public void  sacar (double valor){
        if (valor > saldo){
            System.out.println ("Saldo insuficiente");
        }
        else{
            saldo -= valor;
            System.out.println("Saque bem feito");
            System.out.println("Nome:" + nome);
            System.out.println("Agencia:" + agencia);
            System.out.println("Novo saldo " + saldo );
        }
    }

    public void imprime(){
        System.out.println("Nome:" + nome);
        System.out.println("Agencia:" + agencia);
        System.out.println("Saldo:" + saldo);
    }
}




