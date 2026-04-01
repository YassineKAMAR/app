package a3;

import a3.i;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public class f extends b3.a {
    public static final Parcelable.Creator<f> CREATOR = new f1();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final Scope[] f79o = new Scope[0];

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final x2.d[] f80p = new x2.d[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f81a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f82b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f83c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f84d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f85e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f86f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f87g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f88h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    x2.d[] f89i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    x2.d[] f90j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final boolean f91k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final int f92l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f93m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f94n;

    f(int i8, int i9, int i10, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, x2.d[] dVarArr, x2.d[] dVarArr2, boolean z7, int i11, boolean z8, String str2) {
        scopeArr = scopeArr == null ? f79o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        dVarArr = dVarArr == null ? f80p : dVarArr;
        dVarArr2 = dVarArr2 == null ? f80p : dVarArr2;
        this.f81a = i8;
        this.f82b = i9;
        this.f83c = i10;
        if ("com.google.android.gms".equals(str)) {
            this.f84d = "com.google.android.gms";
        } else {
            this.f84d = str;
        }
        if (i8 < 2) {
            this.f88h = iBinder != null ? a.H0(i.a.v0(iBinder)) : null;
        } else {
            this.f85e = iBinder;
            this.f88h = account;
        }
        this.f86f = scopeArr;
        this.f87g = bundle;
        this.f89i = dVarArr;
        this.f90j = dVarArr2;
        this.f91k = z7;
        this.f92l = i11;
        this.f93m = z8;
        this.f94n = str2;
    }

    public final String g() {
        return this.f94n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        f1.a(this, parcel, i8);
    }
}
