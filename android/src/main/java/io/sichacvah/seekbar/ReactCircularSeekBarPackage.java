package io.sichacvah.circularseekbar;

import android.app.Activity;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * The React package.
 */
public class ReactCircularSeekBarPackage implements ReactPackage {
    public ReactCircularSeekBarPackage() {
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        // modules.add(new PlayerModule(reactContext));
        return modules;
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return Collections.emptyList();
    }

    @Override
    public List<SimpleViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Arrays.<SimpleViewManager>asList(
            new ReactCircularSeekBarManager()
        );
        
    }
}