package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.concurrent.atomic.AtomicMarkableReference;

public class Toaster {
    private static FirebaseDatabase database = FirebaseDatabase.getInstance();
    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }

    public static void captureEvent(Boolean val){
        DatabaseReference myRef = database.getReference("installed");
        myRef.setValue(val);
    }

    public  static  void  setApplicationName(String appName){
        DatabaseReference applicationNameRef = database.getReference("applicationDetails");
        User user = new User(appName,"roshan_persistent.com");
        applicationNameRef.child("2").setValue(user);
    }

}

