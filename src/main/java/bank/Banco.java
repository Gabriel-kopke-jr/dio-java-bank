package bank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class Banco {

    public int nrBanco;
    private List<Conta> listContas;

}
