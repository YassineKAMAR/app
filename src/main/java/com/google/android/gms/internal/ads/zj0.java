package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f18260a;

    public final long a(ByteBuffer byteBuffer) {
        kd kdVar;
        jd jdVar;
        long j8 = this.f18260a;
        if (j8 > 0) {
            return j8;
        }
        try {
            ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
            byteBufferDuplicate.flip();
            Iterator it = new fd(new yj0(byteBufferDuplicate), ck0.f6384c).h().iterator();
            while (true) {
                kdVar = null;
                if (!it.hasNext()) {
                    jdVar = null;
                    break;
                }
                hd hdVar = (hd) it.next();
                if (hdVar instanceof jd) {
                    jdVar = (jd) hdVar;
                    break;
                }
            }
            Iterator it2 = jdVar.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                hd hdVar2 = (hd) it2.next();
                if (hdVar2 instanceof kd) {
                    kdVar = (kd) hdVar2;
                    break;
                }
            }
            long jH = (kdVar.h() * 1000) / kdVar.i();
            this.f18260a = jH;
            return jH;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
