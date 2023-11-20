import bank.Cliente;
import bank.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Daniel");
        cliente.setTipoDocumentoCliente(1);
        cliente.setNrDocumento("111222333444");

        ContaPoupanca  contaPoupanca = new ContaPoupanca();
        contaPoupanca.setCliente(cliente);
        contaPoupanca.setAgencia(1);
        contaPoupanca.depositar(10000,contaPoupanca);
        contaPoupanca.imprimirInfosComuns();


            }

}
