package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class xy implements qz {
    xy() {
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        String str;
        fm0 fm0Var = (fm0) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            str = "Missing App Id, cannot show LMD Overlay without it";
        } else {
            m63 m63VarL = o63.l();
            m63VarL.b((String) map.get("appId"));
            m63VarL.h(fm0Var.getWidth());
            m63VarL.g(fm0Var.T().getWindowToken());
            m63VarL.d((map.containsKey("gravityX") && map.containsKey("gravityY")) ? Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")) : 81);
            m63VarL.e(map.containsKey("verticalMargin") ? Float.parseFloat((String) map.get("verticalMargin")) : 0.02f);
            if (map.containsKey("enifd")) {
                m63VarL.a((String) map.get("enifd"));
            }
            try {
                g2.t.l().j(fm0Var, m63VarL.i());
                return;
            } catch (NullPointerException e8) {
                g2.t.q().u(e8, "DefaultGmsgHandlers.ShowLMDOverlay");
                str = "Missing parameters for LMD Overlay show request";
            }
        }
        j2.v1.k(str);
    }
}
