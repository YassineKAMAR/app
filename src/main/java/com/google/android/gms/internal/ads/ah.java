package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class ah implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ bh f5266a;

    ah(bh bhVar) {
        this.f5266a = bhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.f5266a.f5787b != null) {
            return;
        }
        synchronized (bh.f5783c) {
            if (this.f5266a.f5787b != null) {
                return;
            }
            boolean z7 = false;
            try {
                zBooleanValue = ((Boolean) ns.f12141n2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    bh.f5784d = k43.b(this.f5266a.f5786a.f9202a, "ADSHIELD", null);
                    z7 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z7 = zBooleanValue;
            }
            this.f5266a.f5787b = Boolean.valueOf(z7);
            bh.f5783c.open();
        }
    }
}
