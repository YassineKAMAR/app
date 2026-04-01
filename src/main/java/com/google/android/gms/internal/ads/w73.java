package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class w73 implements m83 {
    protected w73() {
    }

    public static w73 c(char c8) {
        return new t73(c8);
    }

    @Override // com.google.android.gms.internal.ads.m83
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c8);
}
