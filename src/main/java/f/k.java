package f;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f21559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f21560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class<?> f21561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f21562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f21563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f21564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f21565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f21566h;

    static void a(Resources resources) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            return;
        }
        if (i8 >= 24) {
            d(resources);
        } else if (i8 >= 23) {
            c(resources);
        } else {
            b(resources);
        }
    }

    private static void b(Resources resources) {
        if (!f21560b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f21559a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
            }
            f21560b = true;
        }
        Field field = f21559a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e9);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        if (!f21560b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f21559a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
            }
            f21560b = true;
        }
        Object obj = null;
        Field field = f21559a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e9);
            }
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    private static void d(Resources resources) {
        Object obj;
        if (!f21566h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f21565g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e8);
            }
            f21566h = true;
        }
        Field field = f21565g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e9) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f21560b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f21559a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
            }
            f21560b = true;
        }
        Field field2 = f21559a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    private static void e(Object obj) {
        if (!f21562d) {
            try {
                f21561c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e8) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e8);
            }
            f21562d = true;
        }
        Class<?> cls = f21561c;
        if (cls == null) {
            return;
        }
        if (!f21564f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f21563e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e9);
            }
            f21564f = true;
        }
        Field field = f21563e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e10) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e10);
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
