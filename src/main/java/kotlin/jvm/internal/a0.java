package kotlin.jvm.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {
    public u6.f a(n nVar) {
        return nVar;
    }

    public u6.c b(Class cls) {
        return new h(cls);
    }

    public u6.e c(Class cls, String str) {
        return new t(cls, str);
    }

    public u6.g d(u uVar) {
        return uVar;
    }

    public String e(m mVar) {
        String string = mVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String f(r rVar) {
        return e(rVar);
    }

    public u6.i g(u6.d dVar, List<u6.j> list, boolean z7) {
        return new e0(dVar, list, z7);
    }
}
