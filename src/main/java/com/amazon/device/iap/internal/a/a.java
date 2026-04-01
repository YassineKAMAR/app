package com.amazon.device.iap.internal.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.amazon.a.a.i.h;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4210b = "a";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f4211e = "http://www.amazon.com/gp/mas/get-appstore/android/ref=mas_mx_mba_iap_dl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f4212f = "Amazon Appstore required";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f4213g = "Amazon Appstore Update Required";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f4214j = 31536000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.a.a f4215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.amazon.a.a.i.c f4216i;

    public a(com.amazon.a.a.i.c cVar) {
        super(cVar);
        this.f4216i = cVar;
    }

    @Override // com.amazon.a.a.e.c
    protected long h() {
        return 31536000L;
    }

    @Override // com.amazon.a.a.i.h
    protected void i() {
        com.amazon.device.iap.internal.util.b.a(f4210b, "doAction");
        if (f4212f.equalsIgnoreCase(this.f4216i.e()) || f4213g.equalsIgnoreCase(this.f4216i.e())) {
            try {
                Activity activityB = this.f4215h.b();
                if (activityB == null) {
                    activityB = this.f4215h.a();
                }
                activityB.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(f4211e)));
            } catch (Exception e8) {
                com.amazon.device.iap.internal.util.b.b(f4210b, "Exception in PurchaseItemCommandTask.OnSuccess: " + e8);
            }
        }
    }

    public String toString() {
        return f4210b;
    }
}
