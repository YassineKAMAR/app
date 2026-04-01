package y2;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected final Status f27426a;

    public b(Status status) {
        super(status.i() + ": " + (status.n() != null ? status.n() : ""));
        this.f27426a = status;
    }

    public Status a() {
        return this.f27426a;
    }

    public int b() {
        return this.f27426a.i();
    }
}
