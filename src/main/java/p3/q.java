package p3;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static <T> T a(Bundle bundle, String str, Class<T> cls, T t7) {
        T t8 = (T) bundle.get(str);
        if (t8 == null) {
            return t7;
        }
        if (cls.isAssignableFrom(t8.getClass())) {
            return t8;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t8.getClass().getCanonicalName()));
    }

    public static void b(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
