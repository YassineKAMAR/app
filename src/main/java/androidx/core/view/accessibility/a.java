package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f2139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2140c;

    public a(int i8, f fVar, int i9) {
        this.f2138a = i8;
        this.f2139b = fVar;
        this.f2140c = i9;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2138a);
        this.f2139b.F(this.f2140c, bundle);
    }
}
