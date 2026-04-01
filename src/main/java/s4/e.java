package s4;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f26219d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f26220e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.f f26221a = com.google.firebase.installations.f.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f26222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26223c;

    e() {
    }

    private synchronized long a(int i8) {
        if (c(i8)) {
            return (long) Math.min(Math.pow(2.0d, this.f26223c) + this.f26221a.e(), f26220e);
        }
        return f26219d;
    }

    private static boolean c(int i8) {
        return i8 == 429 || (i8 >= 500 && i8 < 600);
    }

    private static boolean d(int i8) {
        return (i8 >= 200 && i8 < 300) || i8 == 401 || i8 == 404;
    }

    private synchronized void e() {
        this.f26223c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b() {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f26223c     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L14
            com.google.firebase.installations.f r0 = r5.f26221a     // Catch: java.lang.Throwable -> L17
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.f26222b     // Catch: java.lang.Throwable -> L17
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            monitor-exit(r5)
            return r0
        L17:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.e.b():boolean");
    }

    public synchronized void f(int i8) {
        if (d(i8)) {
            e();
            return;
        }
        this.f26223c++;
        this.f26222b = this.f26221a.a() + a(i8);
    }
}
