package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class qr4 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Comparator f13737g = new Comparator() { // from class: com.google.android.gms.internal.ads.mr4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((pr4) obj).f13120a - ((pr4) obj2).f13120a;
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Comparator f13738h = new Comparator() { // from class: com.google.android.gms.internal.ads.nr4
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((pr4) obj).f13122c, ((pr4) obj2).f13122c);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13742d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f13743e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f13744f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pr4[] f13740b = new pr4[5];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f13739a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f13741c = -1;

    public qr4(int i8) {
    }

    public final float a(float f8) {
        if (this.f13741c != 0) {
            Collections.sort(this.f13739a, f13738h);
            this.f13741c = 0;
        }
        float f9 = this.f13743e;
        int i8 = 0;
        for (int i9 = 0; i9 < this.f13739a.size(); i9++) {
            float f10 = 0.5f * f9;
            pr4 pr4Var = (pr4) this.f13739a.get(i9);
            i8 += pr4Var.f13121b;
            if (i8 >= f10) {
                return pr4Var.f13122c;
            }
        }
        if (this.f13739a.isEmpty()) {
            return Float.NaN;
        }
        return ((pr4) this.f13739a.get(r6.size() - 1)).f13122c;
    }

    public final void b(int i8, float f8) {
        pr4 pr4Var;
        int i9;
        pr4 pr4Var2;
        int i10;
        if (this.f13741c != 1) {
            Collections.sort(this.f13739a, f13737g);
            this.f13741c = 1;
        }
        int i11 = this.f13744f;
        if (i11 > 0) {
            pr4[] pr4VarArr = this.f13740b;
            int i12 = i11 - 1;
            this.f13744f = i12;
            pr4Var = pr4VarArr[i12];
        } else {
            pr4Var = new pr4(null);
        }
        int i13 = this.f13742d;
        this.f13742d = i13 + 1;
        pr4Var.f13120a = i13;
        pr4Var.f13121b = i8;
        pr4Var.f13122c = f8;
        this.f13739a.add(pr4Var);
        int i14 = this.f13743e + i8;
        while (true) {
            this.f13743e = i14;
            while (true) {
                int i15 = this.f13743e;
                if (i15 <= 2000) {
                    return;
                }
                i9 = i15 - 2000;
                pr4Var2 = (pr4) this.f13739a.get(0);
                i10 = pr4Var2.f13121b;
                if (i10 <= i9) {
                    this.f13743e -= i10;
                    this.f13739a.remove(0);
                    int i16 = this.f13744f;
                    if (i16 < 5) {
                        pr4[] pr4VarArr2 = this.f13740b;
                        this.f13744f = i16 + 1;
                        pr4VarArr2[i16] = pr4Var2;
                    }
                }
            }
            pr4Var2.f13121b = i10 - i9;
            i14 = this.f13743e - i9;
        }
    }

    public final void c() {
        this.f13739a.clear();
        this.f13741c = -1;
        this.f13742d = 0;
        this.f13743e = 0;
    }
}
