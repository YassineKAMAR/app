package com.android.billingclient.api;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import com.android.billingclient.api.i;
import com.google.android.gms.internal.play_billing.a6;
import com.google.android.gms.internal.play_billing.d5;
import com.google.android.gms.internal.play_billing.e5;
import com.google.android.gms.internal.play_billing.g5;
import com.google.android.gms.internal.play_billing.i5;
import com.google.android.gms.internal.play_billing.n4;
import com.google.android.gms.internal.play_billing.o4;
import com.google.android.gms.internal.play_billing.r4;
import com.google.android.gms.internal.play_billing.s4;
import com.google.android.gms.internal.play_billing.s5;
import com.google.android.gms.internal.play_billing.u4;
import com.google.android.gms.internal.play_billing.y4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
class c extends b {
    private ExecutorService A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile int f4467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f4469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile n0 f4470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f4471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private y f4472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile s5 f4473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile u f4474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f4476j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f4477k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f4478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f4479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f4480n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f4481o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4482p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f4483q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f4484r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f4485s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f4486t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f4487u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4488v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f4489w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4490x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d0 f4491y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f4492z;

    private c(Context context, d0 d0Var, j1.n nVar, String str, String str2, j1.q qVar, y yVar, ExecutorService executorService) {
        this.f4467a = 0;
        this.f4469c = new Handler(Looper.getMainLooper());
        this.f4477k = 0;
        this.f4468b = str;
        o(context, nVar, d0Var, qVar, str, null);
    }

    c(String str, Context context, y yVar, ExecutorService executorService) {
        this.f4467a = 0;
        this.f4469c = new Handler(Looper.getMainLooper());
        this.f4477k = 0;
        String strN = N();
        this.f4468b = strN;
        this.f4471e = context.getApplicationContext();
        d5 d5VarX = e5.x();
        d5VarX.q(strN);
        d5VarX.p(this.f4471e.getPackageName());
        this.f4472f = new a0(this.f4471e, (e5) d5VarX.h());
        this.f4471e.getPackageName();
    }

    c(String str, d0 d0Var, Context context, j1.h0 h0Var, y yVar, ExecutorService executorService) {
        this.f4467a = 0;
        this.f4469c = new Handler(Looper.getMainLooper());
        this.f4477k = 0;
        this.f4468b = N();
        this.f4471e = context.getApplicationContext();
        d5 d5VarX = e5.x();
        d5VarX.q(N());
        d5VarX.p(this.f4471e.getPackageName());
        this.f4472f = new a0(this.f4471e, (e5) d5VarX.h());
        com.google.android.gms.internal.play_billing.v.k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        this.f4470d = new n0(this.f4471e, null, this.f4472f);
        this.f4491y = d0Var;
        this.f4471e.getPackageName();
    }

    c(String str, d0 d0Var, Context context, j1.n nVar, j1.c cVar, y yVar, ExecutorService executorService) {
        String strN = N();
        this.f4467a = 0;
        this.f4469c = new Handler(Looper.getMainLooper());
        this.f4477k = 0;
        this.f4468b = strN;
        n(context, nVar, d0Var, cVar, strN, null);
    }

    c(String str, d0 d0Var, Context context, j1.n nVar, j1.q qVar, y yVar, ExecutorService executorService) {
        this(context, d0Var, nVar, N(), null, qVar, null, null);
    }

