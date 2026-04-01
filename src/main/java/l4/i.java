package l4;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
class i implements i4.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f24410a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f24411b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i4.c f24412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f24413d;

    i(f fVar) {
        this.f24413d = fVar;
    }

    private void a() {
        if (this.f24410a) {
            throw new i4.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f24410a = true;
    }

    @Override // i4.g
    public i4.g b(String str) throws IOException {
        a();
        this.f24413d.f(this.f24412c, str, this.f24411b);
        return this;
    }

    @Override // i4.g
    public i4.g c(boolean z7) {
        a();
        this.f24413d.k(this.f24412c, z7, this.f24411b);
        return this;
    }

    void d(i4.c cVar, boolean z7) {
        this.f24410a = false;
        this.f24412c = cVar;
        this.f24411b = z7;
    }
}
