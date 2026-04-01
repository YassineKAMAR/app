package com.google.android.gms.common.api;

import a3.o;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import x2.e;

/* JADX INFO: loaded from: classes.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f4782a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i8, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i8);
        intent.putExtra("notify_manager", z7);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            e.m().n(this, ((Integer) o.j(num)).intValue(), 2, this);
            this.f4782a = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f4782a = 1;
        } catch (ActivityNotFoundException e8) {
            if (extras.getBoolean("notify_manager", true)) {
                com.google.android.gms.common.api.internal.b.x(this).F(new x2.b(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String string = pendingIntent.toString();
                StringBuilder sb = new StringBuilder(string.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(string);
                sb.append(".");
                String string2 = sb.toString();
                if (Build.FINGERPRINT.contains("generic")) {
                    string2 = string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", string2, e8);
            }
            this.f4782a = 1;
            finish();
        } catch (IntentSender.SendIntentException e9) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e9);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        if (i8 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4782a = 0;
            setResult(i9, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.b bVarX = com.google.android.gms.common.api.internal.b.x(this);
                if (i9 == -1) {
                    bVarX.a();
                } else if (i9 == 0) {
                    bVarX.F(new x2.b(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i8 == 2) {
            this.f4782a = 0;
            setResult(i9, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f4782a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4782a = bundle.getInt("resolution");
        }
        if (this.f4782a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4782a);
        super.onSaveInstanceState(bundle);
    }
}
