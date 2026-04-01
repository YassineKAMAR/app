package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class a73 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s3.i f5071a;

    a73() {
        this.f5071a = null;
    }

    public a73(s3.i iVar) {
        this.f5071a = iVar;
    }

    protected abstract void a();

    final s3.i b() {
        return this.f5071a;
    }

    public final void c(Exception exc) {
        s3.i iVar = this.f5071a;
        if (iVar != null) {
            iVar.d(exc);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e8) {
            c(e8);
        }
    }
}
