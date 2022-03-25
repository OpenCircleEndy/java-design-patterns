package nl.ocs.academy.strategy;

class HealthCareOffer {

    private Strategy monthlyCostsCalculation;

    public HealthCareOffer(Strategy strategy) {
        monthlyCostsCalculation = strategy;
    }

    public String print() {
        return "Monthly costs: " + monthlyCostsCalculation.calculateCosts();
    }
}
