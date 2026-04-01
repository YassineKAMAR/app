package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.n;
import androidx.core.graphics.c;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends androidx.vectordrawable.graphics.drawable.f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final PorterDuff.Mode f2961k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f2962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f2963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f2964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f2967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f2968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Matrix f2969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f2970j;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2997b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2996a = androidx.core.graphics.c.d(string2);
            }
            this.f2998c = n.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (n.j(xmlPullParser, "pathData")) {
                TypedArray typedArrayK = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2936d);
                f(typedArrayK, xmlPullParser);
                typedArrayK.recycle();
            }
        }
    }

    private static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f2971e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f2972f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f2973g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        androidx.core.content.res.d f2974h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f2975i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f2976j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f2977k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f2978l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f2979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f2980n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f2981o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f2982p;

        c() {
            this.f2973g = 0.0f;
            this.f2975i = 1.0f;
            this.f2976j = 1.0f;
            this.f2977k = 0.0f;
            this.f2978l = 1.0f;
            this.f2979m = 0.0f;
            this.f2980n = Paint.Cap.BUTT;
            this.f2981o = Paint.Join.MITER;
            this.f2982p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f2973g = 0.0f;
            this.f2975i = 1.0f;
            this.f2976j = 1.0f;
            this.f2977k = 0.0f;
            this.f2978l = 1.0f;
            this.f2979m = 0.0f;
            this.f2980n = Paint.Cap.BUTT;
            this.f2981o = Paint.Join.MITER;
            this.f2982p = 4.0f;
            this.f2971e = cVar.f2971e;
            this.f2972f = cVar.f2972f;
            this.f2973g = cVar.f2973g;
            this.f2975i = cVar.f2975i;
            this.f2974h = cVar.f2974h;
            this.f2998c = cVar.f2998c;
            this.f2976j = cVar.f2976j;
            this.f2977k = cVar.f2977k;
            this.f2978l = cVar.f2978l;
            this.f2979m = cVar.f2979m;
            this.f2980n = cVar.f2980n;
            this.f2981o = cVar.f2981o;
            this.f2982p = cVar.f2982p;
        }

        private Paint.Cap e(int i8, Paint.Cap cap) {
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i8, Paint.Join join) {
            return i8 != 0 ? i8 != 1 ? i8 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2971e = null;
            if (n.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2997b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2996a = androidx.core.graphics.c.d(string2);
                }
                this.f2974h = n.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2976j = n.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f2976j);
                this.f2980n = e(n.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f2980n);
                this.f2981o = f(n.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f2981o);
                this.f2982p = n.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f2982p);
                this.f2972f = n.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2975i = n.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2975i);
                this.f2973g = n.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f2973g);
                this.f2978l = n.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2978l);
                this.f2979m = n.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2979m);
                this.f2977k = n.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f2977k);
                this.f2998c = n.g(typedArray, xmlPullParser, "fillType", 13, this.f2998c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f2974h.i() || this.f2972f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f2972f.j(iArr) | this.f2974h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2935c);
            h(typedArrayK, xmlPullParser, theme);
            typedArrayK.recycle();
        }

        float getFillAlpha() {
            return this.f2976j;
        }

        int getFillColor() {
            return this.f2974h.e();
        }

        float getStrokeAlpha() {
            return this.f2975i;
        }

        int getStrokeColor() {
            return this.f2972f.e();
        }

        float getStrokeWidth() {
            return this.f2973g;
        }

        float getTrimPathEnd() {
            return this.f2978l;
        }

        float getTrimPathOffset() {
            return this.f2979m;
        }

        float getTrimPathStart() {
            return this.f2977k;
        }

        void setFillAlpha(float f8) {
            this.f2976j = f8;
        }

        void setFillColor(int i8) {
            this.f2974h.k(i8);
        }

        void setStrokeAlpha(float f8) {
            this.f2975i = f8;
        }

        void setStrokeColor(int i8) {
            this.f2972f.k(i8);
        }

        void setStrokeWidth(float f8) {
            this.f2973g = f8;
        }

        void setTrimPathEnd(float f8) {
            this.f2978l = f8;
        }

        void setTrimPathOffset(float f8) {
            this.f2979m = f8;
        }

        void setTrimPathStart(float f8) {
            this.f2977k = f8;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f2983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<e> f2984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f2985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f2986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f2987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f2988f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f2989g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f2990h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f2991i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f2992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f2993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f2994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f2995m;

        public d() {
            super();
            this.f2983a = new Matrix();
            this.f2984b = new ArrayList<>();
            this.f2985c = 0.0f;
            this.f2986d = 0.0f;
            this.f2987e = 0.0f;
            this.f2988f = 1.0f;
            this.f2989g = 1.0f;
            this.f2990h = 0.0f;
            this.f2991i = 0.0f;
            this.f2992j = new Matrix();
            this.f2995m = null;
        }

        public d(d dVar, p.a<String, Object> aVar) {
            f bVar;
            super();
            this.f2983a = new Matrix();
            this.f2984b = new ArrayList<>();
            this.f2985c = 0.0f;
            this.f2986d = 0.0f;
            this.f2987e = 0.0f;
            this.f2988f = 1.0f;
            this.f2989g = 1.0f;
            this.f2990h = 0.0f;
            this.f2991i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2992j = matrix;
            this.f2995m = null;
            this.f2985c = dVar.f2985c;
            this.f2986d = dVar.f2986d;
            this.f2987e = dVar.f2987e;
            this.f2988f = dVar.f2988f;
            this.f2989g = dVar.f2989g;
            this.f2990h = dVar.f2990h;
            this.f2991i = dVar.f2991i;
            this.f2994l = dVar.f2994l;
            String str = dVar.f2995m;
            this.f2995m = str;
            this.f2993k = dVar.f2993k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f2992j);
            ArrayList<e> arrayList = dVar.f2984b;
            for (int i8 = 0; i8 < arrayList.size(); i8++) {
                e eVar = arrayList.get(i8);
                if (eVar instanceof d) {
                    this.f2984b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f2984b.add(bVar);
                    String str2 = bVar.f2997b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f2992j.reset();
            this.f2992j.postTranslate(-this.f2986d, -this.f2987e);
            this.f2992j.postScale(this.f2988f, this.f2989g);
            this.f2992j.postRotate(this.f2985c, 0.0f, 0.0f);
            this.f2992j.postTranslate(this.f2990h + this.f2986d, this.f2991i + this.f2987e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2994l = null;
            this.f2985c = n.f(typedArray, xmlPullParser, "rotation", 5, this.f2985c);
            this.f2986d = typedArray.getFloat(1, this.f2986d);
            this.f2987e = typedArray.getFloat(2, this.f2987e);
            this.f2988f = n.f(typedArray, xmlPullParser, "scaleX", 3, this.f2988f);
            this.f2989g = n.f(typedArray, xmlPullParser, "scaleY", 4, this.f2989g);
            this.f2990h = n.f(typedArray, xmlPullParser, "translateX", 6, this.f2990h);
            this.f2991i = n.f(typedArray, xmlPullParser, "translateY", 7, this.f2991i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2995m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i8 = 0; i8 < this.f2984b.size(); i8++) {
                if (this.f2984b.get(i8).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i8 = 0; i8 < this.f2984b.size(); i8++) {
                zB |= this.f2984b.get(i8).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2934b);
            e(typedArrayK, xmlPullParser);
            typedArrayK.recycle();
        }

        public String getGroupName() {
            return this.f2995m;
        }

        public Matrix getLocalMatrix() {
            return this.f2992j;
        }

        public float getPivotX() {
            return this.f2986d;
        }

        public float getPivotY() {
            return this.f2987e;
        }

        public float getRotation() {
            return this.f2985c;
        }

        public float getScaleX() {
            return this.f2988f;
        }

        public float getScaleY() {
            return this.f2989g;
        }

        public float getTranslateX() {
            return this.f2990h;
        }

        public float getTranslateY() {
            return this.f2991i;
        }

        public void setPivotX(float f8) {
            if (f8 != this.f2986d) {
                this.f2986d = f8;
                d();
            }
        }

        public void setPivotY(float f8) {
            if (f8 != this.f2987e) {
                this.f2987e = f8;
                d();
            }
        }

        public void setRotation(float f8) {
            if (f8 != this.f2985c) {
                this.f2985c = f8;
                d();
            }
        }

        public void setScaleX(float f8) {
            if (f8 != this.f2988f) {
                this.f2988f = f8;
                d();
            }
        }

        public void setScaleY(float f8) {
            if (f8 != this.f2989g) {
                this.f2989g = f8;
                d();
            }
        }

        public void setTranslateX(float f8) {
            if (f8 != this.f2990h) {
                this.f2990h = f8;
                d();
            }
        }

        public void setTranslateY(float f8) {
            if (f8 != this.f2991i) {
                this.f2991i = f8;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected c.b[] f2996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f2997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2999d;

        public f() {
            super();
            this.f2996a = null;
            this.f2998c = 0;
        }

        public f(f fVar) {
            super();
            this.f2996a = null;
            this.f2998c = 0;
            this.f2997b = fVar.f2997b;
            this.f2999d = fVar.f2999d;
            this.f2996a = androidx.core.graphics.c.f(fVar.f2996a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f2996a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f2996a;
        }

        public String getPathName() {
            return this.f2997b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (androidx.core.graphics.c.b(this.f2996a, bVarArr)) {
                androidx.core.graphics.c.j(this.f2996a, bVarArr);
            } else {
                this.f2996a = androidx.core.graphics.c.f(bVarArr);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.g$g, reason: collision with other inner class name */
    private static class C0044g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f3000q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f3001a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f3002b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f3003c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f3004d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f3005e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f3006f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f3007g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f3008h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f3009i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f3010j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f3011k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f3012l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f3013m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f3014n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f3015o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final p.a<String, Object> f3016p;

        public C0044g() {
            this.f3003c = new Matrix();
            this.f3009i = 0.0f;
            this.f3010j = 0.0f;
            this.f3011k = 0.0f;
            this.f3012l = 0.0f;
            this.f3013m = 255;
            this.f3014n = null;
            this.f3015o = null;
            this.f3016p = new p.a<>();
            this.f3008h = new d();
            this.f3001a = new Path();
            this.f3002b = new Path();
        }

        public C0044g(C0044g c0044g) {
            this.f3003c = new Matrix();
            this.f3009i = 0.0f;
            this.f3010j = 0.0f;
            this.f3011k = 0.0f;
            this.f3012l = 0.0f;
            this.f3013m = 255;
            this.f3014n = null;
            this.f3015o = null;
            p.a<String, Object> aVar = new p.a<>();
            this.f3016p = aVar;
            this.f3008h = new d(c0044g.f3008h, aVar);
            this.f3001a = new Path(c0044g.f3001a);
            this.f3002b = new Path(c0044g.f3002b);
            this.f3009i = c0044g.f3009i;
            this.f3010j = c0044g.f3010j;
            this.f3011k = c0044g.f3011k;
            this.f3012l = c0044g.f3012l;
            this.f3007g = c0044g.f3007g;
            this.f3013m = c0044g.f3013m;
            this.f3014n = c0044g.f3014n;
            String str = c0044g.f3014n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f3015o = c0044g.f3015o;
        }

        private static float a(float f8, float f9, float f10, float f11) {
            return (f8 * f11) - (f9 * f10);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            dVar.f2983a.set(matrix);
            dVar.f2983a.preConcat(dVar.f2992j);
            canvas.save();
            for (int i10 = 0; i10 < dVar.f2984b.size(); i10++) {
                e eVar = dVar.f2984b.get(i10);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f2983a, canvas, i8, i9, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i8, i9, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            float f8 = i8 / this.f3011k;
            float f9 = i9 / this.f3012l;
            float fMin = Math.min(f8, f9);
            Matrix matrix = dVar.f2983a;
            this.f3003c.set(matrix);
            this.f3003c.postScale(f8, f9);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f3001a);
            Path path = this.f3001a;
            this.f3002b.reset();
            if (fVar.c()) {
                this.f3002b.setFillType(fVar.f2998c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3002b.addPath(path, this.f3003c);
                canvas.clipPath(this.f3002b);
                return;
            }
            c cVar = (c) fVar;
            float f10 = cVar.f2977k;
            if (f10 != 0.0f || cVar.f2978l != 1.0f) {
                float f11 = cVar.f2979m;
                float f12 = (f10 + f11) % 1.0f;
                float f13 = (cVar.f2978l + f11) % 1.0f;
                if (this.f3006f == null) {
                    this.f3006f = new PathMeasure();
                }
                this.f3006f.setPath(this.f3001a, false);
                float length = this.f3006f.getLength();
                float f14 = f12 * length;
                float f15 = f13 * length;
                path.reset();
                if (f14 > f15) {
                    this.f3006f.getSegment(f14, length, path, true);
                    this.f3006f.getSegment(0.0f, f15, path, true);
                } else {
                    this.f3006f.getSegment(f14, f15, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3002b.addPath(path, this.f3003c);
            if (cVar.f2974h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f2974h;
                if (this.f3005e == null) {
                    Paint paint = new Paint(1);
                    this.f3005e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3005e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f3003c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f2976j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f2976j));
                }
                paint2.setColorFilter(colorFilter);
                this.f3002b.setFillType(cVar.f2998c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3002b, paint2);
            }
            if (cVar.f2972f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f2972f;
                if (this.f3004d == null) {
                    Paint paint3 = new Paint(1);
                    this.f3004d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3004d;
                Paint.Join join = cVar.f2981o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f2980n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f2982p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f3003c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f2975i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f2975i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f2973g * fMin * fE);
                canvas.drawPath(this.f3002b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i8, int i9, ColorFilter colorFilter) {
            c(this.f3008h, f3000q, canvas, i8, i9, colorFilter);
        }

        public boolean f() {
            if (this.f3015o == null) {
                this.f3015o = Boolean.valueOf(this.f3008h.a());
            }
            return this.f3015o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3008h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3013m;
        }

        public void setAlpha(float f8) {
            setRootAlpha((int) (f8 * 255.0f));
        }

        public void setRootAlpha(int i8) {
            this.f3013m = i8;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f3017a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        C0044g f3018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f3019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f3020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f3021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f3022f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f3023g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f3024h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3025i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f3026j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f3027k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f3028l;

        public h() {
            this.f3019c = null;
            this.f3020d = g.f2961k;
            this.f3018b = new C0044g();
        }

        public h(h hVar) {
            this.f3019c = null;
            this.f3020d = g.f2961k;
            if (hVar != null) {
                this.f3017a = hVar.f3017a;
                C0044g c0044g = new C0044g(hVar.f3018b);
                this.f3018b = c0044g;
                if (hVar.f3018b.f3005e != null) {
                    c0044g.f3005e = new Paint(hVar.f3018b.f3005e);
                }
                if (hVar.f3018b.f3004d != null) {
                    this.f3018b.f3004d = new Paint(hVar.f3018b.f3004d);
                }
                this.f3019c = hVar.f3019c;
                this.f3020d = hVar.f3020d;
                this.f3021e = hVar.f3021e;
            }
        }

        public boolean a(int i8, int i9) {
            return i8 == this.f3022f.getWidth() && i9 == this.f3022f.getHeight();
        }

        public boolean b() {
            return !this.f3027k && this.f3023g == this.f3019c && this.f3024h == this.f3020d && this.f3026j == this.f3021e && this.f3025i == this.f3018b.getRootAlpha();
        }

        public void c(int i8, int i9) {
            if (this.f3022f == null || !a(i8, i9)) {
                this.f3022f = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
                this.f3027k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3022f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3028l == null) {
                Paint paint = new Paint();
                this.f3028l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3028l.setAlpha(this.f3018b.getRootAlpha());
            this.f3028l.setColorFilter(colorFilter);
            return this.f3028l;
        }

        public boolean f() {
            return this.f3018b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3018b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3017a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f3018b.g(iArr);
            this.f3027k |= zG;
            return zG;
        }

        public void i() {
            this.f3023g = this.f3019c;
            this.f3024h = this.f3020d;
            this.f3025i = this.f3018b.getRootAlpha();
            this.f3026j = this.f3021e;
            this.f3027k = false;
        }

        public void j(int i8, int i9) {
            this.f3022f.eraseColor(0);
            this.f3018b.b(new Canvas(this.f3022f), i8, i9, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f3029a;

        public i(Drawable.ConstantState constantState) {
            this.f3029a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3029a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3029a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f2960a = (VectorDrawable) this.f3029a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f2960a = (VectorDrawable) this.f3029a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f2960a = (VectorDrawable) this.f3029a.newDrawable(resources, theme);
            return gVar;
        }
    }

    g() {
        this.f2966f = true;
        this.f2968h = new float[9];
        this.f2969i = new Matrix();
        this.f2970j = new Rect();
        this.f2962b = new h();
    }

    g(h hVar) {
        this.f2966f = true;
        this.f2968h = new float[9];
        this.f2969i = new Matrix();
        this.f2970j = new Rect();
        this.f2962b = hVar;
        this.f2963c = j(this.f2963c, hVar.f3019c, hVar.f3020d);
    }

    static int a(int i8, float f8) {
        return (i8 & 16777215) | (((int) (Color.alpha(i8) * f8)) << 24);
    }

    public static g b(Resources resources, int i8, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f2960a = androidx.core.content.res.h.d(resources, i8, theme);
            gVar.f2967g = new i(gVar.f2960a.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i8);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e8) {
            Log.e("VectorDrawableCompat", "parser error", e8);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i8;
        int i9;
        f fVar;
        h hVar = this.f2962b;
        C0044g c0044g = hVar.f3018b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0044g.f3008h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z7 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2984b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0044g.f3016p.put(cVar.getPathName(), cVar);
                    }
                    z7 = false;
                    fVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2984b.add(bVar);
                    String pathName = bVar.getPathName();
                    fVar = bVar;
                    if (pathName != null) {
                        c0044g.f3016p.put(bVar.getPathName(), bVar);
                        fVar = bVar;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2984b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0044g.f3016p.put(dVar2.getGroupName(), dVar2);
                    }
                    i8 = hVar.f3017a;
                    i9 = dVar2.f2993k;
                    hVar.f3017a = i9 | i8;
                }
                i8 = hVar.f3017a;
                i9 = fVar.f2999d;
                hVar.f3017a = i9 | i8;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z7) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i8, PorterDuff.Mode mode) {
        if (i8 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i8 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i8 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i8) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case com.amazon.c.a.a.c.f4052g /* 16 */:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f2962b;
        C0044g c0044g = hVar.f3018b;
        hVar.f3020d = g(n.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = n.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f3019c = colorStateListC;
        }
        hVar.f3021e = n.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3021e);
        c0044g.f3011k = n.f(typedArray, xmlPullParser, "viewportWidth", 7, c0044g.f3011k);
        float f8 = n.f(typedArray, xmlPullParser, "viewportHeight", 8, c0044g.f3012l);
        c0044g.f3012l = f8;
        if (c0044g.f3011k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f8 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0044g.f3009i = typedArray.getDimension(3, c0044g.f3009i);
        float dimension = typedArray.getDimension(2, c0044g.f3010j);
        c0044g.f3010j = dimension;
        if (c0044g.f3009i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0044g.setAlpha(n.f(typedArray, xmlPullParser, "alpha", 4, c0044g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0044g.f3014n = string;
            c0044g.f3016p.put(string, c0044g);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2960a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f2962b.f3018b.f3016p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2970j);
        if (this.f2970j.width() <= 0 || this.f2970j.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2964d;
        if (colorFilter == null) {
            colorFilter = this.f2963c;
        }
        canvas.getMatrix(this.f2969i);
        this.f2969i.getValues(this.f2968h);
        float fAbs = Math.abs(this.f2968h[0]);
        float fAbs2 = Math.abs(this.f2968h[4]);
        float fAbs3 = Math.abs(this.f2968h[1]);
        float fAbs4 = Math.abs(this.f2968h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f2970j.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f2970j.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f2970j;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f2970j.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f2970j.offsetTo(0, 0);
        this.f2962b.c(iMin, iMin2);
        if (!this.f2966f) {
            this.f2962b.j(iMin, iMin2);
        } else if (!this.f2962b.b()) {
            this.f2962b.j(iMin, iMin2);
            this.f2962b.i();
        }
        this.f2962b.d(canvas, colorFilter, this.f2970j);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2960a;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2962b.f3018b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2962b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2960a;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2964d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2960a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f2960a.getConstantState());
        }
        this.f2962b.f3017a = getChangingConfigurations();
        return this.f2962b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2962b.f3018b.f3010j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2962b.f3018b.f3009i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z7) {
        this.f2966f = z7;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f2962b;
        hVar.f3018b = new C0044g();
        TypedArray typedArrayK = n.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2933a);
        i(typedArrayK, xmlPullParser, theme);
        typedArrayK.recycle();
        hVar.f3017a = getChangingConfigurations();
        hVar.f3027k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2963c = j(this.f2963c, hVar.f3019c, hVar.f3020d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2960a;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2962b.f3021e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f2962b) != null && (hVar.g() || ((colorStateList = this.f2962b.f3019c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2965e && super.mutate() == this) {
            this.f2962b = new h(this.f2962b);
            this.f2965e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z7 = false;
        h hVar = this.f2962b;
        ColorStateList colorStateList = hVar.f3019c;
        if (colorStateList != null && (mode = hVar.f3020d) != null) {
            this.f2963c = j(this.f2963c, colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z7;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j8) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j8);
        } else {
            super.scheduleSelf(runnable, j8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i8) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.setAlpha(i8);
        } else if (this.f2962b.f3018b.getRootAlpha() != i8) {
            this.f2962b.f3018b.setRootAlpha(i8);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z7);
        } else {
            this.f2962b.f3021e = z7;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i8) {
        super.setChangingConfigurations(i8);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i8, PorterDuff.Mode mode) {
        super.setColorFilter(i8, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2964d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f8, float f9) {
        super.setHotspot(f8, f9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i8, int i9, int i10, int i11) {
        super.setHotspotBounds(i8, i9, i10, i11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i8) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i8);
        } else {
            setTintList(ColorStateList.valueOf(i8));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        h hVar = this.f2962b;
        if (hVar.f3019c != colorStateList) {
            hVar.f3019c = colorStateList;
            this.f2963c = j(this.f2963c, colorStateList, hVar.f3020d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        h hVar = this.f2962b;
        if (hVar.f3020d != mode) {
            hVar.f3020d = mode;
            this.f2963c = j(this.f2963c, hVar.f3019c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f2960a;
        return drawable != null ? drawable.setVisible(z7, z8) : super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2960a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
