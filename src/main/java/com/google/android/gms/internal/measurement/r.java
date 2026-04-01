package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface r {
    public static final r L = new y();
    public static final r M = new p();
    public static final r N = new k("continue");
    public static final r O = new k("break");
    public static final r P = new k("return");
    public static final r Q = new h(Boolean.TRUE);
    public static final r R = new h(Boolean.FALSE);
    public static final r S = new t("");

    r g(String str, b7 b7Var, List<r> list);

    r l();

    Double m();

    String n();

    Iterator<r> o();

    Boolean p();
}
