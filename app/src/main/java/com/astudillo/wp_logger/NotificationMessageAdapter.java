package com.astudillo.wp_logger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by astudillo on 3/19/18.
 */

public class NotificationMessageAdapter extends ArrayAdapter<NotificationMessage> {

    Context context;
    int layoutResourceId;
    NotificationMessage data[];

    public NotificationMessageAdapter(@NonNull Context context, int resource, @NonNull NotificationMessage[] data) {
        super(context, resource, data);
        this.context = context;
        this.layoutResourceId = resource;
        this.data = data;
    }
}
