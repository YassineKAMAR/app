package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.o1;
import androidx.appcompat.widget.q0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends e0 implements k.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    e.b f445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q0 f446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b f447j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f448k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f449l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f452o;

    private class a extends q0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.q0
        public k.e b() {
            b bVar = ActionMenuItemView.this.f447j;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.q0
        protected boolean c() {
            k.e eVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f445h;
            return bVar != null && bVar.a(actionMenuItemView.f442e) && (eVarB = b()) != null && eVarB.a();
        }
    }

    public static abstract class b {
        public abstract k.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Resources resources = context.getResources();
        this.f448k = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f21327v, i8, 0);
        this.f450m = typedArrayObtainStyledAttributes.getDimensionPixelSize(e.j.f21332w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f452o = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f451n = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        return i8 >= 480 || (i8 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z7 = true;
        boolean z8 = !TextUtils.isEmpty(this.f443f);
        if (this.f444g != null && (!this.f442e.B() || (!this.f448k && !this.f449l))) {
            z7 = false;
        }
        boolean z9 = z8 & z7;
        setText(z9 ? this.f443f : null);
        CharSequence contentDescription = this.f442e.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z9 ? null : this.f442e.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.f442e.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            o1.a(this, z9 ? null : this.f442e.getTitle());
        } else {
            o1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.f442e.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i8) {
        this.f442e = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f446i == null) {
            this.f446i = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f442e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f445h;
        if (bVar != null) {
            bVar.a(this.f442e);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f448k = g();
        h();
    }

    @Override // androidx.appcompat.widget.e0, android.widget.TextView, android.view.View
    protected void onMeasure(int i8, int i9) {
        int i10;
        boolean zF = f();
        if (zF && (i10 = this.f451n) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f450m) : this.f450m;
        if (mode != 1073741824 && this.f450m > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i9);
        }
        if (zF || this.f444g == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f444g.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        q0 q0Var;
        if (this.f442e.hasSubMenu() && (q0Var = this.f446i) != null && q0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z7) {
    }

    public void setChecked(boolean z7) {
    }

    public void setExpandedFormat(boolean z7) {
        if (this.f449l != z7) {
            this.f449l = z7;
            g gVar = this.f442e;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f444g = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i8 = this.f452o;
            if (intrinsicWidth > i8) {
                intrinsicHeight = (int) (intrinsicHeight * (i8 / intrinsicWidth));
                intrinsicWidth = i8;
            }
            if (intrinsicHeight > i8) {
                intrinsicWidth = (int) (intrinsicWidth * (i8 / intrinsicHeight));
            } else {
                i8 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i8);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.f445h = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f451n = i8;
        super.setPadding(i8, i9, i10, i11);
    }

    public void setPopupCallback(b bVar) {
        this.f447j = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f443f = charSequence;
        h();
    }
}
