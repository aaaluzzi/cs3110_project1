public class Transition {
    
    private final State fromState;
    private final State toState;
    private final char[] values;

    public Transition(State fromState, State toState, char[] values) {
        this.fromState = fromState;
        this.toState = toState;
        this.values = values;
    }

    public boolean accepts(char value) {
        for (int acceptedValue : values) {
            if (value == acceptedValue) {
                return true;
            }
        }
        return false;
    }

    public State getFromState() {
        return fromState;
    }

    public State getToState() {
        return toState;
    }

}
