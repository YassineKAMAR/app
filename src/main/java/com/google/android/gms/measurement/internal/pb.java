package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class pb extends ua {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f20380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Set<Integer> f20381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<Integer, rb> f20382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Long f20383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f20384h;

    pb(va vaVar) {
        super(vaVar);
    }

    private final boolean A(int i8, int i9) {
        rb rbVar = this.f20382f.get(Integer.valueOf(i8));
        if (rbVar == null) {
            return false;
        }
        return rbVar.f20465d.get(i9);
    }

    private final rb y(Integer num) {
        if (this.f20382f.containsKey(num)) {
            return this.f20382f.get(num);
        }
        rb rbVar = new rb(this, this.f20380d);
        this.f20382f.put(num, rbVar);
        return rbVar;
    }

    @Override // com.google.android.gms.measurement.internal.ua
    protected final boolean x() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x02fc A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List<com.google.android.gms.internal.measurement.u4> z(java.lang.String r53, java.util.List<com.google.android.gms.internal.measurement.w4> r54, java.util.List<com.google.android.gms.internal.measurement.f5> r55, java.lang.Long r56, java.lang.Long r57) {
        /*
            Method dump skipped, instruction units count: 1787
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.pb.z(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
