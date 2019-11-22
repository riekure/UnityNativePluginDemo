package com.example.unitynativepluginlibrary;

import android.app.AlertDialog;
import android.content.Context;

public class NativeDialog {
    static public void showMessage(Context context, String title, String message) {

        new AlertDialog.Builder(context)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("YES, YES, YES!", null)
                .setNegativeButton("...No?", null)
                .show();
    }

}
