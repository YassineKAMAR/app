package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f8331a;

    private gh3(InputStream inputStream) {
        this.f8331a = inputStream;
    }

    public static gh3 b(byte[] bArr) {
        return new gh3(new ByteArrayInputStream(bArr));
    }

    public final jw3 a() throws IOException {
        try {
            return jw3.R(this.f8331a, m04.a());
        } finally {
            this.f8331a.close();
        }
    }
}
