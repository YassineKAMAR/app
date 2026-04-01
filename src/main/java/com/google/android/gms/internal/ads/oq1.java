package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oq1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f12612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final jq1 f12613f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f12609b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12610c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f12611d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2.x1 f12608a = g2.t.q().h();

    public oq1(String str, jq1 jq1Var) {
        this.f12612e = str;
        this.f12613f = jq1Var;
    }

    private final Map g() {
        Map mapG = this.f12613f.g();
        mapG.put("tms", Long.toString(g2.t.b().b(), 10));
        mapG.put("tid", this.f12608a.F0() ? "" : this.f12612e);
        return mapG;
    }

    public final synchronized void a(String str) {
        if (((Boolean) h2.y.c().b(ns.X1)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "aaia");
                mapG.put("aair", "MalformedJson");
                this.f12609b.add(mapG);
            }
        }
    }

    public final synchronized void b(String str, String str2) {
        if (((Boolean) h2.y.c().b(ns.X1)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_finished");
                mapG.put("ancn", str);
                mapG.put("rqe", str2);
                this.f12609b.add(mapG);
            }
        }
    }

    public final synchronized void c(String str) {
        if (((Boolean) h2.y.c().b(ns.X1)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_started");
                mapG.put("ancn", str);
                this.f12609b.add(mapG);
            }
        }
    }

    public final synchronized void d(String str) {
        if (((Boolean) h2.y.c().b(ns.X1)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
                Map mapG = g();
                mapG.put("action", "adapter_init_finished");
                mapG.put("ancn", str);
                this.f12609b.add(mapG);
            }
        }
    }

    public final synchronized void e() {
        if (((Boolean) h2.y.c().b(ns.X1)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
                if (this.f12611d) {
                    return;
                }
                Map mapG = g();
                mapG.put("action", "init_finished");
                this.f12609b.add(mapG);
                Iterator it = this.f12609b.iterator();
                while (it.hasNext()) {
                    this.f12613f.f((Map) it.next());
                }
                this.f12611d = true;
            }
        }
    }

    public final synchronized void f() {
        if (((Boolean) h2.y.c().b(ns.X1)).booleanValue()) {
            if (!((Boolean) h2.y.c().b(ns.r8)).booleanValue()) {
                if (this.f12610c) {
                    return;
                }
                Map mapG = g();
                mapG.put("action", "init_started");
                this.f12609b.add(mapG);
                this.f12610c = true;
            }
        }
    }
}
