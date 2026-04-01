package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import t.e;

/* JADX INFO: loaded from: classes.dex */
public class i extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f1603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1604c;

    public void a(ConstraintLayout constraintLayout) {
        if (this.f1603b == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.f1603b.getLayoutParams();
        bVar2.f1429v0.g1(0);
        e.b bVarY = bVar.f1429v0.y();
        e.b bVar3 = e.b.FIXED;
        if (bVarY != bVar3) {
            bVar.f1429v0.h1(bVar2.f1429v0.U());
        }
        if (bVar.f1429v0.R() != bVar3) {
            bVar.f1429v0.I0(bVar2.f1429v0.v());
        }
        bVar2.f1429v0.g1(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.f1602a == -1 && !isInEditMode()) {
            setVisibility(this.f1604c);
        }
        View viewFindViewById = constraintLayout.findViewById(this.f1602a);
        this.f1603b = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.b) viewFindViewById.getLayoutParams()).f1405j0 = true;
            this.f1603b.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1603b;
    }

    public int getEmptyVisibility() {
        return this.f1604c;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i8) {
        View viewFindViewById;
        if (this.f1602a == i8) {
            return;
        }
        View view = this.f1603b;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.f1603b.getLayoutParams()).f1405j0 = false;
            this.f1603b = null;
        }
        this.f1602a = i8;
        if (i8 == -1 || (viewFindViewById = ((View) getParent()).findViewById(i8)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i8) {
        this.f1604c = i8;
    }
}
