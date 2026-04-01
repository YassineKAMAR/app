package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class s extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f1123a;

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.F);
    }

    public s(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        g1.a(this, getContext());
        q qVar = new q(this);
        this.f1123a = qVar;
        qVar.c(attributeSet, i8);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        Bitmap bitmapB = this.f1123a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i8, 0), getMeasuredHeight());
        }
    }
}
