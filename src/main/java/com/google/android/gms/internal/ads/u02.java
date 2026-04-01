package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases_flutter.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u02 extends v02 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final SparseArray f15427h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f15428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j31 f15429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TelephonyManager f15430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m02 f15431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15432g;

    static {
        SparseArray sparseArray = new SparseArray();
        f15427h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), lq.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        lq lqVar = lq.CONNECTING;
        sparseArray.put(iOrdinal, lqVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), lqVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), lqVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), lq.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        lq lqVar2 = lq.DISCONNECTED;
        sparseArray.put(iOrdinal2, lqVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), lqVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), lqVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), lqVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), lqVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), lq.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), lqVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), lqVar);
    }

    u02(Context context, j31 j31Var, m02 m02Var, i02 i02Var, j2.x1 x1Var) {
        super(i02Var, x1Var);
        this.f15428c = context;
        this.f15429d = j31Var;
        this.f15431f = m02Var;
        this.f15430e = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ aq b(u02 u02Var, Bundle bundle) {
        tp tpVarM = aq.M();
        int i8 = bundle.getInt("cnt", -2);
        int i9 = bundle.getInt("gnt", 0);
        int i10 = 2;
        if (i8 == -1) {
            u02Var.f15432g = 2;
        } else {
            u02Var.f15432g = 1;
            if (i8 == 0) {
                tpVarM.v(2);
            } else if (i8 != 1) {
                tpVarM.v(1);
            } else {
                tpVarM.v(3);
            }
            switch (i9) {
                case 1:
                case 2:
                case 4:
                case 7:
                case R.styleable.GradientColor_android_endY /* 11 */:
                case com.amazon.c.a.a.c.f4052g /* 16 */:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case R.styleable.GradientColor_android_endX /* 10 */:
                case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                case 14:
                case 15:
                case 17:
                    i10 = 3;
                    break;
                case 13:
                    i10 = 5;
                    break;
                default:
                    i10 = 1;
                    break;
            }
            tpVarM.u(i10);
        }
        return (aq) tpVarM.q();
    }

    static /* bridge */ /* synthetic */ lq c(u02 u02Var, Bundle bundle) {
        return (lq) f15427h.get(ft2.a(ft2.a(bundle, "device"), "network").getInt("active_network_state", -1), lq.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] f(u02 u02Var, boolean z7, ArrayList arrayList, aq aqVar, lq lqVar) {
        gq gqVarU = hq.U();
        gqVarU.u(arrayList);
        gqVarU.C(g(Settings.Global.getInt(u02Var.f15428c.getContentResolver(), "airplane_mode_on", 0) != 0));
        gqVarU.D(g2.t.s().i(u02Var.f15428c, u02Var.f15430e));
        gqVarU.z(u02Var.f15431f.e());
        gqVarU.y(u02Var.f15431f.b());
        gqVarU.v(u02Var.f15431f.a());
        gqVarU.w(lqVar);
        gqVarU.x(aqVar);
        gqVarU.E(u02Var.f15432g);
        gqVarU.F(g(z7));
        gqVarU.B(u02Var.f15431f.d());
        gqVarU.A(g2.t.b().a());
        gqVarU.G(g(Settings.Global.getInt(u02Var.f15428c.getContentResolver(), "wifi_on", 0) != 0));
        return ((hq) gqVarU.q()).g();
    }

    private static final int g(boolean z7) {
        return z7 ? 2 : 1;
    }

    public final void e(boolean z7) {
        zf3.r(this.f15429d.b(), new t02(this, z7), eh0.f7327f);
    }
}
