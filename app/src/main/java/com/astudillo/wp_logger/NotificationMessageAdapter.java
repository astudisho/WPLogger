package com.astudillo.wp_logger;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by astudillo on 3/19/18.
 */

public class NotificationMessageAdapter extends ArrayAdapter<NotificationMessage> {

    Context context;
    int layoutResourceId;
    ArrayList<NotificationMessage> data;

    public NotificationMessageAdapter(@NonNull Context context, int resource, @NonNull ArrayList<NotificationMessage> data) {
        super(context, resource, data);
        this.context = context;
        this.layoutResourceId = resource;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        NotificationMessage notificationMessage = getItem(position);

        if(convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item,parent,false);

        TextView txvContacto = (TextView) convertView.findViewById(R.id.txvContacto);
        TextView txvMensaje = (TextView) convertView.findViewById(R.id.txvMensaje);

        txvContacto.setText(notificationMessage.GetContacto());
        txvMensaje.setText(notificationMessage.GetMensaje());

        return  convertView;
    }
}
