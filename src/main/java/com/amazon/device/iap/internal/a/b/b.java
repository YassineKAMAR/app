package com.amazon.device.iap.internal.a.b;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;

/* JADX INFO: loaded from: classes.dex */
abstract class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f4222b = "purchase_updates";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final boolean f4223c;

    b(com.amazon.device.iap.internal.a.c cVar, String str, boolean z7) {
        super(cVar, f4222b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f4223c = z7;
    }

    @Override // com.amazon.a.a.n.a.a
    protected void e() {
        super.e();
        a(com.amazon.a.a.o.b.f3892b, this.f4223c ? null : com.amazon.device.iap.internal.util.a.a((String) ((com.amazon.device.iap.internal.a.c) j()).a().a("userId")));
    }
}
