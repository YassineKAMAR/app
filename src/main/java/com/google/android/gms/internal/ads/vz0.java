package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16535a;

    public vz0(nz0 nz0Var) {
        this.f16535a = Collections.singletonList(zf3.h(nz0Var));
    }

    public vz0(List list) {
        this.f16535a = list;
    }

    public static x22 a(x22 x22Var) {
        return new y22(x22Var, new z73() { // from class: com.google.android.gms.internal.ads.uz0
            @Override // com.google.android.gms.internal.ads.z73
            public final Object apply(Object obj) {
                return new vz0((nz0) obj);
            }
        });
    }
}
