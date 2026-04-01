package o7;

import java.lang.annotation.Annotation;
import k7.j;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 {
    public static final void b(k7.j kind) {
        kotlin.jvm.internal.q.f(kind, "kind");
        if (kind instanceof j.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof k7.e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof k7.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static final String c(k7.f fVar, n7.a json) {
        kotlin.jvm.internal.q.f(fVar, "<this>");
        kotlin.jvm.internal.q.f(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof n7.e) {
                return ((n7.e) annotation).discriminator();
            }
        }
        return json.e().c();
    }

    public static final <T> T d(n7.g gVar, i7.a<T> deserializer) {
        n7.v vVarO;
        kotlin.jvm.internal.q.f(gVar, "<this>");
        kotlin.jvm.internal.q.f(deserializer, "deserializer");
        if (!(deserializer instanceof m7.b) || gVar.b().e().k()) {
            return deserializer.deserialize(gVar);
        }
        String strC = c(deserializer.getDescriptor(), gVar.b());
        n7.h hVarJ = gVar.j();
        k7.f descriptor = deserializer.getDescriptor();
        if (hVarJ instanceof n7.t) {
            n7.t tVar = (n7.t) hVarJ;
            n7.h hVar = (n7.h) tVar.get(strC);
            String strA = (hVar == null || (vVarO = n7.i.o(hVar)) == null) ? null : vVarO.a();
            i7.a<? extends T> aVarC = ((m7.b) deserializer).c(gVar, strA);
            if (aVarC != null) {
                return (T) w0.a(gVar.b(), strC, tVar, aVarC);
            }
            e(strA, tVar);
            throw new e6.h();
        }
        throw b0.e(-1, "Expected " + kotlin.jvm.internal.z.b(n7.t.class) + " as the serialized body of " + descriptor.a() + ", but had " + kotlin.jvm.internal.z.b(hVarJ.getClass()));
    }

    public static final Void e(String str, n7.t jsonTree) {
        String str2;
        kotlin.jvm.internal.q.f(jsonTree, "jsonTree");
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + '\'';
        }
        throw b0.f(-1, "Polymorphic serializer was not found for " + str2, jsonTree.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(i7.j<?> jVar, i7.j<Object> jVar2, String str) {
    }
}
