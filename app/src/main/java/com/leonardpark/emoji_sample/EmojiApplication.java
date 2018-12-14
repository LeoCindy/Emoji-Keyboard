package com.leonardpark.emoji_sample;

import android.app.Application;
import android.os.StrictMode;

import com.leonardpark.emoji.EmojiManager;
import com.leonardpark.emoji.google.GoogleEmojiProvider;

public class EmojiApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        EmojiManager.install(new GoogleEmojiProvider());

        if (BuildConfig.DEBUG) {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().build());
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().build());
        }

    }
}
