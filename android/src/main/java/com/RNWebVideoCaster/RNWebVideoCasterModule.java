package com.RNWebVideoCaster;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import android.content.Intent;
import android.content.ActivityNotFoundException;
import android.net.Uri;

import java.util.Map;
import java.util.HashMap;

public class RNWebVideoCasterModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;

    RNWebVideoCasterModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
    }

    @Override
    public String getName() {
        return "RNWebVideoCaster";
    }

    @ReactMethod
    public void play(String videoURL) {
        
        Intent shareVideo = new Intent(Intent.ACTION_VIEW);
        shareVideo.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        shareVideo.setDataAndType(Uri.parse(videoURL), "video/*");
        shareVideo.setPackage("com.instantbits.cast.webvideo");

        try {
            getReactApplicationContext().startActivity(shareVideo);
        } catch (ActivityNotFoundException ex) {
            Intent goToMarket = new Intent(Intent.ACTION_VIEW);
            goToMarket.setData(Uri.parse("market://details?id=com.instantbits.cast.webvideo"));
            goToMarket.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            getReactApplicationContext().startActivity(goToMarket);
        }
    }
}
