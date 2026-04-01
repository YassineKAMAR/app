package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f1465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f1466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f1467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected t.h f1468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f1469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f1470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f1471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View[] f1472h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected HashMap<Integer, String> f1473i;

    public c(Context context) {
        super(context);
        this.f1465a = new int[32];
        this.f1469e = false;
        this.f1472h = null;
        this.f1473i = new HashMap<>();
        this.f1467c = context;
        m(null);
    }

    private void d(String str) {
        if (str == null || str.length() == 0 || this.f1467c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iK = k(strTrim);
        if (iK != 0) {
            this.f1473i.put(Integer.valueOf(iK), strTrim);
            e(iK);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void e(int i8) {
        if (i8 == getId()) {
            return;
        }
        int i9 = this.f1466b + 1;
        int[] iArr = this.f1465a;
        if (i9 > iArr.length) {
            this.f1465a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1465a;
        int i10 = this.f1466b;
        iArr2[i10] = i8;
        this.f1466b = i10 + 1;
    }

    private void f(String str) {
        if (str == null || str.length() == 0 || this.f1467c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f1391c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1467c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = constraintLayout.getChildAt(i8);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iJ = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iJ = ((Integer) objF).intValue();
            }
        }
        if (iJ == 0 && constraintLayout != null) {
            iJ = j(constraintLayout, str);
        }
        if (iJ == 0) {
            try {
                iJ = j.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iJ == 0 ? this.f1467c.getResources().getIdentifier(str, "id", this.f1467c.getPackageName()) : iJ;
    }

    protected void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1465a, this.f1466b);
    }

    protected void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i8 = 0; i8 < this.f1466b; i8++) {
            View viewH = constraintLayout.h(this.f1465a[i8]);
            if (viewH != null) {
                viewH.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void i(ConstraintLayout constraintLayout) {
    }

    protected View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1472h;
        if (viewArr == null || viewArr.length != this.f1466b) {
            this.f1472h = new View[this.f1466b];
        }
        for (int i8 = 0; i8 < this.f1466b; i8++) {
            this.f1472h[i8] = constraintLayout.h(this.f1465a[i8]);
        }
        return this.f1472h;
    }

    protected void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1724n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == k.f1826z1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f1470f = string;
                    setIds(string);
                } else if (index == k.A1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f1471g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void n(t.e eVar, boolean z7) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1470f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1471g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f1469e) {
            super.onMeasure(i8, i9);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int iJ;
        if (isInEditMode()) {
            setIds(this.f1470f);
        }
        t.h hVar = this.f1468d;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i8 = 0; i8 < this.f1466b; i8++) {
            int i9 = this.f1465a[i8];
            View viewH = constraintLayout.h(i9);
            if (viewH == null && (iJ = j(constraintLayout, (str = this.f1473i.get(Integer.valueOf(i9))))) != 0) {
                this.f1465a[i8] = iJ;
                this.f1473i.put(Integer.valueOf(iJ), str);
                viewH = constraintLayout.h(iJ);
            }
            if (viewH != null) {
                this.f1468d.c(constraintLayout.i(viewH));
            }
        }
        this.f1468d.a(constraintLayout.f1364c);
    }

    public void s() {
        if (this.f1468d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f1429v0 = (t.e) this.f1468d;
        }
    }

    protected void setIds(String str) {
        this.f1470f = str;
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.f1466b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i8);
            if (iIndexOf == -1) {
                d(str.substring(i8));
                return;
            } else {
                d(str.substring(i8, iIndexOf));
                i8 = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f1471g = str;
        if (str == null) {
            return;
        }
        int i8 = 0;
        this.f1466b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i8);
            if (iIndexOf == -1) {
                f(str.substring(i8));
                return;
            } else {
                f(str.substring(i8, iIndexOf));
                i8 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1470f = null;
        this.f1466b = 0;
        for (int i8 : iArr) {
            e(i8);
        }
    }

    @Override // android.view.View
    public void setTag(int i8, Object obj) {
        super.setTag(i8, obj);
        if (obj == null && this.f1470f == null) {
            e(i8);
        }
    }
}
