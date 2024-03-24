package interfaces;

import modelo.Coche;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Coche coche = CocheBuilder.builder()
                .id(1112)
                .marca("Renault")
                .precio(new BigDecimal(21000))
                .build();
        System.out.println(coche);
    }
}
