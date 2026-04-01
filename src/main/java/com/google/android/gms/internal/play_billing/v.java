package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f19698a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return m(intent.getExtras(), "ProxyBillingActivity");
        }
        k("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        String strConcat;
        if (bundle == null) {
            strConcat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                j(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            strConcat = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
        }
        k(str, strConcat);
        return 6;
    }

    public static int c(Intent intent, String str) {
        return e(intent, "ProxyBillingActivity").b();
    }

    public static Bundle d(boolean z7, boolean z8, boolean z9, boolean z10, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z7) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static com.android.billingclient.api.f e(Intent intent, String str) {
        if (intent != null) {
            f.a aVarC = com.android.billingclient.api.f.c();
            aVarC.c(b(intent.getExtras(), str));
            aVarC.b(g(intent.getExtras(), str));
            return aVarC.a();
        }
        k("BillingHelper", "Got null intent!");
        f.a aVarC2 = com.android.billingclient.api.f.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static j1.j f(Bundle bundle, String str) {
        return bundle == null ? new j1.j(0, null) : new j1.j(m(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String g(Bundle bundle, String str) {
        if (bundle == null) {
            k(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            j(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        k(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String h(int i8) {
        return a.a(i8).toString();
    }

    public static List i(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseN = n(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseN == null) {
                j("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseN);
        } else {
            j("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i8 = 0; i8 < stringArrayList.size() && i8 < stringArrayList2.size(); i8++) {
                Purchase purchaseN2 = n(stringArrayList.get(i8), stringArrayList2.get(i8));
                if (purchaseN2 != null) {
                    arrayList.add(purchaseN2);
                }
            }
        }
        return arrayList;
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i8 = 40000;
            while (!str2.isEmpty() && i8 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i8));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i8 -= iMin;
            }
        }
    }

    public static void k(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void l(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    private static int m(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        k(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase n(String str, String str2) {
        if (str == null || str2 == null) {
            j("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e8) {
            k("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e8.toString()));
            return null;
        }
    }
}
