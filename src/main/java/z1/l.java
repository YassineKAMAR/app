package z1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.fg0;
import com.google.android.gms.internal.ads.gu;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.qg0;
import h2.a3;

/* JADX INFO: loaded from: classes.dex */
public abstract class l extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final a3 f27648a;

    protected l(Context context, int i8) {
        super(context);
        this.f27648a = new a3(this, i8);
    }

    public void a() {
        ns.a(getContext());
        if (((Boolean) gu.f8499e.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.ja)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: z1.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.f27611a;
                        try {
                            lVar.f27648a.n();
                        } catch (IllegalStateException e8) {
                            o90.c(lVar.getContext()).a(e8, "BaseAdView.destroy");
                        }
                    }
                });
                return;
            }
        }
        this.f27648a.n();
    }

    public void b(final g gVar) {
        a3.o.e("#008 Must be called on the main UI thread.");
        ns.a(getContext());
        if (((Boolean) gu.f8500f.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.ma)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: z1.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.f27618a;
                        try {
                            lVar.f27648a.p(gVar.f27620a);
                        } catch (IllegalStateException e8) {
                            o90.c(lVar.getContext()).a(e8, "BaseAdView.loadAd");
                        }
                    }
                });
                return;
            }
        }
        this.f27648a.p(gVar.f27620a);
    }

    public void c() {
        ns.a(getContext());
        if (((Boolean) gu.f8501g.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.ka)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: z1.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.f27612a;
                        try {
                            lVar.f27648a.q();
                        } catch (IllegalStateException e8) {
                            o90.c(lVar.getContext()).a(e8, "BaseAdView.pause");
                        }
                    }
                });
                return;
            }
        }
        this.f27648a.q();
    }

    public void d() {
        ns.a(getContext());
        if (((Boolean) gu.f8502h.e()).booleanValue()) {
            if (((Boolean) h2.y.c().b(ns.ia)).booleanValue()) {
                fg0.f7750b.execute(new Runnable() { // from class: z1.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        l lVar = this.f27610a;
                        try {
                            lVar.f27648a.r();
                        } catch (IllegalStateException e8) {
                            o90.c(lVar.getContext()).a(e8, "BaseAdView.resume");
                        }
                    }
                });
                return;
            }
        }
        this.f27648a.r();
    }

    public d getAdListener() {
        return this.f27648a.d();
    }

    public h getAdSize() {
        return this.f27648a.e();
    }

    public String getAdUnitId() {
        return this.f27648a.m();
    }

    public q getOnPaidEventListener() {
        return this.f27648a.f();
    }

    public w getResponseInfo() {
        return this.f27648a.g();
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

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(d dVar) {
        this.f27648a.t(dVar);
        if (dVar == 0) {
            this.f27648a.s(null);
            return;
        }
        if (dVar instanceof h2.a) {
            this.f27648a.s((h2.a) dVar);
        }
        if (dVar instanceof a2.e) {
            this.f27648a.x((a2.e) dVar);
        }
    }

    public void setAdSize(h hVar) {
        this.f27648a.u(hVar);
    }

    public void setAdUnitId(String str) {
        this.f27648a.w(str);
    }

    public void setOnPaidEventListener(q qVar) {
        this.f27648a.z(qVar);
    }
}
