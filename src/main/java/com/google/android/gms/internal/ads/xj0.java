package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class xj0 implements po3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f17272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final po3 f17273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f17275d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private InputStream f17277f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f17278g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f17279h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile hn f17280i;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ut3 f17284m;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f17281j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17282k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicLong f17283l = new AtomicLong(-1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f17276e = ((Boolean) h2.y.c().b(ns.O1)).booleanValue();

    public xj0(Context context, po3 po3Var, String str, int i8, g94 g94Var, wj0 wj0Var) {
        this.f17272a = context;
        this.f17273b = po3Var;
        this.f17274c = str;
        this.f17275d = i8;
    }

    private final boolean c() {
        if (!this.f17276e) {
            return false;
        }
        if (!((Boolean) h2.y.c().b(ns.f12098i4)).booleanValue() || this.f17281j) {
            return ((Boolean) h2.y.c().b(ns.f12107j4)).booleanValue() && !this.f17282k;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.wl4
    public final int H(byte[] bArr, int i8, int i9) throws IOException {
        if (!this.f17278g) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f17277f;
        return inputStream != null ? inputStream.read(bArr, i8, i9) : this.f17273b.H(bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void a(g94 g94Var) {
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final long b(ut3 ut3Var) throws IOException {
        if (this.f17278g) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        this.f17278g = true;
        Uri uri = ut3Var.f15867a;
        this.f17279h = uri;
        this.f17284m = ut3Var;
        this.f17280i = hn.g(uri);
        en enVarB = null;
        byte b8 = 0;
        if (!((Boolean) h2.y.c().b(ns.f12071f4)).booleanValue()) {
            if (this.f17280i != null) {
                this.f17280i.f8839h = ut3Var.f15872f;
                this.f17280i.f8840i = b93.c(this.f17274c);
                this.f17280i.f8841j = this.f17275d;
                enVarB = g2.t.e().b(this.f17280i);
            }
            if (enVarB != null && enVarB.u()) {
                this.f17281j = enVarB.w();
                this.f17282k = enVarB.v();
                if (!c()) {
                    this.f17277f = enVarB.n();
                    return -1L;
                }
            }
        } else if (this.f17280i != null) {
            this.f17280i.f8839h = ut3Var.f15872f;
            this.f17280i.f8840i = b93.c(this.f17274c);
            this.f17280i.f8841j = this.f17275d;
            long jLongValue = ((Long) h2.y.c().b(this.f17280i.f8838g ? ns.f12089h4 : ns.f12080g4)).longValue();
            g2.t.b().b();
            g2.t.f();
            Future futureA = sn.a(this.f17272a, this.f17280i);
            try {
                tn tnVar = (tn) futureA.get(jLongValue, TimeUnit.MILLISECONDS);
                tnVar.d();
                this.f17281j = tnVar.f();
                this.f17282k = tnVar.e();
                tnVar.a();
                if (c()) {
                    g2.t.b().b();
                    throw null;
                }
                this.f17277f = tnVar.c();
                g2.t.b().b();
                throw null;
            } catch (InterruptedException unused) {
                futureA.cancel(false);
                Thread.currentThread().interrupt();
                g2.t.b().b();
                throw null;
            } catch (ExecutionException | TimeoutException unused2) {
                futureA.cancel(false);
                g2.t.b().b();
                throw null;
            }
        }
        if (this.f17280i != null) {
            this.f17284m = new ut3(Uri.parse(this.f17280i.f8832a), null, ut3Var.f15871e, ut3Var.f15872f, ut3Var.f15873g, null, ut3Var.f15875i);
        }
        return this.f17273b.b(this.f17284m);
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final Uri l() {
        return this.f17279h;
    }

    @Override // com.google.android.gms.internal.ads.po3, com.google.android.gms.internal.ads.b94
    public final /* synthetic */ Map m() {
        return Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.po3
    public final void p() throws IOException {
        if (!this.f17278g) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f17278g = false;
        this.f17279h = null;
        InputStream inputStream = this.f17277f;
        if (inputStream == null) {
            this.f17273b.p();
        } else {
            e3.k.a(inputStream);
            this.f17277f = null;
        }
    }
}
