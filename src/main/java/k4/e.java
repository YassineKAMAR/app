package k4;

import android.util.Base64;
import android.util.JsonWriter;
import i4.f;
import i4.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class e implements i4.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f24216a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24217b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f24218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, i4.d<?>> f24219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<Class<?>, f<?>> f24220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i4.d<Object> f24221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f24222g;

    e(Writer writer, Map<Class<?>, i4.d<?>> map, Map<Class<?>, f<?>> map2, i4.d<Object> dVar, boolean z7) {
        this.f24218c = new JsonWriter(writer);
        this.f24219d = map;
        this.f24220e = map2;
        this.f24221f = dVar;
        this.f24222g = z7;
    }

    private boolean l(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e o(String str, Object obj) throws IOException {
        q();
        this.f24218c.name(str);
        if (obj != null) {
            return f(obj, false);
        }
        this.f24218c.nullValue();
        return this;
    }

    private e p(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        q();
        this.f24218c.name(str);
        return f(obj, false);
    }

    private void q() throws IOException {
        if (!this.f24217b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f24216a;
        if (eVar != null) {
            eVar.q();
            this.f24216a.f24217b = false;
            this.f24216a = null;
            this.f24218c.endObject();
        }
    }

    @Override // i4.e
    public i4.e a(i4.c cVar, long j8) {
        return h(cVar.b(), j8);
    }

    @Override // i4.e
    public i4.e d(i4.c cVar, Object obj) {
        return i(cVar.b(), obj);
    }

    public e e(long j8) throws IOException {
        q();
        this.f24218c.value(j8);
        return this;
    }

    e f(Object obj, boolean z7) throws IOException {
        int i8 = 0;
        if (z7 && l(obj)) {
            Object[] objArr = new Object[1];
            objArr[0] = obj == null ? null : obj.getClass();
            throw new i4.b(String.format("%s cannot be encoded inline", objArr));
        }
        if (obj == null) {
            this.f24218c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f24218c.value((Number) obj);
            return this;
        }
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f24218c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    f(it.next(), false);
                }
                this.f24218c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f24218c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        i((String) key, entry.getValue());
                    } catch (ClassCastException e8) {
                        throw new i4.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e8);
                    }
                }
                this.f24218c.endObject();
                return this;
            }
            i4.d<?> dVar = this.f24219d.get(obj.getClass());
            if (dVar != null) {
                return n(dVar, obj, z7);
            }
            f<?> fVar = this.f24220e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return n(this.f24221f, obj, z7);
            }
            b(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return k((byte[]) obj);
        }
        this.f24218c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i8 < length) {
                this.f24218c.value(r6[i8]);
                i8++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i8 < length2) {
                e(jArr[i8]);
                i8++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i8 < length3) {
                this.f24218c.value(dArr[i8]);
                i8++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i8 < length4) {
                this.f24218c.value(zArr[i8]);
                i8++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                f(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                f(obj2, false);
            }
        }
        this.f24218c.endArray();
        return this;
    }

    @Override // i4.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e b(String str) throws IOException {
        q();
        this.f24218c.value(str);
        return this;
    }

    public e h(String str, long j8) throws IOException {
        q();
        this.f24218c.name(str);
        return e(j8);
    }

    public e i(String str, Object obj) {
        return this.f24222g ? p(str, obj) : o(str, obj);
    }

    @Override // i4.g
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e c(boolean z7) throws IOException {
        q();
        this.f24218c.value(z7);
        return this;
    }

    public e k(byte[] bArr) throws IOException {
        q();
        if (bArr == null) {
            this.f24218c.nullValue();
        } else {
            this.f24218c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void m() throws IOException {
        q();
        this.f24218c.flush();
    }

    e n(i4.d<Object> dVar, Object obj, boolean z7) throws IOException {
        if (!z7) {
            this.f24218c.beginObject();
        }
        dVar.a(obj, this);
        if (!z7) {
            this.f24218c.endObject();
        }
        return this;
    }
}
