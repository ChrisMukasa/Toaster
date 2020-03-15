package com.chris.mukasa.toastlibrary;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 **** This Library is the property for Chris Simba Mukasa
 **** Email: mukasa.chris7@gmail.com
 **** Phone: +243-994-802-444
 **** R.D.Congo
 **** Edition March 2020
 **** Mobile Developer Enthusiast
 */

public class Toaster
{
    /**
     * For the success toast custom message
     * @param context the base context
     * @param message the displayed message
     */
    @SuppressLint("InflateParams")
    public void success(Context context, String message)
    {
        View toast = LayoutInflater.from(context).inflate(R.layout.toast_success, null);
        TextView lb_toast_message = toast.findViewById(R.id.lb_toast_message);
        lb_toast_message.setText(message);
        Toast widget = new Toast(context);
        widget.setView(toast);
        widget.setDuration(Toast.LENGTH_SHORT);
        widget.show();
    }

    /**
     * For the error toast custom message
     * @param context the base context
     * @param message the displayed message
     */
    @SuppressLint("InflateParams")
    public void error(Context context, String message)
    {
        View toast = LayoutInflater.from(context).inflate(R.layout.toast_error, null);
        TextView lb_toast_message = toast.findViewById(R.id.lb_toast_message);
        lb_toast_message.setText(message);
        Toast widget = new Toast(context);
        widget.setView(toast);
        widget.setDuration(Toast.LENGTH_LONG);
        widget.show();
    }

    /**
     * For the updating toast custom message
     * @param context the base context
     * @param message the displayed message
     */
    @SuppressLint("InflateParams")
    public void updating(Context context, String message)
    {
        View toast = LayoutInflater.from(context).inflate(R.layout.toast_updating, null);
        TextView lb_toast_message = toast.findViewById(R.id.lb_toast_message);
        lb_toast_message.setText(message);
        Toast widget = new Toast(context);
        widget.setView(toast);
        widget.setDuration(Toast.LENGTH_SHORT);
        widget.show();
    }

    /**
     * For the no connection toast custom message
     * @param context the base context
     * @param message the displayed message
     */
    @SuppressLint("InflateParams")
    public void no_connection(Context context, String message)
    {
        View toast = LayoutInflater.from(context).inflate(R.layout.toast_no_connection, null);
        TextView lb_toast_message = toast.findViewById(R.id.lb_toast_message);
        lb_toast_message.setText(message);
        Toast widget = new Toast(context);
        widget.setView(toast);
        widget.setDuration(Toast.LENGTH_SHORT);
        widget.show();
    }

    /**
     * For the wrong toast custom message
     * @param context the base context
     * @param message the displayed message
     */
    @SuppressLint("InflateParams")
    public void wrong(Context context, String message)
    {
        View toast = LayoutInflater.from(context).inflate(R.layout.toast_wrong, null);
        TextView lb_toast_message = toast.findViewById(R.id.lb_toast_message);
        lb_toast_message.setText(message);
        Toast widget = new Toast(context);
        widget.setView(toast);
        widget.setDuration(Toast.LENGTH_LONG);
        widget.show();
    }
}
