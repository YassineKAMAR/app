package k7;

import e6.i0;
import k7.k;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import m7.y1;
import p6.l;
import w6.v;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends r implements l<k7.a, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24279a = new a();

        a() {
            super(1);
        }

        public final void a(k7.a aVar) {
            q.f(aVar, "$this$null");
        }

        @Override // p6.l
        public /* bridge */ /* synthetic */ i0 invoke(k7.a aVar) {
            a(aVar);
            return i0.f21430a;
        }
    }

    public static final f a(String serialName, e kind) {
        q.f(serialName, "serialName");
        q.f(kind, "kind");
        if (!v.p(serialName)) {
            return y1.a(serialName, kind);
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    public static final f b(String serialName, f[] typeParameters, l<? super k7.a, i0> builderAction) {
        q.f(serialName, "serialName");
        q.f(typeParameters, "typeParameters");
        q.f(builderAction, "builderAction");
        if (!(!v.p(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        k7.a aVar = new k7.a(serialName);
        builderAction.invoke(aVar);
        return new g(serialName, k.a.f24282a, aVar.f().size(), f6.j.C(typeParameters), aVar);
    }

    public static final f c(String serialName, j kind, f[] typeParameters, l<? super k7.a, i0> builder) {
        q.f(serialName, "serialName");
        q.f(kind, "kind");
        q.f(typeParameters, "typeParameters");
        q.f(builder, "builder");
        if (!(!v.p(serialName))) {
            throw new IllegalArgumentException("Blank serial names are prohibited".toString());
        }
        if (!(!q.b(kind, k.a.f24282a))) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString());
        }
        k7.a aVar = new k7.a(serialName);
        builder.invoke(aVar);
        return new g(serialName, kind, aVar.f().size(), f6.j.C(typeParameters), aVar);
    }

    public static /* synthetic */ f d(String str, j jVar, f[] fVarArr, l lVar, int i8, Object obj) {
        if ((i8 & 8) != 0) {
            lVar = a.f24279a;
        }
        return c(str, jVar, fVarArr, lVar);
    }
}
