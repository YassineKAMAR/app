package h;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import h.c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedAPI"})
class e extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f22132m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f22133n;

    static class a extends c.AbstractC0115c {
        int[][] J;

        a(a aVar, e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[f()][];
            }
        }

        int A(int[] iArr) {
            int[][] iArr2 = this.J;
            int iH = h();
            for (int i8 = 0; i8 < iH; i8++) {
                if (StateSet.stateSetMatches(iArr2[i8], iArr)) {
                    return i8;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new e(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }

        @Override // h.c.AbstractC0115c
        public void o(int i8, int i9) {
            super.o(i8, i9);
            int[][] iArr = new int[i9][];
            System.arraycopy(this.J, 0, iArr, 0, i8);
            this.J = iArr;
        }

        @Override // h.c.AbstractC0115c
        void r() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.J[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.J = iArr2;
        }

        int z(int[] iArr, Drawable drawable) {
            int iA = a(drawable);
            this.J[iA] = iArr;
            return iA;
        }
    }

    e(a aVar) {
        if (aVar != null) {
            h(aVar);
        }
    }

    e(a aVar, Resources resources) {
        h(new a(aVar, this, resources));
        onStateChange(getState());
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // h.c
    void h(c.AbstractC0115c abstractC0115c) {
        super.h(abstractC0115c);
        if (abstractC0115c instanceof a) {
            this.f22132m = (a) abstractC0115c;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // h.c
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a b() {
        return new a(this.f22132m, this, null);
    }

    int[] k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i8 = 0;
        for (int i9 = 0; i9 < attributeCount; i9++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i9);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i10 = i8 + 1;
                if (!attributeSet.getAttributeBooleanValue(i9, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i8] = attributeNameResource;
                i8 = i10;
            }
        }
        return StateSet.trimStateSet(iArr, i8);
    }

    @Override // h.c, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f22133n && super.mutate() == this) {
            this.f22132m.r();
            this.f22133n = true;
        }
        return this;
    }

    @Override // h.c, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iA = this.f22132m.A(iArr);
        if (iA < 0) {
            iA = this.f22132m.A(StateSet.WILD_CARD);
        }
        return g(iA) || zOnStateChange;
    }
}
