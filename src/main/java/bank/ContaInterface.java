package bank;

public interface ContaInterface {

    void depositar(double valor, Conta contaDestino);

    void sacar(double valor);

    void transferir(double valor, Conta contaDestino);

    void cancelarConta();

}

