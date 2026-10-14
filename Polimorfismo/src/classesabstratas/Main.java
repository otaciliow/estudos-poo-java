package classesabstratas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Relatorio> relatorios = new ArrayList<>();
        relatorios.add(new RelatorioFinanceiro());
        relatorios.add(new RelatorioVendas());

        for (Relatorio r: relatorios) {
            r.gerar();
        }
    }
}
