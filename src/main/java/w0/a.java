package w0;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<a> f27042c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f27043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f27044b;

    /* JADX INFO: renamed from: w0.a$a, reason: collision with other inner class name */
    private static class C0186a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Set<String> f27045a = new HashSet(Arrays.asList(c0.d().a()));
    }

    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 23;
        }
    }

    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 24;
        }
    }

    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return false;
        }
    }

    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 26;
        }
    }

    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 27;
        }
    }

    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 28;
        }
    }

    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 29;
        }
    }

    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        @Override // w0.a
        public final boolean c() {
            return Build.VERSION.SDK_INT >= 33;
        }
    }

    a(String str, String str2) {
        this.f27043a = str;
        this.f27044b = str2;
        f27042c.add(this);
    }

    public static Set<a> e() {
        return Collections.unmodifiableSet(f27042c);
    }

    @Override // w0.v
    public String a() {
        return this.f27043a;
    }

    @Override // w0.v
    public boolean b() {
        return c() || d();
    }

    public abstract boolean c();

    public boolean d() {
        return r7.a.b(C0186a.f27045a, this.f27044b);
    }
}
