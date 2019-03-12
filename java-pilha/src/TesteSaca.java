public class TesteSaca {

    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123,125);
        conta.deposita(250);
        try{
            conta.saca(250);
        }catch(SaldoInsuficienteException ex){
            System.out.println(" Ex:" +ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
