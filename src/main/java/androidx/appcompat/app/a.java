package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import f.i;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AlertController f439c;

    /* JADX INFO: renamed from: androidx.appcompat.app.a$a, reason: collision with other inner class name */
    public static class C0009a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.f f440a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f441b;

        public C0009a(Context context) {
            this(context, a.h(context, 0));
        }

        public C0009a(Context context, int i8) {
            this.f440a = new AlertController.f(new ContextThemeWrapper(context, a.h(context, i8)));
            this.f441b = i8;
        }

        public a a() {
            a aVar = new a(this.f440a.f400a, this.f441b);
            this.f440a.a(aVar.f439c);
            aVar.setCancelable(this.f440a.f417r);
            if (this.f440a.f417r) {
                aVar.setCanceledOnTouchOutside(true);
            }
            aVar.setOnCancelListener(this.f440a.f418s);
            aVar.setOnDismissListener(this.f440a.f419t);
            DialogInterface.OnKeyListener onKeyListener = this.f440a.f420u;
            if (onKeyListener != null) {
                aVar.setOnKeyListener(onKeyListener);
            }
            return aVar;
        }

        public Context b() {
            return this.f440a.f400a;
        }

        public C0009a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f440a;
            fVar.f422w = listAdapter;
            fVar.f423x = onClickListener;
            return this;
        }

        public C0009a d(View view) {
            this.f440a.f406g = view;
            return this;
        }

        public C0009a e(Drawable drawable) {
            this.f440a.f403d = drawable;
            return this;
        }

        public C0009a f(DialogInterface.OnKeyListener onKeyListener) {
            this.f440a.f420u = onKeyListener;
            return this;
        }

        public C0009a g(ListAdapter listAdapter, int i8, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f440a;
            fVar.f422w = listAdapter;
            fVar.f423x = onClickListener;
            fVar.I = i8;
            fVar.H = true;
            return this;
        }

        public C0009a h(CharSequence charSequence) {
            this.f440a.f405f = charSequence;
            return this;
        }
    }

    protected a(Context context, int i8) {
        super(context, h(context, i8));
        this.f439c = new AlertController(getContext(), this, getWindow());
    }

    static int h(Context context, int i8) {
        if (((i8 >>> 24) & 255) >= 1) {
            return i8;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(e.a.f21101o, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView f() {
        return this.f439c.d();
    }

    @Override // f.i, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f439c.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i8, KeyEvent keyEvent) {
        if (this.f439c.g(i8, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i8, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i8, KeyEvent keyEvent) {
        if (this.f439c.h(i8, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i8, keyEvent);
    }

    @Override // f.i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f439c.q(charSequence);
    }
}
