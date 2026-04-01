package io.flutter.plugins.webviewflutter;

import android.content.res.AssetManager;
import l5.a;

/* JADX INFO: loaded from: classes.dex */
abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final AssetManager f23473a;

    static class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a.InterfaceC0144a f23474b;

        a(AssetManager assetManager, a.InterfaceC0144a interfaceC0144a) {
            super(assetManager);
            this.f23474b = interfaceC0144a;
        }

        @Override // io.flutter.plugins.webviewflutter.k
        public String a(String str) {
            return this.f23474b.a(str);
        }
    }

    public k(AssetManager assetManager) {
        this.f23473a = assetManager;
    }

    abstract String a(String str);

    public String[] b(String str) {
        return this.f23473a.list(str);
    }
}
