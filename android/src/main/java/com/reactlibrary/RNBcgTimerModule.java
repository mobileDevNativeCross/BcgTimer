
package com.reactlibrary;

import android.content.Context;
import android.content.SharedPreferences;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNBcgTimerModule extends ReactContextBaseJavaModule {

  private ReactApplicationContext reactContext;

  public RNBcgTimerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNBcgTimer";
  }


  @ReactMethod
  public void changeStatus(Boolean status) {
    SharedPreferences shared = reactContext.getSharedPreferences("myData", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor = shared.edit();
    editor.putBoolean("status", status);
    editor.commit();
  }
}