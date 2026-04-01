package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class t extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f1125a;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.H);
    }

    public t(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        g1.a(this, getContext());
        u uVar = new u(this);
        this.f1125a = uVar;
        uVar.c(attributeSet, i8);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1125a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1125a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1125a.g(canvas);
    }
}
