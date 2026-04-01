package v;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: v.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0180a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26758a;

        static {
            int[] iArr = new int[b.EnumC0017b.values().length];
            f26758a = iArr;
            try {
                iArr[b.EnumC0017b.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26758a[b.EnumC0017b.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26758a[b.EnumC0017b.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26758a[b.EnumC0017b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f26758a[b.EnumC0017b.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f26758a[b.EnumC0017b.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f26758a[b.EnumC0017b.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int a(int i8) {
        int i9 = (i8 & (~(i8 >> 31))) - 255;
        return (i9 & (i9 >> 31)) + 255;
    }

    public static void b(androidx.constraintlayout.widget.b bVar, View view, float[] fArr) {
        StringBuilder sb;
        String str;
        Class<?> cls = view.getClass();
        String str2 = "set" + bVar.b();
        try {
            boolean z7 = true;
            switch (C0180a.f26758a[bVar.c().ordinal()]) {
                case 1:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str2, Drawable.class);
                    int iA = (a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iA);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf((a((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + bVar.b());
                case 6:
                    Method method2 = cls.getMethod(str2, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z7 = false;
                    }
                    objArr[0] = Boolean.valueOf(z7);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e8) {
            e = e8;
            sb = new StringBuilder();
            str = "cannot access method ";
            sb.append(str);
            sb.append(str2);
            sb.append(" on View \"");
            sb.append(androidx.constraintlayout.motion.widget.a.b(view));
            sb.append("\"");
            Log.e("CustomSupport", sb.toString());
            e.printStackTrace();
        } catch (NoSuchMethodException e9) {
            e = e9;
            sb = new StringBuilder();
            str = "no method ";
            sb.append(str);
            sb.append(str2);
            sb.append(" on View \"");
            sb.append(androidx.constraintlayout.motion.widget.a.b(view));
            sb.append("\"");
            Log.e("CustomSupport", sb.toString());
            e.printStackTrace();
        } catch (InvocationTargetException e10) {
            e = e10;
            e.printStackTrace();
        }
    }
}
