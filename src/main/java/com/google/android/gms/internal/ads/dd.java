package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class dd implements ed {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f6685b = Logger.getLogger(dd.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ThreadLocal f6686a = new cd(this);

    @Override // com.google.android.gms.internal.ads.ed
    public final hd a(u74 u74Var, id idVar) throws EOFException {
        int iA0;
        long jL;
        long jK = u74Var.k();
        ((ByteBuffer) this.f6686a.get()).rewind().limit(8);
        do {
            iA0 = u74Var.a0((ByteBuffer) this.f6686a.get());
            if (iA0 == 8) {
                ((ByteBuffer) this.f6686a.get()).rewind();
                long jE = gd.e((ByteBuffer) this.f6686a.get());
                byte[] bArr = null;
                if (jE < 8 && jE > 1) {
                    Logger logger = f6685b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jE);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f6686a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jE == 1) {
                        ((ByteBuffer) this.f6686a.get()).limit(16);
                        u74Var.a0((ByteBuffer) this.f6686a.get());
                        ((ByteBuffer) this.f6686a.get()).position(8);
                        jL = gd.f((ByteBuffer) this.f6686a.get()) - 16;
                    } else {
                        jL = jE == 0 ? u74Var.l() - u74Var.k() : jE - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f6686a.get()).limit(((ByteBuffer) this.f6686a.get()).limit() + 16);
                        u74Var.a0((ByteBuffer) this.f6686a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.f6686a.get()).position() - 16; iPosition < ((ByteBuffer) this.f6686a.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.f6686a.get()).position() - 16)] = ((ByteBuffer) this.f6686a.get()).get(iPosition);
                        }
                        jL -= 16;
                    }
                    long j8 = jL;
                    hd hdVarB = b(str, bArr, idVar instanceof hd ? ((hd) idVar).j() : "");
                    hdVarB.c(idVar);
                    ((ByteBuffer) this.f6686a.get()).rewind();
                    hdVarB.a(u74Var, (ByteBuffer) this.f6686a.get(), j8, this);
                    return hdVarB;
                } catch (UnsupportedEncodingException e8) {
                    throw new RuntimeException(e8);
                }
            }
        } while (iA0 >= 0);
        u74Var.b(jK);
        throw new EOFException();
    }

    public abstract hd b(String str, byte[] bArr, String str2);
}
