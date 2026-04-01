package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f4781a;

    public GooglePlayServicesManifestException(int i8, String str) {
        super(str);
        this.f4781a = i8;
    }
}
