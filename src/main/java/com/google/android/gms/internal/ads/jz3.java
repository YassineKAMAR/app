package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
abstract class jz3 implements lz3 {
    jz3() {
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(j());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
