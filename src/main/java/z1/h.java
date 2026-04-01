package z1;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.qg0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import h2.w4;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f27641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h f27624i = new h(320, 50, "320x50_mb");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final h f27625j = new h(468, 60, "468x60_as");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h f27626k = new h(320, 100, "320x100_as");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h f27627l = new h(728, 90, "728x90_as");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final h f27628m = new h(RCHTTPStatusCodes.UNSUCCESSFUL, 250, "300x250_as");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final h f27629n = new h(160, 600, "160x600_as");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Deprecated
    public static final h f27630o = new h(-1, -2, "smart_banner");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final h f27631p = new h(-3, -4, "fluid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final h f27632q = new h(0, 0, "invalid");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final h f27634s = new h(50, 50, "50x50_mb");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final h f27633r = new h(-3, 0, "search_v2");

    public h(int i8, int i9) {
        this(i8, i9, (i8 == -1 ? "FULL" : String.valueOf(i8)) + "x" + (i9 == -2 ? "AUTO" : String.valueOf(i9)) + "_as");
    }

    h(int i8, int i9, String str) {
        if (i8 < 0 && i8 != -1 && i8 != -3) {
            throw new IllegalArgumentException("Invalid width for AdSize: " + i8);
        }
        if (i9 >= 0 || i9 == -2 || i9 == -4) {
            this.f27635a = i8;
            this.f27636b = i9;
            this.f27637c = str;
        } else {
            throw new IllegalArgumentException("Invalid height for AdSize: " + i9);
        }
    }

    public static h a(Context context, int i8) {
        h hVarG = jg0.g(context, i8, 50, 0);
        hVarG.f27638d = true;
        return hVarG;
    }

    public static h b(Context context, int i8) {
        int iE = jg0.e(context, 0);
        if (iE == -1) {
            return f27632q;
        }
        h hVar = new h(i8, 0);
        hVar.f27640f = iE;
        hVar.f27639e = true;
        return hVar;
    }

    public static h e(int i8, int i9) {
        h hVar = new h(i8, 0);
        hVar.f27640f = i9;
        hVar.f27639e = true;
        if (i9 < 32) {
            qg0.g("The maximum height set for the inline adaptive ad size was " + i9 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return hVar;
    }

    public static h f(Context context, int i8) {
        h hVarG = jg0.g(context, i8, 50, 2);
        hVarG.f27638d = true;
        return hVarG;
    }

    public static h g(Context context, int i8) {
        int iE = jg0.e(context, 2);
        h hVar = new h(i8, 0);
        if (iE == -1) {
            return f27632q;
        }
        hVar.f27640f = iE;
        hVar.f27639e = true;
        return hVar;
    }

    public static h h(Context context, int i8) {
        h hVarG = jg0.g(context, i8, 50, 1);
        hVarG.f27638d = true;
        return hVarG;
    }

    public static h i(Context context, int i8) {
        int iE = jg0.e(context, 1);
        h hVar = new h(i8, 0);
        if (iE == -1) {
            return f27632q;
        }
        hVar.f27640f = iE;
        hVar.f27639e = true;
        return hVar;
    }

    public int c() {
        return this.f27636b;
    }

    public int d(Context context) {
        int i8 = this.f27636b;
        if (i8 == -4 || i8 == -3) {
            return -1;
        }
        if (i8 == -2) {
            return w4.g(context.getResources().getDisplayMetrics());
        }
        h2.v.b();
        return jg0.B(context, i8);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f27635a == hVar.f27635a && this.f27636b == hVar.f27636b && this.f27637c.equals(hVar.f27637c);
    }

    public int hashCode() {
        return this.f27637c.hashCode();
    }

    public int j() {
        return this.f27635a;
    }

    public int k(Context context) {
        int i8 = this.f27635a;
        if (i8 == -3) {
            return -1;
        }
        if (i8 != -1) {
            h2.v.b();
            return jg0.B(context, i8);
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Parcelable.Creator<w4> creator = w4.CREATOR;
        return displayMetrics.widthPixels;
    }

    public boolean l() {
        return this.f27635a == -3 && this.f27636b == -4;
    }

    final int m() {
        return this.f27642h;
    }

    final int n() {
        return this.f27640f;
    }

    final void o(int i8) {
        this.f27640f = i8;
    }

    final void p(int i8) {
        this.f27642h = i8;
    }

    final void q(boolean z7) {
        this.f27639e = true;
    }

    final void r(boolean z7) {
        this.f27641g = true;
    }

    final boolean s() {
        return this.f27638d;
    }

    final boolean t() {
        return this.f27639e;
    }

    public String toString() {
        return this.f27637c;
    }

    final boolean u() {
        return this.f27641g;
    }
}
