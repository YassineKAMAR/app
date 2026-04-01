package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;

/* JADX INFO: loaded from: classes.dex */
final class on extends PushbackInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ pn f12563a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    on(pn pnVar, InputStream inputStream, int i8) {
        super(inputStream, 1);
        this.f12563a = pnVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        rn.e(this.f12563a.f12950c);
        super.close();
    }
}
