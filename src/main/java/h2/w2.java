package h2;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.ads.jg0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f22334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f22335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f22336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f22337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f22338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bundle f22339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f22340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f22341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f22342i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f22343j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set f22344k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Bundle f22345l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f22346m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f22347n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f22348o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f22349p;

    public w2(v2 v2Var, t2.a aVar) {
        this.f22334a = v2Var.f22320g;
        this.f22335b = v2Var.f22321h;
        this.f22336c = v2Var.f22322i;
        this.f22337d = v2Var.f22323j;
        this.f22338e = Collections.unmodifiableSet(v2Var.f22314a);
        this.f22339f = v2Var.f22315b;
        this.f22340g = Collections.unmodifiableMap(v2Var.f22316c);
        this.f22341h = v2Var.f22324k;
        this.f22342i = v2Var.f22325l;
        this.f22343j = v2Var.f22326m;
        this.f22344k = Collections.unmodifiableSet(v2Var.f22317d);
        this.f22345l = v2Var.f22318e;
        this.f22346m = Collections.unmodifiableSet(v2Var.f22319f);
        this.f22347n = v2Var.f22327n;
        this.f22348o = v2Var.f22328o;
        this.f22349p = v2Var.f22329p;
    }

    @Deprecated
    public final int a() {
        return this.f22337d;
    }

    public final int b() {
        return this.f22349p;
    }

    public final int c() {
        return this.f22343j;
    }

    public final Bundle d() {
        return this.f22345l;
    }

    public final Bundle e(Class cls) {
        return this.f22339f.getBundle(cls.getName());
    }

    public final Bundle f() {
        return this.f22339f;
    }

    public final t2.a g() {
        return null;
    }

    public final String h() {
        return this.f22348o;
    }

    public final String i() {
        return this.f22335b;
    }

    public final String j() {
        return this.f22341h;
    }

    public final String k() {
        return this.f22342i;
    }

    @Deprecated
    public final Date l() {
        return this.f22334a;
    }

    public final List m() {
        return new ArrayList(this.f22336c);
    }

    public final Set n() {
        return this.f22346m;
    }

    public final Set o() {
        return this.f22338e;
    }

    @Deprecated
    public final boolean p() {
        return this.f22347n;
    }

    public final boolean q(Context context) {
        z1.v vVarD = j3.g().d();
        v.b();
        Set set = this.f22344k;
        String strC = jg0.C(context);
        return set.contains(strC) || vVarD.e().contains(strC);
    }
}
