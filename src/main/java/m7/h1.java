package m7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h1 extends i2<String> {
    protected abstract String Z(String str, String str2);

    protected String a0(k7.f descriptor, int i8) {
        kotlin.jvm.internal.q.f(descriptor, "descriptor");
        return descriptor.g(i8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // m7.i2
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final String W(k7.f fVar, int i8) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        return c0(a0(fVar, i8));
    }

    protected final String c0(String nestedName) {
        kotlin.jvm.internal.q.f(nestedName, "nestedName");
        String strV = V();
        if (strV == null) {
            strV = "";
        }
        return Z(strV, nestedName);
    }
}
