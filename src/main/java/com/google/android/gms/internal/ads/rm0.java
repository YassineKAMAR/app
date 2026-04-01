package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public final class rm0 {
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.fm0, java.lang.Object] */
    public static final fm0 a(final Context context, final vn0 vn0Var, final String str, final boolean z7, final boolean z8, final gh ghVar, final rt rtVar, final wg0 wg0Var, gt gtVar, final g2.l lVar, final g2.a aVar, final vn vnVar, final wr2 wr2Var, final as2 as2Var, final b22 b22Var) throws qm0 {
        ns.a(context);
        try {
            final gt gtVar2 = null;
            c93 c93Var = new c93(context, vn0Var, str, z7, z8, ghVar, rtVar, wg0Var, gtVar2, lVar, aVar, vnVar, wr2Var, as2Var, b22Var) { // from class: com.google.android.gms.internal.ads.om0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Context f12541a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ vn0 f12542b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f12543c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f12544d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f12545e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ gh f12546f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ rt f12547g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ wg0 f12548h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ g2.l f12549i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ g2.a f12550j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ vn f12551k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ wr2 f12552l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ as2 f12553m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ b22 f12554n;

                {
                    this.f12549i = lVar;
                    this.f12550j = aVar;
                    this.f12551k = vnVar;
                    this.f12552l = wr2Var;
                    this.f12553m = as2Var;
                    this.f12554n = b22Var;
                }

                @Override // com.google.android.gms.internal.ads.c93
                public final Object j() {
                    vn0 vn0Var2 = this.f12542b;
                    String str2 = this.f12543c;
                    boolean z9 = this.f12544d;
                    vn vnVar2 = this.f12551k;
                    boolean z10 = this.f12545e;
                    gh ghVar2 = this.f12546f;
                    rt rtVar2 = this.f12547g;
                    g2.l lVar2 = this.f12549i;
                    wr2 wr2Var2 = this.f12552l;
                    Context context2 = this.f12541a;
                    wg0 wg0Var2 = this.f12548h;
                    g2.a aVar2 = this.f12550j;
                    as2 as2Var2 = this.f12553m;
                    b22 b22Var2 = this.f12554n;
                    try {
                        TrafficStats.setThreadStatsTag(264);
                        int i8 = ym0.f17816l0;
                        um0 um0Var = new um0(new ym0(new un0(context2), vn0Var2, str2, z9, z10, ghVar2, rtVar2, wg0Var2, null, lVar2, aVar2, vnVar2, wr2Var2, as2Var2));
                        um0Var.setWebViewClient(g2.t.s().d(um0Var, vnVar2, z10, b22Var2));
                        um0Var.setWebChromeClient(new em0(um0Var));
                        return um0Var;
                    } finally {
                        TrafficStats.clearThreadStatsTag();
                    }
                }
            };
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return c93Var.j();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            throw new qm0("Webview initialization failed.", th);
        }
    }
}
