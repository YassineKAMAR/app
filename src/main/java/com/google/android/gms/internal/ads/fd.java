package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class fd extends t74 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a84 f7719i = a84.b(fd.class);

    public fd(u74 u74Var, ed edVar) {
        o(u74Var, u74Var.l(), edVar);
    }

    @Override // com.google.android.gms.internal.ads.t74, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.t74
    public final String toString() {
        String string = this.f14995b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
