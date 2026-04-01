package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
final class qo4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zy1 f13582c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f13581b = new SparseArray();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f13580a = -1;

    public qo4(zy1 zy1Var) {
        this.f13582c = zy1Var;
    }

    public final Object a(int i8) {
        if (this.f13580a == -1) {
            this.f13580a = 0;
        }
        while (true) {
            int i9 = this.f13580a;
            if (i9 <= 0 || i8 >= this.f13581b.keyAt(i9)) {
                break;
            }
            this.f13580a--;
        }
        while (this.f13580a < this.f13581b.size() - 1 && i8 >= this.f13581b.keyAt(this.f13580a + 1)) {
            this.f13580a++;
        }
        return this.f13581b.valueAt(this.f13580a);
    }

    public final Object b() {
        return this.f13581b.valueAt(this.f13581b.size() - 1);
    }

    public final void c(int i8, Object obj) {
        if (this.f13580a == -1) {
            uu1.f(this.f13581b.size() == 0);
            this.f13580a = 0;
        }
        if (this.f13581b.size() > 0) {
            int iKeyAt = this.f13581b.keyAt(r0.size() - 1);
            uu1.d(i8 >= iKeyAt);
            if (iKeyAt == i8) {
                ko4.D((io4) this.f13581b.valueAt(r0.size() - 1));
            }
        }
        this.f13581b.append(i8, obj);
    }

    public final void d() {
        for (int i8 = 0; i8 < this.f13581b.size(); i8++) {
            ko4.D((io4) this.f13581b.valueAt(i8));
        }
        this.f13580a = -1;
        this.f13581b.clear();
    }

    public final void e(int i8) {
        int i9 = 0;
        while (i9 < this.f13581b.size() - 1) {
            int i10 = i9 + 1;
            if (i8 < this.f13581b.keyAt(i10)) {
                return;
            }
            ko4.D((io4) this.f13581b.valueAt(i9));
            this.f13581b.removeAt(i9);
            int i11 = this.f13580a;
            if (i11 > 0) {
                this.f13580a = i11 - 1;
            }
            i9 = i10;
        }
    }

    public final boolean f() {
        return this.f13581b.size() == 0;
    }
}
