package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.l1;
import androidx.core.view.e0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g f457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RadioButton f459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CheckBox f461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView f464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f470n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f471o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private LayoutInflater f472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f473q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.C);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet);
        l1 l1VarU = l1.u(getContext(), attributeSet, e.j.W1, i8, 0);
        this.f466j = l1VarU.f(e.j.Y1);
        this.f467k = l1VarU.m(e.j.X1, -1);
        this.f469m = l1VarU.a(e.j.Z1, false);
        this.f468l = context;
        this.f470n = l1VarU.f(e.j.f21225a2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, e.a.f21112z, 0);
        this.f471o = typedArrayObtainStyledAttributes.hasValue(0);
        l1VarU.v();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i8) {
        LinearLayout linearLayout = this.f465i;
        if (linearLayout != null) {
            linearLayout.addView(view, i8);
        } else {
            addView(view, i8);
        }
    }

    private void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(e.g.f21193h, (ViewGroup) this, false);
        this.f461e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(e.g.f21194i, (ViewGroup) this, false);
        this.f458b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(e.g.f21196k, (ViewGroup) this, false);
        this.f459c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f472p == null) {
            this.f472p = LayoutInflater.from(getContext());
        }
        return this.f472p;
    }

    private void setSubMenuArrowVisible(boolean z7) {
        ImageView imageView = this.f463g;
        if (imageView != null) {
            imageView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f464h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f464h.getLayoutParams();
        rect.top += this.f464h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void d(g gVar, int i8) {
        this.f457a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f457a;
    }

    public void h(boolean z7, char c8) {
        int i8 = (z7 && this.f457a.A()) ? 0 : 8;
        if (i8 == 0) {
            this.f462f.setText(this.f457a.h());
        }
        if (this.f462f.getVisibility() != i8) {
            this.f462f.setVisibility(i8);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        e0.I(this, this.f466j);
        TextView textView = (TextView) findViewById(e.f.M);
        this.f460d = textView;
        int i8 = this.f467k;
        if (i8 != -1) {
            textView.setTextAppearance(this.f468l, i8);
        }
        this.f462f = (TextView) findViewById(e.f.F);
        ImageView imageView = (ImageView) findViewById(e.f.I);
        this.f463g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f470n);
        }
        this.f464h = (ImageView) findViewById(e.f.f21177r);
        this.f465i = (LinearLayout) findViewById(e.f.f21171l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.f458b != null && this.f469m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f458b.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i8, i9);
    }

    public void setCheckable(boolean z7) {
        CompoundButton compoundButton;
        View view;
        if (!z7 && this.f459c == null && this.f461e == null) {
            return;
        }
        if (this.f457a.m()) {
            if (this.f459c == null) {
                g();
            }
            compoundButton = this.f459c;
            view = this.f461e;
        } else {
            if (this.f461e == null) {
                e();
            }
            compoundButton = this.f461e;
            view = this.f459c;
        }
        if (z7) {
            compoundButton.setChecked(this.f457a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f461e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f459c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z7) {
        CompoundButton compoundButton;
        if (this.f457a.m()) {
            if (this.f459c == null) {
                g();
            }
            compoundButton = this.f459c;
        } else {
            if (this.f461e == null) {
                e();
            }
            compoundButton = this.f461e;
        }
        compoundButton.setChecked(z7);
    }

    public void setForceShowIcon(boolean z7) {
        this.f473q = z7;
        this.f469m = z7;
    }

    public void setGroupDividerEnabled(boolean z7) {
        ImageView imageView = this.f464h;
        if (imageView != null) {
            imageView.setVisibility((this.f471o || !z7) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z7 = this.f457a.z() || this.f473q;
        if (z7 || this.f469m) {
            ImageView imageView = this.f458b;
            if (imageView == null && drawable == null && !this.f469m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f469m) {
                this.f458b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f458b;
            if (!z7) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f458b.getVisibility() != 0) {
                this.f458b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i8;
        TextView textView;
        if (charSequence != null) {
            this.f460d.setText(charSequence);
            if (this.f460d.getVisibility() == 0) {
                return;
            }
            textView = this.f460d;
            i8 = 0;
        } else {
            i8 = 8;
            if (this.f460d.getVisibility() == 8) {
                return;
            } else {
                textView = this.f460d;
            }
        }
        textView.setVisibility(i8);
    }
}
