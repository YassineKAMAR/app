package d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a<d, androidx.activity.result.a> {
    @Override // d.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, d dVar) {
        return new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", dVar);
    }

    @Override // d.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public androidx.activity.result.a c(int i8, Intent intent) {
        return new androidx.activity.result.a(i8, intent);
    }
}
