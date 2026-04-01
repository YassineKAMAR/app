package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wz implements qz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final Map f16980d = e3.f.d(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2.b f16981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u70 f16982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b80 f16983c;

    public wz(g2.b bVar, u70 u70Var, b80 b80Var) {
        this.f16981a = bVar;
        this.f16982b = u70Var;
        this.f16983c = b80Var;
    }

    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        fm0 fm0Var = (fm0) obj;
        int iIntValue = ((Integer) f16980d.get((String) map.get("a"))).intValue();
        int i8 = 6;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                g2.b bVar = this.f16981a;
                if (!bVar.c()) {
                    bVar.b(null);
                    return;
                }
                if (iIntValue == 1) {
                    this.f16982b.i(map);
                    return;
                }
                if (iIntValue == 3) {
                    new x70(fm0Var, map).i();
                    return;
                }
                if (iIntValue == 4) {
                    new s70(fm0Var, map).j();
                    return;
                } else if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f16982b.h(true);
                        return;
                    } else if (iIntValue != 7) {
                        qg0.f("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            this.f16983c.l();
            return;
        }
        String str = (String) map.get("forceOrientation");
        boolean z7 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (fm0Var == null) {
            qg0.g("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i8 = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            i8 = z7 ? -1 : 14;
        }
        fm0Var.W0(i8);
    }
}
