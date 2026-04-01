package k5;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import b6.h;
import io.flutter.embedding.android.c;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(19)
public class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FlutterMutatorsStack f24223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f24224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f24227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c f24229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    ViewTreeObserver.OnGlobalFocusChangeListener f24230h;

    /* JADX INFO: renamed from: k5.a$a, reason: collision with other inner class name */
    class ViewTreeObserverOnGlobalFocusChangeListenerC0140a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f24231a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f24232b;

        ViewTreeObserverOnGlobalFocusChangeListenerC0140a(View.OnFocusChangeListener onFocusChangeListener, View view) {
            this.f24231a = onFocusChangeListener;
            this.f24232b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f24231a;
            View view3 = this.f24232b;
            onFocusChangeListener.onFocusChange(view3, h.d(view3));
        }
    }

    public a(Context context, float f8, c cVar) {
        super(context, null);
        this.f24224b = f8;
        this.f24229g = cVar;
    }

    private Matrix getPlatformViewMatrix() {
        Matrix matrix = new Matrix(this.f24223a.getFinalMatrix());
        float f8 = this.f24224b;
        matrix.preScale(1.0f / f8, 1.0f / f8);
        matrix.postTranslate(-this.f24225c, -this.f24226d);
        return matrix;
    }

    public void a(FlutterMutatorsStack flutterMutatorsStack, int i8, int i9, int i10, int i11) {
        this.f24223a = flutterMutatorsStack;
        this.f24225c = i8;
        this.f24226d = i9;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i10, i11);
        layoutParams.leftMargin = i8;
        layoutParams.topMargin = i9;
        setLayoutParams(layoutParams);
        setWillNotDraw(false);
    }

    public void b() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f24230h) == null) {
            return;
        }
        this.f24230h = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.concat(getPlatformViewMatrix());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        Iterator<Path> it = this.f24223a.getFinalClippingPaths().iterator();
        while (it.hasNext()) {
            Path path = new Path(it.next());
            path.offset(-this.f24225c, -this.f24226d);
            canvas.clipPath(path);
        }
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i8;
        float f8;
        if (this.f24229g == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i9 = this.f24225c;
            this.f24227e = i9;
            i8 = this.f24226d;
            this.f24228f = i8;
            f8 = i9;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f24227e, this.f24228f);
                this.f24227e = this.f24225c;
                this.f24228f = this.f24226d;
                return this.f24229g.l(motionEvent, matrix);
            }
            f8 = this.f24225c;
            i8 = this.f24226d;
        }
        matrix.postTranslate(f8, i8);
        return this.f24229g.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        b();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f24230h == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC0140a viewTreeObserverOnGlobalFocusChangeListenerC0140a = new ViewTreeObserverOnGlobalFocusChangeListenerC0140a(onFocusChangeListener, this);
            this.f24230h = viewTreeObserverOnGlobalFocusChangeListenerC0140a;
            viewTreeObserver.addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC0140a);
        }
    }
}
