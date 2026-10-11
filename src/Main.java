public class Main {
    public static void main(String[] args) {

        System.out.println("\n--- Polimorfismo: login dos 3 ---\n");

        Usuario[] usuarios = {
                new Vendedor("Lucas", "Lucas23@gmail.com", "123456"),
                new Gerente("José","Jose34@gmail.com","456789"),
                new Atendente("Louro", "louro23@gmail.com", "4587")
        };

        String[] senhas = {"123456", "456789", "4587"};

        for(int i = 0; i < usuarios.length; i++){
            usuarios[i].realizarLogin(usuarios[i].getEmail(), senhas[i]);
        }


        System.out.println("\n--- Gerente ---\n");

        Gerente gerente = new Gerente("Leo", "leo12@gmail.com", "451236");

        gerente.gerarRelatorioFinanceiro();

        gerente.realizarLogin("leo12@gmail.com", "451236");
        gerente.gerarRelatorioFinanceiro();


        System.out.println("\n--- Vendedor ---\n");

        Vendedor vendedor = new Vendedor("Joel", "joel23@gmail.com", "852963");

        vendedor.realizarVenda(2);

        vendedor.realizarLogin("joel23@gmail.com", "852963");
        vendedor.realizarVenda(2);

        vendedor.consultarVendas();


        System.out.println("\n--- Atendente ---\n");

        Atendente atendente = new Atendente("Luiz","luiz14@gmail.com","457812");

        atendente.receberPagamentos(50.5);

        atendente.realizarLogin("luiz14@gmail.com","457812");
        atendente.receberPagamentos(50.5);
        atendente.fecharCaixa();
    }
}
