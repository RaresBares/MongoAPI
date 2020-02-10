package de.mymongo.client.collection;

import com.mongodb.DB;
import com.mongodb.DBCollection;

public class TargetCollection extends DBCollection {
    protected TargetCollection(DB database, String name) {
        super(database, name);
    }
}
