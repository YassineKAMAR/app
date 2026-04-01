package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class uz2 extends qz2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f15937i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sz2 f15938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rz2 f15939b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z13 f15941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private w03 f15942e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f15940c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f15943f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f15944g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f15945h = UUID.randomUUID().toString();

    uz2(rz2 rz2Var, sz2 sz2Var) {
        this.f15939b = rz2Var;
        this.f15938a = sz2Var;
        k(null);
        if (sz2Var.d() == tz2.HTML || sz2Var.d() == tz2.JAVASCRIPT) {
            this.f15942e = new x03(sz2Var.a());
        } else {
            this.f15942e = new a13(sz2Var.i(), null);
        }
        this.f15942e.k();
        i03.a().d(this);
        p03.a().d(this.f15942e.a(), rz2Var.b());
    }

    private final void k(View view) {
        this.f15941d = new z13(view);
    }

    @Override // com.google.android.gms.internal.ads.qz2
    public final void b(View view, xz2 xz2Var, String str) {
        l03 l03Var;
        if (this.f15944g) {
            return;
        }
        if (!f15937i.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        Iterator it = this.f15940c.iterator();
        while (true) {
            if (!it.hasNext()) {
                l03Var = null;
                break;
            } else {
                l03Var = (l03) it.next();
                if (l03Var.b().get() == view) {
                    break;
                }
            }
        }
        if (l03Var == null) {
            this.f15940c.add(new l03(view, xz2Var, "Ad overlay"));
        }
    }

    @Override // com.google.android.gms.internal.ads.qz2
    public final void c() {
        if (this.f15944g) {
            return;
        }
        this.f15941d.clear();
        if (!this.f15944g) {
            this.f15940c.clear();
        }
        this.f15944g = true;
        p03.a().c(this.f15942e.a());
        i03.a().e(this);
        this.f15942e.c();
        this.f15942e = null;
    }

    @Override // com.google.android.gms.internal.ads.qz2
    public final void d(View view) {
        if (this.f15944g || f() == view) {
            return;
        }
        k(view);
        this.f15942e.b();
        Collection<uz2> collectionC = i03.a().c();
        if (collectionC == null || collectionC.isEmpty()) {
            return;
        }
        for (uz2 uz2Var : collectionC) {
            if (uz2Var != this && uz2Var.f() == view) {
                uz2Var.f15941d.clear();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.qz2
    public final void e() {
        if (this.f15943f) {
            return;
        }
        this.f15943f = true;
        i03.a().f(this);
        this.f15942e.i(q03.c().a());
        this.f15942e.e(g03.a().c());
        this.f15942e.g(this, this.f15938a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View f() {
        return (View) this.f15941d.get();
    }

    public final w03 g() {
        return this.f15942e;
    }

    public final String h() {
        return this.f15945h;
    }

    public final List i() {
        return this.f15940c;
    }

    public final boolean j() {
        return this.f15943f && !this.f15944g;
    }
}
