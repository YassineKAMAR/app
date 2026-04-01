package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class vn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bo f16374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final lp f16375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f16376c;

    private vn() {
        this.f16375b = mp.O();
        this.f16376c = false;
        this.f16374a = new bo();
    }

    public vn(bo boVar) {
        this.f16375b = mp.O();
        this.f16374a = boVar;
        this.f16376c = ((Boolean) h2.y.c().b(ns.M4)).booleanValue();
    }

    public static vn a() {
        return new vn();
    }

    private final synchronized String d(int i8) {
        return String.format("id=%s,timestamp=%s,event=%s,data=%s\n", this.f16375b.E(), Long.valueOf(g2.t.b().b()), Integer.valueOf(i8 - 1), Base64.encodeToString(((mp) this.f16375b.q()).g(), 3));
    }

    private final synchronized void e(int i8) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(externalStorageDirectory, "clearcut_events.txt"), true);
            try {
                try {
                    fileOutputStream.write(d(i8).getBytes());
                } catch (IOException unused) {
                    j2.v1.k("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        j2.v1.k("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    j2.v1.k("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            j2.v1.k("Could not find file for Clearcut");
        }
    }

    private final synchronized void f(int i8) {
        lp lpVar = this.f16375b;
        lpVar.x();
        lpVar.w(j2.k2.E());
        ao aoVar = new ao(this.f16374a, ((mp) this.f16375b.q()).g(), null);
        int i9 = i8 - 1;
        aoVar.a(i9);
        aoVar.c();
        j2.v1.k("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i9, 10))));
    }

    public final synchronized void b(un unVar) {
        if (this.f16376c) {
            try {
                unVar.a(this.f16375b);
            } catch (NullPointerException e8) {
                g2.t.q().u(e8, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void c(int i8) {
        if (this.f16376c) {
            if (((Boolean) h2.y.c().b(ns.N4)).booleanValue()) {
                e(i8);
            } else {
                f(i8);
            }
        }
    }
}
