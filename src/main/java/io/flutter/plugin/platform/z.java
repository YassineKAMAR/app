package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(20)
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SingleViewPresentation f23018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.flutter.plugin.platform.a f23020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f23023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final View.OnFocusChangeListener f23024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private VirtualDisplay f23025h;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f23026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f23027b;

        /* JADX INFO: renamed from: io.flutter.plugin.platform.z$a$a, reason: collision with other inner class name */
        class RunnableC0125a implements Runnable {
            RunnableC0125a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f23026a.postDelayed(aVar.f23027b, 128L);
            }
        }

        a(View view, Runnable runnable) {
            this.f23026a = view;
            this.f23027b = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f23026a, new RunnableC0125a());
            this.f23026a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static class b implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f23030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Runnable f23031b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f23030a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f23030a = view;
            this.f23031b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f23031b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f23031b = null;
            this.f23030a.post(new a());
        }
    }

    private z(Context context, io.flutter.plugin.platform.a aVar, VirtualDisplay virtualDisplay, k kVar, o oVar, View.OnFocusChangeListener onFocusChangeListener, int i8, Object obj) {
        this.f23019b = context;
        this.f23020c = aVar;
        this.f23023f = oVar;
        this.f23024g = onFocusChangeListener;
        this.f23022e = i8;
        this.f23025h = virtualDisplay;
        this.f23021d = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f23025h.getDisplay(), kVar, aVar, i8, onFocusChangeListener);
        this.f23018a = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static z a(Context context, io.flutter.plugin.platform.a aVar, k kVar, o oVar, int i8, int i9, int i10, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        if (i8 == 0 || i9 == 0) {
            return null;
        }
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        oVar.a(i8, i9);
        VirtualDisplay virtualDisplayCreateVirtualDisplay = displayManager.createVirtualDisplay("flutter-vd#" + i10, i8, i9, displayMetrics.densityDpi, oVar.getSurface(), 0);
        if (virtualDisplayCreateVirtualDisplay == null) {
            return null;
        }
        return new z(context, aVar, virtualDisplayCreateVirtualDisplay, kVar, oVar, onFocusChangeListener, i10, obj);
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.f23018a;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void c() {
        this.f23018a.cancel();
        this.f23018a.detachState();
        this.f23025h.release();
        this.f23023f.release();
    }

    public int d() {
        o oVar = this.f23023f;
        if (oVar != null) {
            return oVar.getHeight();
        }
        return 0;
    }

    public int e() {
        o oVar = this.f23023f;
        if (oVar != null) {
            return oVar.getWidth();
        }
        return 0;
    }

    public View f() {
        SingleViewPresentation singleViewPresentation = this.f23018a;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    void g() {
        SingleViewPresentation singleViewPresentation = this.f23018a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f23018a.getView().c();
    }

    void h() {
        SingleViewPresentation singleViewPresentation = this.f23018a;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.f23018a.getView().d();
    }

    public void i(int i8, int i9, Runnable runnable) {
        boolean zIsFocused = f().isFocused();
        SingleViewPresentation.e eVarDetachState = this.f23018a.detachState();
        this.f23025h.setSurface(null);
        this.f23025h.release();
        DisplayManager displayManager = (DisplayManager) this.f23019b.getSystemService("display");
        this.f23023f.a(i8, i9);
        this.f23025h = displayManager.createVirtualDisplay("flutter-vd#" + this.f23022e, i8, i9, this.f23021d, this.f23023f.getSurface(), 0);
        View viewF = f();
        viewF.addOnAttachStateChangeListener(new a(viewF, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f23019b, this.f23025h.getDisplay(), this.f23020c, eVarDetachState, this.f23024g, zIsFocused);
        singleViewPresentation.show();
        this.f23018a.cancel();
        this.f23018a = singleViewPresentation;
    }
}
