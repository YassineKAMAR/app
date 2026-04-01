package com.amazon.device.iap.internal.a.e;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.util.MetricsHelper;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f4249b = "purchase_item";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f4250f = "a";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f4251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f4252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f4253e;

    a(com.amazon.device.iap.internal.a.c cVar, String str, String str2) {
        super(cVar, f4249b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f4253e = str2;
        a("sku", str2);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        String str = f4250f;
        com.amazon.device.iap.internal.util.b.a(str, "data: " + mapB);
        if (!mapB.containsKey(com.amazon.a.a.o.b.f3916z)) {
            com.amazon.device.iap.internal.util.b.b(str, "did not find intent");
            return false;
        }
        com.amazon.device.iap.internal.util.b.a(str, "found intent");
        final Intent intent = (Intent) mapB.remove(com.amazon.a.a.o.b.f3916z);
        this.f4251c.b(com.amazon.a.a.n.b.d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.iap.internal.a.e.a.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = a.this.f4252d.b();
                    if (activityB == null) {
                        activityB = a.this.f4252d.a();
                    }
                    com.amazon.device.iap.internal.util.b.a(a.f4250f, "About to fire intent with activity " + activityB);
                    activityB.startActivity(intent);
                } catch (Exception e8) {
                    MetricsHelper.submitExceptionMetrics(a.this.k(), a.f4250f + ".onResult().execute()", e8);
                    com.amazon.device.iap.internal.util.b.b(a.f4250f, "Exception when attempting to fire intent: " + e8);
                }
            }
        });
        return true;
    }
}
