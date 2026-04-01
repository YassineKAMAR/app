package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f8152c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8153a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8154b = -1;

    private final boolean c(String str) {
        Matcher matcher = f8152c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i8 = nz2.f12300a;
            int i9 = Integer.parseInt(strGroup, 16);
            int i10 = Integer.parseInt(matcher.group(2), 16);
            if (i9 <= 0 && i10 <= 0) {
                return false;
            }
            this.f8153a = i9;
            this.f8154b = i10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final boolean a() {
        return (this.f8153a == -1 || this.f8154b == -1) ? false : true;
    }

    public final boolean b(td0 td0Var) {
        for (int i8 = 0; i8 < td0Var.b(); i8++) {
            tc0 tc0VarC = td0Var.c(i8);
            if (tc0VarC instanceof h4) {
                h4 h4Var = (h4) tc0VarC;
                if ("iTunSMPB".equals(h4Var.f8620c) && c(h4Var.f8621d)) {
                    return true;
                }
            } else if (tc0VarC instanceof q4) {
                q4 q4Var = (q4) tc0VarC;
                if ("com.apple.iTunes".equals(q4Var.f13260b) && "iTunSMPB".equals(q4Var.f13261c) && c(q4Var.f13262d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
