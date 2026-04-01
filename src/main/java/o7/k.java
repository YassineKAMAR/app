package o7;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f25341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25342b;

    public k(o0 writer) {
        kotlin.jvm.internal.q.f(writer, "writer");
        this.f25341a = writer;
        this.f25342b = true;
    }

    public final boolean a() {
        return this.f25342b;
    }

    public void b() {
        this.f25342b = true;
    }

    public void c() {
        this.f25342b = false;
    }

    public void d(byte b8) {
        this.f25341a.writeLong(b8);
    }

    public final void e(char c8) {
        this.f25341a.a(c8);
    }

    public void f(double d8) {
        this.f25341a.c(String.valueOf(d8));
    }

    public void g(float f8) {
        this.f25341a.c(String.valueOf(f8));
    }

    public void h(int i8) {
        this.f25341a.writeLong(i8);
    }

    public void i(long j8) {
        this.f25341a.writeLong(j8);
    }

    public final void j(String v7) {
        kotlin.jvm.internal.q.f(v7, "v");
        this.f25341a.c(v7);
    }

    public void k(short s8) {
        this.f25341a.writeLong(s8);
    }

    public void l(boolean z7) {
        this.f25341a.c(String.valueOf(z7));
    }

    public final void m(String value) {
        kotlin.jvm.internal.q.f(value, "value");
        this.f25341a.b(value);
    }

    protected final void n(boolean z7) {
        this.f25342b = z7;
    }

    public void o() {
    }

    public void p() {
    }
}
