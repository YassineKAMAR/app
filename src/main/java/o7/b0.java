package o7;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {
    public static final x a(Number value, String key, String output) {
        kotlin.jvm.internal.q.f(value, "value");
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(output, "output");
        return e(-1, k(value, key, output));
    }

    public static final z b(Number value, String output) {
        kotlin.jvm.internal.q.f(value, "value");
        kotlin.jvm.internal.q.f(output, "output");
        return new z("Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(output, 0, 1, null)));
    }

    public static final z c(Number value, String key, String output) {
        kotlin.jvm.internal.q.f(value, "value");
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(output, "output");
        return new z(k(value, key, output));
    }

    public static final z d(k7.f keyDescriptor) {
        kotlin.jvm.internal.q.f(keyDescriptor, "keyDescriptor");
        return new z("Value of type '" + keyDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + keyDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final x e(int i8, String message) {
        kotlin.jvm.internal.q.f(message, "message");
        if (i8 >= 0) {
            message = "Unexpected JSON token at offset " + i8 + ": " + message;
        }
        return new x(message);
    }

    public static final x f(int i8, String message, CharSequence input) {
        kotlin.jvm.internal.q.f(message, "message");
        kotlin.jvm.internal.q.f(input, "input");
        return e(i8, message + "\nJSON input: " + ((Object) h(input, i8)));
    }

    public static final x g(String key, String input) {
        kotlin.jvm.internal.q.f(key, "key");
        kotlin.jvm.internal.q.f(input, "input");
        return e(-1, "Encountered unknown key '" + key + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) i(input, 0, 1, null)));
    }

    private static final CharSequence h(CharSequence charSequence, int i8) {
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i8 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i9 = i8 - 30;
        int i10 = i8 + 30;
        return (i9 <= 0 ? "" : ".....") + charSequence.subSequence(t6.l.b(i9, 0), t6.l.d(i10, charSequence.length())).toString() + (i10 >= charSequence.length() ? "" : ".....");
    }

    static /* synthetic */ CharSequence i(CharSequence charSequence, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -1;
        }
        return h(charSequence, i8);
    }

    public static final Void j(a aVar, Number result) {
        kotlin.jvm.internal.q.f(aVar, "<this>");
        kotlin.jvm.internal.q.f(result, "result");
        a.y(aVar, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new e6.h();
    }

    private static final String k(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) i(str2, 0, 1, null));
    }
}
