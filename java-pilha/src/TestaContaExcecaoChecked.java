public class TestaContaExcecaoChecked {

    public static void main(String[] args) {
        Conta c = new ContaCorrente(123,125);
        try{
            c.deposita(152);
        }catch(SaldoInsuficienteException ex){
            System.out.println("Tratamento...");
        }
    }
}
