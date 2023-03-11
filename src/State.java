public class State {

    public final int id;
    private final boolean accept;

    public State(int id, boolean accept) {
        this.id = id;
        this.accept = accept;
    }

    public State(int id) {
        this(id, false);
    }

    public boolean isAcceptState() {
        return accept;
    }

    public boolean equals(State other) {
        return other != null && this.id == other.id;
    }
    
}