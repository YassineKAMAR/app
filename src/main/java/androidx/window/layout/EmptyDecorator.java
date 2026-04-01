package androidx.window.layout;

import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    @Override // androidx.window.layout.WindowInfoTrackerDecorator
    public WindowInfoTracker decorate(WindowInfoTracker tracker) {
        q.f(tracker, "tracker");
        return tracker;
    }
}
