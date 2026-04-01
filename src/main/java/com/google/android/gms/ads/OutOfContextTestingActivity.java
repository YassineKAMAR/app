package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.w40;
import g3.b;
import h2.i2;
import h2.v;
import z1.s;
import z1.t;

/* JADX INFO: loaded from: classes.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2 i2VarF = v.a().f(this, new w40());
        if (i2VarF == null) {
            finish();
            return;
        }
        setContentView(t.f27651a);
        LinearLayout linearLayout = (LinearLayout) findViewById(s.f27650a);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            i2VarF.h4(stringExtra, b.k3(this), b.k3(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
