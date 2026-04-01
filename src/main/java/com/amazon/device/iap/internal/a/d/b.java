package com.amazon.device.iap.internal.a.d;

import com.amazon.a.a.n.a.h;
import com.amazon.d.a.j;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.c;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f4243d = "purchase_fulfilled";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Set<String> f4244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final String f4245c;

    public b(c cVar, Set<String> set, String str) {
        super(cVar, f4243d, com.amazon.a.a.o.b.ae, cVar.d().toString(), PurchasingService.SDK_VERSION);
        this.f4244b = set;
        this.f4245c = str;
        b(false);
        a(com.amazon.a.a.o.b.F, set);
        a(com.amazon.a.a.o.b.f3897g, str);
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        return true;
    }

    @Override // com.amazon.a.a.n.a.h
    public void l() {
        Object objA = j().a().a(com.amazon.a.a.o.b.al);
        if (objA != null && Boolean.FALSE.equals(objA)) {
            a(com.amazon.a.a.o.b.f3897g, com.amazon.device.iap.internal.model.a.DELIVERY_ATTEMPTED.toString());
        }
        super.l();
    }
}
