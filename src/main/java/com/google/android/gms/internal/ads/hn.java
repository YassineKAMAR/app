package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hn extends b3.a {
    public static final Parcelable.Creator<hn> CREATOR = new in();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f8836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f8837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f8838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f8840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8841j;

    hn(String str, long j8, String str2, String str3, String str4, Bundle bundle, boolean z7, long j9, String str5, int i8) {
        this.f8832a = str;
        this.f8833b = j8;
        this.f8834c = str2 == null ? "" : str2;
        this.f8835d = str3 == null ? "" : str3;
        this.f8836e = str4 == null ? "" : str4;
        this.f8837f = bundle == null ? new Bundle() : bundle;
        this.f8838g = z7;
        this.f8839h = j9;
        this.f8840i = str5;
        this.f8841j = i8;
    }

    public static hn g(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                qg0.g("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean zEquals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long j8 = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new hn(queryParameter, j8, host, str, str2, bundle, zEquals, 0L, "", 0);
        } catch (NullPointerException | NumberFormatException e8) {
            qg0.h("Unable to parse Uri into cache offering.", e8);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i8) {
        String str = this.f8832a;
        int iA = b3.c.a(parcel);
        b3.c.q(parcel, 2, str, false);
        b3.c.n(parcel, 3, this.f8833b);
        b3.c.q(parcel, 4, this.f8834c, false);
        b3.c.q(parcel, 5, this.f8835d, false);
        b3.c.q(parcel, 6, this.f8836e, false);
        b3.c.e(parcel, 7, this.f8837f, false);
        b3.c.c(parcel, 8, this.f8838g);
        b3.c.n(parcel, 9, this.f8839h);
        b3.c.q(parcel, 10, this.f8840i, false);
        b3.c.k(parcel, 11, this.f8841j);
        b3.c.b(parcel, iA);
    }
}
