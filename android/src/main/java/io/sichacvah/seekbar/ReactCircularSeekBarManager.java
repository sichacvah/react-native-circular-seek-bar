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


@ReactModule(name = ReactCircularSeekBarManager.REACT_CLASS)
public class ReactCircularSeekBarManager extends SimpleViewManager<ReactCircularSeekBar> {
    protected static final String REACT_CLASS = "ReactCircularSeekBarManager";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    public Object getCallerContext() {
        return mCallerContext;
    }

    @Override
    public ReactCircularSeekBar createViewInstance(ThemedReactContext context) {
        return new ReactCircularSeekBar(context);
    }

    @ReactProp(name = "circleColor",  customType = "Color")
    public void setElevation(ReactCircularSeekBar view, @Nullable Integer color) {
        if (color == null) {
            view.setCircleColor(Color.TRANSPARENT);
        } else {
            view.setCircleColor(color);
        }
    }

    @ReactProp(name = "circleProgressColor", customType = "Color")
    public void setProgressColor(ReactCircularSeekBar view, @Nullable Integer color) {
        if (color == null) {
            view.setCircleProgressColor(Color.TRANSPARENT);
        } else {
            view.setCircleProgressColor(color);
        }
    }

    @ReactProp(name = "progress")
    public void setProgress(ReactCircularSeekBar view, @Nullable Integer progress) {
        if (progress != null) {
            view.setProgress(progress);
        }
    }

    @ReactProp(name = "strokeWidth")
    public void setCircleStroke(ReactCircularSeekBar view, @Nullable float width) {
        if (width != null) {
            view.mCirclePaint.setBorderWidth(width);
        }
    }

    @ReactProp(name = "circleXRadius")
    public void setCircleXRadius(ReactCircularSeekBar view, @Nullable float radius) {
        if (radius != null) {
            view.mCircleXRadius = radius;
        }
    }

    @ReactProp(name = "circleYRadius")
    public void setCircleYRadius(ReactCircularSeekBar view, @Nullable float radius) {
        if (radius != null) {
            view.mCircleYRadius = radius;
        }
    }

    @ReactProp(name = "endAngle")
    public void setCircleYRadius(ReactCircularSeekBar view, @Nullable float angle) {
        if (angle != null) {
            view.mEndAngle = angle;
            view.calculateTotalDegrees();
            view.calculateProgressDegrees();
            view.calculatePointerAngle();
            view.initPaths();
        }
    }

    @ReactProp(name = "startAngle")
    public void setCircleYRadius(ReactCircularSeekBar view, @Nullable float angle) {
        if (angle != null) {
            view.mStartAngle = angle;
            view.calculateTotalDegrees();
            view.calculateProgressDegrees();
            view.calculatePointerAngle();
            view.initPaths();
        }
    }

    @ReactProp(name = "max")
    public void setMax(ReactCircularSeekBar view, @Nullable int max) {
        if (max != null) {
            view.setMax(max);
        }
    }

    @ReactProp(name = "pointerAlphaOnTouch")
    public void setPointerAlphaOnTouch(ReactCircularSeekBar view, @Nullable int alpha) {
        if (alpha != null) {
            view.setAlpha(alpha);
        }
    }

    @ReactProp(name = "pointerColor")
    public void setPointerColor(ReactCircularSeekBar view, @Nullable int color) {
        if (color == null) {
            view.setPointerColor(Color.TRANSPARENT);
        } else {
            view.setPointerColor(color);
        }
    }

    @ReactProp(name = "reactHaloColor")
    public void setPointerHaloColor(ReactCircularSeekBar view, @Nullable int color) {
        if (color == null) {
            view.setPointerHaloColor(Color.TRANSPARENT);
        } else {
            view.setPointerHaloColor(color);
        }
    }


    @ReactProp(name = "useCustomRadius")
    public void useCustomRadius(ReactCircularSeekBar view, @Nullable boolean use) {
        if (use != null) {
            view.mCustomRadii = use;
        }
    }




}