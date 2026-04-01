package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class y84 extends androidx.browser.customtabs.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference f17636b;

    public y84(qt qtVar) {
        this.f17636b = new WeakReference(qtVar);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        qt qtVar = (qt) this.f17636b.get();
        if (qtVar != null) {
            qtVar.c(cVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        qt qtVar = (qt) this.f17636b.get();
        if (qtVar != null) {
            qtVar.d();
        }
    }
}
