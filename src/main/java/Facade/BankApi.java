package Facade;

public class BankApi {
    ManagmentSystem ms;
    public BankApi(){
        this.ms = new ManagmentSystem();
    }
    public void addClient(Client client){
        ms.addClient(client);
    }
    public void removeClient(Client client){
        ms.removeClient(client);
    }
    public void sellInstrument(int clientId, int instrumentId){
        ms.getClient(clientId).sellInstrument(instrumentId);
    }
    public void buyInstrument(int clientId, int instrumentId){
        ms.getClient(clientId).sellInstrument(instrumentId);
    }
    public void registerInstrument(int clientId, int instrumentId){
        if(ms.getClient(clientId)!=null && ms.getClient(clientId).getInstrument(instrumentId)!=null){
            ms.getClient(clientId).getInstrument(instrumentId).register();
        }
    }
    public void unregisterInstrument(int clientId, int instrumentId){
        if(ms.getClient(clientId)!=null && ms.getClient(clientId).getInstrument(instrumentId)!=null){
            ms.getClient(clientId).getInstrument(instrumentId).unregister();
        }
    }

}
