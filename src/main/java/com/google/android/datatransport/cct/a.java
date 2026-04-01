package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import n1.g;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f4698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f4699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f4700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set<l1.b> f4701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f4702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f4703h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4705b;

    static {
        String strA = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4698c = strA;
        String strA2 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f4699d = strA2;
        String strA3 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4700e = strA3;
        f4701f = Collections.unmodifiableSet(new HashSet(Arrays.asList(l1.b.b("proto"), l1.b.b("json"))));
        f4702g = new a(strA, null);
        f4703h = new a(strA2, strA3);
    }

    public a(String str, String str2) {
        this.f4704a = str;
        this.f4705b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] strArrSplit = str.substring(2).split(Pattern.quote("\\"), 2);
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = strArrSplit[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // n1.g
    public Set<l1.b> a() {
        return f4701f;
    }

    public byte[] b() {
        String str = this.f4705b;
        if (str == null && this.f4704a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f4704a;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f4705b;
    }

    public String e() {
        return this.f4704a;
    }

    @Override // n1.f
    public byte[] getExtras() {
        return b();
    }

    @Override // n1.f
    public String getName() {
        return "cct";
    }
}
