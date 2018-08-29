package com.sopan.weather.view.base;


import android.support.v7.app.AppCompatActivity;

import com.sopan.weather.MainApplication;
import com.sopan.weather.dagger.DiComponent;

public abstract class BaseActivity extends AppCompatActivity {

    private MainApplication getMainApplication() {
        return (MainApplication) getApplication();
    }

    protected DiComponent getDiComponent() {
        return getMainApplication().getDiComponent();
    }

}
