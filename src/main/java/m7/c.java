package m7;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static final Void a(String str, u6.c<?> baseClass) {
        String str2;
        kotlin.jvm.internal.q.f(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.b() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nMark the base class as 'sealed' or register the serializer explicitly.";
        }
        throw new i7.i(str2);
    }

    public static final Void b(u6.c<?> subClass, u6.c<?> baseClass) {
        kotlin.jvm.internal.q.f(subClass, "subClass");
        kotlin.jvm.internal.q.f(baseClass, "baseClass");
        String strB = subClass.b();
        if (strB == null) {
            strB = String.valueOf(subClass);
        }
        a(strB, baseClass);
        throw new e6.h();
    }
}
