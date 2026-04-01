package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class rf2 implements oi2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lg3 f14101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ViewGroup f14102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f14103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f14104d;

    public rf2(lg3 lg3Var, ViewGroup viewGroup, Context context, Set set) {
        this.f14101a = lg3Var;
        this.f14104d = set;
        this.f14102b = viewGroup;
        this.f14103c = context;
    }

    final /* synthetic */ sf2 a() {
        if (((Boolean) h2.y.c().b(ns.P5)).booleanValue() && this.f14102b != null && this.f14104d.contains("banner")) {
            return new sf2(Boolean.valueOf(this.f14102b.isHardwareAccelerated()));
        }
        Boolean boolValueOf = null;
        if (((Boolean) h2.y.c().b(ns.Q5)).booleanValue() && this.f14104d.contains("native")) {
            Context context = this.f14103c;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolValueOf = Boolean.valueOf((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    boolValueOf = Boolean.TRUE;
                }
                return new sf2(boolValueOf);
            }
        }
        return new sf2(null);
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final int j() {
        return 22;
    }

    @Override // com.google.android.gms.internal.ads.oi2
    public final x3.d k() {
        return this.f14101a.Z(new Callable() { // from class: com.google.android.gms.internal.ads.qf2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13443a.a();
            }
        });
    }
}
