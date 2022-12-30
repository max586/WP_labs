package Facade;

import java.util.HashMap;
import java.util.Map;

public class Client {
    int id;
    Map<Instrument,Integer> instruments;
    public Client(int id){
        this.id = id;
        instruments = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void buyInstrument(int id){
        for(Instrument instrument: instruments.keySet()){
            if(instrument.getId()==id && instrument.isRegistered){
                instruments.put(instrument, instruments.get(instrument)+1);
                return;
            }
        }
        Instrument newInstrument = new Instrument(id);
        instruments.put(newInstrument, 1);
    }
    public void sellInstrument(int id){
        for(Instrument instrument: instruments.keySet()){
            if(instrument.getId()==id && instrument.isRegistered){
                if(instruments.get(instrument)==1){
                    instruments.remove(instrument);
                } else{
                    instruments.put(instrument,instruments.get(instrument)-1);
                }
            }
        }
    }

    public Instrument getInstrument(int instrumentId){
        return instruments.keySet().stream().filter(e->e.getId()==instrumentId).findFirst().orElse(null);
    }
}
