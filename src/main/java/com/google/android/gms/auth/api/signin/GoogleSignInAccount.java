package com.google.android.gms.auth.api.signin;

import a3.o;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import b3.c;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import e3.e;
import e3.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends b3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static e f4767n = h.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f4769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f4770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f4771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f4772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f4773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f4774g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f4775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f4776i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<Scope> f4777j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f4778k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f4779l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set<Scope> f4780m = new HashSet();

    GoogleSignInAccount(int i8, String str, String str2, String str3, String str4, Uri uri, String str5, long j8, String str6, List<Scope> list, String str7, String str8) {
        this.f4768a = i8;
        this.f4769b = str;
        this.f4770c = str2;
        this.f4771d = str3;
        this.f4772e = str4;
        this.f4773f = uri;
        this.f4774g = str5;
        this.f4775h = j8;
        this.f4776i = str6;
        this.f4777j = list;
        this.f4778k = str7;
        this.f4779l = str8;
    }

    public static GoogleSignInAccount A(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l8, String str7, Set<Scope> set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l8.longValue(), o.f(str7), new ArrayList((Collection) o.j(set)), str5, str6);
    }

    public static GoogleSignInAccount B(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j8 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i8 = 0; i8 < length; i8++) {
            hashSet.add(new Scope(jSONArray.getString(i8)));
        }
        GoogleSignInAccount googleSignInAccountA = A(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j8), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountA.f4774g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountA;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f4776i.equals(this.f4776i) && googleSignInAccount.y().equals(y());
    }

    public Account g() {
        String str = this.f4771d;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public int hashCode() {
        return ((this.f4776i.hashCode() + 527) * 31) + y().hashCode();
    }

    public String i() {
        return this.f4772e;
    }

    public String n() {
        return this.f4771d;
    }

    public String p() {
        return this.f4779l;
    }

    public String u() {
        return this.f4778k;
    }

    public String v() {
        return this.f4769b;
    }

    public String w() {
        return this.f4770c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        int iA = c.a(parcel);
        c.k(parcel, 1, this.f4768a);
        c.q(parcel, 2, v(), false);
        c.q(parcel, 3, w(), false);
        c.q(parcel, 4, n(), false);
        c.q(parcel, 5, i(), false);
        c.p(parcel, 6, x(), i8, false);
        c.q(parcel, 7, z(), false);
        c.n(parcel, 8, this.f4775h);
        c.q(parcel, 9, this.f4776i, false);
        c.u(parcel, 10, this.f4777j, false);
        c.q(parcel, 11, u(), false);
        c.q(parcel, 12, p(), false);
        c.b(parcel, iA);
    }

    public Uri x() {
        return this.f4773f;
    }

    public Set<Scope> y() {
        HashSet hashSet = new HashSet(this.f4777j);
        hashSet.addAll(this.f4780m);
        return hashSet;
    }

    public String z() {
        return this.f4774g;
    }
}
