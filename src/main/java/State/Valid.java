package State;

public class Valid extends State{
    public boolean isBranchReplaced;

    public Valid(boolean isBranchReplaced){
        this.isBranchReplaced = isBranchReplaced;
    }
    @Override
    public void doSth() {
        System.out.println("Valid state");
        if(isBranchReplaced){
            context.changeState(new Invalid());
        } else{
           context.changeState(new Mined(0,false));
        }
    }
}
