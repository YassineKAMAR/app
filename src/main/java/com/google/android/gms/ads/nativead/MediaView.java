package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.pw;
import com.google.android.gms.internal.ads.qg0;
import g3.b;
import o2.d;
import o2.e;
import z1.o;

/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o f4759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f4760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView.ScaleType f4761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d f4763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f4764f;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected final synchronized void a(d dVar) {
        this.f4763e = dVar;
        if (this.f4760b) {
            dVar.f25299a.c(this.f4759a);
        }
    }

    protected final synchronized void b(e eVar) {
        this.f4764f = eVar;
        if (this.f4762d) {
            eVar.f25300a.d(this.f4761c);
        }
    }

    public o getMediaContent() {
        return this.f4759a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.f4762d = true;
        this.f4761c = scaleType;
        e eVar = this.f4764f;
        if (eVar != null) {
            eVar.f25300a.d(scaleType);
        }
    }

    public void setMediaContent(o oVar) {
        boolean zA0;
        this.f4760b = true;
        this.f4759a = oVar;
        d dVar = this.f4763e;
        if (dVar != null) {
            dVar.f25299a.c(oVar);
        }
        if (oVar == null) {
            return;
        }
        try {
            pw pwVarJ = oVar.j();
            if (pwVarJ != null) {
                if (!oVar.a()) {
                    if (oVar.k()) {
                        zA0 = pwVarJ.a0(b.k3(this));
                    }
                    removeAllViews();
                }
                zA0 = pwVarJ.t0(b.k3(this));
                if (zA0) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e8) {
            removeAllViews();
            qg0.e("", e8);
        }
    }
}
