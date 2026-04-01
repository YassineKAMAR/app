package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum vz2 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    AUDIO("audio");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16543a;

    vz2(String str) {
        this.f16543a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f16543a;
    }
}
