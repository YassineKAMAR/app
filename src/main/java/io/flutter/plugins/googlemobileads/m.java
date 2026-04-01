package io.flutter.plugins.googlemobileads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final z1.h f23248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f23249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f23250c;

    static class a {
        a() {
        }

        z1.h a(Context context, int i8) {
            return z1.h.a(context, i8);
        }

        z1.h b(Context context, int i8) {
            return z1.h.b(context, i8);
        }

        z1.h c(int i8, int i9) {
            return z1.h.e(i8, i9);
        }

        z1.h d(Context context, int i8) {
            return z1.h.f(context, i8);
        }

        z1.h e(Context context, int i8) {
            return z1.h.g(context, i8);
        }

        z1.h f(Context context, int i8) {
            return z1.h.h(context, i8);
        }

        z1.h g(Context context, int i8) {
            return z1.h.i(context, i8);
        }
    }

    static class b extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final String f23251d;

        b(Context context, a aVar, String str, int i8) {
            super(b(context, aVar, str, i8));
            this.f23251d = str;
        }

        private static z1.h b(Context context, a aVar, String str, int i8) {
            if (str == null) {
                return aVar.a(context, i8);
            }
            if (str.equals("portrait")) {
                return aVar.f(context, i8);
            }
            if (str.equals("landscape")) {
                return aVar.d(context, i8);
            }
            throw new IllegalArgumentException("Unexpected value for orientation: " + str);
        }
    }

    static class c extends m {
        c() {
            super(z1.h.f27631p);
        }
    }

    static class d extends m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Integer f23252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Integer f23253e;

        d(a aVar, Context context, int i8, Integer num, Integer num2) {
            super(b(aVar, context, i8, num, num2));
            this.f23252d = num;
            this.f23253e = num2;
        }

        private static z1.h b(a aVar, Context context, int i8, Integer num, Integer num2) {
            return num != null ? num.intValue() == 0 ? aVar.g(context, i8) : aVar.e(context, i8) : num2 != null ? aVar.c(i8, num2.intValue()) : aVar.b(context, i8);
        }
    }

    static class e extends m {
        e() {
            super(z1.h.f27630o);
        }
    }

    m(int i8, int i9) {
        this(new z1.h(i8, i9));
    }

    m(z1.h hVar) {
        this.f23248a = hVar;
        this.f23249b = hVar.j();
        this.f23250c = hVar.c();
    }

    public z1.h a() {
        return this.f23248a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f23249b == mVar.f23249b && this.f23250c == mVar.f23250c;
    }

    public int hashCode() {
        return (this.f23249b * 31) + this.f23250c;
    }
}
