package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public enum ad {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(o7.f19004b),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f18568a;

    ad(Object obj) {
        this.f18568a = obj;
    }
}
