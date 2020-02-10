package de.mymongo.client.db;

import com.mongodb.DB;
import com.mongodb.Mongo;

public class TargetDatabase  extends DB {
    

    public TargetDatabase(Mongo mongo, String name) {
        super(mongo, name);
    }
}
