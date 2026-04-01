package b0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LayoutInflater f3267k;

    @Deprecated
    public c(Context context, int i8, Cursor cursor, boolean z7) {
        super(context, cursor, z7);
        this.f3266j = i8;
        this.f3265i = i8;
        this.f3267k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // b0.a
    public View f(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3267k.inflate(this.f3266j, viewGroup, false);
    }

    @Override // b0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f3267k.inflate(this.f3265i, viewGroup, false);
    }
}
