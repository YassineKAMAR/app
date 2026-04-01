package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public final class kt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Pattern f10351a;

    public kt2() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) h2.y.c().b(ns.P6));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f10351a = patternCompile;
    }

    public final String a(String str) {
        Pattern pattern = this.f10351a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
