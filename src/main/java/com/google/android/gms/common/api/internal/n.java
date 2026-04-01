package com.google.android.gms.common.api.internal;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes.dex */
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z2.b<?> f4881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x2.d f4882b;

    /* synthetic */ n(z2.b bVar, x2.d dVar, z2.n nVar) {
        this.f4881a = bVar;
        this.f4882b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (a3.n.a(this.f4881a, nVar.f4881a) && a3.n.a(this.f4882b, nVar.f4882b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a3.n.b(this.f4881a, this.f4882b);
    }

    public final String toString() {
        return a3.n.c(this).a(SubscriberAttributeKt.JSON_NAME_KEY, this.f4881a).a("feature", this.f4882b).toString();
    }
}
