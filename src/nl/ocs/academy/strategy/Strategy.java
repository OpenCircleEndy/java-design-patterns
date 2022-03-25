package nl.ocs.academy.strategy;

import java.math.BigDecimal;

public interface Strategy {
    default BigDecimal calculateCosts() {
        return new BigDecimal(130);
    }
}
