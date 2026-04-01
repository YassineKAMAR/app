package f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import j.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    public static class C0102a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21461a;

        public C0102a(int i8, int i9) {
            super(i8, i9);
            this.f21461a = 8388627;
        }

        public C0102a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f21461a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f21317t);
            this.f21461a = typedArrayObtainStyledAttributes.getInt(e.j.f21322u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0102a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f21461a = 0;
        }

        public C0102a(C0102a c0102a) {
            super((ViewGroup.MarginLayoutParams) c0102a);
            this.f21461a = 0;
            this.f21461a = c0102a.f21461a;
        }
    }

    public interface b {
        void onMenuVisibilityChanged(boolean z7);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public boolean f() {
        return false;
    }

    public abstract boolean g();

    public abstract void h(boolean z7);

    public abstract int i();

    public abstract Context j();

    public boolean k() {
        return false;
    }

    public abstract void l(Configuration configuration);

    void m() {
    }

    public abstract boolean n(int i8, KeyEvent keyEvent);

    public boolean o(KeyEvent keyEvent) {
        return false;
    }

    public boolean p() {
        return false;
    }

    public abstract void q(boolean z7);

    public abstract void r(boolean z7);

    public abstract void s(CharSequence charSequence);

    public abstract j.b t(b.a aVar);
}
