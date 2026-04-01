package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n7.a f25376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f25377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o0 writer, n7.a json) {
        super(writer);
        kotlin.jvm.internal.q.f(writer, "writer");
        kotlin.jvm.internal.q.f(json, "json");
        this.f25376c = json;
    }

    @Override // o7.k
    public void b() {
        n(true);
        this.f25377d++;
    }

    @Override // o7.k
    public void c() {
        n(false);
        j("\n");
        int i8 = this.f25377d;
        for (int i9 = 0; i9 < i8; i9++) {
            j(this.f25376c.e().i());
        }
    }

    @Override // o7.k
    public void o() {
        e(' ');
    }

    @Override // o7.k
    public void p() {
        this.f25377d--;
    }
}
