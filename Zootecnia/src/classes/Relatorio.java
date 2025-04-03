package classes;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private List<Lote> lotesAntigos;

    public Relatorio() {
        this.lotesAntigos = new ArrayList<>();
    }

    public List<Lote> getLotesAntigos() {
        return lotesAntigos;
    }

    public void setLotesAntigos(List<Lote> lotesAntigos) {
        this.lotesAntigos = lotesAntigos;
    }

    public void adicionarLote(Lote lote) {
        lotesAntigos.add(lote);
    }

    public List<Lote> obterLotes() {
        return new ArrayList<>(lotesAntigos);
    }
}
