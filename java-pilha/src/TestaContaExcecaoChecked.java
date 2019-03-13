public class TestaContaExcecaoChecked {

    public static void main(String[] args) throws SaldoInsuficienteException {
        Conta c = new ContaCorrente(123,125);
        try{
            c.deposita(152);
        }catch(Exception ex){
            throw new SaldoInsuficienteException("Tratando");
//            System.out.println("Tratamento...");
        }
    }
}
