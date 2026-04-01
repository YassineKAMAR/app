package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class xa implements t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f20685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ va f20686b;

    xa(va vaVar, String str) {
        this.f20686b = vaVar;
        this.f20685a = str;
    }

    @Override // com.google.android.gms.measurement.internal.t4
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f20686b.I(true, i8, th, bArr, this.f20685a);
    }
}
