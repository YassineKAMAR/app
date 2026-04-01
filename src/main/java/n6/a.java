package n6;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static final long a(InputStream inputStream, OutputStream out, int i8) throws IOException {
        q.f(inputStream, "<this>");
        q.f(out, "out");
        byte[] bArr = new byte[i8];
        int i9 = inputStream.read(bArr);
        long j8 = 0;
        while (i9 >= 0) {
            out.write(bArr, 0, i9);
            j8 += (long) i9;
            i9 = inputStream.read(bArr);
        }
        return j8;
    }

    public static /* synthetic */ long b(InputStream inputStream, OutputStream outputStream, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return a(inputStream, outputStream, i8);
    }

    public static final byte[] c(InputStream inputStream) {
        q.f(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        b(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        q.e(byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
