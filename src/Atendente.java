public class Atendente extends Usuario{
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha){
        super(nome, email, senha, false);
        this.valorEmCaixa = 0;

    }

    public void receberPagamentos(double pagamento){
        if(!isLogado()){
            System.out.println("Você não está logado!");
            return;
        }
        if(pagamento <= 0){
            System.out.println("Valor informado inválido!");
            return;
        }

        this.valorEmCaixa += pagamento;
        System.out.println("Valor recebido: " + pagamento);
        System.out.println("Valor total do caixa: " + this.valorEmCaixa);


    }

    public void fecharCaixa(){
        if(!isLogado()){
            System.out.println("Você não está logado!");
            return;
        }


        System.out.println("Com a sua saída o valor do caixa será zerado.");
        System.out.println("Antigo valor disponível: " + valorEmCaixa);
        valorEmCaixa = 0;
        System.out.println("Valor atual: " + valorEmCaixa);
        realizarLogoff();
        System.out.println("Caixa fechado com sucesso!");


    }



    public double getValorEmCaixa(){
        return valorEmCaixa;
    }




}
