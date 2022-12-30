package State;

public class Client {
    public static void main(String[] args) {
        var context = new Context(new Created(true));
        for(int i=0;i<5;i++) {
            context.state.doSth();
        }
    }
}
