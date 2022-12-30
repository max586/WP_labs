package State;

public class Context {
    public State state;

    public Context(State state){
        this.state = state;
        state.setContext(this);
    }

    public void changeState(State state){
        this.state = state;
        state.setContext(this);
    }
}