    static /* synthetic */ j1.o0 I(c cVar, String str, int i8) {
        com.google.android.gms.internal.play_billing.v.j("BillingClient", "Querying owned items, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        boolean z7 = true;
        Bundle bundleD = com.google.android.gms.internal.play_billing.v.d(cVar.f4480n, cVar.f4488v, true, false, cVar.f4468b);
        List list = null;
        String string = null;
        while (true) {
            try {
                Bundle bundleF5 = cVar.f4480n ? cVar.f4473g.f5(z7 != cVar.f4488v ? 9 : 19, cVar.f4471e.getPackageName(), str, string, bundleD) : cVar.f4473g.q2(3, cVar.f4471e.getPackageName(), str, string);
                k0 k0VarA = l0.a(bundleF5, "BillingClient", "getPurchase()");
                f fVarA = k0VarA.a();
                if (fVarA != z.f4662l) {
                    cVar.f4472f.a(j1.c0.a(k0VarA.b(), 9, fVarA));
                    return new j1.o0(fVarA, list);
                }
                ArrayList<String> stringArrayList = bundleF5.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleF5.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleF5.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z8 = false;
                for (int i9 = 0; i9 < stringArrayList2.size(); i9++) {
                    String str2 = stringArrayList2.get(i9);
                    String str3 = stringArrayList3.get(i9);
                    com.google.android.gms.internal.play_billing.v.j("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList.get(i9))));
                    try {
                        Purchase purchase = new Purchase(str2, str3);
                        if (TextUtils.isEmpty(purchase.f())) {
                            com.google.android.gms.internal.play_billing.v.k("BillingClient", "BUG: empty/null token!");
                            z8 = true;
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e8) {
                        com.google.android.gms.internal.play_billing.v.l("BillingClient", "Got an exception trying to decode the purchase!", e8);
                        y yVar = cVar.f4472f;
                        f fVar = z.f4660j;
                        yVar.a(j1.c0.a(51, 9, fVar));
                        return new j1.o0(fVar, null);
                    }
                }
                if (z8) {
                    cVar.f4472f.a(j1.c0.a(26, 9, z.f4660j));
                }
                string = bundleF5.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.v.j("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new j1.o0(z.f4662l, arrayList);
                }
                list = null;
                z7 = true;
            } catch (Exception e9) {
                y yVar2 = cVar.f4472f;
                f fVar2 = z.f4663m;
                yVar2.a(j1.c0.a(52, 9, fVar2));
                com.google.android.gms.internal.play_billing.v.l("BillingClient", "Got exception trying to get purchasesm try to reconnect", e9);
                return new j1.o0(fVar2, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler J() {
        return Looper.myLooper() == null ? this.f4469c : new Handler(Looper.myLooper());
    }

    private final f K(final f fVar) {
        if (Thread.interrupted()) {
            return fVar;
        }
        this.f4469c.post(new Runnable() { // from class: com.android.billingclient.api.o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4608a.C(fVar);
            }
        });
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f M() {
        return (this.f4467a == 0 || this.f4467a == 3) ? z.f4663m : z.f4660j;
    }

    @SuppressLint({"PrivateApi"})
    private static String N() {
        try {
            return (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            return "6.1.0";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Future O(Callable callable, long j8, final Runnable runnable, Handler handler) {
        if (this.A == null) {
            this.A = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.v.f19698a, new o(this));
        }
        try {
            final Future futureSubmit = this.A.submit(callable);
            handler.postDelayed(new Runnable() { // from class: j1.a1
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = futureSubmit;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    Runnable runnable2 = runnable;
                    future.cancel(true);
                    com.google.android.gms.internal.play_billing.v.k("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, (long) (j8 * 0.95d));
            return futureSubmit;
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.v.l("BillingClient", "Async task throws exception!", e8);
            return null;
        }
    }

    private final void P(String str, final j1.l lVar) {
        if (!f()) {
            y yVar = this.f4472f;
            f fVar = z.f4663m;
            yVar.a(j1.c0.a(2, 11, fVar));
            lVar.a(fVar, null);
            return;
        }
        if (O(new q(this, str, lVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.w0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4645a.G(lVar);
            }
        }, J()) == null) {
            f fVarM = M();
            this.f4472f.a(j1.c0.a(25, 11, fVarM));
            lVar.a(fVarM, null);
        }
    }

    private final void Q(String str, final j1.m mVar) {
        if (!f()) {
            y yVar = this.f4472f;
            f fVar = z.f4663m;
            yVar.a(j1.c0.a(2, 9, fVar));
            mVar.a(fVar, com.google.android.gms.internal.play_billing.g.y());
            return;
        }
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Please provide a valid product type.");
            y yVar2 = this.f4472f;
            f fVar2 = z.f4657g;
            yVar2.a(j1.c0.a(50, 9, fVar2));
            mVar.a(fVar2, com.google.android.gms.internal.play_billing.g.y());
            return;
        }
        if (O(new p(this, str, mVar), 30000L, new Runnable() { // from class: com.android.billingclient.api.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4625a.H(mVar);
            }
        }, J()) == null) {
            f fVarM = M();
            this.f4472f.a(j1.c0.a(25, 9, fVarM));
            mVar.a(fVarM, com.google.android.gms.internal.play_billing.g.y());
        }
    }

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
    private final void R(f fVar, int i8, int i9) {
        s4 s4Var = null;
        o4 o4Var = null;
        if (fVar.b() == 0) {
            y yVar = this.f4472f;
            try {
                r4 r4VarX = s4.x();
                r4VarX.q(5);
                g5 g5VarX = i5.x();
                g5VarX.p(i9);
                r4VarX.p((i5) g5VarX.h());
                s4Var = (s4) r4VarX.h();
            } catch (Exception e8) {
                com.google.android.gms.internal.play_billing.v.l("BillingLogger", "Unable to create logging payload", e8);
            }
            yVar.c(s4Var);
            return;
        }
        y yVar2 = this.f4472f;
        try {
            n4 n4VarY = o4.y();
            u4 u4VarY = y4.y();
            u4VarY.q(fVar.b());
            u4VarY.p(fVar.a());
            u4VarY.r(i8);
            n4VarY.p(u4VarY);
            n4VarY.r(5);
            g5 g5VarX2 = i5.x();
            g5VarX2.p(i9);
            n4VarY.q((i5) g5VarX2.h());
            o4Var = (o4) n4VarY.h();
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.v.l("BillingLogger", "Unable to create logging payload", e9);
        }
        yVar2.a(o4Var);
    }

    static /* synthetic */ x X(c cVar, String str) {
        com.google.android.gms.internal.play_billing.v.j("BillingClient", "Querying purchase history, item type: ".concat(String.valueOf(str)));
        ArrayList arrayList = new ArrayList();
        Bundle bundleD = com.google.android.gms.internal.play_billing.v.d(cVar.f4480n, cVar.f4488v, true, false, cVar.f4468b);
        String string = null;
        while (cVar.f4478l) {
            try {
                Bundle bundleT1 = cVar.f4473g.t1(6, cVar.f4471e.getPackageName(), str, string, bundleD);
                k0 k0VarA = l0.a(bundleT1, "BillingClient", "getPurchaseHistory()");
                f fVarA = k0VarA.a();
                if (fVarA != z.f4662l) {
                    cVar.f4472f.a(j1.c0.a(k0VarA.b(), 11, fVarA));
                    return new x(fVarA, null);
                }
                ArrayList<String> stringArrayList = bundleT1.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundleT1.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundleT1.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                boolean z7 = false;
                for (int i8 = 0; i8 < stringArrayList2.size(); i8++) {
                    String str2 = stringArrayList2.get(i8);
                    String str3 = stringArrayList3.get(i8);
                    com.google.android.gms.internal.play_billing.v.j("BillingClient", "Purchase record found for sku : ".concat(String.valueOf(stringArrayList.get(i8))));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str2, str3);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.d())) {
                            com.google.android.gms.internal.play_billing.v.k("BillingClient", "BUG: empty/null token!");
                            z7 = true;
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e8) {
                        com.google.android.gms.internal.play_billing.v.l("BillingClient", "Got an exception trying to decode the purchase!", e8);
                        y yVar = cVar.f4472f;
                        f fVar = z.f4660j;
                        yVar.a(j1.c0.a(51, 11, fVar));
                        return new x(fVar, null);
                    }
                }
                if (z7) {
                    cVar.f4472f.a(j1.c0.a(26, 11, z.f4660j));
                }
                string = bundleT1.getString("INAPP_CONTINUATION_TOKEN");
                com.google.android.gms.internal.play_billing.v.j("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
                if (TextUtils.isEmpty(string)) {
                    return new x(z.f4662l, arrayList);
                }
            } catch (RemoteException e9) {
                com.google.android.gms.internal.play_billing.v.l("BillingClient", "Got exception trying to get purchase history, try to reconnect", e9);
                y yVar2 = cVar.f4472f;
                f fVar2 = z.f4663m;
                yVar2.a(j1.c0.a(59, 11, fVar2));
                return new x(fVar2, null);
            }
        }
        com.google.android.gms.internal.play_billing.v.k("BillingClient", "getPurchaseHistory is not supported on current device");
        return new x(z.f4667q, null);
    }

    private void n(Context context, j1.n nVar, d0 d0Var, j1.c cVar, String str, y yVar) {
        this.f4471e = context.getApplicationContext();
        d5 d5VarX = e5.x();
        d5VarX.q(str);
        d5VarX.p(this.f4471e.getPackageName());
        if (yVar == null) {
            yVar = new a0(this.f4471e, (e5) d5VarX.h());
        }
        this.f4472f = yVar;
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f4470d = new n0(this.f4471e, nVar, cVar, this.f4472f);
        this.f4491y = d0Var;
        this.f4492z = cVar != null;
        this.f4471e.getPackageName();
    }

    private void o(Context context, j1.n nVar, d0 d0Var, j1.q qVar, String str, y yVar) {
        this.f4471e = context.getApplicationContext();
        d5 d5VarX = e5.x();
        d5VarX.q(str);
        d5VarX.p(this.f4471e.getPackageName());
        if (yVar == null) {
            yVar = new a0(this.f4471e, (e5) d5VarX.h());
        }
        this.f4472f = yVar;
        if (nVar == null) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Billing client should have a valid listener but the provided is null.");
        }
        this.f4470d = new n0(this.f4471e, nVar, qVar, this.f4472f);
        this.f4491y = d0Var;
        this.f4492z = qVar != null;
    }

    final /* synthetic */ void B(j1.b bVar) {
        y yVar = this.f4472f;
        f fVar = z.f4664n;
        yVar.a(j1.c0.a(24, 3, fVar));
        bVar.a(fVar);
    }

    final /* synthetic */ void C(f fVar) {
        if (this.f4470d.d() != null) {
            this.f4470d.d().onPurchasesUpdated(fVar, null);
        } else {
            this.f4470d.c();
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "No valid listener is set in BroadcastManager");
        }
    }

    final /* synthetic */ void D(j1.g gVar, j1.f fVar) {
        y yVar = this.f4472f;
        f fVar2 = z.f4664n;
        yVar.a(j1.c0.a(24, 4, fVar2));
        gVar.a(fVar2, fVar.a());
    }

    final /* synthetic */ void E(j1.e eVar) {
        y yVar = this.f4472f;
        f fVar = z.f4664n;
        yVar.a(j1.c0.a(24, 13, fVar));
        eVar.a(fVar, null);
    }

    final /* synthetic */ void F(j1.k kVar) {
        y yVar = this.f4472f;
        f fVar = z.f4664n;
        yVar.a(j1.c0.a(24, 7, fVar));
        kVar.a(fVar, new ArrayList());
    }

    final /* synthetic */ void G(j1.l lVar) {
        y yVar = this.f4472f;
        f fVar = z.f4664n;
        yVar.a(j1.c0.a(24, 11, fVar));
        lVar.a(fVar, null);
    }

    final /* synthetic */ void H(j1.m mVar) {
        y yVar = this.f4472f;
        f fVar = z.f4664n;
        yVar.a(j1.c0.a(24, 9, fVar));
        mVar.a(fVar, com.google.android.gms.internal.play_billing.g.y());
    }

    final /* synthetic */ Bundle T(int i8, String str, String str2, e eVar, Bundle bundle) {
        return this.f4473g.a4(i8, this.f4471e.getPackageName(), str, str2, null, bundle);
    }

    final /* synthetic */ Bundle U(String str, String str2) {
        return this.f4473g.C2(3, this.f4471e.getPackageName(), str, str2, null);
    }

    @Override // com.android.billingclient.api.b
    public final void a(final j1.a aVar, final j1.b bVar) {
        if (!f()) {
            y yVar = this.f4472f;
            f fVar = z.f4663m;
            yVar.a(j1.c0.a(2, 3, fVar));
            bVar.a(fVar);
            return;
        }
        if (TextUtils.isEmpty(aVar.a())) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Please provide a valid purchase token.");
            y yVar2 = this.f4472f;
            f fVar2 = z.f4659i;
            yVar2.a(j1.c0.a(26, 3, fVar2));
            bVar.a(fVar2);
            return;
        }
        if (!this.f4480n) {
            y yVar3 = this.f4472f;
            f fVar3 = z.f4652b;
            yVar3.a(j1.c0.a(27, 3, fVar3));
            bVar.a(fVar3);
            return;
        }
        if (O(new Callable() { // from class: com.android.billingclient.api.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f4601a.b0(aVar, bVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4613a.B(bVar);
            }
        }, J()) == null) {
            f fVarM = M();
            this.f4472f.a(j1.c0.a(25, 3, fVarM));
            bVar.a(fVarM);
        }
    }

    @Override // com.android.billingclient.api.b
    public final void b(final j1.f fVar, final j1.g gVar) {
        if (!f()) {
            y yVar = this.f4472f;
            f fVar2 = z.f4663m;
            yVar.a(j1.c0.a(2, 4, fVar2));
            gVar.a(fVar2, fVar.a());
            return;
        }
        if (O(new Callable() { // from class: com.android.billingclient.api.u0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f4635a.c0(fVar, gVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.v0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4640a.D(gVar, fVar);
            }
        }, J()) == null) {
            f fVarM = M();
            this.f4472f.a(j1.c0.a(25, 4, fVarM));
            gVar.a(fVarM, fVar.a());
        }
    }

    final /* synthetic */ Object b0(j1.a aVar, j1.b bVar) {
        try {
            s5 s5Var = this.f4473g;
            String packageName = this.f4471e.getPackageName();
            String strA = aVar.a();
            String str = this.f4468b;
            Bundle bundle = new Bundle();
            bundle.putString("playBillingLibraryVersion", str);
            Bundle bundleE5 = s5Var.E5(9, packageName, strA, bundle);
            bVar.a(z.a(com.google.android.gms.internal.play_billing.v.b(bundleE5, "BillingClient"), com.google.android.gms.internal.play_billing.v.g(bundleE5, "BillingClient")));
            return null;
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.v.l("BillingClient", "Error acknowledge purchase!", e8);
            y yVar = this.f4472f;
            f fVar = z.f4663m;
            yVar.a(j1.c0.a(28, 3, fVar));
            bVar.a(fVar);
            return null;
        }
    }

    @Override // com.android.billingclient.api.b
    public final void c() {
        this.f4472f.c(j1.c0.b(12));
        try {
            try {
                if (this.f4470d != null) {
                    this.f4470d.e();
                }
                if (this.f4474h != null) {
                    this.f4474h.c();
                }
                if (this.f4474h != null && this.f4473g != null) {
                    com.google.android.gms.internal.play_billing.v.j("BillingClient", "Unbinding from service.");
                    this.f4471e.unbindService(this.f4474h);
                    this.f4474h = null;
                }
                this.f4473g = null;
                ExecutorService executorService = this.A;
                if (executorService != null) {
                    executorService.shutdownNow();
                    this.A = null;
                }
            } catch (Exception e8) {
                com.google.android.gms.internal.play_billing.v.l("BillingClient", "There was an exception while ending connection!", e8);
            }
        } finally {
            this.f4467a = 3;
        }
    }

    final /* synthetic */ Object c0(j1.f fVar, j1.g gVar) {
        int iA1;
        String strG;
        String strA = fVar.a();
        try {
            com.google.android.gms.internal.play_billing.v.j("BillingClient", "Consuming purchase with token: " + strA);
            if (this.f4480n) {
                s5 s5Var = this.f4473g;
                String packageName = this.f4471e.getPackageName();
                boolean z7 = this.f4480n;
                String str = this.f4468b;
                Bundle bundle = new Bundle();
                if (z7) {
                    bundle.putString("playBillingLibraryVersion", str);
                }
                Bundle bundleE1 = s5Var.e1(9, packageName, strA, bundle);
                iA1 = bundleE1.getInt("RESPONSE_CODE");
                strG = com.google.android.gms.internal.play_billing.v.g(bundleE1, "BillingClient");
            } else {
                iA1 = this.f4473g.a1(3, this.f4471e.getPackageName(), strA);
                strG = "";
            }
            f fVarA = z.a(iA1, strG);
            if (iA1 == 0) {
                com.google.android.gms.internal.play_billing.v.j("BillingClient", "Successfully consumed purchase.");
            } else {
                com.google.android.gms.internal.play_billing.v.k("BillingClient", "Error consuming purchase with token. Response code: " + iA1);
                this.f4472f.a(j1.c0.a(23, 4, fVarA));
            }
            gVar.a(fVarA, strA);
            return null;
        } catch (Exception e8) {
            com.google.android.gms.internal.play_billing.v.l("BillingClient", "Error consuming purchase!", e8);
            y yVar = this.f4472f;
            f fVar2 = z.f4663m;
            yVar.a(j1.c0.a(29, 4, fVar2));
            gVar.a(fVar2, strA);
            return null;
        }
    }

    @Override // com.android.billingclient.api.b
    public final void d(j1.h hVar, final j1.e eVar) {
        if (!f()) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Service disconnected.");
            y yVar = this.f4472f;
            f fVar = z.f4663m;
            yVar.a(j1.c0.a(2, 13, fVar));
            eVar.a(fVar, null);
            return;
        }
        if (!this.f4487u) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Current client doesn't support get billing config.");
            y yVar2 = this.f4472f;
            f fVar2 = z.f4676z;
            yVar2.a(j1.c0.a(32, 13, fVar2));
            eVar.a(fVar2, null);
            return;
        }
        String str = this.f4468b;
        final Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (O(new Callable() { // from class: com.android.billingclient.api.q0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f4618a.d0(bundle, eVar);
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f4622a.E(eVar);
            }
        }, J()) == null) {
            f fVarM = M();
            this.f4472f.a(j1.c0.a(25, 13, fVarM));
            eVar.a(fVarM, null);
        }
    }

    final /* synthetic */ Object d0(Bundle bundle, j1.e eVar) {
        y yVar;
        f fVar;
        try {
            this.f4473g.r1(18, this.f4471e.getPackageName(), bundle, new v(eVar, this.f4472f, null));
        } catch (DeadObjectException e8) {
            com.google.android.gms.internal.play_billing.v.l("BillingClient", "getBillingConfig got a dead object exception (try to reconnect).", e8);
            yVar = this.f4472f;
            fVar = z.f4663m;
            yVar.a(j1.c0.a(62, 13, fVar));
            eVar.a(fVar, null);
        } catch (Exception e9) {
            com.google.android.gms.internal.play_billing.v.l("BillingClient", "getBillingConfig got an exception.", e9);
            yVar = this.f4472f;
            fVar = z.f4660j;
            yVar.a(j1.c0.a(62, 13, fVar));
            eVar.a(fVar, null);
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    @Override // com.android.billingclient.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.f e(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.c.e(java.lang.String):com.android.billingclient.api.f");
    }

    final /* synthetic */ Object e0(i iVar, j1.k kVar) {
        String strG;
        Object obj;
        int i8;
        Object obj2;
        y yVar;
        o4 o4VarA;
        y yVar2;
        o4 o4VarA2;
        ArrayList arrayList = new ArrayList();
        String strC = iVar.c();
        com.google.android.gms.internal.play_billing.g gVarB = iVar.b();
        int size = gVarB.size();
        int i9 = 0;
        while (true) {
            strG = "Error trying to decode SkuDetails.";
            if (i9 >= size) {
                obj = null;
                strG = "";
                i8 = 0;
                break;
            }
            int i10 = i9 + 20;
            ArrayList arrayList2 = new ArrayList(gVarB.subList(i9, i10 > size ? size : i10));
            ArrayList<String> arrayList3 = new ArrayList<>();
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                arrayList3.add(((i.b) arrayList2.get(i11)).b());
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
            bundle.putString("playBillingLibraryVersion", this.f4468b);
            try {
                s5 s5Var = this.f4473g;
                int i12 = true != this.f4489w ? 17 : 20;
                String packageName = this.f4471e.getPackageName();
                String str = this.f4468b;
                if (TextUtils.isEmpty(null)) {
                    try {
                        this.f4471e.getPackageName();
                    } catch (Exception e8) {
                        e = e8;
                        obj = null;
                        i8 = 6;
                        com.google.android.gms.internal.play_billing.v.l("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                        this.f4472f.a(j1.c0.a(43, 7, z.f4660j));
                        strG = "An internal error occurred.";
                        kVar.a(z.a(i8, strG), arrayList);
                        return obj;
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("playBillingLibraryVersion", str);
                bundle2.putBoolean("enablePendingPurchases", true);
                bundle2.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
                ArrayList<String> arrayList4 = new ArrayList<>();
                ArrayList<String> arrayList5 = new ArrayList<>();
                com.google.android.gms.internal.play_billing.g gVar = gVarB;
                int size3 = arrayList2.size();
                int i13 = size;
                int i14 = 0;
                boolean z7 = false;
                boolean z8 = false;
                while (i14 < size3) {
                    i.b bVar = (i.b) arrayList2.get(i14);
                    ArrayList arrayList6 = arrayList2;
                    try {
                        arrayList4.add(null);
                        z8 |= !TextUtils.isEmpty(null);
                        String strC2 = bVar.c();
                        int i15 = size3;
                        if (strC2.equals("first_party")) {
                            try {
                                a6.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                                arrayList5.add(null);
                                z7 = true;
                            } catch (Exception e9) {
                                e = e9;
                                obj = null;
                                i8 = 6;
                                com.google.android.gms.internal.play_billing.v.l("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                this.f4472f.a(j1.c0.a(43, 7, z.f4660j));
                                strG = "An internal error occurred.";
                                kVar.a(z.a(i8, strG), arrayList);
                                return obj;
                            }
                        }
                        i14++;
                        size3 = i15;
                        arrayList2 = arrayList6;
                    } catch (Exception e10) {
                        e = e10;
                        obj = null;
                    }
                }
                if (z8) {
                    bundle2.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                }
                if (!arrayList5.isEmpty()) {
                    bundle2.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                }
                if (z7) {
                    obj2 = null;
                    if (!TextUtils.isEmpty(null)) {
                        bundle2.putString("accountName", null);
                    }
                } else {
                    obj2 = null;
                }
                int i16 = i12;
                obj = obj2;
                i8 = 6;
                try {
                    Bundle bundleW0 = s5Var.W0(i16, packageName, strC, bundle, bundle2);
                    if (bundleW0 == null) {
                        com.google.android.gms.internal.play_billing.v.k("BillingClient", "queryProductDetailsAsync got empty product details response.");
                        yVar = this.f4472f;
                        o4VarA = j1.c0.a(44, 7, z.B);
                        break;
                    }
                    if (bundleW0.containsKey("DETAILS_LIST")) {
                        ArrayList<String> stringArrayList = bundleW0.getStringArrayList("DETAILS_LIST");
                        if (stringArrayList == null) {
                            com.google.android.gms.internal.play_billing.v.k("BillingClient", "queryProductDetailsAsync got null response list");
                            yVar = this.f4472f;
                            o4VarA = j1.c0.a(46, 7, z.B);
                            break;
                        }
                        for (int i17 = 0; i17 < stringArrayList.size(); i17++) {
                            try {
                                h hVar = new h(stringArrayList.get(i17));
                                com.google.android.gms.internal.play_billing.v.j("BillingClient", "Got product details: ".concat(hVar.toString()));
                                arrayList.add(hVar);
                            } catch (JSONException e11) {
                                com.google.android.gms.internal.play_billing.v.l("BillingClient", "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e11);
                                yVar2 = this.f4472f;
                                o4VarA2 = j1.c0.a(47, 7, z.a(6, "Error trying to decode SkuDetails."));
                                yVar2.a(o4VarA2);
                                kVar.a(z.a(i8, strG), arrayList);
                                return obj;
                            }
                        }
                        i9 = i10;
                        gVarB = gVar;
                        size = i13;
                    } else {
                        int iB = com.google.android.gms.internal.play_billing.v.b(bundleW0, "BillingClient");
                        strG = com.google.android.gms.internal.play_billing.v.g(bundleW0, "BillingClient");
                        if (iB != 0) {
                            com.google.android.gms.internal.play_billing.v.k("BillingClient", "getSkuDetails() failed for queryProductDetailsAsync. Response code: " + iB);
                            this.f4472f.a(j1.c0.a(23, 7, z.a(iB, strG)));
                            i8 = iB;
                        } else {
                            com.google.android.gms.internal.play_billing.v.k("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.");
                            yVar2 = this.f4472f;
                            o4VarA2 = j1.c0.a(45, 7, z.a(6, strG));
                        }
                    }
                } catch (Exception e12) {
                    e = e12;
                    com.google.android.gms.internal.play_billing.v.l("BillingClient", "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                    this.f4472f.a(j1.c0.a(43, 7, z.f4660j));
                    strG = "An internal error occurred.";
                }
            } catch (Exception e13) {
                e = e13;
                obj = null;
            }
        }
        yVar.a(o4VarA);
        strG = "Item is unavailable for purchase.";
        i8 = 4;
        kVar.a(z.a(i8, strG), arrayList);
        return obj;
    }

    @Override // com.android.billingclient.api.b
    public final boolean f() {
        return (this.f4467a != 2 || this.f4473g == null || this.f4474h == null) ? false : true;
    }

    final /* synthetic */ Object f0(Bundle bundle, Activity activity, ResultReceiver resultReceiver) {
        this.f4473g.Y4(12, this.f4471e.getPackageName(), bundle, new w(new WeakReference(activity), resultReceiver, null));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba  */
    @Override // com.android.billingclient.api.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.android.billingclient.api.f g(android.app.Activity r32, final com.android.billingclient.api.e r33) {
        /*
            Method dump skipped, instruction units count: 1295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.c.g(android.app.Activity, com.android.billingclient.api.e):com.android.billingclient.api.f");
    }

    @Override // com.android.billingclient.api.b
    public final void i(final i iVar, final j1.k kVar) {
        if (!f()) {
            y yVar = this.f4472f;
            f fVar = z.f4663m;
            yVar.a(j1.c0.a(2, 7, fVar));
            kVar.a(fVar, new ArrayList());
            return;
        }
        if (this.f4486t) {
            if (O(new Callable() { // from class: com.android.billingclient.api.t0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.f4628a.e0(iVar, kVar);
                    return null;
                }
            }, 30000L, new Runnable() { // from class: com.android.billingclient.api.x0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4649a.F(kVar);
                }
            }, J()) == null) {
                f fVarM = M();
                this.f4472f.a(j1.c0.a(25, 7, fVarM));
                kVar.a(fVarM, new ArrayList());
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.v.k("BillingClient", "Querying product details is not supported.");
        y yVar2 = this.f4472f;
        f fVar2 = z.f4672v;
        yVar2.a(j1.c0.a(20, 7, fVar2));
        kVar.a(fVar2, new ArrayList());
    }

    @Override // com.android.billingclient.api.b
    public final void j(j1.o oVar, j1.l lVar) {
        P(oVar.b(), lVar);
    }

    @Override // com.android.billingclient.api.b
    public final void k(j1.p pVar, j1.m mVar) {
        Q(pVar.b(), mVar);
    }

    @Override // com.android.billingclient.api.b
    public final f l(final Activity activity, g gVar, j1.i iVar) {
        if (!f()) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Service disconnected.");
            return z.f4663m;
        }
        if (!this.f4482p) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Current client doesn't support showing in-app messages.");
            return z.f4673w;
        }
        View viewFindViewById = activity.findViewById(R.id.content);
        IBinder windowToken = viewFindViewById.getWindowToken();
        Rect rect = new Rect();
        viewFindViewById.getGlobalVisibleRect(rect);
        final Bundle bundle = new Bundle();
        androidx.core.app.l.a(bundle, "KEY_WINDOW_TOKEN", windowToken);
        bundle.putInt("KEY_DIMEN_LEFT", rect.left);
        bundle.putInt("KEY_DIMEN_TOP", rect.top);
        bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
        bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
        bundle.putString("playBillingLibraryVersion", this.f4468b);
        bundle.putIntegerArrayList("KEY_CATEGORY_IDS", gVar.b());
        final r rVar = new r(this, this.f4469c, iVar);
        O(new Callable() { // from class: com.android.billingclient.api.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f4579a.f0(bundle, activity, rVar);
                return null;
            }
        }, 5000L, null, this.f4469c);
        return z.f4662l;
    }

    @Override // com.android.billingclient.api.b
    public final void m(j1.d dVar) {
        if (f()) {
            com.google.android.gms.internal.play_billing.v.j("BillingClient", "Service connection is valid. No need to re-initialize.");
            this.f4472f.c(j1.c0.b(6));
            dVar.onBillingSetupFinished(z.f4662l);
            return;
        }
        int i8 = 1;
        if (this.f4467a == 1) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Client is already in the process of connecting to billing service.");
            y yVar = this.f4472f;
            f fVar = z.f4654d;
            yVar.a(j1.c0.a(37, 6, fVar));
            dVar.onBillingSetupFinished(fVar);
            return;
        }
        if (this.f4467a == 3) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            y yVar2 = this.f4472f;
            f fVar2 = z.f4663m;
            yVar2.a(j1.c0.a(38, 6, fVar2));
            dVar.onBillingSetupFinished(fVar2);
            return;
        }
        this.f4467a = 1;
        com.google.android.gms.internal.play_billing.v.j("BillingClient", "Starting in-app billing setup.");
        this.f4474h = new u(this, dVar, null);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f4471e.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            i8 = 41;
        } else {
            ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
            if (serviceInfo != null) {
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                if (!"com.android.vending".equals(str) || str2 == null) {
                    com.google.android.gms.internal.play_billing.v.k("BillingClient", "The device doesn't have valid Play Store.");
                    i8 = 40;
                } else {
                    ComponentName componentName = new ComponentName(str, str2);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f4468b);
                    if (this.f4471e.bindService(intent2, this.f4474h, 1)) {
                        com.google.android.gms.internal.play_billing.v.j("BillingClient", "Service was bonded successfully.");
                        return;
                    } else {
                        com.google.android.gms.internal.play_billing.v.k("BillingClient", "Connection to Billing service is blocked.");
                        i8 = 39;
                    }
                }
            }
        }
        this.f4467a = 0;
        com.google.android.gms.internal.play_billing.v.j("BillingClient", "Billing service unavailable on device.");
        y yVar3 = this.f4472f;
        f fVar3 = z.f4653c;
        yVar3.a(j1.c0.a(i8, 6, fVar3));
        dVar.onBillingSetupFinished(fVar3);
    }
}
