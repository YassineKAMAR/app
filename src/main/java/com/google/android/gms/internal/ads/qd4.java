package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class qd4 extends r94 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f13415o = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f13416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f13417i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f13418j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f13419k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s11[] f13420l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object[] f13421m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HashMap f13422n;

    /* JADX WARN: Illegal instructions before constructor call */
    public qd4(Collection collection, oo4 oo4Var) {
        s11[] s11VarArr = new s11[collection.size()];
        Iterator it = collection.iterator();
        int i8 = 0;
        int i9 = 0;
        while (it.hasNext()) {
            s11VarArr[i9] = ((yc4) it.next()).j();
            i9++;
        }
        Object[] objArr = new Object[collection.size()];
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            objArr[i8] = ((yc4) it2.next()).k();
            i8++;
        }
        this(s11VarArr, objArr, oo4Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private qd4(s11[] s11VarArr, Object[] objArr, oo4 oo4Var) {
        super(false, oo4Var);
        int i8 = 0;
        this.f13420l = s11VarArr;
        int length = s11VarArr.length;
        this.f13418j = new int[length];
        this.f13419k = new int[length];
        this.f13421m = objArr;
        this.f13422n = new HashMap();
        int iC = 0;
        int iB = 0;
        int i9 = 0;
        while (i8 < s11VarArr.length) {
            s11 s11Var = s11VarArr[i8];
            this.f13420l[i9] = s11Var;
            this.f13419k[i9] = iC;
            this.f13418j[i9] = iB;
            iC += s11Var.c();
            iB += this.f13420l[i9].b();
            this.f13422n.put(objArr[i9], Integer.valueOf(i9));
            i8++;
            i9++;
        }
        this.f13416h = iC;
        this.f13417i = iB;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int b() {
        return this.f13417i;
    }

    @Override // com.google.android.gms.internal.ads.s11
    public final int c() {
        return this.f13416h;
    }

    @Override // com.google.android.gms.internal.ads.r94
    protected final int p(Object obj) {
        Integer num = (Integer) this.f13422n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.r94
    protected final int q(int i8) {
        return nz2.n(this.f13418j, i8 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.r94
    protected final int r(int i8) {
        return nz2.n(this.f13419k, i8 + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.r94
    protected final int s(int i8) {
        return this.f13418j[i8];
    }

    @Override // com.google.android.gms.internal.ads.r94
    protected final int t(int i8) {
        return this.f13419k[i8];
    }

    @Override // com.google.android.gms.internal.ads.r94
    protected final s11 u(int i8) {
        return this.f13420l[i8];
    }

    @Override // com.google.android.gms.internal.ads.r94
    protected final Object v(int i8) {
        return this.f13421m[i8];
    }

    final List y() {
        return Arrays.asList(this.f13420l);
    }

    public final qd4 z(oo4 oo4Var) {
        s11[] s11VarArr = new s11[this.f13420l.length];
        int i8 = 0;
        while (true) {
            s11[] s11VarArr2 = this.f13420l;
            if (i8 >= s11VarArr2.length) {
                return new qd4(s11VarArr, this.f13421m, oo4Var);
            }
            s11VarArr[i8] = new pd4(this, s11VarArr2[i8]);
            i8++;
        }
    }
}
