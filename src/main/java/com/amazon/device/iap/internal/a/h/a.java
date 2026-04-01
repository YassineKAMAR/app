package com.amazon.device.iap.internal.a.h;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;

/* JADX INFO: loaded from: classes.dex */
public class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f4264b = "submit_metric";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f4265c = "metricName";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4266d = "metricAttributes";

    public a(c cVar, String str, String str2) {
        super(cVar, f4264b, "1.0", cVar.d().toString(), PurchasingService.SDK_VERSION);
        a(f4265c, str);
        a(f4266d, str2);
        b(false);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        return true;
    }
}
