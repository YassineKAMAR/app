package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class qf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e3.e f13431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dg0 f13432b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f13435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f13436f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f13434d = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f13437g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f13438h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f13439i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f13440j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f13441k = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedList f13433c = new LinkedList();

    qf0(e3.e eVar, dg0 dg0Var, String str, String str2) {
        this.f13431a = eVar;
        this.f13432b = dg0Var;
        this.f13435e = str;
        this.f13436f = str2;
    }

    public final Bundle a() {
        Bundle bundle;
        synchronized (this.f13434d) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.f13435e);
            bundle.putString("slotid", this.f13436f);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.f13440j);
            bundle.putLong("tresponse", this.f13441k);
            bundle.putLong("timp", this.f13437g);
            bundle.putLong("tload", this.f13438h);
            bundle.putLong("pcc", this.f13439i);
            bundle.putLong("tfetch", -1L);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it = this.f13433c.iterator();
            while (it.hasNext()) {
                arrayList.add(((pf0) it.next()).b());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String c() {
        return this.f13435e;
    }

    public final void d() {
        synchronized (this.f13434d) {
            if (this.f13441k != -1) {
                pf0 pf0Var = new pf0(this);
                pf0Var.d();
                this.f13433c.add(pf0Var);
                this.f13439i++;
                this.f13432b.f();
                this.f13432b.e(this);
            }
        }
    }

    public final void e() {
        synchronized (this.f13434d) {
            if (this.f13441k != -1 && !this.f13433c.isEmpty()) {
                pf0 pf0Var = (pf0) this.f13433c.getLast();
                if (pf0Var.a() == -1) {
                    pf0Var.c();
                    this.f13432b.e(this);
                }
            }
        }
    }

    public final void f() {
        synchronized (this.f13434d) {
            if (this.f13441k != -1 && this.f13437g == -1) {
                this.f13437g = this.f13431a.b();
                this.f13432b.e(this);
            }
            this.f13432b.g();
        }
    }

    public final void g() {
        synchronized (this.f13434d) {
            this.f13432b.h();
        }
    }

    public final void h(boolean z7) {
        synchronized (this.f13434d) {
            if (this.f13441k != -1) {
                this.f13438h = this.f13431a.b();
            }
        }
    }

    public final void i() {
        synchronized (this.f13434d) {
            this.f13432b.i();
        }
    }

    public final void j(h2.r4 r4Var) {
        synchronized (this.f13434d) {
            long jB = this.f13431a.b();
            this.f13440j = jB;
            this.f13432b.j(r4Var, jB);
        }
    }

    public final void k(long j8) {
        synchronized (this.f13434d) {
            this.f13441k = j8;
            if (j8 != -1) {
                this.f13432b.e(this);
            }
        }
    }
}
