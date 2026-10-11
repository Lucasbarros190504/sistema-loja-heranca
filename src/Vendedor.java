public class Vendedor extends Usuario implements ConsultorDeVendas{
    private int quantidadeDeVendas;



    public Vendedor(String nome, String email, String senha){
        super(nome, email, senha, false);
        this.quantidadeDeVendas = 0;
    }


    public boolean realizarVenda(int venda){
        if(!isLogado()){
            System.out.println("Você precisa estar logado!");
            return false;
        }
        if (venda <= 0){
            System.out.println("Valor informado inválido!");
            return false;
        }
        this.quantidadeDeVendas += venda;
        System.out.println(venda + " Venda(s) realizada(s) com sucesso!");
        System.out.println("Total de venda(s) realizada(s) com sucesso: " + this.quantidadeDeVendas);
        return true;
    }

    @Override
    public void consultarVendas(){
        if (!isLogado()){
            System.out.println("Você não está logado!");
            return;
        }

        System.out.println("Vendas consultadas com sucesso!");
        System.out.println("Total de venda(s): " + this.quantidadeDeVendas);
    }

    public int getQuantidadeDeVendas(){
        return quantidadeDeVendas;
    }







}
