package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zh0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f18233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f18234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ gi0 f18235c;

    zh0(gi0 gi0Var, String str, String str2) {
        this.f18235c = gi0Var;
        this.f18233a = str;
        this.f18234b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi0 gi0Var = this.f18235c;
        if (gi0Var.f8350p != null) {
            gi0Var.f8350p.b(this.f18233a, this.f18234b);
        }
    }
}
