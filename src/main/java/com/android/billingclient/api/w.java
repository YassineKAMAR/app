package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.gms.internal.play_billing.t5;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
final class w extends t5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference f4643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ResultReceiver f4644b;

    /* synthetic */ w(WeakReference weakReference, ResultReceiver resultReceiver, j1.u uVar) {
        this.f4643a = weakReference;
        this.f4644b = resultReceiver;
    }

    @Override // com.google.android.gms.internal.play_billing.u5
    public final void f(Bundle bundle) {
        ResultReceiver resultReceiver = this.f4644b;
        if (resultReceiver == null) {
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.f4643a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.f4644b.send(0, null);
            com.google.android.gms.internal.play_billing.v.k("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.f4644b);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e8) {
            this.f4644b.send(0, null);
            com.google.android.gms.internal.play_billing.v.l("BillingClient", "Exception caught while launching intent for in-app messaging.", e8);
        }
    }
}
