package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.j;

/* JADX INFO: loaded from: classes.dex */
class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.appcompat.app.a f563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c f564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j.a f565d;

    public f(e eVar) {
        this.f562a = eVar;
    }

    public void a() {
        androidx.appcompat.app.a aVar = this.f563b;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        e eVar = this.f562a;
        a.C0009a c0009a = new a.C0009a(eVar.u());
        c cVar = new c(c0009a.b(), e.g.f21195j);
        this.f564c = cVar;
        cVar.h(this);
        this.f562a.b(this.f564c);
        c0009a.c(this.f564c.a(), this);
        View viewY = eVar.y();
        if (viewY != null) {
            c0009a.d(viewY);
        } else {
            c0009a.e(eVar.w()).h(eVar.x());
        }
        c0009a.f(this);
        androidx.appcompat.app.a aVarA = c0009a.a();
        this.f563b = aVarA;
        aVarA.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f563b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f563b.show();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void c(e eVar, boolean z7) {
        if (z7 || eVar == this.f562a) {
            a();
        }
        j.a aVar = this.f565d;
        if (aVar != null) {
            aVar.c(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean d(e eVar) {
        j.a aVar = this.f565d;
        if (aVar != null) {
            return aVar.d(eVar);
        }
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i8) {
        this.f562a.L((g) this.f564c.a().getItem(i8), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f564c.c(this.f562a, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i8, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i8 == 82 || i8 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f563b.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f563b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f562a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f562a.performShortcut(i8, keyEvent, 0);
    }
}
