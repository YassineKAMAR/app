package m3;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f24772a;

    /* synthetic */ m(l lVar) {
    }

    public final v0 a() {
        n2.b(this.f24772a, Application.class);
        return new k(this.f24772a, null);
    }

    public final m b(Application application) {
        application.getClass();
        this.f24772a = application;
        return this;
    }
}
