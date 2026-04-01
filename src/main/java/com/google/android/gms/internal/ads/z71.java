package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class z71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f18068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f18069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f18070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f18071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f18074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final jb3 f18075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final jb3 f18076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f18077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f18078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final jb3 f18079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private jb3 f18080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final HashMap f18082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final HashSet f18083p;

    @Deprecated
    public z71() {
        this.f18068a = Integer.MAX_VALUE;
        this.f18069b = Integer.MAX_VALUE;
        this.f18070c = Integer.MAX_VALUE;
        this.f18071d = Integer.MAX_VALUE;
        this.f18072e = Integer.MAX_VALUE;
        this.f18073f = Integer.MAX_VALUE;
        this.f18074g = true;
        this.f18075h = jb3.z();
        this.f18076i = jb3.z();
        this.f18077j = Integer.MAX_VALUE;
        this.f18078k = Integer.MAX_VALUE;
        this.f18079l = jb3.z();
        this.f18080m = jb3.z();
        this.f18081n = 0;
        this.f18082o = new HashMap();
        this.f18083p = new HashSet();
    }

    protected z71(a91 a91Var) {
        this.f18068a = Integer.MAX_VALUE;
        this.f18069b = Integer.MAX_VALUE;
        this.f18070c = Integer.MAX_VALUE;
        this.f18071d = Integer.MAX_VALUE;
        this.f18072e = a91Var.f5106i;
        this.f18073f = a91Var.f5107j;
        this.f18074g = a91Var.f5108k;
        this.f18075h = a91Var.f5109l;
        this.f18076i = a91Var.f5111n;
        this.f18077j = Integer.MAX_VALUE;
        this.f18078k = Integer.MAX_VALUE;
        this.f18079l = a91Var.f5115r;
        this.f18080m = a91Var.f5117t;
        this.f18081n = a91Var.f5118u;
        this.f18083p = new HashSet(a91Var.A);
        this.f18082o = new HashMap(a91Var.f5123z);
    }

    public final z71 d(Context context) {
        CaptioningManager captioningManager;
        if ((nz2.f12300a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
            this.f18081n = 1088;
            Locale locale = captioningManager.getLocale();
            if (locale != null) {
                this.f18080m = jb3.A(nz2.L(locale));
            }
        }
        return this;
    }

    public z71 e(int i8, int i9, boolean z7) {
        this.f18072e = i8;
        this.f18073f = i9;
        this.f18074g = true;
        return this;
    }
}
