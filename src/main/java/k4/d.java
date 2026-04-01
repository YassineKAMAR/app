package k4;

import i4.f;
import i4.g;
import java.io.IOException;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j4.b<d> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i4.d<Object> f24206e = new i4.d() { // from class: k4.a
        @Override // i4.d
        public final void a(Object obj, Object obj2) {
            d.l(obj, (i4.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f<String> f24207f = new f() { // from class: k4.b
        @Override // i4.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).b((String) obj);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final f<Boolean> f24208g = new f() { // from class: k4.c
        @Override // i4.f
        public final void a(Object obj, Object obj2) {
            d.n((Boolean) obj, (g) obj2);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f24209h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, i4.d<?>> f24210a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, f<?>> f24211b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i4.d<Object> f24212c = f24206e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f24213d = false;

    class a implements i4.a {
        a() {
        }

        @Override // i4.a
        public void a(Object obj, Writer writer) throws IOException {
            e eVar = new e(writer, d.this.f24210a, d.this.f24211b, d.this.f24212c, d.this.f24213d);
            eVar.f(obj, false);
            eVar.m();
        }
    }

    private static final class b implements f<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final DateFormat f24215a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f24215a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        @Override // i4.f
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Date date, g gVar) {
            gVar.b(f24215a.format(date));
        }
    }

    public d() {
        p(String.class, f24207f);
        p(Boolean.class, f24208g);
        p(Date.class, f24209h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l(Object obj, i4.e eVar) {
        throw new i4.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void n(Boolean bool, g gVar) {
        gVar.c(bool.booleanValue());
    }

    public i4.a i() {
        return new a();
    }

    public d j(j4.a aVar) {
        aVar.a(this);
        return this;
    }

    public d k(boolean z7) {
        this.f24213d = z7;
        return this;
    }

    @Override // j4.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public <T> d a(Class<T> cls, i4.d<? super T> dVar) {
        this.f24210a.put(cls, dVar);
        this.f24211b.remove(cls);
        return this;
    }

    public <T> d p(Class<T> cls, f<? super T> fVar) {
        this.f24211b.put(cls, fVar);
        this.f24210a.remove(cls);
        return this;
    }
}
