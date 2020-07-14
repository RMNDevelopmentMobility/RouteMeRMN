package com.routemermn;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Helper {
    public static void showLog(String message) {
        Log.e("### RouteMeRMN: ", "" + message);
    }

    public static void showToast(Context context, String message) {
        Toast.makeText(context, "" + message, 0).show();
    }
}
