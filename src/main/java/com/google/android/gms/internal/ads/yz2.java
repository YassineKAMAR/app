package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public enum yz2 {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17962a;

    yz2(String str) {
        this.f17962a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17962a;
    }
}
