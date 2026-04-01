package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.w04;
import com.google.android.gms.internal.ads.z04;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class w04<MessageType extends z04<MessageType, BuilderType>, BuilderType extends w04<MessageType, BuilderType>> extends yy3<MessageType, BuilderType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z04 f16586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected z04 f16587b;

    protected w04(MessageType messagetype) {
        this.f16586a = messagetype;
        if (messagetype.H()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f16587b = messagetype.o();
    }

    private static void l(Object obj, Object obj2) {
        s24.a().b(obj.getClass()).e(obj, obj2);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final w04 clone() {
        w04 w04Var = (w04) this.f16586a.J(5, null, null);
        w04Var.f16587b = a();
        return w04Var;
    }

    public final w04 o(z04 z04Var) {
        if (!this.f16586a.equals(z04Var)) {
            if (!this.f16587b.H()) {
                t();
            }
            l(this.f16587b, z04Var);
        }
        return this;
    }

    public final w04 p(byte[] bArr, int i8, int i9, m04 m04Var) throws m14 {
        if (!this.f16587b.H()) {
            t();
        }
        try {
            s24.a().b(this.f16587b.getClass()).g(this.f16587b, bArr, 0, i9, new dz3(m04Var));
            return this;
        } catch (m14 e8) {
            throw e8;
        } catch (IOException e9) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e9);
        } catch (IndexOutOfBoundsException unused) {
            throw m14.j();
        }
    }

    public final MessageType q() {
        MessageType messagetype = (MessageType) a();
        if (messagetype.G()) {
            return messagetype;
        }
        throw new u34(messagetype);
    }

    @Override // com.google.android.gms.internal.ads.j24
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public MessageType a() {
        if (!this.f16587b.H()) {
            return (MessageType) this.f16587b;
        }
        this.f16587b.C();
        return (MessageType) this.f16587b;
    }

    protected final void s() {
        if (this.f16587b.H()) {
            return;
        }
        t();
    }

    protected void t() {
        z04 z04VarO = this.f16586a.o();
        l(z04VarO, this.f16587b);
        this.f16587b = z04VarO;
    }
}
