package m3;

/* JADX INFO: loaded from: classes.dex */
public final class m2 implements l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m2 f24775b = new m2(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f24776a;

    private m2(Object obj) {
        this.f24776a = obj;
    }

    public static l2 a(Object obj) {
        if (obj != null) {
            return new m2(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // m3.o2
    public final Object k() {
        return this.f24776a;
    }
}
