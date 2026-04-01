package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u extends w implements u6.g {
    public u(Object obj, Class cls, String str, String str2, int i8) {
        super(obj, cls, str, str2, i8);
    }

    @Override // kotlin.jvm.internal.e
    protected u6.b computeReflected() {
        return z.d(this);
    }

    @Override // p6.a
    public Object invoke() {
        return get();
    }
}
