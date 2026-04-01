package androidx.core.provider;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f2093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f2094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<List<byte[]>> f2095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2096e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f2097f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f2092a = (String) androidx.core.util.f.b(str);
        this.f2093b = (String) androidx.core.util.f.b(str2);
        this.f2094c = (String) androidx.core.util.f.b(str3);
        this.f2095d = (List) androidx.core.util.f.b(list);
        this.f2097f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f2095d;
    }

    public int c() {
        return this.f2096e;
    }

    String d() {
        return this.f2097f;
    }

    public String e() {
        return this.f2092a;
    }

    public String f() {
        return this.f2093b;
    }

    public String g() {
        return this.f2094c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2092a + ", mProviderPackage: " + this.f2093b + ", mQuery: " + this.f2094c + ", mCertificates:");
        for (int i8 = 0; i8 < this.f2095d.size(); i8++) {
            sb.append(" [");
            List<byte[]> list = this.f2095d.get(i8);
            for (int i9 = 0; i9 < list.size(); i9++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i9), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2096e);
        return sb.toString();
    }
}
