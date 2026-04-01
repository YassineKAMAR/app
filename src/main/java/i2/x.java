package i2;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.jg0;
import com.google.android.gms.internal.ads.ns;

/* JADX INFO: loaded from: classes.dex */
public final class x extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageButton f22545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f22546b;

    public x(Context context, w wVar, e eVar) {
        super(context);
        this.f22546b = eVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.f22545a = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        h2.v.b();
        int iB = jg0.B(context, wVar.f22541a);
        h2.v.b();
        int iB2 = jg0.B(context, 0);
        h2.v.b();
        int iB3 = jg0.B(context, wVar.f22542b);
        h2.v.b();
        imageButton.setPadding(iB, iB2, iB3, jg0.B(context, wVar.f22543c));
        imageButton.setContentDescription("Interstitial close button");
        h2.v.b();
        int iB4 = jg0.B(context, wVar.f22544d + wVar.f22541a + wVar.f22542b);
        h2.v.b();
        addView(imageButton, new FrameLayout.LayoutParams(iB4, jg0.B(context, wVar.f22544d + wVar.f22543c), 17));
        long jLongValue = ((Long) h2.y.c().b(ns.f12032b1)).longValue();
        if (jLongValue <= 0) {
            return;
        }
        v vVar = ((Boolean) h2.y.c().b(ns.f12041c1)).booleanValue() ? new v(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(jLongValue).setListener(vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void c() {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.fs r0 = com.google.android.gms.internal.ads.ns.f12023a1
            com.google.android.gms.internal.ads.ls r1 = h2.y.c()
            java.lang.Object r0 = r1.b(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = e3.m.f()
            r2 = 17301527(0x1080017, float:2.497932E-38)
            if (r1 == 0) goto L67
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L67
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L24
            goto L67
        L24:
            com.google.android.gms.internal.ads.zf0 r1 = g2.t.q()
            android.content.res.Resources r1 = r1.d()
            if (r1 == 0) goto L61
            r3 = 0
            java.lang.String r4 = "white"
            boolean r4 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r4 == 0) goto L3e
            int r0 = e2.a.f21354b     // Catch: android.content.res.Resources.NotFoundException -> L49
        L39:
            android.graphics.drawable.Drawable r3 = r1.getDrawable(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L4e
        L3e:
            java.lang.String r4 = "black"
            boolean r0 = r4.equals(r0)     // Catch: android.content.res.Resources.NotFoundException -> L49
            if (r0 == 0) goto L4e
            int r0 = e2.a.f21353a     // Catch: android.content.res.Resources.NotFoundException -> L49
            goto L39
        L49:
            java.lang.String r0 = "Close button resource not found, falling back to default."
            com.google.android.gms.internal.ads.qg0.b(r0)
        L4e:
            android.widget.ImageButton r0 = r5.f22545a
            if (r3 != 0) goto L56
            r0.setImageResource(r2)
            return
        L56:
            r0.setImageDrawable(r3)
            android.widget.ImageButton r0 = r5.f22545a
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r0.setScaleType(r1)
            return
        L61:
            android.widget.ImageButton r0 = r5.f22545a
            r0.setImageResource(r2)
            return
        L67:
            android.widget.ImageButton r0 = r5.f22545a
            r0.setImageResource(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.x.c():void");
    }

    public final void b(boolean z7) {
        if (!z7) {
            this.f22545a.setVisibility(0);
            return;
        }
        this.f22545a.setVisibility(8);
        if (((Long) h2.y.c().b(ns.f12032b1)).longValue() > 0) {
            this.f22545a.animate().cancel();
            this.f22545a.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e eVar = this.f22546b;
        if (eVar != null) {
            eVar.t();
        }
    }
}
