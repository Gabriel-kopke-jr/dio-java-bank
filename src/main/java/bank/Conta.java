package bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public abstract class Conta implements ContaInterface{

    private boolean statusConta = true;
    private double saldo = 0;
    private int agencia;

    private Cliente cliente;

    @Override
    public void depositar(double valor, Conta contaDestino) {
        try {
        double saldoDestino = contaDestino.getSaldo() + valor;;
        contaDestino.setSaldo(saldoDestino);
        System.out.println("Valor depositado");
        }
        catch (NullPointerException e){
            System.out.println("Não encontrada a Conta de destino");
        }
        catch (Exception e){
            lauchMessageError();
            System.out.println("Erro inexperado ocorreu");
        }
    }

    @Override
    public void sacar(double valor) {
        double saldoConta = this.getSaldo();
        if (saldoConta < valor){
            lauchMessageError();
        }
        saldoConta -= valor;

        this.setSaldo(saldoConta);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (valor >= this.getSaldo()){
        this.sacar(valor);
        this.depositar(valor, contaDestino);
    }
        else lauchMessageError();
    }


    @Override
    public void cancelarConta() {
        this.setStatusConta(false);
    }

    private void lauchMessageError() {
        System.out.println("Não é possível a realização dessa operação");
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s",this.getCliente().getNome()));
        System.out.println(String.format("Agencia: %d",this.getAgencia()));
        System.out.println(String.format("Saldo: %.2f",this.getSaldo()));
    }
}
