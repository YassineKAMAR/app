package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.StaticLayout$Builder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class h0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final RectF f973l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static ConcurrentHashMap<String, Method> f974m = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static ConcurrentHashMap<String, Field> f975n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f976a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f977b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f978c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f979d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f980e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f981f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f982g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextPaint f983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Context f985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c f986k;

    private static class a extends c {
        a() {
        }

        @Override // androidx.appcompat.widget.h0.c
        void a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
            staticLayout$Builder.setTextDirection((TextDirectionHeuristic) h0.o(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class b extends a {
        b() {
        }

        @Override // androidx.appcompat.widget.h0.a, androidx.appcompat.widget.h0.c
        void a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
            staticLayout$Builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.h0.c
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private static class c {
        c() {
        }

        void a(StaticLayout$Builder staticLayout$Builder, TextView textView) {
        }

        boolean b(TextView textView) {
            return ((Boolean) h0.o(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    h0(TextView textView) {
        this.f984i = textView;
        this.f985j = textView.getContext();
        int i8 = Build.VERSION.SDK_INT;
        this.f986k = i8 >= 29 ? new b() : i8 >= 23 ? new a() : new c();
    }

    private boolean A() {
        return !(this.f984i instanceof j);
    }

    private void B(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
        }
        if (f9 <= f8) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f976a = 1;
        this.f979d = f8;
        this.f980e = f9;
        this.f978c = f10;
        this.f982g = false;
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i8 : iArr) {
            if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                arrayList.add(Integer.valueOf(i8));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i9 = 0; i9 < size; i9++) {
            iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        return iArr2;
    }

    private void c() {
        this.f976a = 0;
        this.f979d = -1.0f;
        this.f980e = -1.0f;
        this.f978c = -1.0f;
        this.f981f = new int[0];
        this.f977b = false;
    }

    private StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9) {
        StaticLayout$Builder staticLayout$BuilderObtain = StaticLayout$Builder.obtain(charSequence, 0, charSequence.length(), this.f983h, i8);
        StaticLayout$Builder hyphenationFrequency = staticLayout$BuilderObtain.setAlignment(alignment).setLineSpacing(this.f984i.getLineSpacingExtra(), this.f984i.getLineSpacingMultiplier()).setIncludePad(this.f984i.getIncludeFontPadding()).setBreakStrategy(this.f984i.getBreakStrategy()).setHyphenationFrequency(this.f984i.getHyphenationFrequency());
        if (i9 == -1) {
            i9 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i9);
        try {
            this.f986k.a(staticLayout$BuilderObtain, this.f984i);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return staticLayout$BuilderObtain.build();
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i8) {
        return new StaticLayout(charSequence, this.f983h, i8, alignment, this.f984i.getLineSpacingMultiplier(), this.f984i.getLineSpacingExtra(), this.f984i.getIncludeFontPadding());
    }

    private int g(RectF rectF) {
        int length = this.f981f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i8 = length - 1;
        int i9 = 1;
        int i10 = 0;
        while (i9 <= i8) {
            int i11 = (i9 + i8) / 2;
            if (z(this.f981f[i11], rectF)) {
                int i12 = i11 + 1;
                i10 = i9;
                i9 = i12;
            } else {
                i10 = i11 - 1;
                i8 = i10;
            }
        }
        return this.f981f[i10];
    }

    private static Method m(String str) {
        try {
            Method declaredMethod = f974m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                declaredMethod.setAccessible(true);
                f974m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    static <T> T o(Object obj, String str, T t7) {
        try {
            return (T) m(str).invoke(obj, new Object[0]);
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e8);
            return t7;
        }
    }

    private void u(float f8) {
        if (f8 != this.f984i.getPaint().getTextSize()) {
            this.f984i.getPaint().setTextSize(f8);
            boolean zIsInLayout = this.f984i.isInLayout();
            if (this.f984i.getLayout() != null) {
                this.f977b = false;
                try {
                    Method methodM = m("nullLayouts");
                    if (methodM != null) {
                        methodM.invoke(this.f984i, new Object[0]);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (zIsInLayout) {
                    this.f984i.forceLayout();
                } else {
                    this.f984i.requestLayout();
                }
                this.f984i.invalidate();
            }
        }
    }

    private boolean w() {
        if (A() && this.f976a == 1) {
            if (!this.f982g || this.f981f.length == 0) {
                int iFloor = ((int) Math.floor((this.f980e - this.f979d) / this.f978c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i8 = 0; i8 < iFloor; i8++) {
                    iArr[i8] = Math.round(this.f979d + (i8 * this.f978c));
                }
                this.f981f = b(iArr);
            }
            this.f977b = true;
        } else {
            this.f977b = false;
        }
        return this.f977b;
    }

    private void x(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                iArr[i8] = typedArray.getDimensionPixelSize(i8, -1);
            }
            this.f981f = b(iArr);
            y();
        }
    }

    private boolean y() {
        boolean z7 = this.f981f.length > 0;
        this.f982g = z7;
        if (z7) {
            this.f976a = 1;
            this.f979d = r0[0];
            this.f980e = r0[r1 - 1];
            this.f978c = -1.0f;
        }
        return z7;
    }

    private boolean z(int i8, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f984i.getText();
        TransformationMethod transformationMethod = this.f984i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f984i)) != null) {
            text = transformation;
        }
        int maxLines = this.f984i.getMaxLines();
        n(i8);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) o(this.f984i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    void a() {
        if (p()) {
            if (this.f977b) {
                if (this.f984i.getMeasuredHeight() <= 0 || this.f984i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f986k.b(this.f984i) ? 1048576 : (this.f984i.getMeasuredWidth() - this.f984i.getTotalPaddingLeft()) - this.f984i.getTotalPaddingRight();
                int height = (this.f984i.getHeight() - this.f984i.getCompoundPaddingBottom()) - this.f984i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f973l;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fG = g(rectF);
                    if (fG != this.f984i.getTextSize()) {
                        v(0, fG);
                    }
                }
            }
            this.f977b = true;
        }
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9) {
        return Build.VERSION.SDK_INT >= 23 ? e(charSequence, alignment, i8, i9) : f(charSequence, alignment, i8);
    }

    int h() {
        return Math.round(this.f980e);
    }

    int i() {
        return Math.round(this.f979d);
    }

    int j() {
        return Math.round(this.f978c);
    }

    int[] k() {
        return this.f981f;
    }

    int l() {
        return this.f976a;
    }

    void n(int i8) {
        TextPaint textPaint = this.f983h;
        if (textPaint == null) {
            this.f983h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f983h.set(this.f984i.getPaint());
        this.f983h.setTextSize(i8);
    }

    boolean p() {
        return A() && this.f976a != 0;
    }

    void q(AttributeSet attributeSet, int i8) {
        int resourceId;
        Context context = this.f985j;
        int[] iArr = e.j.f21263i0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i8, 0);
        TextView textView = this.f984i;
        androidx.core.view.e0.F(textView, textView.getContext(), iArr, attributeSet, typedArrayObtainStyledAttributes, i8, 0);
        int i9 = e.j.f21288n0;
        if (typedArrayObtainStyledAttributes.hasValue(i9)) {
            this.f976a = typedArrayObtainStyledAttributes.getInt(i9, 0);
        }
        int i10 = e.j.f21283m0;
        float dimension = typedArrayObtainStyledAttributes.hasValue(i10) ? typedArrayObtainStyledAttributes.getDimension(i10, -1.0f) : -1.0f;
        int i11 = e.j.f21273k0;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(i11) ? typedArrayObtainStyledAttributes.getDimension(i11, -1.0f) : -1.0f;
        int i12 = e.j.f21268j0;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(i12) ? typedArrayObtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = e.j.f21278l0;
        if (typedArrayObtainStyledAttributes.hasValue(i13) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(i13, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            x(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!A()) {
            this.f976a = 0;
            return;
        }
        if (this.f976a == 1) {
            if (!this.f982g) {
                DisplayMetrics displayMetrics = this.f985j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                B(dimension2, dimension3, dimension);
            }
            w();
        }
    }

    void r(int i8, int i9, int i10, int i11) {
        if (A()) {
            DisplayMetrics displayMetrics = this.f985j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(i11, i8, displayMetrics), TypedValue.applyDimension(i11, i9, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (w()) {
                a();
            }
        }
    }

    void s(int[] iArr, int i8) {
        if (A()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i8 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f985j.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArrCopyOf[i9] = Math.round(TypedValue.applyDimension(i8, iArr[i9], displayMetrics));
                    }
                }
                this.f981f = b(iArrCopyOf);
                if (!y()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f982g = false;
            }
            if (w()) {
                a();
            }
        }
    }

    void t(int i8) {
        if (A()) {
            if (i8 == 0) {
                c();
                return;
            }
            if (i8 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i8);
            }
            DisplayMetrics displayMetrics = this.f985j.getResources().getDisplayMetrics();
            B(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (w()) {
                a();
            }
        }
    }

    void v(int i8, float f8) {
        Context context = this.f985j;
        u(TypedValue.applyDimension(i8, f8, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }
}
