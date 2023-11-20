package bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class ContaPoupanca extends Conta{
    private UUID idConta = UUID.randomUUID();
    public void imprimirInfosComuns(){
        System.out.println("Extrato conta Poupança");
        super.imprimirInfosComuns();
    }

}
