package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.e;
import androidx.core.provider.g;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Class<?> f2055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Constructor<?> f2056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Method f2057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Method f2058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Method f2059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final Method f2060l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Method f2061m;

    public g() throws NoSuchMethodException {
        Method methodU;
        Constructor<?> constructorW;
        Method methodS;
        Method methodT;
        Method methodX;
        Method methodR;
        Class<?> cls = null;
        try {
            Class<?> clsV = v();
            constructorW = w(clsV);
            methodS = s(clsV);
            methodT = t(clsV);
            methodX = x(clsV);
            methodR = r(clsV);
            methodU = u(clsV);
            cls = clsV;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e8.getClass().getName(), e8);
            methodU = null;
            constructorW = null;
            methodS = null;
            methodT = null;
            methodX = null;
            methodR = null;
        }
        this.f2055g = cls;
        this.f2056h = constructorW;
        this.f2057i = methodS;
        this.f2058j = methodT;
        this.f2059k = methodX;
        this.f2060l = methodR;
        this.f2061m = methodU;
    }

    private Object l() {
        try {
            return this.f2056h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f2060l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i8, int i9, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f2057i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i8, int i9, int i10) {
        try {
            return ((Boolean) this.f2058j.invoke(obj, byteBuffer, Integer.valueOf(i8), null, Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f2059k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f2057i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f2057i != null;
    }

    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface a(Context context, e.c cVar, Resources resources, int i8) {
        if (!q()) {
            return super.a(context, cVar, resources, i8);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        for (e.d dVar : cVar.a()) {
            if (!n(context, objL, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(objL);
                return null;
            }
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [android.graphics.Typeface$Builder] */
    @Override // androidx.core.graphics.e, androidx.core.graphics.j
    public Typeface b(Context context, CancellationSignal cancellationSignal, g.b[] bVarArr, int i8) {
        Typeface typefaceI;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            g.b bVarG = g(bVarArr, i8);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    final FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                    Typeface typefaceBuild = new Object(fileDescriptor) { // from class: android.graphics.Typeface$Builder
                        static {
                            throw new NoClassDefFoundError();
                        }

                        public native /* synthetic */ Typeface build();

                        public native /* synthetic */ Typeface$Builder setItalic(boolean z7);

                        public native /* synthetic */ Typeface$Builder setWeight(int i9);
                    }.setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> mapH = k.h(context, bVarArr, cancellationSignal);
        Object objL = l();
        if (objL == null) {
            return null;
        }
        boolean z7 = false;
        for (g.b bVar : bVarArr) {
            ByteBuffer byteBuffer = mapH.get(bVar.d());
            if (byteBuffer != null) {
                if (!o(objL, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0)) {
                    m(objL);
                    return null;
                }
                z7 = true;
            }
        }
        if (!z7) {
            m(objL);
            return null;
        }
        if (p(objL) && (typefaceI = i(objL)) != null) {
            return Typeface.create(typefaceI, i8);
        }
        return null;
    }

    @Override // androidx.core.graphics.j
    public Typeface d(Context context, Resources resources, int i8, String str, int i9) {
        if (!q()) {
            return super.d(context, resources, i8, str, i9);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (!n(context, objL, str, 0, -1, -1, null)) {
            m(objL);
            return null;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance(this.f2055g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f2061m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    protected Method t(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class<?> v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> w(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method x(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
