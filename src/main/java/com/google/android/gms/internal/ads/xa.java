package com.google.android.gms.internal.ads;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes.dex */
final class xa extends ya {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f17144b;

    public xa(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f17144b = bArr;
    }

    @Override // java.security.cert.Certificate
    public final byte[] getEncoded() {
        return this.f17144b;
    }
}
