package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ek0 implements qz {
    @Override // com.google.android.gms.internal.ads.qz
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        dj0 dj0Var = (dj0) obj;
        bn0 bn0VarZ = dj0Var.z();
        if (bn0VarZ == null) {
            try {
                bn0 bn0Var = new bn0(dj0Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                dj0Var.g(bn0Var);
                bn0VarZ = bn0Var;
            } catch (NullPointerException e8) {
                e = e8;
                qg0.e("Unable to parse videoMeta message.", e);
                g2.t.q().u(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e9) {
                e = e9;
                qg0.e("Unable to parse videoMeta message.", e);
                g2.t.q().u(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float f8 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f9 = Float.parseFloat((String) map.get("currentTime"));
        int i8 = Integer.parseInt((String) map.get("playbackState"));
        int i9 = 0;
        if (i8 >= 0 && i8 <= 3) {
            i9 = i8;
        }
        String str = (String) map.get("aspectRatio");
        float f10 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (qg0.j(3)) {
            qg0.b("Video Meta GMSG: currentTime : " + f9 + " , duration : " + f8 + " , isMuted : " + zEquals + " , playbackState : " + i9 + " , aspectRatio : " + str);
        }
        bn0VarZ.P5(f9, f8, i9, zEquals, f10);
    }
}
