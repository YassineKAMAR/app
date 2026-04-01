package r3;

import a3.c;
import a3.i0;
import a3.o;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public class a extends a3.g<g> implements q3.f {
    public static final /* synthetic */ int M = 0;
    private final boolean I;
    private final a3.d J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z7, a3.d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.I = true;
        this.J = dVar;
        this.K = bundle;
        this.L = dVar.g();
    }

    public static Bundle l0(a3.d dVar) {
        dVar.f();
        Integer numG = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // a3.c
    protected final Bundle A() {
        if (!y().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }

    @Override // a3.c
    protected final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // a3.c
    protected final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // a3.c, y2.a.f
    public final int k() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // q3.f
    public final void n(f fVar) {
        o.k(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account accountB = this.J.b();
            ((g) D()).k3(new j(1, new i0(accountB, ((Integer) o.j(this.L)).intValue(), "<<default account>>".equals(accountB.name) ? v2.a.a(y()).b() : null)), fVar);
        } catch (RemoteException e8) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.r2(new l(1, new x2.b(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e8);
            }
        }
    }

    @Override // a3.c, y2.a.f
    public final boolean o() {
        return this.I;
    }

    @Override // q3.f
    public final void p() {
        h(new c.d());
    }

    @Override // a3.c
    protected final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof g ? (g) iInterfaceQueryLocalInterface : new g(iBinder);
    }
}
