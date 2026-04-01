package io.flutter.plugin.platform;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
@TargetApi(23)
public class p extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private io.flutter.embedding.android.c f22966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o f22967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalFocusChangeListener f22968g;

    class a implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View.OnFocusChangeListener f22969a;

        a(View.OnFocusChangeListener onFocusChangeListener) {
            this.f22969a = onFocusChangeListener;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            View.OnFocusChangeListener onFocusChangeListener = this.f22969a;
            p pVar = p.this;
            onFocusChangeListener.onFocusChange(pVar, b6.h.d(pVar));
        }
    }

    public p(Context context) {
        super(context);
        setWillNotDraw(false);
    }

    public p(Context context, o oVar) {
        this(context);
        this.f22967f = oVar;
    }

    public void a() {
        o oVar = this.f22967f;
        if (oVar != null) {
            oVar.release();
            this.f22967f = null;
        }
    }

    public void b(int i8, int i9) {
        o oVar = this.f22967f;
        if (oVar != null) {
            oVar.a(i8, i9);
        }
    }

    public void c() {
        ViewTreeObserver.OnGlobalFocusChangeListener onGlobalFocusChangeListener;
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive() || (onGlobalFocusChangeListener = this.f22968g) == null) {
            return;
        }
        this.f22968g = null;
        viewTreeObserver.removeOnGlobalFocusChangeListener(onGlobalFocusChangeListener);
    }

    @Override // android.view.View
    @SuppressLint({"NewApi"})
    public void draw(Canvas canvas) {
        o oVar = this.f22967f;
        if (oVar == null) {
            super.draw(canvas);
            g5.b.b("PlatformViewWrapper", "Platform view cannot be composed without a RenderTarget.");
            return;
        }
        Canvas canvasLockHardwareCanvas = oVar.lockHardwareCanvas();
        if (canvasLockHardwareCanvas == null) {
            invalidate();
            return;
        }
        try {
            canvasLockHardwareCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(canvasLockHardwareCanvas);
        } finally {
            this.f22967f.unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
    }

    public ViewTreeObserver.OnGlobalFocusChangeListener getActiveFocusListener() {
        return this.f22968g;
    }

    public int getRenderTargetHeight() {
        o oVar = this.f22967f;
        if (oVar != null) {
            return oVar.getHeight();
        }
        return 0;
    }

    public int getRenderTargetWidth() {
        o oVar = this.f22967f;
        if (oVar != null) {
            return oVar.getWidth();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        invalidate();
        return super.invalidateChildInParent(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"NewApi"})
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidate();
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
        if (this.f22966e == null) {
            return super.onTouchEvent(motionEvent);
        }
        Matrix matrix = new Matrix();
        int action = motionEvent.getAction();
        if (action == 0) {
            int i9 = this.f22964c;
            this.f22962a = i9;
            i8 = this.f22965d;
            this.f22963b = i8;
            f8 = i9;
        } else {
            if (action == 2) {
                matrix.postTranslate(this.f22962a, this.f22963b);
                this.f22962a = this.f22964c;
                this.f22963b = this.f22965d;
                return this.f22966e.l(motionEvent, matrix);
            }
            f8 = this.f22964c;
            i8 = this.f22965d;
        }
        matrix.postTranslate(f8, i8);
        return this.f22966e.l(motionEvent, matrix);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getImportantForAccessibility() != 4) {
            return super.requestSendAccessibilityEvent(view, accessibilityEvent);
        }
        return false;
    }

    public void setLayoutParams(FrameLayout.LayoutParams layoutParams) {
        super.setLayoutParams((ViewGroup.LayoutParams) layoutParams);
        this.f22964c = layoutParams.leftMargin;
        this.f22965d = layoutParams.topMargin;
    }

    public void setOnDescendantFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        c();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive() && this.f22968g == null) {
            a aVar = new a(onFocusChangeListener);
            this.f22968g = aVar;
            viewTreeObserver.addOnGlobalFocusChangeListener(aVar);
        }
    }

    public void setTouchProcessor(io.flutter.embedding.android.c cVar) {
        this.f22966e = cVar;
    }
}
