package io.flutter.plugin.platform;

import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private io.flutter.view.g f22937a;

    a() {
    }

    public boolean a(MotionEvent motionEvent, boolean z7) {
        io.flutter.view.g gVar = this.f22937a;
        if (gVar == null) {
            return false;
        }
        return gVar.M(motionEvent, z7);
    }

    public boolean b(View view, View view2, AccessibilityEvent accessibilityEvent) {
        io.flutter.view.g gVar = this.f22937a;
        if (gVar == null) {
            return false;
        }
        return gVar.w(view, view2, accessibilityEvent);
    }

    void c(io.flutter.view.g gVar) {
        this.f22937a = gVar;
    }
}
