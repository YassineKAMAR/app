package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes.dex */
@Keep
@TargetApi(17)
class SingleViewPresentation extends Presentation {
    private static final String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.a accessibilityEventsDelegate;
    private FrameLayout container;
    private final View.OnFocusChangeListener focusChangeListener;
    private final Context outerContext;
    private a rootView;
    private boolean startFocused;
    private final e state;
    private int viewId;

    private static class a extends FrameLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.flutter.plugin.platform.a f22924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f22925b;

        public a(Context context, io.flutter.plugin.platform.a aVar, View view) {
            super(context);
            this.f22924a = aVar;
            this.f22925b = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f22924a.b(this.f22925b, view, accessibilityEvent);
        }
    }

    static class b extends ViewGroup {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f22926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f22927b;

        public b(Context context) {
            super(context);
            this.f22926a = new Rect();
            this.f22927b = new Rect();
        }

        private static int a(int i8) {
            return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i8), Integer.MIN_VALUE);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
                this.f22926a.set(i8, i9, i10, i11);
                Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f22926a, layoutParams.x, layoutParams.y, this.f22927b);
                Rect rect = this.f22927b;
                childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        @Override // android.view.View
        protected void onMeasure(int i8, int i9) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                getChildAt(i10).measure(a(i8), a(i9));
            }
            super.onMeasure(i8, i9);
        }
    }

    private static class c extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputMethodManager f22928a;

        c(Context context) {
            this(context, null);
        }

        private c(Context context, InputMethodManager inputMethodManager) {
            super(context);
            this.f22928a = inputMethodManager == null ? (InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Context createDisplayContext(Display display) {
            return new c(super.createDisplayContext(display), this.f22928a);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "input_method".equals(str) ? this.f22928a : super.getSystemService(str);
        }
    }

    private static class d extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f22929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WindowManager f22930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f22931c;

        d(Context context, f fVar, Context context2) {
            super(context);
            this.f22929a = fVar;
            this.f22931c = context2;
        }

        private WindowManager a() {
            if (this.f22930b == null) {
                this.f22930b = this.f22929a.b();
            }
            return this.f22930b;
        }

        private boolean b() {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i8 = 0; i8 < stackTrace.length && i8 < 11; i8++) {
                if (stackTrace[i8].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i8].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            return "window".equals(str) ? b() ? this.f22931c.getSystemService(str) : a() : super.getSystemService(str);
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private k f22932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f22933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f22934c;

        e() {
        }
    }

    static class f implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowManager f22935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        b f22936b;

        f(WindowManager windowManager, b bVar) {
            this.f22935a = windowManager;
            this.f22936b = bVar;
        }

        private void a(Object[] objArr) {
            b bVar = this.f22936b;
            if (bVar == null) {
                g5.b.g(SingleViewPresentation.TAG, "Embedded view called addView while detached from presentation");
            } else {
                bVar.addView((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        private void c(Object[] objArr) {
            b bVar = this.f22936b;
            if (bVar == null) {
                g5.b.g(SingleViewPresentation.TAG, "Embedded view called removeView while detached from presentation");
            } else {
                bVar.removeView((View) objArr[0]);
            }
        }

        private void d(Object[] objArr) {
            if (this.f22936b == null) {
                g5.b.g(SingleViewPresentation.TAG, "Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = (View) objArr[0];
            view.clearAnimation();
            this.f22936b.removeView(view);
        }

        private void e(Object[] objArr) {
            b bVar = this.f22936b;
            if (bVar == null) {
                g5.b.g(SingleViewPresentation.TAG, "Embedded view called updateViewLayout while detached from presentation");
            } else {
                bVar.updateViewLayout((View) objArr[0], (WindowManager.LayoutParams) objArr[1]);
            }
        }

        public WindowManager b() {
            return (WindowManager) Proxy.newProxyInstance(WindowManager.class.getClassLoader(), new Class[]{WindowManager.class}, this);
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            name.hashCode();
            switch (name) {
                case "addView":
                    a(objArr);
                    return null;
                case "removeViewImmediate":
                    d(objArr);
                    return null;
                case "updateViewLayout":
                    e(objArr);
                    return null;
                case "removeView":
                    c(objArr);
                    return null;
                default:
                    try {
                        return method.invoke(this.f22935a, objArr);
                    } catch (InvocationTargetException e8) {
                        throw e8.getCause();
                    }
            }
        }
    }

    public SingleViewPresentation(Context context, Display display, io.flutter.plugin.platform.a aVar, e eVar, View.OnFocusChangeListener onFocusChangeListener, boolean z7) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.state = eVar;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z7;
    }

    public SingleViewPresentation(Context context, Display display, k kVar, io.flutter.plugin.platform.a aVar, int i8, View.OnFocusChangeListener onFocusChangeListener) {
        super(new c(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = aVar;
        this.viewId = i8;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        e eVar = new e();
        this.state = eVar;
        eVar.f22932a = kVar;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public e detachState() {
        FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        a aVar = this.rootView;
        if (aVar != null) {
            aVar.removeAllViews();
        }
        return this.state;
    }

    public k getView() {
        return this.state.f22932a;
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        if (this.state.f22934c == null) {
            this.state.f22934c = new b(getContext());
        }
        if (this.state.f22933b == null) {
            WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
            e eVar = this.state;
            eVar.f22933b = new f(windowManager, eVar.f22934c);
        }
        this.container = new FrameLayout(getContext());
        d dVar = new d(getContext(), this.state.f22933b, this.outerContext);
        View view = this.state.f22932a.getView();
        if (view.getContext() instanceof MutableContextWrapper) {
            ((MutableContextWrapper) view.getContext()).setBaseContext(dVar);
        } else {
            g5.b.g(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        a aVar = new a(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = aVar;
        aVar.addView(this.container);
        this.rootView.addView(this.state.f22934c);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }
}
