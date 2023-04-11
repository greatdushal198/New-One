package com.wigzo.sdk.models;

import com.wigzo.sdk.base.ValidationException;

import java.util.ArrayList;

public class EventDataList extends ArrayList<EventData> {

    public boolean hasValidItems() throws ValidationException {
        for (EventData eventData : this) {
            if(!eventData.isValid()) {
                System.out.println("Wigzo new SDK");
                throw new ValidationException();
            }
        }
        return true;
    }
}
