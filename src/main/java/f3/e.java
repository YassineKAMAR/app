package f3;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f21705b = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f21706a = null;

    public static d a(Context context) {
        return f21705b.b(context);
    }

    public final synchronized d b(Context context) {
        if (this.f21706a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f21706a = new d(context);
        }
        return this.f21706a;
    }
}
