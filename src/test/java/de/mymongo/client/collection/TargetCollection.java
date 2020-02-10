package de.mymongo.client.collection;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;

import java.util.HashMap;
import java.util.List;

public class TargetCollection extends DBCollection {
    public TargetCollection(DB database, String name) {
        super(database, name);
    }


    public List<DBObject> objects(){
        return getHintFields();
    }
    public List<DBObject> get(HashMap<String, String> values){
        return find(new BasicDBObject(values)).toArray();
    }

    public void delete(HashMap<String, String> values){
        for (DBObject dbObject : get(values)) {
            remove(dbObject);
        }

    }

    public DBObject fetch(HashMap<String, String> values){
        DBObject object = new BasicDBObject(values);
        return object;
    }

    public void create(HashMap<String, String> values){
        insert(fetch(values));
    }

    public void change(HashMap<String, String> values){
        BasicDBObject query = new BasicDBObject();
        query.put("name", "Shubham");
    }
}
