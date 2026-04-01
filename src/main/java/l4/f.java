package l4;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import l4.d;

/* JADX INFO: loaded from: classes.dex */
final class f implements i4.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f24393f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i4.c f24394g = i4.c.a(SubscriberAttributeKt.JSON_NAME_KEY).b(l4.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final i4.c f24395h = i4.c.a("value").b(l4.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final i4.d<Map.Entry<Object, Object>> f24396i = new i4.d() { // from class: l4.e
        @Override // i4.d
        public final void a(Object obj, Object obj2) {
            f.s((Map.Entry) obj, (i4.e) obj2);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f24397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, i4.d<?>> f24398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, i4.f<?>> f24399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i4.d<Object> f24400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f24401e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24402a;

        static {
            int[] iArr = new int[d.a.values().length];
            f24402a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24402a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24402a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map<Class<?>, i4.d<?>> map, Map<Class<?>, i4.f<?>> map2, i4.d<Object> dVar) {
        this.f24397a = outputStream;
        this.f24398b = map;
        this.f24399c = map2;
        this.f24400d = dVar;
    }

    private static ByteBuffer l(int i8) {
        return ByteBuffer.allocate(i8).order(ByteOrder.LITTLE_ENDIAN);
    }

    private <T> long m(i4.d<T> dVar, T t7) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f24397a;
            this.f24397a = bVar;
            try {
                dVar.a(t7, this);
                this.f24397a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th) {
                this.f24397a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private <T> f n(i4.d<T> dVar, i4.c cVar, T t7, boolean z7) throws IOException {
        long jM = m(dVar, t7);
        if (z7 && jM == 0) {
            return this;
        }
        t((r(cVar) << 3) | 2);
        u(jM);
        dVar.a(t7, this);
        return this;
    }

    private <T> f o(i4.f<T> fVar, i4.c cVar, T t7, boolean z7) {
        this.f24401e.d(cVar, z7);
        fVar.a(t7, this.f24401e);
        return this;
    }

    private static d q(i4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new i4.b("Field has no @Protobuf config");
    }

    private static int r(i4.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new i4.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void s(Map.Entry entry, i4.e eVar) {
        eVar.d(f24394g, entry.getKey());
        eVar.d(f24395h, entry.getValue());
    }

    private void t(int i8) throws IOException {
        while (true) {
            long j8 = i8 & (-128);
            OutputStream outputStream = this.f24397a;
            if (j8 == 0) {
                outputStream.write(i8 & 127);
                return;
            } else {
                outputStream.write((i8 & 127) | 128);
                i8 >>>= 7;
            }
        }
    }

    private void u(long j8) throws IOException {
        while (true) {
            long j9 = (-128) & j8;
            OutputStream outputStream = this.f24397a;
            if (j9 == 0) {
                outputStream.write(((int) j8) & 127);
                return;
            } else {
                outputStream.write((((int) j8) & 127) | 128);
                j8 >>>= 7;
            }
        }
    }

    i4.e c(i4.c cVar, double d8, boolean z7) throws IOException {
        if (z7 && d8 == 0.0d) {
            return this;
        }
        t((r(cVar) << 3) | 1);
        this.f24397a.write(l(8).putDouble(d8).array());
        return this;
    }

    @Override // i4.e
    public i4.e d(i4.c cVar, Object obj) {
        return f(cVar, obj, true);
    }

    i4.e e(i4.c cVar, float f8, boolean z7) throws IOException {
        if (z7 && f8 == 0.0f) {
            return this;
        }
        t((r(cVar) << 3) | 5);
        this.f24397a.write(l(4).putFloat(f8).array());
        return this;
    }

    i4.e f(i4.c cVar, Object obj, boolean z7) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z7 && charSequence.length() == 0) {
                return this;
            }
            t((r(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f24393f);
            t(bytes.length);
            this.f24397a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                n(f24396i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return c(cVar, ((Double) obj).doubleValue(), z7);
        }
        if (obj instanceof Float) {
            return e(cVar, ((Float) obj).floatValue(), z7);
        }
        if (obj instanceof Number) {
            return j(cVar, ((Number) obj).longValue(), z7);
        }
        if (obj instanceof Boolean) {
            return k(cVar, ((Boolean) obj).booleanValue(), z7);
        }
        if (!(obj instanceof byte[])) {
            i4.d<?> dVar = this.f24398b.get(obj.getClass());
            if (dVar != null) {
                return n(dVar, cVar, obj, z7);
            }
            i4.f<?> fVar = this.f24399c.get(obj.getClass());
            return fVar != null ? o(fVar, cVar, obj, z7) : obj instanceof c ? g(cVar, ((c) obj).a()) : obj instanceof Enum ? g(cVar, ((Enum) obj).ordinal()) : n(this.f24400d, cVar, obj, z7);
        }
        byte[] bArr = (byte[]) obj;
        if (z7 && bArr.length == 0) {
            return this;
        }
        t((r(cVar) << 3) | 2);
        t(bArr.length);
        this.f24397a.write(bArr);
        return this;
    }

    public f g(i4.c cVar, int i8) {
        return h(cVar, i8, true);
    }

    f h(i4.c cVar, int i8, boolean z7) throws IOException {
        if (z7 && i8 == 0) {
            return this;
        }
        d dVarQ = q(cVar);
        int i9 = a.f24402a[dVarQ.intEncoding().ordinal()];
        if (i9 == 1) {
            t(dVarQ.tag() << 3);
            t(i8);
        } else if (i9 == 2) {
            t(dVarQ.tag() << 3);
            t((i8 << 1) ^ (i8 >> 31));
        } else if (i9 == 3) {
            t((dVarQ.tag() << 3) | 5);
            this.f24397a.write(l(4).putInt(i8).array());
        }
        return this;
    }

    @Override // i4.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f a(i4.c cVar, long j8) {
        return j(cVar, j8, true);
    }

    f j(i4.c cVar, long j8, boolean z7) throws IOException {
        if (z7 && j8 == 0) {
            return this;
        }
        d dVarQ = q(cVar);
        int i8 = a.f24402a[dVarQ.intEncoding().ordinal()];
        if (i8 == 1) {
            t(dVarQ.tag() << 3);
            u(j8);
        } else if (i8 == 2) {
            t(dVarQ.tag() << 3);
            u((j8 >> 63) ^ (j8 << 1));
        } else if (i8 == 3) {
            t((dVarQ.tag() << 3) | 1);
            this.f24397a.write(l(8).putLong(j8).array());
        }
        return this;
    }

    f k(i4.c cVar, boolean z7, boolean z8) {
        return h(cVar, z7 ? 1 : 0, z8);
    }

    f p(Object obj) {
        if (obj == null) {
            return this;
        }
        i4.d<?> dVar = this.f24398b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new i4.b("No encoder for " + obj.getClass());
    }
}
