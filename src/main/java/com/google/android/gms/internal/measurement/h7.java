package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f7;
import com.google.android.gms.internal.measurement.h7;

/* JADX INFO: loaded from: classes.dex */
public abstract class h7<MessageType extends f7<MessageType, BuilderType>, BuilderType extends h7<MessageType, BuilderType>> implements pa {
    @Override // com.google.android.gms.internal.measurement.pa
    public final /* synthetic */ pa b(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public abstract /* synthetic */ Object clone();

    @Override // com.google.android.gms.internal.measurement.pa
    public final /* synthetic */ pa g(byte[] bArr, l8 l8Var) {
        return i(bArr, 0, bArr.length, l8Var);
    }

    public abstract BuilderType h(byte[] bArr, int i8, int i9);

    public abstract BuilderType i(byte[] bArr, int i8, int i9, l8 l8Var);
}
