package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1444j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t.a f1446l;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void t(t.e r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1445k = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.f1444j
            if (r6 != r2) goto Lf
        Lc:
            r3.f1445k = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.f1444j
            if (r6 != r2) goto L19
        L16:
            r3.f1445k = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof t.a
            if (r5 == 0) goto L27
            t.a r4 = (t.a) r4
            int r5 = r3.f1445k
            r4.x1(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.t(t.e, int, boolean):void");
    }

    public boolean getAllowsGoneWidget() {
        return this.f1446l.r1();
    }

    public int getMargin() {
        return this.f1446l.t1();
    }

    public int getType() {
        return this.f1444j;
    }

    @Override // androidx.constraintlayout.widget.c
    protected void m(AttributeSet attributeSet) {
        super.m(attributeSet);
        this.f1446l = new t.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.f1724n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i8);
                if (index == k.f1802w1) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == k.f1794v1) {
                    this.f1446l.w1(typedArrayObtainStyledAttributes.getBoolean(index, true));
                } else if (index == k.f1810x1) {
                    this.f1446l.y1(typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f1468d = this.f1446l;
        s();
    }

    @Override // androidx.constraintlayout.widget.c
    public void n(t.e eVar, boolean z7) {
        t(eVar, this.f1444j, z7);
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.f1446l.w1(z7);
    }

    public void setDpMargin(int i8) {
        this.f1446l.y1((int) ((i8 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i8) {
        this.f1446l.y1(i8);
    }

    public void setType(int i8) {
        this.f1444j = i8;
    }
}
