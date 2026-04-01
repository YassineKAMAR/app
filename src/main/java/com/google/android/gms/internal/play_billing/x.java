package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.w;
import com.google.android.gms.internal.play_billing.x;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x<MessageType extends x<MessageType, BuilderType>, BuilderType extends w<MessageType, BuilderType>> implements r2 {
    protected int zza = 0;

    int a(b3 b3Var) {
        throw null;
    }

    public final byte[] b() {
        try {
            int iM = m();
            byte[] bArr = new byte[iM];
            v0 v0VarA = v0.A(bArr, 0, iM);
            c(v0VarA);
            v0VarA.a();
            return bArr;
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e8);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.r2
    public final n0 k() {
        try {
            int iM = m();
            n0 n0Var = n0.f19633b;
            byte[] bArr = new byte[iM];
            v0 v0VarA = v0.A(bArr, 0, iM);
            c(v0VarA);
            v0VarA.a();
            return new k0(bArr);
        } catch (IOException e8) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e8);
        }
    }
}
