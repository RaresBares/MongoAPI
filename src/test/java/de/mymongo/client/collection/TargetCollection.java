package de.mymongo.client.collection;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import java.util.List;

public class TargetCollection extends DBCollection {
    public TargetCollection(DB database, String name) {
        super(database, name);
    }


    public List<DBObject>  
}
