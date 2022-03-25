package nl.ocs.academy.strategy;

import java.math.BigDecimal;

class OcsStrategy implements Strategy {
    @Override
    public BigDecimal calculateCosts() {
        return BigDecimal.valueOf(110);
    }
}
