package l4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import l4.h;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, i4.d<?>> f24403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, i4.f<?>> f24404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i4.d<Object> f24405c;

    public static final class a implements j4.b<a> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final i4.d<Object> f24406d = new i4.d() { // from class: l4.g
            @Override // i4.d
            public final void a(Object obj, Object obj2) {
                h.a.e(obj, (i4.e) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<?>, i4.d<?>> f24407a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map<Class<?>, i4.f<?>> f24408b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i4.d<Object> f24409c = f24406d;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void e(Object obj, i4.e eVar) {
            throw new i4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public h c() {
            return new h(new HashMap(this.f24407a), new HashMap(this.f24408b), this.f24409c);
        }

        public a d(j4.a aVar) {
            aVar.a(this);
            return this;
        }

        @Override // j4.b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public <U> a a(Class<U> cls, i4.d<? super U> dVar) {
            this.f24407a.put(cls, dVar);
            this.f24408b.remove(cls);
            return this;
        }
    }

    h(Map<Class<?>, i4.d<?>> map, Map<Class<?>, i4.f<?>> map2, i4.d<Object> dVar) {
        this.f24403a = map;
        this.f24404b = map2;
        this.f24405c = dVar;
    }

    public static a a() {
        return new a();
    }

    public void b(Object obj, OutputStream outputStream) {
        new f(outputStream, this.f24403a, this.f24404b, this.f24405c).p(obj);
    }

    public byte[] c(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            b(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
