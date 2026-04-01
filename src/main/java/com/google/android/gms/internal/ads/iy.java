package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class iy implements qz {
    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get(DiagnosticsEntry.Event.TIMESTAMP_KEY);
            if (TextUtils.isEmpty(str2)) {
                qg0.g("No label given for CSI tick.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                qg0.g("No timestamp given for CSI tick.");
                return;
            }
            try {
                long jB = g2.t.b().b() + (Long.parseLong(str4) - g2.t.b().a());
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                fm0Var.x().c(str2, str3, jB);
                return;
            } catch (NumberFormatException e8) {
                qg0.h("Malformed timestamp for CSI tick.", e8);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                qg0.g("No value given for CSI experiment.");
                return;
            } else {
                fm0Var.x().a().d("e", str5);
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                qg0.g("No value given for CSI extra.");
            } else if (TextUtils.isEmpty(str6)) {
                qg0.g("No name given for CSI extra.");
            } else {
                fm0Var.x().a().d(str6, str7);
            }
        }
    }
}
