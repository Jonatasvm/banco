public class depobanco {
    public static void main (String [] args) {
        banco banco1 = new banco();
        banco1.nome = "Joao";
        banco1.conta = 1521;
        banco1.agencia = 412;
        banco1.saldo = 200;

        banco banco2 = new banco();
        banco2.nome = "maria";
        banco2.conta = 5212;
        banco2.agencia = 422;
        banco2.saldo = 359;
        
        banco1.alerta();
        banco2.alerta();
        
    } 

}
