package a3;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class b0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f20a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f21b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f22c;

    b0(Intent intent, Activity activity, int i8) {
        this.f20a = intent;
        this.f21b = activity;
        this.f22c = i8;
    }

    @Override // a3.d0
    public final void a() {
        Intent intent = this.f20a;
        if (intent != null) {
            this.f21b.startActivityForResult(intent, this.f22c);
        }
    }
}
