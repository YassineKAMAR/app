package x0;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f27192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Notification f27194c;

    public e(int i8, Notification notification, int i9) {
        this.f27192a = i8;
        this.f27194c = notification;
        this.f27193b = i9;
    }

    public int a() {
        return this.f27193b;
    }

    public Notification b() {
        return this.f27194c;
    }

    public int c() {
        return this.f27192a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f27192a == eVar.f27192a && this.f27193b == eVar.f27193b) {
            return this.f27194c.equals(eVar.f27194c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f27192a * 31) + this.f27193b) * 31) + this.f27194c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f27192a + ", mForegroundServiceType=" + this.f27193b + ", mNotification=" + this.f27194c + '}';
    }
}
