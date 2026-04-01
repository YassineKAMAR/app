package io.flutter.plugins.webviewflutter;

import io.flutter.plugins.webviewflutter.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l implements n.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k f23481a;

    public l(k kVar) {
        this.f23481a = kVar;
    }

    @Override // io.flutter.plugins.webviewflutter.n.j
    public String a(String str) {
        return this.f23481a.a(str);
    }

    @Override // io.flutter.plugins.webviewflutter.n.j
    public List<String> b(String str) {
        try {
            String[] strArrB = this.f23481a.b(str);
            return strArrB == null ? new ArrayList() : Arrays.asList(strArrB);
        } catch (IOException e8) {
            throw new RuntimeException(e8.getMessage());
        }
    }
}
