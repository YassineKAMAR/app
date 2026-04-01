package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f1875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f1876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final q0[] f1877c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final q0[] f1878d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1879e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1880f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f1881g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f1882h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f1883i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f1884j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public PendingIntent f1885k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private boolean f1886l;

        public a(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i8 != 0 ? IconCompat.g(null, "", i8) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q0[] q0VarArr, q0[] q0VarArr2, boolean z7, int i8, boolean z8, boolean z9, boolean z10) {
            this.f1880f = true;
            this.f1876b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.f1883i = iconCompat.h();
            }
            this.f1884j = d.d(charSequence);
            this.f1885k = pendingIntent;
            this.f1875a = bundle == null ? new Bundle() : bundle;
            this.f1877c = q0VarArr;
            this.f1878d = q0VarArr2;
            this.f1879e = z7;
            this.f1881g = i8;
            this.f1880f = z8;
            this.f1882h = z9;
            this.f1886l = z10;
        }

        public PendingIntent a() {
            return this.f1885k;
        }

        public boolean b() {
            return this.f1879e;
        }

        public Bundle c() {
            return this.f1875a;
        }

        public IconCompat d() {
            int i8;
            if (this.f1876b == null && (i8 = this.f1883i) != 0) {
                this.f1876b = IconCompat.g(null, "", i8);
            }
            return this.f1876b;
        }

        public q0[] e() {
            return this.f1877c;
        }

        public int f() {
            return this.f1881g;
        }

        public boolean g() {
            return this.f1880f;
        }

        public CharSequence h() {
            return this.f1884j;
        }

        public boolean i() {
            return this.f1886l;
        }

        public boolean j() {
            return this.f1882h;
        }
    }

    public static class b extends e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private CharSequence f1887e;

        static class a {
            static Notification.BigTextStyle a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.bigText(charSequence);
            }

            static Notification.BigTextStyle b(Notification.Builder builder) {
                return new Notification.BigTextStyle(builder);
            }

            static Notification.BigTextStyle c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setBigContentTitle(charSequence);
            }

            static Notification.BigTextStyle d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
                return bigTextStyle.setSummaryText(charSequence);
            }
        }

        @Override // androidx.core.app.p.e
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.p.e
        public void b(o oVar) {
            Notification.BigTextStyle bigTextStyleA = a.a(a.c(a.b(oVar.a()), this.f1915b), this.f1887e);
            if (this.f1917d) {
                a.d(bigTextStyleA, this.f1916c);
            }
        }

        @Override // androidx.core.app.p.e
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f1887e = d.d(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        int P;
        boolean Q;
        Notification R;
        boolean S;
        Object T;

        @Deprecated
        public ArrayList<String> U;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f1888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f1889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<p0> f1890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<a> f1891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f1892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f1893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        PendingIntent f1894g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PendingIntent f1895h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        RemoteViews f1896i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Bitmap f1897j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        CharSequence f1898k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f1899l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f1900m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f1901n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f1902o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        e f1903p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        CharSequence f1904q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        CharSequence f1905r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        CharSequence[] f1906s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f1907t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f1908u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        boolean f1909v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        String f1910w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        boolean f1911x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        String f1912y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        boolean f1913z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.f1889b = new ArrayList<>();
            this.f1890c = new ArrayList<>();
            this.f1891d = new ArrayList<>();
            this.f1901n = true;
            this.f1913z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f1888a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f1900m = 0;
            this.U = new ArrayList<>();
            this.Q = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void k(int i8, boolean z7) {
            Notification notification;
            int i9;
            if (z7) {
                notification = this.R;
                i9 = i8 | notification.flags;
            } else {
                notification = this.R;
                i9 = (~i8) & notification.flags;
            }
            notification.flags = i9;
        }

        public d a(int i8, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f1889b.add(new a(i8, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new q(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d e(boolean z7) {
            k(16, z7);
            return this;
        }

        public d f(String str) {
            this.K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f1894g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f1893f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f1892e = d(charSequence);
            return this;
        }

        public d j(PendingIntent pendingIntent) {
            this.R.deleteIntent = pendingIntent;
            return this;
        }

        public d l(boolean z7) {
            this.f1913z = z7;
            return this;
        }

        public d m(int i8) {
            this.f1900m = i8;
            return this;
        }

        public d n(int i8) {
            this.R.icon = i8;
            return this;
        }

        public d o(e eVar) {
            if (this.f1903p != eVar) {
                this.f1903p = eVar;
                if (eVar != null) {
                    eVar.g(this);
                }
            }
            return this;
        }

        public d p(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public d q(long j8) {
            this.R.when = j8;
            return this;
        }
    }

    public static abstract class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected d f1914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        CharSequence f1915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        CharSequence f1916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f1917d = false;

        public void a(Bundle bundle) {
            if (this.f1917d) {
                bundle.putCharSequence("android.summaryText", this.f1916c);
            }
            CharSequence charSequence = this.f1915b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(o oVar);

        protected abstract String c();

        public RemoteViews d(o oVar) {
            return null;
        }

        public RemoteViews e(o oVar) {
            return null;
        }

        public RemoteViews f(o oVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f1914a != dVar) {
                this.f1914a = dVar;
                if (dVar != null) {
                    dVar.o(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        return notification.extras;
    }
}
