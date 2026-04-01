package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<View> f820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LayoutInflater f821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f822e;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f818a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.H3, i8, 0);
        this.f819b = typedArrayObtainStyledAttributes.getResourceId(e.j.K3, -1);
        this.f818a = typedArrayObtainStyledAttributes.getResourceId(e.j.J3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(e.j.I3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f818a == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f821d;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f818a, viewGroup, false);
        int i8 = this.f819b;
        if (i8 != -1) {
            viewInflate.setId(i8);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f820c = new WeakReference<>(viewInflate);
        a aVar = this.f822e;
        if (aVar != null) {
            aVar.a(this, viewInflate);
        }
        return viewInflate;
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f819b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f821d;
    }

    public int getLayoutResource() {
        return this.f818a;
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i8) {
        this.f819b = i8;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f821d = layoutInflater;
    }

    public void setLayoutResource(int i8) {
        this.f818a = i8;
    }

    public void setOnInflateListener(a aVar) {
        this.f822e = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        WeakReference<View> weakReference = this.f820c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i8);
            return;
        }
        super.setVisibility(i8);
        if (i8 == 0 || i8 == 4) {
            a();
        }
    }
}
