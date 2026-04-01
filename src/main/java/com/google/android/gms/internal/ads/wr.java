package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.os.Environment;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class wr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16861a;

    public wr(Context context) {
        a3.o.k(context, "Context can not be null");
        this.f16861a = context;
    }

    public final boolean a(Intent intent) {
        a3.o.k(intent, "Intent can not be null");
        return !this.f16861a.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    public final boolean b() {
        return a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean c() {
        return ((Boolean) j2.k1.a(this.f16861a, new Callable() { // from class: com.google.android.gms.internal.ads.vr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
            }
        })).booleanValue() && f3.e.a(this.f16861a).a("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
