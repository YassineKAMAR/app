package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f13255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f13256b;

    public q3() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13255a = byteArrayOutputStream;
        this.f13256b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public final byte[] a(p3 p3Var) {
        this.f13255a.reset();
        try {
            b(this.f13256b, p3Var.f12719a);
            String str = p3Var.f12720b;
            if (str == null) {
                str = "";
            }
            b(this.f13256b, str);
            this.f13256b.writeLong(p3Var.f12721c);
            this.f13256b.writeLong(p3Var.f12722d);
            this.f13256b.write(p3Var.f12723e);
            this.f13256b.flush();
            return this.f13255a.toByteArray();
        } catch (IOException e8) {
            throw new RuntimeException(e8);
        }
    }
}
