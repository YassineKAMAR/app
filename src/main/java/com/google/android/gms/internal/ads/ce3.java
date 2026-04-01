package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ce3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ce3 f6327b = new ce3(new a("Failure occurred while trying to finish a future."));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Throwable f6328a;

    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    ce3(Throwable th) {
        th.getClass();
        this.f6328a = th;
    }
}
