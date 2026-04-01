package j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class j2 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ k2 f23988a;

    /* synthetic */ j2(k2 k2Var, i2 i2Var) {
        this.f23988a = k2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        k2 k2Var;
        boolean z7;
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            k2Var = this.f23988a;
            z7 = true;
        } else {
            if (!"android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                return;
            }
            k2Var = this.f23988a;
            z7 = false;
        }
        k2Var.f23996e = z7;
    }
}
