package com.amazon.device.iap.internal.a.a;

import com.amazon.a.a.n.a.h;
import com.amazon.device.iap.PurchasingService;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final String f4217b = "getItem_data";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Set<String> f4218c;

    a(com.amazon.device.iap.internal.a.c cVar, String str, Set<String> set) {
        super(cVar, f4217b, str, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f4218c = set;
        a(com.amazon.a.a.o.b.O, set);
    }
}
