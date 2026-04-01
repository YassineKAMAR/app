package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public final class au1 extends h2.h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Map f5495a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f5496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f5497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final nt1 f5498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final lg3 f5499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final bu1 f5500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ft1 f5501g;

    au1(Context context, WeakReference weakReference, nt1 nt1Var, bu1 bu1Var, lg3 lg3Var) {
        this.f5496b = context;
        this.f5497c = weakReference;
        this.f5498d = nt1Var;
        this.f5499e = lg3Var;
        this.f5500f = bu1Var;
    }

    private final Context V5() {
        Context context = (Context) this.f5497c.get();
        return context == null ? this.f5496b : context;
    }

    private static z1.g W5() {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        g.a aVar = new g.a();
        aVar.b(AdMobAdapter.class, bundle);
        return aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String X5(Object obj) {
        z1.w wVarG;
        h2.m2 m2VarH;
        if (obj instanceof z1.n) {
            wVarG = ((z1.n) obj).f();
        } else if (obj instanceof b2.a) {
            wVarG = ((b2.a) obj).a();
        } else if (obj instanceof k2.a) {
            wVarG = ((k2.a) obj).a();
        } else if (obj instanceof r2.c) {
            wVarG = ((r2.c) obj).a();
        } else if (obj instanceof s2.a) {
            wVarG = ((s2.a) obj).a();
        } else {
            if (!(obj instanceof z1.j)) {
                if (obj instanceof com.google.android.gms.ads.nativead.a) {
                    wVarG = ((com.google.android.gms.ads.nativead.a) obj).g();
                }
                return "";
            }
            wVarG = ((z1.j) obj).getResponseInfo();
        }
        if (wVarG == null || (m2VarH = wVarG.h()) == null) {
            return "";
        }
        try {
            return m2VarH.o();
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void Y5(String str, String str2) {
        try {
            zf3.r(this.f5501g.b(str), new yt1(this, str2), this.f5499e);
        } catch (NullPointerException e8) {
            g2.t.q().u(e8, "OutOfContextTester.setAdAsOutOfContext");
            this.f5498d.f(str2);
        }
    }

    private final synchronized void Z5(String str, String str2) {
        try {
            zf3.r(this.f5501g.b(str), new zt1(this, str2), this.f5499e);
        } catch (NullPointerException e8) {
            g2.t.q().u(e8, "OutOfContextTester.setAdAsShown");
            this.f5498d.f(str2);
        }
    }

    public final void R5(ft1 ft1Var) {
        this.f5501g = ft1Var;
    }

    protected final synchronized void S5(String str, Object obj, String str2) {
        this.f5495a.put(str, obj);
        Y5(X5(obj), str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void T5(final java.lang.String r7, java.lang.String r8, final java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.au1.T5(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final synchronized void U5(String str, String str2) {
        Activity activityB = this.f5498d.b();
        if (activityB == null) {
            return;
        }
        Object obj = this.f5495a.get(str);
        if (obj == null) {
            return;
        }
        fs fsVar = ns.e9;
        if (!((Boolean) h2.y.c().b(fsVar)).booleanValue() || (obj instanceof b2.a) || (obj instanceof k2.a) || (obj instanceof r2.c) || (obj instanceof s2.a)) {
            this.f5495a.remove(str);
        }
        Z5(X5(obj), str2);
        if (obj instanceof b2.a) {
            ((b2.a) obj).g(activityB);
            return;
        }
        if (obj instanceof k2.a) {
            ((k2.a) obj).f(activityB);
            return;
        }
        if (obj instanceof r2.c) {
            ((r2.c) obj).i(activityB, new z1.r() { // from class: com.google.android.gms.internal.ads.pt1
                @Override // z1.r
                public final void a(r2.b bVar) {
                }
            });
            return;
        }
        if (obj instanceof s2.a) {
            ((s2.a) obj).i(activityB, new z1.r() { // from class: com.google.android.gms.internal.ads.qt1
                @Override // z1.r
                public final void a(r2.b bVar) {
                }
            });
            return;
        }
        if (((Boolean) h2.y.c().b(fsVar)).booleanValue() && ((obj instanceof z1.j) || (obj instanceof com.google.android.gms.ads.nativead.a))) {
            Intent intent = new Intent();
            Context contextV5 = V5();
            intent.setClassName(contextV5, "com.google.android.gms.ads.OutOfContextTestingActivity");
            intent.putExtra("adUnit", str);
            g2.t.r();
            j2.k2.s(contextV5, intent);
        }
    }

    @Override // h2.i2
    public final void h4(String str, g3.a aVar, g3.a aVar2) {
        Context context = (Context) g3.b.H0(aVar);
        ViewGroup viewGroup = (ViewGroup) g3.b.H0(aVar2);
        if (context == null || viewGroup == null) {
            return;
        }
        Object obj = this.f5495a.get(str);
        if (obj != null) {
            this.f5495a.remove(str);
        }
        if (obj instanceof z1.j) {
            bu1.a(context, viewGroup, (z1.j) obj);
        } else if (obj instanceof com.google.android.gms.ads.nativead.a) {
            bu1.b(context, viewGroup, (com.google.android.gms.ads.nativead.a) obj);
        }
    }
}
