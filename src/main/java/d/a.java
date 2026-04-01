package d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<I, O> {

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static final class C0099a<T> {
    }

    public abstract Intent a(Context context, @SuppressLint({"UnknownNullness"}) I i8);

    public C0099a<O> b(Context context, @SuppressLint({"UnknownNullness"}) I i8) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract O c(int i8, Intent intent);
}
