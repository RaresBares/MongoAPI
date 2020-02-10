package de.mymongo.client;

import com.mongodb.MongoClient;
import de.mymongo.client.group.db.TargetDatabase;

public class BetterClient extends MongoClient {

    private TargetDatabase target = null;

    public BetterClient(String host, int port) {
        super(host,port);
    }

    public void target(String db) {
        TargetDatabase datab = new TargetDatabase(this, db);
        this.target = datab;
    }

    public TargetDatabase getTarget() {
        return target;
    }

    public void createDB(String name){
        if(!getDatabaseNames().contains(name)){
            createDB(name);
        }else {
            System.out.println("DB exists!");
        }


    }



}
