package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.aw;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import g3.b;
import h2.p3;
import h2.v;
import h2.y;
import o2.d;
import o2.e;
import z1.o;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f4765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aw f4766b;

    public NativeAdView(Context context) {
        super(context);
        this.f4765a = e(context);
        this.f4766b = f();
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4765a = e(context);
        this.f4766b = f();
    }

    private final FrameLayout e(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final aw f() {
        if (isInEditMode()) {
            return null;
        }
        FrameLayout frameLayout = this.f4765a;
        return v.a().h(frameLayout.getContext(), this, frameLayout);
    }

    private final void g(String str, View view) {
        aw awVar = this.f4766b;
        if (awVar != null) {
            try {
                awVar.U0(str, b.k3(view));
            } catch (RemoteException e8) {
                qg0.e("Unable to call setAssetView on delegate", e8);
            }
        }
    }

    public void a() {
        aw awVar = this.f4766b;
        if (awVar != null) {
            try {
                awVar.l();
            } catch (RemoteException e8) {
                qg0.e("Unable to destroy native ad view", e8);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i8, layoutParams);
        super.bringChildToFront(this.f4765a);
    }

    protected final View b(String str) {
        aw awVar = this.f4766b;
        if (awVar != null) {
            try {
                g3.a aVarC = awVar.c(str);
                if (aVarC != null) {
                    return (View) b.H0(aVarC);
                }
            } catch (RemoteException e8) {
                qg0.e("Unable to call getAssetView on delegate", e8);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f4765a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(o oVar) {
        aw awVar = this.f4766b;
        if (awVar == null) {
            return;
        }
        try {
            if (oVar instanceof p3) {
                awVar.J4(((p3) oVar).b());
            } else if (oVar == null) {
                awVar.J4(null);
            } else {
                qg0.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e8) {
            qg0.e("Unable to call setMediaContent on delegate", e8);
        }
    }

    final /* synthetic */ void d(ImageView.ScaleType scaleType) {
        aw awVar = this.f4766b;
        if (awVar == null || scaleType == null) {
            return;
        }
        try {
            awVar.i2(b.k3(scaleType));
        } catch (RemoteException e8) {
            qg0.e("Unable to call setMediaViewImageScaleType on delegate", e8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f4766b != null) {
            if (((Boolean) y.c().b(ns.ya)).booleanValue()) {
                try {
                    this.f4766b.m0(b.k3(motionEvent));
                } catch (RemoteException e8) {
                    qg0.e("Unable to call handleTouchEvent on delegate", e8);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public o2.a getAdChoicesView() {
        View viewB = b("3011");
        if (viewB instanceof o2.a) {
            return (o2.a) viewB;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return b("3005");
    }

    public final View getBodyView() {
        return b("3004");
    }

    public final View getCallToActionView() {
        return b("3002");
    }

    public final View getHeadlineView() {
        return b("3001");
    }

    public final View getIconView() {
        return b("3003");
    }

    public final View getImageView() {
        return b("3008");
    }

    public final MediaView getMediaView() {
        View viewB = b("3010");
        if (viewB instanceof MediaView) {
            return (MediaView) viewB;
        }
        if (viewB == null) {
            return null;
        }
        qg0.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return b("3007");
    }

    public final View getStarRatingView() {
        return b("3009");
    }

    public final View getStoreView() {
        return b("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i8) {
        super.onVisibilityChanged(view, i8);
        aw awVar = this.f4766b;
        if (awVar != null) {
            try {
                awVar.T1(b.k3(view), i8);
            } catch (RemoteException e8) {
                qg0.e("Unable to call onVisibilityChanged on delegate", e8);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f4765a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f4765a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(o2.a aVar) {
        g("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        g("3005", view);
    }

    public final void setBodyView(View view) {
        g("3004", view);
    }

    public final void setCallToActionView(View view) {
        g("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        aw awVar = this.f4766b;
        if (awVar != null) {
            try {
                awVar.v3(b.k3(view));
            } catch (RemoteException e8) {
                qg0.e("Unable to call setClickConfirmingView on delegate", e8);
            }
        }
    }

    public final void setHeadlineView(View view) {
        g("3001", view);
    }

    public final void setIconView(View view) {
        g("3003", view);
    }

    public final void setImageView(View view) {
        g("3008", view);
    }

    public final void setMediaView(MediaView mediaView) {
        g("3010", mediaView);
        if (mediaView == null) {
            return;
        }
        mediaView.a(new d(this));
        mediaView.b(new e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [g3.a, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void setNativeAd(a aVar) {
        aw awVar = this.f4766b;
        if (awVar != 0) {
            try {
                awVar.z1(aVar.k());
            } catch (RemoteException e8) {
                qg0.e("Unable to call setNativeAd on delegate", e8);
            }
        }
    }

    public final void setPriceView(View view) {
        g("3007", view);
    }

    public final void setStarRatingView(View view) {
        g("3009", view);
    }

    public final void setStoreView(View view) {
        g("3006", view);
    }
}
