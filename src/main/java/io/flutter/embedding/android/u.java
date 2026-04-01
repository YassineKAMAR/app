package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.a0;
import r5.d;

/* JADX INFO: loaded from: classes.dex */
public class u implements a0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r5.d f22706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0.b f22707b = new a0.b();

    public u(r5.d dVar) {
        this.f22706a = dVar;
    }

    @Override // io.flutter.embedding.android.a0.d
    public void a(KeyEvent keyEvent, final a0.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f22706a.e(new d.b(keyEvent, this.f22707b.a(keyEvent.getUnicodeChar())), action != 0, new d.a() { // from class: io.flutter.embedding.android.t
                @Override // r5.d.a
                public final void a(boolean z7) {
                    aVar.a(z7);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
