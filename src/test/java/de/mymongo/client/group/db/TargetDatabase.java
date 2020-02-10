package de.mymongo.client.group.db;

import com.mongodb.DB;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import de.mymongo.client.group.collection.TargetCollection;

public class TargetDatabase extends DB {

    private TargetCollection target;

    public TargetDatabase(Mongo mongo, String name) {
        super(mongo, name);
    }

    public TargetCollection getTarget() {
        return target;
    }

    public void setTarget(String target) {
        if (getCollectionNames().contains(target)) {
            this.target = new TargetCollection(this, target);
        } else {

        }

    }

    public void createTarget(String target, DBObject options) {
        createCollection(target, options);
    }

    public void createTarget(String target) {
        createCollection(target, null);
    }


}
