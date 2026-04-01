package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class l6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p.a<String, Uri> f18920a = new p.a<>();

    public static synchronized Uri a(String str) {
        Uri uri;
        p.a<String, Uri> aVar = f18920a;
        uri = aVar.get(str);
        if (uri == null) {
            uri = Uri.parse("content://com.google.android.gms.phenotype/" + Uri.encode(str));
            aVar.put(str, uri);
        }
        return uri;
    }

    public static String b(Context context, String str) {
        if (str.contains("#")) {
            throw new IllegalArgumentException("The passed in package cannot already have a subpackage: " + str);
        }
        return str + "#" + context.getPackageName();
    }
}
