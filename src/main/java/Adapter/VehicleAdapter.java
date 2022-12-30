package Adapter;

public class VehicleAdapter extends LegacyCar implements Vehicle{
    int x,y;
    @Override
    public void moveTo(int x2, int y2) {
        drive(x2-x, y2-y);
    }
}
