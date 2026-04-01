package c4;

import a3.n;
import a3.o;
import a3.r;
import android.content.Context;
import android.text.TextUtils;
import e3.q;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f3458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f3463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f3464g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3465a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f3466b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3467c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f3468d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3469e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f3470f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f3471g;

        public l a() {
            return new l(this.f3466b, this.f3465a, this.f3467c, this.f3468d, this.f3469e, this.f3470f, this.f3471g);
        }

        public b b(String str) {
            this.f3465a = o.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f3466b = o.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f3467c = str;
            return this;
        }

        public b e(String str) {
            this.f3468d = str;
            return this;
        }

        public b f(String str) {
            this.f3469e = str;
            return this;
        }

        public b g(String str) {
            this.f3471g = str;
            return this;
        }

        public b h(String str) {
            this.f3470f = str;
            return this;
        }
    }

    private l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.n(!q.a(str), "ApplicationId must be set.");
        this.f3459b = str;
        this.f3458a = str2;
        this.f3460c = str3;
        this.f3461d = str4;
        this.f3462e = str5;
        this.f3463f = str6;
        this.f3464g = str7;
    }

    public static l a(Context context) {
        r rVar = new r(context);
        String strA = rVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new l(strA, rVar.a("google_api_key"), rVar.a("firebase_database_url"), rVar.a("ga_trackingId"), rVar.a("gcm_defaultSenderId"), rVar.a("google_storage_bucket"), rVar.a("project_id"));
    }

    public String b() {
        return this.f3458a;
    }

    public String c() {
        return this.f3459b;
    }

    public String d() {
        return this.f3460c;
    }

    public String e() {
        return this.f3461d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return n.a(this.f3459b, lVar.f3459b) && n.a(this.f3458a, lVar.f3458a) && n.a(this.f3460c, lVar.f3460c) && n.a(this.f3461d, lVar.f3461d) && n.a(this.f3462e, lVar.f3462e) && n.a(this.f3463f, lVar.f3463f) && n.a(this.f3464g, lVar.f3464g);
    }

    public String f() {
        return this.f3462e;
    }

    public String g() {
        return this.f3464g;
    }

    public String h() {
        return this.f3463f;
    }

    public int hashCode() {
        return n.b(this.f3459b, this.f3458a, this.f3460c, this.f3461d, this.f3462e, this.f3463f, this.f3464g);
    }

    public String toString() {
        return n.c(this).a("applicationId", this.f3459b).a("apiKey", this.f3458a).a("databaseUrl", this.f3460c).a("gcmSenderId", this.f3462e).a("storageBucket", this.f3463f).a("projectId", this.f3464g).toString();
    }
}
