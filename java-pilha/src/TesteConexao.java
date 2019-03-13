public class TesteConexao {
    public static void main(String[] args) throws Exception {

        try(Conexao con = new Conexao()){
            con.leDados();
        }catch(IllegalStateException ex){
            System.out.println(ex.getMessage()+"Deu erro");
        }
    }
}
