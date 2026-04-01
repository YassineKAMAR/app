package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kh4 extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nb f10085c;

    public kh4(int i8, int i9, int i10, int i11, nb nbVar, boolean z7, Exception exc) {
        String strValueOf = String.valueOf(nbVar);
        StringBuilder sb = new StringBuilder();
        sb.append("AudioTrack init failed ");
        sb.append(i8);
        sb.append(" Config(");
        sb.append(i9);
        sb.append(", ");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append(true != z7 ? "" : " (recoverable)");
        super(sb.toString(), exc);
        this.f10083a = i8;
        this.f10084b = z7;
        this.f10085c = nbVar;
    }
}
