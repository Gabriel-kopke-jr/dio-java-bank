package bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
public class CantaCorrente extends Conta{

    private UUID idConta = UUID.randomUUID();

    public void imprimirInfosComuns(){
        System.out.println("Extrato conta Corrente");
        super.imprimirInfosComuns();
    }

}
