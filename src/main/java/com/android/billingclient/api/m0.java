package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.a1;
import com.google.android.gms.internal.play_billing.o4;
import j1.y0;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
final class m0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j1.n f4594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j1.h0 f4595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j1.c f4596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j1.q f4597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y f4598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ n0 f4600g;

    /* synthetic */ m0(n0 n0Var, j1.h0 h0Var, y yVar, y0 y0Var) {
        this.f4600g = n0Var;
        this.f4594a = null;
        this.f4596c = null;
        this.f4597d = null;
        this.f4595b = null;
        this.f4598e = yVar;
    }

    /* synthetic */ m0(n0 n0Var, j1.n nVar, j1.c cVar, y yVar, y0 y0Var) {
        this.f4600g = n0Var;
        this.f4594a = nVar;
        this.f4598e = yVar;
        this.f4596c = cVar;
        this.f4597d = null;
        this.f4595b = null;
    }

    /* synthetic */ m0(n0 n0Var, j1.n nVar, j1.q qVar, y yVar, y0 y0Var) {
        this.f4600g = n0Var;
        this.f4594a = nVar;
        this.f4598e = yVar;
        this.f4597d = qVar;
        this.f4596c = null;
        this.f4595b = null;
    }

    static /* bridge */ /* synthetic */ j1.h0 a(m0 m0Var) {
        j1.h0 h0Var = m0Var.f4595b;
        return null;
    }

    private final void e(Bundle bundle, f fVar, int i8) {
        if (bundle.getByteArray("FAILURE_LOGGING_PAYLOAD") == null) {
            this.f4598e.a(j1.c0.a(23, i8, fVar));
            return;
        }
        try {
            this.f4598e.a(o4.A(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD"), a1.a()));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.v.k("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    public final synchronized void c(Context context, IntentFilter intentFilter, String str, IntentFilter intentFilter2) {
        if (this.f4599f) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(this.f4600g.f4605b, intentFilter, null, null, 2);
        } else {
            this.f4600g.f4604a.getApplicationContext().getPackageName();
            context.registerReceiver(this.f4600g.f4605b, intentFilter);
        }
        this.f4599f = true;
    }

    public final synchronized void d(Context context) {
        if (!this.f4599f) {
            com.google.android.gms.internal.play_billing.v.k("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this.f4600g.f4605b);
            this.f4599f = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            com.google.android.gms.internal.play_billing.v.k("BillingBroadcastManager", "Bundle is null.");
            y yVar = this.f4598e;
            f fVar = z.f4660j;
            yVar.a(j1.c0.a(11, 1, fVar));
            j1.n nVar = this.f4594a;
            if (nVar != null) {
                nVar.onPurchasesUpdated(fVar, null);
                return;
            }
            return;
        }
        f fVarE = com.google.android.gms.internal.play_billing.v.e(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        String string = extras.getString("INTENT_SOURCE");
        int i8 = 2;
        if (string != "LAUNCH_BILLING_FLOW" && (string == null || !string.equals("LAUNCH_BILLING_FLOW"))) {
            i8 = 1;
        }
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED") || action.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
            List<Purchase> listI = com.google.android.gms.internal.play_billing.v.i(extras);
            if (fVarE.b() == 0) {
                this.f4598e.c(j1.c0.b(i8));
            } else {
                e(extras, fVarE, i8);
            }
            this.f4594a.onPurchasesUpdated(fVarE, listI);
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            if (fVarE.b() != 0) {
                e(extras, fVarE, i8);
                this.f4594a.onPurchasesUpdated(fVarE, com.google.android.gms.internal.play_billing.g.y());
                return;
            }
            if (this.f4596c == null && this.f4597d == null) {
                com.google.android.gms.internal.play_billing.v.k("BillingBroadcastManager", "AlternativeBillingListener and UserChoiceBillingListener is null.");
                y yVar2 = this.f4598e;
                f fVar2 = z.f4660j;
                yVar2.a(j1.c0.a(77, i8, fVar2));
                this.f4594a.onPurchasesUpdated(fVar2, com.google.android.gms.internal.play_billing.g.y());
                return;
            }
            String string2 = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string2 == null) {
                com.google.android.gms.internal.play_billing.v.k("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                y yVar3 = this.f4598e;
                f fVar3 = z.f4660j;
                yVar3.a(j1.c0.a(16, i8, fVar3));
                this.f4594a.onPurchasesUpdated(fVar3, com.google.android.gms.internal.play_billing.g.y());
                return;
            }
            try {
                if (this.f4597d != null) {
                    this.f4597d.a(new j(string2));
                } else {
                    this.f4596c.a(new a(string2));
                }
                this.f4598e.c(j1.c0.b(i8));
            } catch (JSONException unused) {
                com.google.android.gms.internal.play_billing.v.k("BillingBroadcastManager", String.format("Error when parsing invalid user choice data: [%s]", string2));
                y yVar4 = this.f4598e;
                f fVar4 = z.f4660j;
                yVar4.a(j1.c0.a(17, i8, fVar4));
                this.f4594a.onPurchasesUpdated(fVar4, com.google.android.gms.internal.play_billing.g.y());
            }
        }
    }
}
