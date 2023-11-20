package bank;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Cliente {

    private int tipoDocumentoCliente;

    private String nrDocumento;

    private String nome;

}
