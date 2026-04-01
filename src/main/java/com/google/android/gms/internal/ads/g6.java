package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8224a;

    public g6(int i8) {
        this.f8224a = i8;
    }

    public static int a(int i8) {
        return (i8 >> 24) & 255;
    }

    public static String b(int i8) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i8 >> 24) & 255));
        sb.append((char) ((i8 >> 16) & 255));
        sb.append((char) ((i8 >> 8) & 255));
        sb.append((char) (i8 & 255));
        return sb.toString();
    }

    public String toString() {
        return b(this.f8224a);
    }
}
