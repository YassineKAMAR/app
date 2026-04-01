package h2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public final class w4 extends b3.a {
    public static final Parcelable.Creator<w4> CREATOR = new x4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f22354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22356f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w4[] f22357g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f22358h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22359i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f22360j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22361k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f22362l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f22363m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f22364n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f22365o;

    public w4() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public w4(Context context, z1.h hVar) {
        this(context, new z1.h[]{hVar});
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public w4(android.content.Context r14, z1.h[] r15) {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.w4.<init>(android.content.Context, z1.h[]):void");
    }

    w4(String str, int i8, int i9, boolean z7, int i10, int i11, w4[] w4VarArr, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.f22351a = str;
        this.f22352b = i8;
        this.f22353c = i9;
        this.f22354d = z7;
        this.f22355e = i10;
        this.f22356f = i11;
        this.f22357g = w4VarArr;
        this.f22358h = z8;
        this.f22359i = z9;
        this.f22360j = z10;
        this.f22361k = z11;
        this.f22362l = z12;
        this.f22363m = z13;
        this.f22364n = z14;
        this.f22365o = z15;
    }

    public static int g(DisplayMetrics displayMetrics) {
        return (int) (v(displayMetrics) * displayMetrics.density);
    }

    public static w4 i() {
        return new w4("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static w4 n() {
        return new w4("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static w4 p() {
        return new w4("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static w4 u() {
        return new w4("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int v(DisplayMetrics displayMetrics) {
        int i8 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i8 <= 400) {
            return 32;
        }
        return i8 <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f22351a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, str, false);
        b3.c.k(parcel, 3, this.f22352b);
        b3.c.k(parcel, 4, this.f22353c);
        b3.c.c(parcel, 5, this.f22354d);
        b3.c.k(parcel, 6, this.f22355e);
        b3.c.k(parcel, 7, this.f22356f);
        b3.c.t(parcel, 8, this.f22357g, i8, false);
        b3.c.c(parcel, 9, this.f22358h);
        b3.c.c(parcel, 10, this.f22359i);
        b3.c.c(parcel, 11, this.f22360j);
        b3.c.c(parcel, 12, this.f22361k);
        b3.c.c(parcel, 13, this.f22362l);
        b3.c.c(parcel, 14, this.f22363m);
        b3.c.c(parcel, 15, this.f22364n);
        b3.c.c(parcel, 16, this.f22365o);
        b3.c.b(parcel, iA);
    }
}
