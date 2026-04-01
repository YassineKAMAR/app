package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class ni3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentMap f11893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ii3 f11895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class f11896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ws3 f11897e;

    /* synthetic */ ni3(ConcurrentMap concurrentMap, List list, ii3 ii3Var, ws3 ws3Var, Class cls, mi3 mi3Var) {
        this.f11893a = concurrentMap;
        this.f11894b = list;
        this.f11895c = ii3Var;
        this.f11896d = cls;
        this.f11897e = ws3Var;
    }

    public final ii3 a() {
        return this.f11895c;
    }

    public final ws3 b() {
        return this.f11897e;
    }

    public final Class c() {
        return this.f11896d;
    }

    public final Collection d() {
        return this.f11893a.values();
    }

    public final List e(byte[] bArr) {
        List list = (List) this.f11893a.get(new li3(bArr, null));
        return list != null ? list : Collections.emptyList();
    }

    public final boolean f() {
        return !this.f11897e.a().isEmpty();
    }
}
