package nl.ocs.academy.strategy;

class Pattern {
    public static void main(String[] args) {
        System.out.println(new HealthCareOffer(new DefaultStrategy()).print());
        System.out.println(new HealthCareOffer(new OcsStrategy()).print());
    }
}