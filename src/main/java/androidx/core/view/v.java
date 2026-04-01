package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    public static boolean a(MotionEvent motionEvent, int i8) {
        return (motionEvent.getSource() & i8) == i8;
    }
}
