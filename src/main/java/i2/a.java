package i2;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.ns;
import com.google.android.gms.internal.ads.qg0;
import j2.k2;
import j2.v1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final boolean a(Context context, Intent intent, f0 f0Var, d0 d0Var, boolean z7) {
        if (z7) {
            return c(context, intent.getData(), f0Var, d0Var);
        }
        try {
            v1.k("Launching an intent: " + intent.toURI());
            g2.t.r();
            k2.s(context, intent);
            if (f0Var != null) {
                f0Var.q();
            }
            if (d0Var != null) {
                d0Var.a(true);
            }
            return true;
        } catch (ActivityNotFoundException e8) {
            qg0.g(e8.getMessage());
            if (d0Var != null) {
                d0Var.a(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, i iVar, f0 f0Var, d0 d0Var) {
        String strConcat;
        int i8 = 0;
        if (iVar != null) {
            ns.a(context);
            Intent intent = iVar.f22504h;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(iVar.f22498b)) {
                    strConcat = "Open GMSG did not contain a URL.";
                } else {
                    if (TextUtils.isEmpty(iVar.f22499c)) {
                        intent.setData(Uri.parse(iVar.f22498b));
                    } else {
                        String str = iVar.f22498b;
                        intent.setDataAndType(Uri.parse(str), iVar.f22499c);
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(iVar.f22500d)) {
                        intent.setPackage(iVar.f22500d);
                    }
                    if (!TextUtils.isEmpty(iVar.f22501e)) {
                        String[] strArrSplit = iVar.f22501e.split("/", 2);
                        if (strArrSplit.length < 2) {
                            strConcat = "Could not parse component name from open GMSG: ".concat(String.valueOf(iVar.f22501e));
                        } else {
                            intent.setClassName(strArrSplit[0], strArrSplit[1]);
                        }
                    }
                    String str2 = iVar.f22502f;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i8 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            qg0.g("Could not parse intent flags.");
                        }
                        intent.addFlags(i8);
                    }
                    if (((Boolean) h2.y.c().b(ns.f12179r4)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) h2.y.c().b(ns.f12170q4)).booleanValue()) {
                            g2.t.r();
                            k2.P(context, intent);
                        }
                    }
                }
            }
            return a(context, intent, f0Var, d0Var, iVar.f22506j);
        }
        strConcat = "No intent data for launcher overlay.";
        qg0.g(strConcat);
        return false;
    }

    private static final boolean c(Context context, Uri uri, f0 f0Var, d0 d0Var) {
        int iN;
        try {
            iN = g2.t.r().N(context, uri);
            if (f0Var != null) {
                f0Var.q();
            }
        } catch (ActivityNotFoundException e8) {
            qg0.g(e8.getMessage());
            iN = 6;
        }
        if (d0Var != null) {
            d0Var.d(iN);
        }
        return iN == 5;
    }
}
