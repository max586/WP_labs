package State;

public class Created extends State{
    public boolean isTXValid;


    public Created(boolean isTXValid) {
        this.isTXValid = isTXValid;
    }

    @Override
    public void doSth() {
        System.out.println("Created state");
        if(isTXValid){
            context.changeState(new Valid(false));
        } else{
            context.changeState(new Invalid());
        }
    }
}
