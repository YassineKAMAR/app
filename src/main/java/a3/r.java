package a3;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f161b;

    public r(Context context) {
        o.j(context);
        Resources resources = context.getResources();
        this.f160a = resources;
        this.f161b = resources.getResourcePackageName(x2.k.f27280a);
    }

    public String a(String str) {
        int identifier = this.f160a.getIdentifier(str, "string", this.f161b);
        if (identifier == 0) {
            return null;
        }
        return this.f160a.getString(identifier);
    }
}
