package io.flutter.embedding.android;

import android.app.Activity;
import androidx.window.java.layout.WindowInfoTrackerCallbackAdapter;
import androidx.window.layout.WindowLayoutInfo;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WindowInfoTrackerCallbackAdapter f22640a;

    public f0(WindowInfoTrackerCallbackAdapter windowInfoTrackerCallbackAdapter) {
        this.f22640a = windowInfoTrackerCallbackAdapter;
    }

    public void a(Activity activity, Executor executor, androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.f22640a.addWindowLayoutInfoListener(activity, executor, aVar);
    }

    public void b(androidx.core.util.a<WindowLayoutInfo> aVar) {
        this.f22640a.removeWindowLayoutInfoListener(aVar);
    }
}
