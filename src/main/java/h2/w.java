package h2;

/* JADX INFO: loaded from: classes.dex */
public class w extends z1.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22332a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private z1.d f22333b;

    @Override // z1.d, h2.a
    public final void Z() {
        synchronized (this.f22332a) {
            z1.d dVar = this.f22333b;
            if (dVar != null) {
                dVar.Z();
            }
        }
    }

    @Override // z1.d
    public final void h() {
        synchronized (this.f22332a) {
            z1.d dVar = this.f22333b;
            if (dVar != null) {
                dVar.h();
            }
        }
    }

    @Override // z1.d
    public void j(z1.n nVar) {
        synchronized (this.f22332a) {
            z1.d dVar = this.f22333b;
            if (dVar != null) {
                dVar.j(nVar);
            }
        }
    }

    @Override // z1.d
    public final void k() {
        synchronized (this.f22332a) {
            z1.d dVar = this.f22333b;
            if (dVar != null) {
                dVar.k();
            }
        }
    }

    @Override // z1.d
    public void l() {
        synchronized (this.f22332a) {
            z1.d dVar = this.f22333b;
            if (dVar != null) {
                dVar.l();
            }
        }
    }

    @Override // z1.d
    public final void m() {
        synchronized (this.f22332a) {
            z1.d dVar = this.f22333b;
            if (dVar != null) {
                dVar.m();
            }
        }
    }

    public final void o(z1.d dVar) {
        synchronized (this.f22332a) {
            this.f22333b = dVar;
        }
    }
}
