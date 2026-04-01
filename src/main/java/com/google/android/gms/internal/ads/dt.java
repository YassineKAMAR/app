package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class dt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f7004a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gt f7005b;

    public dt(gt gtVar) {
        this.f7005b = gtVar;
    }

    public final gt a() {
        return this.f7005b;
    }

    public final void b(String str, ct ctVar) {
        this.f7004a.put(str, ctVar);
    }

    public final void c(String str, String str2, long j8) {
        ct ctVar = (ct) this.f7004a.get(str2);
        String[] strArr = {str};
        if (ctVar != null) {
            this.f7005b.e(ctVar, j8, strArr);
        }
        this.f7004a.put(str, new ct(j8, null, null));
    }
}
