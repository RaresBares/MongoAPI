package de.mymongo;

import com.mongodb.MongoClient;
import de.mymongo.client.BetterClient;

public class myMongo {

    private BetterClient client = null;
    private static myMongo myMongo = null;

    private myMongo(String host, int port) {
        client = new BetterClient(host, port);
    }

    public static de.mymongo.myMongo getMyMongo(String host, int port) {
        if (myMongo == null) {
            myMongo = new myMongo(host, port);
        } else {

        }
        return myMongo;

    }

  public BetterClient getClient() {
    return client;
  }
}
