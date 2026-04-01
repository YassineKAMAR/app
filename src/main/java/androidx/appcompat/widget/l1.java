package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* JADX INFO: loaded from: classes.dex */
public class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f1012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1013c;

    private l1(Context context, TypedArray typedArray) {
        this.f1011a = context;
        this.f1012b = typedArray;
    }

    public static l1 s(Context context, int i8, int[] iArr) {
        return new l1(context, context.obtainStyledAttributes(i8, iArr));
    }

    public static l1 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new l1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static l1 u(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9) {
        return new l1(context, context.obtainStyledAttributes(attributeSet, iArr, i8, i9));
    }

    public boolean a(int i8, boolean z7) {
        return this.f1012b.getBoolean(i8, z7);
    }

    public int b(int i8, int i9) {
        return this.f1012b.getColor(i8, i9);
    }

    public ColorStateList c(int i8) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!this.f1012b.hasValue(i8) || (resourceId = this.f1012b.getResourceId(i8, 0)) == 0 || (colorStateListC = g.b.c(this.f1011a, resourceId)) == null) ? this.f1012b.getColorStateList(i8) : colorStateListC;
    }

    public int d(int i8, int i9) {
        return this.f1012b.getDimensionPixelOffset(i8, i9);
    }

    public int e(int i8, int i9) {
        return this.f1012b.getDimensionPixelSize(i8, i9);
    }

    public Drawable f(int i8) {
        int resourceId;
        return (!this.f1012b.hasValue(i8) || (resourceId = this.f1012b.getResourceId(i8, 0)) == 0) ? this.f1012b.getDrawable(i8) : g.b.d(this.f1011a, resourceId);
    }

    public Drawable g(int i8) {
        int resourceId;
        if (!this.f1012b.hasValue(i8) || (resourceId = this.f1012b.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return i.b().d(this.f1011a, resourceId, true);
    }

    public float h(int i8, float f8) {
        return this.f1012b.getFloat(i8, f8);
    }

    public Typeface i(int i8, int i9, h.e eVar) {
        int resourceId = this.f1012b.getResourceId(i8, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1013c == null) {
            this.f1013c = new TypedValue();
        }
        return androidx.core.content.res.h.e(this.f1011a, resourceId, this.f1013c, i9, eVar);
    }

    public int j(int i8, int i9) {
        return this.f1012b.getInt(i8, i9);
    }

    public int k(int i8, int i9) {
        return this.f1012b.getInteger(i8, i9);
    }

    public int l(int i8, int i9) {
        return this.f1012b.getLayoutDimension(i8, i9);
    }

    public int m(int i8, int i9) {
        return this.f1012b.getResourceId(i8, i9);
    }

    public String n(int i8) {
        return this.f1012b.getString(i8);
    }

    public CharSequence o(int i8) {
        return this.f1012b.getText(i8);
    }

    public CharSequence[] p(int i8) {
        return this.f1012b.getTextArray(i8);
    }

    public TypedArray q() {
        return this.f1012b;
    }

    public boolean r(int i8) {
        return this.f1012b.hasValue(i8);
    }

    public void v() {
        this.f1012b.recycle();
    }
}
