package State;

public class Mined extends State{
    public int nrOfBlocks=0;
    public int enoughBlocksNr;

    public boolean isOrphaned;

    public Mined(int enoughBlocksNr, boolean isOrphaned){
        this.enoughBlocksNr = enoughBlocksNr;
        this.isOrphaned = isOrphaned;
    }
    public void buildBlockOnTop(){
        System.out.println("new block is built on top");
        nrOfBlocks++;
    }
    @Override
    public void doSth() {
        System.out.println("Mined state");
        if(nrOfBlocks>=enoughBlocksNr){
            context.changeState(new DurablyCommited());
        } else if(isOrphaned){
            context.changeState(new Created(false));
        }
    }
}
