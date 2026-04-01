package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s70 extends a80 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f14543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f14544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f14545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f14546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f14547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f14548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f14549i;

    public s70(fm0 fm0Var, Map map) {
        super(fm0Var, "createCalendarEvent");
        this.f14543c = map;
        this.f14544d = fm0Var.r();
        this.f14545e = l(com.amazon.a.a.o.b.f3893c);
        this.f14548h = l("summary");
        this.f14546f = k("start_ticks");
        this.f14547g = k("end_ticks");
        this.f14549i = l("location");
    }

    private final long k(String str) {
        String str2 = (String) this.f14543c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f14543c.get(str)) ? "" : (String) this.f14543c.get(str);
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra(com.amazon.a.a.o.b.S, this.f14545e);
        data.putExtra("eventLocation", this.f14549i);
        data.putExtra(com.amazon.a.a.o.b.f3893c, this.f14548h);
        long j8 = this.f14546f;
        if (j8 > -1) {
            data.putExtra("beginTime", j8);
        }
        long j9 = this.f14547g;
        if (j9 > -1) {
            data.putExtra("endTime", j9);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() {
        if (this.f14544d == null) {
            c("Activity context is not available.");
            return;
        }
        g2.t.r();
        if (!new wr(this.f14544d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        g2.t.r();
        AlertDialog.Builder builderJ = j2.k2.j(this.f14544d);
        Resources resourcesD = g2.t.q().d();
        builderJ.setTitle(resourcesD != null ? resourcesD.getString(e2.b.f21372r) : "Create calendar event");
        builderJ.setMessage(resourcesD != null ? resourcesD.getString(e2.b.f21373s) : "Allow Ad to create a calendar event?");
        builderJ.setPositiveButton(resourcesD != null ? resourcesD.getString(e2.b.f21370p) : "Accept", new q70(this));
        builderJ.setNegativeButton(resourcesD != null ? resourcesD.getString(e2.b.f21371q) : "Decline", new r70(this));
        builderJ.create().show();
    }
}
