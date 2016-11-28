package io.sichacvah.circularseekbar;

import javax.annotation.Nullable;

import java.util.Map;

import android.graphics.Color;
import android.graphics.PorterDuff.Mode;

import com.facebook.csslayout.CSSConstants;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;


public class ReactCircularSeekBarManager extends SimpleViewManager<ReactCircularSeekBar> {
    protected static final String REACT_CLASS = "CircularSeekBarView";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    public ReactCircularSeekBar createViewInstance(ThemedReactContext context) {
        return new ReactCircularSeekBar(context);
    }

    @ReactProp(name = "circleColor",  customType = "Color")
    public void setElevation(ReactCircularSeekBar view, Integer color) {
        view.setCircleColor(color);        
    }

    @ReactProp(name = "circleProgressColor", customType = "Color")
    public void setProgressColor(ReactCircularSeekBar view, Integer color) {
            view.setCircleProgressColor(color);
    }

    @ReactProp(name = "progress")
    public void setProgress(ReactCircularSeekBar view,  Integer progress) {
            view.setProgress(progress);
    }

    @ReactProp(name = "strokeWidth")
    public void setCircleStroke(ReactCircularSeekBar view,  float width) {
            view.mCirclePaint.setStrokeWidth(width);
    }

    @ReactProp(name = "circleXRadius")
    public void setCircleXRadius(ReactCircularSeekBar view,  float radius) {
            view.mCircleXRadius = radius;
    }

    @ReactProp(name = "circleYRadius")
    public void setCircleYRadius(ReactCircularSeekBar view,  float radius) {
            view.mCircleYRadius = radius;
    }

    @ReactProp(name = "endAngle")
    public void setEndAngle(ReactCircularSeekBar view,  float angle) {
            view.mEndAngle = angle;
            view.calculateTotalDegrees();
            view.calculateProgressDegrees();
            view.calculatePointerAngle();
            view.initPaths();
    }

    @ReactProp(name = "startAngle")
    public void setStartAngle(ReactCircularSeekBar view,  float angle) {
            view.mStartAngle = angle;
            view.calculateTotalDegrees();
            view.calculateProgressDegrees();
            view.calculatePointerAngle();
            view.initPaths();
    }

    @ReactProp(name = "max")
    public void setMax(ReactCircularSeekBar view,  int max) {
            view.setMax(max);
    }

    @ReactProp(name = "pointerAlphaOnTouch")
    public void setPointerAlphaOnTouch(ReactCircularSeekBar view,  int alpha) {
            view.setAlpha(alpha);
    }

    @ReactProp(name = "pointerColor",customType = "Color")
    public void setPointerColor(ReactCircularSeekBar view,  int color) {
            view.setPointerColor(color);
    }

    @ReactProp(name = "pointerHaloColor", customType="Color")
    public void setPointerHaloColor(ReactCircularSeekBar view,  int color) {
            view.setPointerHaloColor(color);
    }

    @ReactProp(name = "pointerHaloColorOnTouch", customType="Color")
    public void setPointerHaloColorOnTouch(ReactCircularSeekBar view,  int color) {
        view.mPointerHaloColorOnTouch = color
    }


    @ReactProp(name = "useCustomRadius")
    public void useCustomRadius(ReactCircularSeekBar view,  boolean use) {
            view.mCustomRadii = use;
    }




}