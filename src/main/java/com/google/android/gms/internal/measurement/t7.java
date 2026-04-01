package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
abstract class t7 implements u7 {
    t7() {
    }

    @Override // java.util.Iterator
    public /* synthetic */ Byte next() {
        return Byte.valueOf(j());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
