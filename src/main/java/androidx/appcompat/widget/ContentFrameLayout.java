package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TypedValue f706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TypedValue f707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TypedValue f709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TypedValue f710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TypedValue f711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Rect f712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f713h;

    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f712g = new Rect();
    }

    public void a(int i8, int i9, int i10, int i11) {
        this.f712g.set(i8, i9, i10, i11);
        if (androidx.core.view.e0.w(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f710e == null) {
            this.f710e = new TypedValue();
        }
        return this.f710e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f711f == null) {
            this.f711f = new TypedValue();
        }
        return this.f711f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f708c == null) {
            this.f708c = new TypedValue();
        }
        return this.f708c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f709d == null) {
            this.f709d = new TypedValue();
        }
        return this.f709d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f706a == null) {
            this.f706a = new TypedValue();
        }
        return this.f706a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f707b == null) {
            this.f707b = new TypedValue();
        }
        return this.f707b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f713h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f713h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.f713h = aVar;
    }
}
