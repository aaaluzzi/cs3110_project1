import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        State[] states = {
                new State(1, false),
                new State(2, false),
                new State(3, true)
        };

        Transition[] transitions = {
                new Transition(states[0], states[1], new char[] { 'a' }),
                new Transition(states[1], states[2], new char[] { 'b' }),
                new Transition(states[2], states[2], new char[] { 'b', 'c' })
        };

        Automaton nfa = new Automaton(transitions, states[0]);

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.println("Enter input string: ");
                String input = sc.nextLine();

                System.out.println(nfa.accepts(input) ? "accepted" : "rejected");
            }
        }
    }
}
