package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class x70 extends a80 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f17083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f17084d;

    public x70(fm0 fm0Var, Map map) {
        super(fm0Var, "storePicture");
        this.f17083c = map;
        this.f17084d = fm0Var.r();
    }

    public final void i() {
        if (this.f17084d == null) {
            c("Activity context is not available");
            return;
        }
        g2.t.r();
        if (!new wr(this.f17084d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f17083c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        g2.t.r();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesD = g2.t.q().d();
        g2.t.r();
        AlertDialog.Builder builderJ = j2.k2.j(this.f17084d);
        builderJ.setTitle(resourcesD != null ? resourcesD.getString(e2.b.f21368n) : "Save image");
        builderJ.setMessage(resourcesD != null ? resourcesD.getString(e2.b.f21369o) : "Allow Ad to store image in Picture gallery?");
        builderJ.setPositiveButton(resourcesD != null ? resourcesD.getString(e2.b.f21370p) : "Accept", new v70(this, str, lastPathSegment));
        builderJ.setNegativeButton(resourcesD != null ? resourcesD.getString(e2.b.f21371q) : "Decline", new w70(this));
        builderJ.create().show();
    }
}
