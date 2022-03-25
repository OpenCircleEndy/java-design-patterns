package nl.ocs.academy.observer;

class Pattern {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.addObserver(event -> {
            System.out.println("Something changed over there: " + event);
        });
        subject.addObserver(event -> {
            System.out.println("I'm gonna log this event: " + event);
        });
        subject.stateChange("end of main");
    }
}