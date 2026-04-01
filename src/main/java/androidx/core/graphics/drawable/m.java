package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
final class m extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f2042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Drawable.ConstantState f2043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ColorStateList f2044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    PorterDuff.Mode f2045d;

    m(m mVar) {
        this.f2044c = null;
        this.f2045d = k.f2034g;
        if (mVar != null) {
            this.f2042a = mVar.f2042a;
            this.f2043b = mVar.f2043b;
            this.f2044c = mVar.f2044c;
            this.f2045d = mVar.f2045d;
        }
    }

    boolean a() {
        return this.f2043b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i8 = this.f2042a;
        Drawable.ConstantState constantState = this.f2043b;
        return i8 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new l(this, resources);
    }
}
