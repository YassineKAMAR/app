package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends l7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f25392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p7.c f25393b;

    public w(a lexer, n7.a json) {
        kotlin.jvm.internal.q.f(lexer, "lexer");
        kotlin.jvm.internal.q.f(json, "json");
        this.f25392a = lexer;
        this.f25393b = json.a();
    }

    @Override // l7.a, l7.e
    public byte D() {
        a aVar = this.f25392a;
        String strS = aVar.s();
        try {
            return w6.d0.a(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UByte' for input '" + strS + '\'', 0, null, 6, null);
            throw new e6.h();
        }
    }

    @Override // l7.a, l7.e
    public short E() {
        a aVar = this.f25392a;
        String strS = aVar.s();
        try {
            return w6.d0.j(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UShort' for input '" + strS + '\'', 0, null, 6, null);
            throw new e6.h();
        }
    }

    @Override // l7.c
    public p7.c a() {
        return this.f25393b;
    }

    @Override // l7.a, l7.e
    public int k() {
        a aVar = this.f25392a;
        String strS = aVar.s();
        try {
            return w6.d0.d(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'UInt' for input '" + strS + '\'', 0, null, 6, null);
            throw new e6.h();
        }
    }

    @Override // l7.a, l7.e
    public long q() {
        a aVar = this.f25392a;
        String strS = aVar.s();
        try {
            return w6.d0.g(strS);
        } catch (IllegalArgumentException unused) {
            a.y(aVar, "Failed to parse type 'ULong' for input '" + strS + '\'', 0, null, 6, null);
            throw new e6.h();
        }
    }

    @Override // l7.c
    public int s(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        throw new IllegalStateException("unsupported".toString());
    }
}
