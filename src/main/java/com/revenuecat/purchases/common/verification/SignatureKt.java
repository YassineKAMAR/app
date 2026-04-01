package com.revenuecat.purchases.common.verification;

import com.revenuecat.purchases.common.verification.Signature;
import f6.i;

/* JADX INFO: loaded from: classes.dex */
public final class SignatureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] copyOf(byte[] bArr, Signature.Component component) {
        return i.f(bArr, component.getStartByte(), component.getEndByte());
    }
}
