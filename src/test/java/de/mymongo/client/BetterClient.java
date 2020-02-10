package de.mymongo.client;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class BetterClient extends MongoClient {

    private DB target = null;

    public BetterClient(String host, int port) {
        super(host,port);
    }

    public void setTarget(String db) {
        DB datab = getDB(db);
        this.target = datab;
    }
}
