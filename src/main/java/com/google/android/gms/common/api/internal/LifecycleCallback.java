package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import z2.e0;
import z2.g0;

/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final z2.e f4813a;

    protected LifecycleCallback(z2.e eVar) {
        this.f4813a = eVar;
    }

    public static z2.e c(Activity activity) {
        return d(new z2.d(activity));
    }

    protected static z2.e d(z2.d dVar) {
        if (dVar.d()) {
            return g0.r1(dVar.b());
        }
        if (dVar.c()) {
            return e0.f(dVar.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    @Keep
    private static z2.e getChimeraLifecycleFragmentImpl(z2.d dVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        Activity activityD = this.f4813a.d();
        a3.o.j(activityD);
        return activityD;
    }

    public void e(int i8, int i9, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
