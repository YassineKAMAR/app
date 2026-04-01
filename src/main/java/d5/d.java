package d5;

import s5.j;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public class d extends d5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final j f21003b;

    class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k.d f21004a;

        a(k.d dVar) {
            this.f21004a = dVar;
        }

        @Override // d5.f
        public void a(Object obj) {
            this.f21004a.a(obj);
        }

        @Override // d5.f
        public void b(String str, String str2, Object obj) {
            this.f21004a.b(str, str2, obj);
        }
    }

    public d(j jVar, k.d dVar) {
        this.f21003b = jVar;
        this.f21002a = new a(dVar);
    }

    @Override // d5.e
    public <T> T c(String str) {
        return (T) this.f21003b.a(str);
    }

    @Override // d5.e
    public String getMethod() {
        return this.f21003b.f26252a;
    }

    @Override // d5.e
    public boolean h(String str) {
        return this.f21003b.c(str);
    }

    @Override // d5.a
    public f n() {
        return this.f21002a;
    }
}
