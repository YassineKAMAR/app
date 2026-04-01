package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public class h extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1601a;

    public h(Context context) {
        super(context);
        this.f1601a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z7) {
        this.f1601a = z7;
    }

    public void setGuidelineBegin(int i8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1601a && bVar.f1386a == i8) {
            return;
        }
        bVar.f1386a = i8;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1601a && bVar.f1388b == i8) {
            return;
        }
        bVar.f1388b = i8;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f8) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f1601a && bVar.f1390c == f8) {
            return;
        }
        bVar.f1390c = f8;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
    }
}
