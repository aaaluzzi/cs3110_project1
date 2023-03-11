public class Automaton {
 
    private final State initialState;
    private final Transition[] transitions;

    public Automaton(Transition[] transitions, State initialState) {
        this.initialState = initialState;
        this.transitions = transitions;
    }

    public boolean accepts(String input) {
        return accepts(input, initialState);
    }

    private boolean accepts(String input, State currentState) {
        if (input.isEmpty()) {
            return currentState.isAcceptState();
        }

        for (Transition transition : transitions) {
            if (transition.getFromState().equals(currentState)
                    && transition.accepts(input.charAt(0))
                    && accepts(input.substring(1), transition.getToState())) {
                return true;
            }
        }
        return false;
    }
    
}
