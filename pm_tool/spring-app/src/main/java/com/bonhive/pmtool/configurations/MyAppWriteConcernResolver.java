package com.bonhive.pmtool.configurations;

import com.mongodb.WriteConcern;
import org.springframework.data.mongodb.core.MongoAction;
import org.springframework.data.mongodb.core.WriteConcernResolver;

public class MyAppWriteConcernResolver implements WriteConcernResolver {

    public WriteConcern resolve(MongoAction action) {
        if (action.getEntityType().getSimpleName().contains("Audit")) {
            return WriteConcern.UNACKNOWLEDGED;
        } else if (action.getEntityType().getSimpleName().contains("Metadata")) {
            return WriteConcern.JOURNALED;
        }
        return action.getDefaultWriteConcern();
    }
}
