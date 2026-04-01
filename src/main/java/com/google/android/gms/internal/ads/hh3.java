package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class hh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OutputStream f8749a;

    private hh3(OutputStream outputStream) {
        this.f8749a = outputStream;
    }

    public static hh3 b(OutputStream outputStream) {
        return new hh3(outputStream);
    }

    public final void a(jw3 jw3Var) throws IOException {
        try {
            jw3Var.f(this.f8749a);
        } finally {
            this.f8749a.close();
        }
    }
}
