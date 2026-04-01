package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.HTTPClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f2019k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f2021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f2022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f2023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f2026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    PorterDuff.Mode f2027h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2028i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f2029j;

    static class a {
        static IconCompat a(Object obj) {
            androidx.core.util.f.b(obj);
            int iD = d(obj);
            if (iD == 2) {
                return IconCompat.g(null, c(obj), b(obj));
            }
            if (iD == 4) {
                return IconCompat.e(e(obj));
            }
            if (iD == 6) {
                return IconCompat.c(e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f2021b = obj;
            return iconCompat;
        }

        static int b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            }
        }

        static String c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon package", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            }
        }

        static int d(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e8) {
                e = e8;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e9) {
                e = e9;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e10) {
                e = e10;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        static Uri e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            }
        }

        static Drawable f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 26) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        static android.graphics.drawable.Icon g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                Method dump skipped, instruction units count: 206
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    static class b {
        static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    static class c {
        static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    static class d {
        static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f2020a = -1;
        this.f2022c = null;
        this.f2023d = null;
        this.f2024e = 0;
        this.f2025f = 0;
        this.f2026g = null;
        this.f2027h = f2019k;
        this.f2028i = null;
    }

    IconCompat(int i8) {
        this.f2022c = null;
        this.f2023d = null;
        this.f2024e = 0;
        this.f2025f = 0;
        this.f2026g = null;
        this.f2027h = f2019k;
        this.f2028i = null;
        this.f2020a = i8;
    }

    public static IconCompat a(Icon icon) {
        return a.a(icon);
    }

    static Bitmap b(Bitmap bitmap, boolean z7) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f8 = iMin;
        float f9 = 0.5f * f8;
        float f10 = 0.9166667f * f9;
        if (z7) {
            float f11 = 0.010416667f * f8;
            paint.setColor(0);
            paint.setShadowLayer(f11, 0.0f, f8 * 0.020833334f, 1023410176);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.setShadowLayer(f11, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f9, f9, f10, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f9, f9, f10, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat c(Uri uri) {
        androidx.core.util.d.c(uri);
        return d(uri.toString());
    }

    public static IconCompat d(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f2021b = str;
        return iconCompat;
    }

    public static IconCompat e(Uri uri) {
        androidx.core.util.d.c(uri);
        return f(uri.toString());
    }

    public static IconCompat f(String str) {
        androidx.core.util.d.c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f2021b = str;
        return iconCompat;
    }

    public static IconCompat g(Resources resources, String str, int i8) {
        androidx.core.util.d.c(str);
        if (i8 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f2024e = i8;
        if (resources != null) {
            try {
                iconCompat.f2021b = resources.getResourceName(i8);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f2021b = str;
        }
        iconCompat.f2029j = str;
        return iconCompat;
    }

    private static String q(int i8) {
        switch (i8) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int h() {
        int i8 = this.f2020a;
        if (i8 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f2021b);
        }
        if (i8 == 2) {
            return this.f2024e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String i() {
        int i8 = this.f2020a;
        if (i8 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.c(this.f2021b);
        }
        if (i8 == 2) {
            String str = this.f2029j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f2021b).split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0] : this.f2029j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int j() {
        int i8 = this.f2020a;
        return (i8 != -1 || Build.VERSION.SDK_INT < 23) ? i8 : a.d(this.f2021b);
    }

    public Uri k() {
        int i8 = this.f2020a;
        if (i8 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.e(this.f2021b);
        }
        if (i8 == 4 || i8 == 6) {
            return Uri.parse((String) this.f2021b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream l(Context context) {
        StringBuilder sb;
        String str;
        Uri uriK = k();
        String scheme = uriK.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriK);
            } catch (Exception e8) {
                e = e8;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f2021b));
            } catch (FileNotFoundException e9) {
                e = e9;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriK);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void m() {
        Parcelable parcelable;
        this.f2027h = PorterDuff.Mode.valueOf(this.f2028i);
        switch (this.f2020a) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                parcelable = this.f2023d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f2023d;
                if (parcelable == null) {
                    byte[] bArr = this.f2022c;
                    this.f2021b = bArr;
                    this.f2020a = 3;
                    this.f2024e = 0;
                    this.f2025f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f2022c, Charset.forName("UTF-16"));
                this.f2021b = str;
                if (this.f2020a == 2 && this.f2029j == null) {
                    this.f2029j = str.split(Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR, -1)[0];
                    return;
                }
                return;
            case 3:
                this.f2021b = this.f2022c;
                return;
        }
        this.f2021b = parcelable;
    }

    public void n(boolean z7) {
        this.f2028i = this.f2027h.name();
        switch (this.f2020a) {
            case HTTPClient.NO_STATUS_CODE /* -1 */:
                if (z7) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z7) {
                    Bitmap bitmap = (Bitmap) this.f2021b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f2022c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f2022c = ((String) this.f2021b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f2022c = (byte[]) this.f2021b;
                return;
            case 4:
            case 6:
                this.f2022c = this.f2021b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f2023d = (Parcelable) this.f2021b;
    }

    @Deprecated
    public Icon o() {
        return p(null);
    }

    public Icon p(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        int height;
        if (this.f2020a == -1) {
            return String.valueOf(this.f2021b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(q(this.f2020a));
        switch (this.f2020a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f2021b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f2021b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f2029j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(h())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f2024e);
                if (this.f2025f != 0) {
                    sb.append(" off=");
                    height = this.f2025f;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f2021b);
                break;
        }
        if (this.f2026g != null) {
            sb.append(" tint=");
            sb.append(this.f2026g);
        }
        if (this.f2027h != f2019k) {
            sb.append(" mode=");
            sb.append(this.f2027h);
        }
        sb.append(")");
        return sb.toString();
    }
}
