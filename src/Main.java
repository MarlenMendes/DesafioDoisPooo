import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaVendas sistema = new SistemaVendas();

        // Criação dos clientes
        Cliente cliente1 = new Cliente("João", "11111111111", "joao@example.com");
        Cliente cliente2 = new Cliente("Maria", "22222222222", "maria@example.com");

        // Criação dos vendedores
        Vendedor vendedor1 = new Vendedor("Pedro", "33333333333", "pedro@example.com");
        Vendedor vendedor2 = new Vendedor("Ana", "44444444444", "ana@example.com");

        // Cadastro dos clientes e vendedores no sistema
        sistema.cadastrarCliente(cliente1);
        sistema.cadastrarCliente(cliente2);
        sistema.cadastrarVendedor(vendedor1);
        sistema.cadastrarVendedor(vendedor2);

        // Criação das vendas
        Venda venda1 = new Venda(cliente1, vendedor1, 100.0, "01/07/2023");
        Venda venda2 = new Venda(cliente2, vendedor2, 200.0, "02/07/2023");

        // Cadastro das vendas no sistema
        sistema.cadastrarVenda(venda1);
        sistema.cadastrarVenda(venda2);

        // Listagem de todas as vendas
        List<Venda> vendasCadastradas = sistema.listarVendas();
        System.out.println("Vendas cadastradas:");
        for (Venda venda : vendasCadastradas) {
            System.out.println("Cliente: " + venda.getCliente().getNome());
            System.out.println("Vendedor: " + venda.getVendedor().getNome());
            System.out.println("Valor: " + venda.getValor());
            System.out.println("Data de Registro: " + venda.getDataRegistro());
            System.out.println("----------------------");
        }

        // Listagem de todos os vendedores
        List<Vendedor> vendedoresCadastrados = sistema.listarVendedores();
        System.out.println("Vendedores cadastrados:");
        for (Vendedor vendedor : vendedoresCadastrados) {
            System.out.println("Nome: " + vendedor.getNome());
            System.out.println("CPF: " + vendedor.getCpf());
            System.out.println("E-mail: " + vendedor.getEmail());
            System.out.println("----------------------");
        }

        // Listagem de todos os clientes
        List<Cliente> clientesCadastrados = sistema.listarClientes();
        System.out.println("Clientes cadastrados:");
        for (Cliente cliente : clientesCadastrados) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("E-mail: " + cliente.getEmail());
            System.out.println("----------------------");
        }
    }
}
