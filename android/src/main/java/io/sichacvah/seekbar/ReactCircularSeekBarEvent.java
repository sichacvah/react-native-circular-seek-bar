package io.sichacvah.circularseekbar;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;


public class ReactCircularSeekBarEvent extends Event<ReactCircularSeekBarEvent> {
    public static final String EVENT_NAME = "topChange";

    private final int mProgress;
    private final boolean mFromUser;

    public ReactCircularSeekBarEvent(int viewId, int progress, boolean fromUser) {
        super(viewId);
        mProgress = progress;
        mFromUser = fromUser;
    }

    public int getProgress() {
        return mProgress;
    }

    public boolean isFromUser() {
        return mFromUser;
    }

    @Override
    public String getEventName() {
        return EVENT_NAME;
    }

    @Override
    public short getCoalescingKey() {
        return 0;
    }

    @Override
    public void dispatch(RCTEventEmitter rtcEventEmitter) {
        rtcEventEmitter.receiveEvent(getViewTag(), getEventName(), serializeEventData());
    }

    private WritableMap serializeEventData() {
        WritableMap eventData = Arguments.createMap();
        eventData.putInt("target", getViewTag());
        eventData.putInt("value", getProgress());
        eventData.putBoolean("fromUser", isFromUser());
        return eventData;
    }
}
