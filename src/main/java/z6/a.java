package z6;

import android.os.Looper;
import d7.v;
import java.util.List;
import y6.u1;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {
    @Override // d7.v
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // d7.v
    public u1 b(List<? extends v> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new c(e.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // d7.v
    public int c() {
        return 1073741823;
    }
}
