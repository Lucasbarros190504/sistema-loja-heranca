public class Gerente extends Usuario implements ConsultorDeVendas{


    public Gerente(String nome, String email, String senha){
        super(nome, email, senha, true);

    }

    public void gerarRelatorioFinanceiro(){
        if (!isLogado()){
            System.out.println("Você não está logado!");
            return;
        }

        System.out.println("Relatório gerado com sucesso!");

    }


    @Override
    public void consultarVendas(){
        if (!isLogado()){
            System.out.println("Você não está logado!");
            return;
        }

        System.out.println("Vendas consultadas com sucesso!");
    }




}
