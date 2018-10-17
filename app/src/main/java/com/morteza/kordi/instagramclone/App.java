package com.morteza.kordi.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("k1NTgaT62qAyjnQiVz5aG5A5O6qWoFALHMkymCio")
                // if defined
                .clientKey("CWAO69q6VlMem0vRvfnYliPnhHSswNRE8307cebn")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
