package g3;

import a3.o;
import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import g3.a;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends a.AbstractBinderC0110a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f22021a;

    private b(Object obj) {
        this.f22021a = obj;
    }

    @ResultIgnorabilityUnspecified
    public static <T> T H0(a aVar) {
        if (aVar instanceof b) {
            return (T) ((b) aVar).f22021a;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i8 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i8++;
                field = field2;
            }
        }
        if (i8 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        o.j(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(iBinderAsBinder);
        } catch (IllegalAccessException e8) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e8);
        } catch (NullPointerException e9) {
            throw new IllegalArgumentException("Binder object is null.", e9);
        }
    }

    public static <T> a k3(T t7) {
        return new b(t7);
    }
}
