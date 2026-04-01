package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class kl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f10146b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f10145a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f10147c = new LinkedList();

    public final jl a(boolean z7) {
        synchronized (this.f10145a) {
            jl jlVar = null;
            if (this.f10147c.isEmpty()) {
                qg0.b("Queue empty");
                return null;
            }
            int i8 = 0;
            if (this.f10147c.size() < 2) {
                jl jlVar2 = (jl) this.f10147c.get(0);
                if (z7) {
                    this.f10147c.remove(0);
                } else {
                    jlVar2.i();
                }
                return jlVar2;
            }
            int i9 = Integer.MIN_VALUE;
            int i10 = 0;
            for (jl jlVar3 : this.f10147c) {
                int iB = jlVar3.b();
                if (iB > i9) {
                    i8 = i10;
                }
                int i11 = iB > i9 ? iB : i9;
                if (iB > i9) {
                    jlVar = jlVar3;
                }
                i10++;
                i9 = i11;
            }
            this.f10147c.remove(i8);
            return jlVar;
        }
    }

    public final void b(jl jlVar) {
        synchronized (this.f10145a) {
            if (this.f10147c.size() >= 10) {
                qg0.b("Queue is full, current size = " + this.f10147c.size());
                this.f10147c.remove(0);
            }
            int i8 = this.f10146b;
            this.f10146b = i8 + 1;
            jlVar.j(i8);
            jlVar.n();
            this.f10147c.add(jlVar);
        }
    }

    public final boolean c(jl jlVar) {
        synchronized (this.f10145a) {
            Iterator it = this.f10147c.iterator();
            while (it.hasNext()) {
                jl jlVar2 = (jl) it.next();
                if (g2.t.q().h().H()) {
                    if (!g2.t.q().h().I() && !jlVar.equals(jlVar2) && jlVar2.f().equals(jlVar.f())) {
                        it.remove();
                        return true;
                    }
                } else if (!jlVar.equals(jlVar2) && jlVar2.d().equals(jlVar.d())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean d(jl jlVar) {
        synchronized (this.f10145a) {
            return this.f10147c.contains(jlVar);
        }
    }
}
