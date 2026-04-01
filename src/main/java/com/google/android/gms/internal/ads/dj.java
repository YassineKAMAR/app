package com.google.android.gms.internal.ads;

import d2.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class dj extends ak {
    public dj(ii iiVar, String str, String str2, ce ceVar, int i8, int i9) {
        super(iiVar, "9mv9Ihk+HlE8P3WJWSjhrxWrdB7cEu1gaxdteA5kBJ6DKumpWYk1Q5Vf8aocVg4i", "s7rU1m4XsqJ83s2reIjdkboWJYkg+gYouDrDcn3Ghpw=", ceVar, i8, 24);
    }

    private final void c() {
        d2.a aVarH = this.f5293b.h();
        if (aVarH == null) {
            return;
        }
        try {
            a.C0100a c0100aB = aVarH.b();
            String strA = c0100aB.a();
            int i8 = li.f10731b;
            if (strA != null && strA.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                UUID uuidFromString = UUID.fromString(strA);
                byte[] bArr = new byte[16];
                ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                strA = pf.a(bArr, true);
            }
            if (strA != null) {
                synchronized (this.f5296e) {
                    this.f5296e.t0(strA);
                    this.f5296e.s0(c0100aB.b());
                    this.f5296e.W(6);
                }
            }
        } catch (IOException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.ak
    protected final void a() {
        if (this.f5293b.q()) {
            c();
            return;
        }
        synchronized (this.f5296e) {
            this.f5296e.t0((String) this.f5297f.invoke(null, this.f5293b.b()));
        }
    }

    @Override // com.google.android.gms.internal.ads.ak
    public final Void b() {
        if (this.f5293b.r()) {
            super.b();
            return null;
        }
        if (this.f5293b.q()) {
            c();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ak, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        b();
        return null;
    }
}
