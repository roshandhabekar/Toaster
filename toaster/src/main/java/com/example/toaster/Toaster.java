package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;

public class Toaster {
    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void captureEvent(){
        FirebaseDatabase fb = FirebaseDatabase.getInstance();

    }

}
