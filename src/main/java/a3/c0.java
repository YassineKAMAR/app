package a3;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
final class c0 extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f51a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ z2.e f52b;

    c0(Intent intent, z2.e eVar, int i8) {
        this.f51a = intent;
        this.f52b = eVar;
    }

    @Override // a3.d0
    public final void a() {
        Intent intent = this.f51a;
        if (intent != null) {
            this.f52b.startActivityForResult(intent, 2);
        }
    }
}
