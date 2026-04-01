package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f1939a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f1940b;

    public interface a {
        Intent c();
    }

    private s0(Context context) {
        this.f1940b = context;
    }

    public static s0 i(Context context) {
        return new s0(context);
    }

    public s0 a(Intent intent) {
        this.f1939a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s0 e(Activity activity) {
        Intent intentC = activity instanceof a ? ((a) activity).c() : null;
        if (intentC == null) {
            intentC = n.a(activity);
        }
        if (intentC != null) {
            ComponentName component = intentC.getComponent();
            if (component == null) {
                component = intentC.resolveActivity(this.f1940b.getPackageManager());
            }
            g(component);
            a(intentC);
        }
        return this;
    }

    public s0 g(ComponentName componentName) {
        int size = this.f1939a.size();
        try {
            Context context = this.f1940b;
            while (true) {
                Intent intentB = n.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f1939a.add(size, intentB);
                context = this.f1940b;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e8);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f1939a.iterator();
    }

    public void n() {
        p(null);
    }

    public void p(Bundle bundle) {
        if (this.f1939a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1939a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.l(this.f1940b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f1940b.startActivity(intent);
    }
}
