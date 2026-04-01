package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f1448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private EnumC0017b f1449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f1451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f1452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f1453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f1454h;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1455a;

        static {
            int[] iArr = new int[EnumC0017b.values().length];
            f1455a = iArr;
            try {
                iArr[EnumC0017b.REFERENCE_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1455a[EnumC0017b.BOOLEAN_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1455a[EnumC0017b.STRING_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1455a[EnumC0017b.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1455a[EnumC0017b.COLOR_DRAWABLE_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1455a[EnumC0017b.INT_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1455a[EnumC0017b.FLOAT_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1455a[EnumC0017b.DIMENSION_TYPE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b, reason: collision with other inner class name */
    public enum EnumC0017b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE,
        REFERENCE_TYPE
    }

    public b(b bVar, Object obj) {
        this.f1447a = false;
        this.f1448b = bVar.f1448b;
        this.f1449c = bVar.f1449c;
        f(obj);
    }

    public b(String str, EnumC0017b enumC0017b, Object obj, boolean z7) {
        this.f1448b = str;
        this.f1449c = enumC0017b;
        this.f1447a = z7;
        f(obj);
    }

    public static HashMap<String, b> a(HashMap<String, b> map, View view) {
        HashMap<String, b> map2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            try {
                map2.put(str, str.equals("BackgroundColor") ? new b(bVar, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new b(bVar, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e8) {
                e8.printStackTrace();
            }
        }
        return map2;
    }

    public static void d(Context context, XmlPullParser xmlPullParser, HashMap<String, b> map) {
        EnumC0017b enumC0017b;
        int resourceId;
        Object string;
        float dimension;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), k.f1821y4);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string2 = null;
        Object objValueOf = null;
        EnumC0017b enumC0017b2 = null;
        boolean z7 = false;
        for (int i8 = 0; i8 < indexCount; i8++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i8);
            if (index == k.f1829z4) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                if (string2 != null && string2.length() > 0) {
                    string2 = Character.toUpperCase(string2.charAt(0)) + string2.substring(1);
                }
            } else if (index == k.J4) {
                string2 = typedArrayObtainStyledAttributes.getString(index);
                z7 = true;
            } else if (index == k.A4) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                enumC0017b2 = EnumC0017b.BOOLEAN_TYPE;
            } else {
                if (index == k.C4) {
                    enumC0017b = EnumC0017b.COLOR_TYPE;
                } else if (index == k.B4) {
                    enumC0017b = EnumC0017b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == k.G4) {
                        enumC0017b = EnumC0017b.DIMENSION_TYPE;
                        dimension = TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == k.D4) {
                        enumC0017b = EnumC0017b.DIMENSION_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == k.E4) {
                        enumC0017b = EnumC0017b.FLOAT_TYPE;
                        dimension = typedArrayObtainStyledAttributes.getFloat(index, Float.NaN);
                    } else {
                        if (index == k.F4) {
                            enumC0017b = EnumC0017b.INT_TYPE;
                            resourceId = typedArrayObtainStyledAttributes.getInteger(index, -1);
                        } else if (index == k.I4) {
                            enumC0017b = EnumC0017b.STRING_TYPE;
                            string = typedArrayObtainStyledAttributes.getString(index);
                            Object obj = string;
                            enumC0017b2 = enumC0017b;
                            objValueOf = obj;
                        } else if (index == k.H4) {
                            enumC0017b = EnumC0017b.REFERENCE_TYPE;
                            resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            if (resourceId == -1) {
                                resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                        }
                        string = Integer.valueOf(resourceId);
                        Object obj2 = string;
                        enumC0017b2 = enumC0017b;
                        objValueOf = obj2;
                    }
                    string = Float.valueOf(dimension);
                    Object obj22 = string;
                    enumC0017b2 = enumC0017b;
                    objValueOf = obj22;
                }
                resourceId = typedArrayObtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(resourceId);
                Object obj222 = string;
                enumC0017b2 = enumC0017b;
                objValueOf = obj222;
            }
        }
        if (string2 != null && objValueOf != null) {
            map.put(string2, new b(string2, enumC0017b2, objValueOf, z7));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void e(View view, HashMap<String, b> map) {
        StringBuilder sb;
        Class<?> cls = view.getClass();
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            String str2 = bVar.f1447a ? str : "set" + str;
            try {
                switch (a.f1455a[bVar.f1449c.ordinal()]) {
                    case 1:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f1450d));
                        break;
                    case 2:
                        cls.getMethod(str2, Boolean.TYPE).invoke(view, Boolean.valueOf(bVar.f1453g));
                        break;
                    case 3:
                        cls.getMethod(str2, CharSequence.class).invoke(view, bVar.f1452f);
                        break;
                    case 4:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f1454h));
                        break;
                    case 5:
                        Method method = cls.getMethod(str2, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(bVar.f1454h);
                        method.invoke(view, colorDrawable);
                        break;
                    case 6:
                        cls.getMethod(str2, Integer.TYPE).invoke(view, Integer.valueOf(bVar.f1450d));
                        break;
                    case 7:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f1451e));
                        break;
                    case 8:
                        cls.getMethod(str2, Float.TYPE).invoke(view, Float.valueOf(bVar.f1451e));
                        break;
                }
            } catch (IllegalAccessException e8) {
                e = e8;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e9) {
                Log.e("TransitionLayout", e9.getMessage());
                Log.e("TransitionLayout", " Custom Attribute \"" + str + "\" not found on " + cls.getName());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls.getName());
                sb2.append(" must have a method ");
                sb2.append(str2);
                Log.e("TransitionLayout", sb2.toString());
            } catch (InvocationTargetException e10) {
                e = e10;
                sb = new StringBuilder();
                sb.append(" Custom Attribute \"");
                sb.append(str);
                sb.append("\" not found on ");
                sb.append(cls.getName());
                Log.e("TransitionLayout", sb.toString());
                e.printStackTrace();
            }
        }
    }

    public String b() {
        return this.f1448b;
    }

    public EnumC0017b c() {
        return this.f1449c;
    }

    public void f(Object obj) {
        switch (a.f1455a[this.f1449c.ordinal()]) {
            case 1:
            case 6:
                this.f1450d = ((Integer) obj).intValue();
                break;
            case 2:
                this.f1453g = ((Boolean) obj).booleanValue();
                break;
            case 3:
                this.f1452f = (String) obj;
                break;
            case 4:
            case 5:
                this.f1454h = ((Integer) obj).intValue();
                break;
            case 7:
            case 8:
                this.f1451e = ((Float) obj).floatValue();
                break;
        }
    }
}
