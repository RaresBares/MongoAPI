package de.mymongo;

import de.mymongo.client.MyMongoClient;

public class myMongo {

    private MyMongoClient client = null;
    private static myMongo myMongo = null;

    private myMongo(String host, int port) {
        client = new MyMongoClient(host, port);
    }

    public static de.mymongo.myMongo getMyMongo(String host, int port) {
        if (myMongo == null) {
            myMongo = new myMongo(host, port);
        } else {

        }
        return myMongo;

    }

  public MyMongoClient getClient() {
    return client;
  }
}
