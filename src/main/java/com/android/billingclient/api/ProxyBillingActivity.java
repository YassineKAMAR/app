package com.android.billingclient.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.activity.ComponentActivity;
import androidx.activity.result.d;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;

/* JADX INFO: loaded from: classes.dex */
@UsedByReflection("PlatformActivityProxy")
public class ProxyBillingActivity extends ComponentActivity {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.activity.result.c<androidx.activity.result.d> f4437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ResultReceiver f4438l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ResultReceiver f4439m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ResultReceiver f4440n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f4441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f4442p;

    private Intent p(String str) {
        Intent intent = new Intent("com.android.vending.billing.ALTERNATIVE_BILLING");
        intent.setPackage(getApplicationContext().getPackageName());
        intent.putExtra("ALTERNATIVE_BILLING_USER_CHOICE_DATA", str);
        return intent;
    }

    private Intent q() {
        getApplicationContext().getPackageName();
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onActivityResult(int r9, int r10, android.content.Intent r11) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.m, android.app.Activity
    protected void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i8;
        super.onCreate(bundle);
        this.f4437k = n(new d.b(), new androidx.activity.result.b() { // from class: com.android.billingclient.api.j0
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                this.f4578a.r((androidx.activity.result.a) obj);
            }
        });
        if (bundle != null) {
            com.google.android.gms.internal.play_billing.v.j("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f4441o = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER)) {
                this.f4438l = (ResultReceiver) bundle.getParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.f4439m = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            } else if (bundle.containsKey("alternative_billing_only_dialog_result_receiver")) {
                this.f4440n = (ResultReceiver) bundle.getParcelable("alternative_billing_only_dialog_result_receiver");
            }
            this.f4442p = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
            return;
        }
        com.google.android.gms.internal.play_billing.v.j("ProxyBillingActivity", "Launching Play Store billing flow");
        if (getIntent().hasExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT")) {
            PendingIntent pendingIntent2 = (PendingIntent) getIntent().getParcelableExtra("ALTERNATIVE_BILLING_ONLY_DIALOG_INTENT");
            this.f4440n = (ResultReceiver) getIntent().getParcelableExtra("alternative_billing_only_dialog_result_receiver");
            this.f4437k.a(new d.b(pendingIntent2).a());
            return;
        }
        if (getIntent().hasExtra("BUY_INTENT")) {
            pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                this.f4442p = true;
                i8 = 110;
            } else {
                i8 = 100;
            }
        } else {
            if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.f4438l = (ResultReceiver) getIntent().getParcelableExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER);
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.f4439m = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i8 = 101;
            } else {
                pendingIntent = null;
            }
            i8 = 100;
        }
        try {
            this.f4441o = true;
            startIntentSenderForResult(pendingIntent.getIntentSender(), i8, new Intent(), 0, 0, 0);
        } catch (IntentSender.SendIntentException e8) {
            com.google.android.gms.internal.play_billing.v.l("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e8);
            ResultReceiver resultReceiver = this.f4438l;
            if (resultReceiver != null) {
                resultReceiver.send(6, null);
            } else {
                ResultReceiver resultReceiver2 = this.f4439m;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(0, null);
                } else {
                    Intent intentQ = q();
                    if (this.f4442p) {
                        intentQ.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                    }
                    intentQ.putExtra("RESPONSE_CODE", 6);
                    intentQ.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                    sendBroadcast(intentQ);
                }
            }
            this.f4441o = false;
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f4441o) {
            Intent intentQ = q();
            intentQ.putExtra("RESPONSE_CODE", 1);
            intentQ.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(intentQ);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.m, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ResultReceiver resultReceiver = this.f4438l;
        if (resultReceiver != null) {
            bundle.putParcelable(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f4439m;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        ResultReceiver resultReceiver3 = this.f4440n;
        if (resultReceiver3 != null) {
            bundle.putParcelable("alternative_billing_only_dialog_result_receiver", resultReceiver3);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f4441o);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.f4442p);
    }

    void r(androidx.activity.result.a aVar) {
        Intent intentB = aVar.b();
        int iC = com.google.android.gms.internal.play_billing.v.c(intentB, "ProxyBillingActivity");
        ResultReceiver resultReceiver = this.f4440n;
        if (resultReceiver != null) {
            resultReceiver.send(iC, intentB == null ? null : intentB.getExtras());
        }
        if (aVar.c() != -1 || iC != 0) {
            com.google.android.gms.internal.play_billing.v.k("ProxyBillingActivity", "Alternative billing only dialog finished with resultCode " + aVar.c() + " and billing's responseCode: " + iC);
        }
        finish();
    }
}
