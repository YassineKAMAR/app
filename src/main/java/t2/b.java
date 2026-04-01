package t2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.qg0;
import h2.a3;
import z1.d;
import z1.h;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3 f26486a;

    public d getAdListener() {
        return this.f26486a.d();
    }

    public h getAdSize() {
        return this.f26486a.e();
    }

    public String getAdUnitId() {
        return this.f26486a.m();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i8, int i9, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i12 = ((i10 - i8) - measuredWidth) / 2;
        int i13 = ((i11 - i9) - measuredHeight) / 2;
        childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        h adSize;
        int iD;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e8) {
                qg0.e("Unable to retrieve ad size.", e8);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int iK = adSize.k(context);
                iD = adSize.d(context);
                measuredWidth = iK;
            } else {
                iD = 0;
            }
        } else {
            measureChild(childAt, i8, i9);
            measuredWidth = childAt.getMeasuredWidth();
            iD = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i8), View.resolveSize(Math.max(iD, getSuggestedMinimumHeight()), i9));
    }

    public void setAdListener(d dVar) {
        this.f26486a.t(dVar);
    }

    public void setAdSize(h hVar) {
        this.f26486a.u(hVar);
    }

    public void setAdUnitId(String str) {
        this.f26486a.w(str);
    }
}
