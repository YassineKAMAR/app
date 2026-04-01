package x0;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f27206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0188b f27207b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Throwable f27208a;

            public a(Throwable th) {
                this.f27208a = th;
            }

            public Throwable a() {
                return this.f27208a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f27208a.getMessage());
            }
        }

        /* JADX INFO: renamed from: x0.m$b$b, reason: collision with other inner class name */
        public static final class C0188b extends b {
            private C0188b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            private c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }

        b() {
        }
    }

    static {
        f27206a = new b.c();
        f27207b = new b.C0188b();
    }
}
