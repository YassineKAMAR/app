package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class k13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f9875a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f9876b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f9877c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f9878d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashSet f9879e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashSet f9880f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HashMap f9881g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f9882h = new WeakHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9883i;

    public final View a(String str) {
        return (View) this.f9877c.get(str);
    }

    public final j13 b(View view) {
        j13 j13Var = (j13) this.f9876b.get(view);
        if (j13Var != null) {
            this.f9876b.remove(view);
        }
        return j13Var;
    }

    public final String c(String str) {
        return (String) this.f9881g.get(str);
    }

    public final String d(View view) {
        if (this.f9875a.size() == 0) {
            return null;
        }
        String str = (String) this.f9875a.get(view);
        if (str != null) {
            this.f9875a.remove(view);
        }
        return str;
    }

    public final HashSet e() {
        return this.f9880f;
    }

    public final HashSet f() {
        return this.f9879e;
    }

    public final void g() {
        this.f9875a.clear();
        this.f9876b.clear();
        this.f9877c.clear();
        this.f9878d.clear();
        this.f9879e.clear();
        this.f9880f.clear();
        this.f9881g.clear();
        this.f9883i = false;
    }

    public final void h() {
        this.f9883i = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Boolean bool;
        i03 i03VarA = i03.a();
        if (i03VarA != null) {
            for (uz2 uz2Var : i03VarA.b()) {
                View viewF = uz2Var.f();
                if (uz2Var.j()) {
                    String strH = uz2Var.h();
                    if (viewF != null) {
                        String str = null;
                        if (viewF.isAttachedToWindow()) {
                            if (viewF.hasWindowFocus()) {
                                this.f9882h.remove(viewF);
                                bool = Boolean.FALSE;
                            } else if (this.f9882h.containsKey(viewF)) {
                                bool = (Boolean) this.f9882h.get(viewF);
                            } else {
                                Map map = this.f9882h;
                                Boolean bool2 = Boolean.FALSE;
                                map.put(viewF, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view = viewF;
                                while (true) {
                                    if (view == null) {
                                        this.f9878d.addAll(hashSet);
                                        break;
                                    }
                                    String strB = i13.b(view);
                                    if (strB != null) {
                                        str = strB;
                                        break;
                                    } else {
                                        hashSet.add(view);
                                        Object parent = view.getParent();
                                        view = parent instanceof View ? (View) parent : null;
                                    }
                                }
                            }
                        } else {
                            str = "notAttached";
                        }
                        if (str == null) {
                            this.f9879e.add(strH);
                            this.f9875a.put(viewF, strH);
                            for (l03 l03Var : uz2Var.i()) {
                                View view2 = (View) l03Var.b().get();
                                if (view2 != null) {
                                    j13 j13Var = (j13) this.f9876b.get(view2);
                                    if (j13Var != null) {
                                        j13Var.c(uz2Var.h());
                                    } else {
                                        this.f9876b.put(view2, new j13(l03Var, uz2Var.h()));
                                    }
                                }
                            }
                        } else if (str != "noWindowFocus") {
                            this.f9880f.add(strH);
                            this.f9877c.put(strH, viewF);
                            this.f9881g.put(strH, str);
                        }
                    } else {
                        this.f9880f.add(strH);
                        this.f9881g.put(strH, "noAdView");
                    }
                }
            }
        }
    }

    public final boolean j(View view) {
        if (!this.f9882h.containsKey(view)) {
            return true;
        }
        this.f9882h.put(view, Boolean.TRUE);
        return false;
    }

    public final int k(View view) {
        if (this.f9878d.contains(view)) {
            return 1;
        }
        return this.f9883i ? 2 : 3;
    }
}
