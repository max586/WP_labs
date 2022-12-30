package Facade;

import java.util.ArrayList;
import java.util.List;

public class ManagmentSystem {
    List<Client> clients;

    public ManagmentSystem(){
        clients = new ArrayList<>();
    }
    public void addClient(Client client){
        clients.add(client);
    }
    public void removeClient(Client client){
        clients.remove(client);
    }

    public Client getClient(int id) {
        return clients.stream().filter(e->e.getId()==id).findFirst().orElse(null);
    }
}
