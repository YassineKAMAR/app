package o1;

import android.content.Context;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class h {
    public static h a(Context context, x1.a aVar, x1.a aVar2, String str) {
        return new c(context, aVar, aVar2, str);
    }

    public abstract Context b();

    public abstract String c();

    public abstract x1.a d();

    public abstract x1.a e();
}
