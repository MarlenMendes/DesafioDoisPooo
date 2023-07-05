import java.util.ArrayList;
import java.util.List;

public class SistemaVendas {
    private List<Cliente> clientes;
    private List<Vendedor> vendedores;
    private List<Venda> vendas;

    public SistemaVendas() {
        clientes = new ArrayList<>();
        vendedores = new ArrayList<>();
        vendas = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        if (!clientes.contains(cliente)) {
            clientes.add(cliente);
        }
    }

    public void cadastrarVendedor(Vendedor vendedor) {
        if (!vendedores.contains(vendedor)) {
            vendedores.add(vendedor);
        }
    }

    public void cadastrarVenda(Venda venda) {
        if (clientes.contains(venda.getCliente()) && vendedores.contains(venda.getVendedor())) {
            vendas.add(venda);
        } else {
            System.out.println("Não é possível cadastrar a venda. Cliente ou vendedor não cadastrado.");
        }
    }

    public List<Venda> listarVendas() {
        return vendas;
    }

    public List<Vendedor> listarVendedores() {
        return vendedores;
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }
}
