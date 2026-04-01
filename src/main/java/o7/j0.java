package o7;

/* JADX INFO: loaded from: classes2.dex */
final class j0 extends c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n7.b f25338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f25339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(n7.a json, n7.b value) {
        super(json, value, null);
        kotlin.jvm.internal.q.f(json, "json");
        kotlin.jvm.internal.q.f(value, "value");
        this.f25338f = value;
        this.f25339g = s0().size();
        this.f25340h = -1;
    }

    @Override // m7.g1
    protected String a0(k7.f desc, int i8) {
        kotlin.jvm.internal.q.f(desc, "desc");
        return String.valueOf(i8);
    }

    @Override // o7.c
    protected n7.h e0(String tag) {
        kotlin.jvm.internal.q.f(tag, "tag");
        return s0().get(Integer.parseInt(tag));
    }

    @Override // l7.c
    public int s(k7.f descriptor) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        int i8 = this.f25340h;
        if (i8 >= this.f25339g - 1) {
            return -1;
        }
        int i9 = i8 + 1;
        this.f25340h = i9;
        return i9;
    }

    @Override // o7.c
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public n7.b s0() {
        return this.f25338f;
    }
}
