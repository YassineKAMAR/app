package p3;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f25609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f25610b;

    public p(Context context, String str) {
        a3.o.j(context);
        this.f25609a = context.getResources();
        if (TextUtils.isEmpty(str)) {
            this.f25610b = a(context);
        } else {
            this.f25610b = str;
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(x2.k.f27280a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f25609a.getIdentifier(str, "string", this.f25610b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f25609a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
