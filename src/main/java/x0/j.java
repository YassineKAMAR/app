package x0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f27196a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f27197b = 20;

    public static class a extends j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f27198c;

        public a(int i8) {
            super(i8);
            this.f27198c = i8;
        }

        @Override // x0.j
        public void a(String str, String str2, Throwable... thArr) {
            if (this.f27198c <= 3) {
                if (thArr == null || thArr.length < 1) {
                    Log.d(str, str2);
                } else {
                    Log.d(str, str2, thArr[0]);
                }
            }
        }

        @Override // x0.j
        public void b(String str, String str2, Throwable... thArr) {
            if (this.f27198c <= 6) {
                if (thArr == null || thArr.length < 1) {
                    Log.e(str, str2);
                } else {
                    Log.e(str, str2, thArr[0]);
                }
            }
        }

        @Override // x0.j
        public void d(String str, String str2, Throwable... thArr) {
            if (this.f27198c <= 4) {
                if (thArr == null || thArr.length < 1) {
                    Log.i(str, str2);
                } else {
                    Log.i(str, str2, thArr[0]);
                }
            }
        }

        @Override // x0.j
        public void g(String str, String str2, Throwable... thArr) {
            if (this.f27198c <= 2) {
                if (thArr == null || thArr.length < 1) {
                    Log.v(str, str2);
                } else {
                    Log.v(str, str2, thArr[0]);
                }
            }
        }

        @Override // x0.j
        public void h(String str, String str2, Throwable... thArr) {
            if (this.f27198c <= 5) {
                if (thArr == null || thArr.length < 1) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, thArr[0]);
                }
            }
        }
    }

    public j(int i8) {
    }

    public static synchronized j c() {
        if (f27196a == null) {
            f27196a = new a(3);
        }
        return f27196a;
    }

    public static synchronized void e(j jVar) {
        f27196a = jVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i8 = f27197b;
        if (length >= i8) {
            str = str.substring(0, i8);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
