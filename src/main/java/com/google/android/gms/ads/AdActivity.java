package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.q80;
import com.google.android.gms.internal.ads.qg0;
import g3.b;
import h2.v;

/* JADX INFO: loaded from: classes.dex */
public final class AdActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q80 f4720a;

    private final void a() {
        q80 q80Var = this.f4720a;
        if (q80Var != null) {
            try {
                q80Var.D();
            } catch (RemoteException e8) {
                qg0.i("#007 Could not call remote method.", e8);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i8, int i9, Intent intent) {
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.X1(i8, i9, intent);
            }
        } catch (Exception e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        super.onActivityResult(i8, i9, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                if (!q80Var.h0()) {
                    return;
                }
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        super.onBackPressed();
        try {
            q80 q80Var2 = this.f4720a;
            if (q80Var2 != null) {
                q80Var2.r();
            }
        } catch (RemoteException e9) {
            qg0.i("#007 Could not call remote method.", e9);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.p0(b.k3(configuration));
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q80 q80VarL = v.a().l(this);
        this.f4720a = q80VarL;
        if (q80VarL != null) {
            try {
                q80VarL.C3(bundle);
                return;
            } catch (RemoteException e8) {
                e = e8;
            }
        } else {
            e = null;
        }
        qg0.i("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.x();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.w();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i8, String[] strArr, int[] iArr) {
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.A2(i8, strArr, iArr);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.z();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.B();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.x0(bundle);
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.G();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.E();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            q80 q80Var = this.f4720a;
            if (q80Var != null) {
                q80Var.A();
            }
        } catch (RemoteException e8) {
            qg0.i("#007 Could not call remote method.", e8);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i8) {
        super.setContentView(i8);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        a();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        a();
    }
}
