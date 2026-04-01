package n6;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    public static final long a(Reader reader, Writer out, int i8) throws IOException {
        q.f(reader, "<this>");
        q.f(out, "out");
        char[] cArr = new char[i8];
        int i9 = reader.read(cArr);
        long j8 = 0;
        while (i9 >= 0) {
            out.write(cArr, 0, i9);
            j8 += (long) i9;
            i9 = reader.read(cArr);
        }
        return j8;
    }

    public static /* synthetic */ long b(Reader reader, Writer writer, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = 8192;
        }
        return a(reader, writer, i8);
    }

    public static final byte[] c(URL url) throws IOException {
        q.f(url, "<this>");
        InputStream it = url.openStream();
        try {
            q.e(it, "it");
            byte[] bArrC = a.c(it);
            b.a(it, null);
            return bArrC;
        } finally {
        }
    }

    public static final String d(Reader reader) {
        q.f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        b(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        q.e(string, "buffer.toString()");
        return string;
    }
}
