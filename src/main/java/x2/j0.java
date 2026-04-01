package x2;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
class j0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final j0 f27275e = new j0(true, 3, 1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f27276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f27277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Throwable f27278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f27279d;

    private j0(boolean z7, int i8, int i9, String str, Throwable th) {
        this.f27276a = z7;
        this.f27279d = i8;
        this.f27277b = str;
        this.f27278c = th;
    }

    @Deprecated
    static j0 b() {
        return f27275e;
    }

    static j0 c(String str) {
        return new j0(false, 1, 5, str, null);
    }

    static j0 d(String str, Throwable th) {
        return new j0(false, 1, 5, str, th);
    }

    static j0 f(int i8) {
        return new j0(true, i8, 1, null, null);
    }

    static j0 g(int i8, int i9, String str, Throwable th) {
        return new j0(false, i8, i9, str, th);
    }

    String a() {
        return this.f27277b;
    }

    final void e() {
        if (this.f27276a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f27278c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f27278c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
