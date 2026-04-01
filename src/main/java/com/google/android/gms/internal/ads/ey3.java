package com.google.android.gms.internal.ads;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ey3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ey3 f7544b = new ey3(new fy3());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ey3 f7545c = new ey3(new jy3());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ey3 f7546d = new ey3(new ly3());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ey3 f7547e = new ey3(new ky3());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ey3 f7548f = new ey3(new gy3());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ey3 f7549g = new ey3(new iy3());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ey3 f7550h = new ey3(new hy3());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final dy3 f7551a;

    public ey3(my3 my3Var) {
        this.f7551a = vn3.b() ? new cy3(my3Var, null) : ty3.a() ? new xx3(my3Var, null) : new ay3(my3Var, null);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        return this.f7551a.a(str);
    }
}
