package q0;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b extends Closeable {
    void B();

    void C(String str, Object[] objArr);

    Cursor I(String str);

    void L();

    Cursor O(e eVar, CancellationSignal cancellationSignal);

    Cursor T(e eVar);

    String U();

    boolean V();

    void f();

    boolean isOpen();

    List<Pair<String, String>> m();

    void n(String str);

    f s(String str);
}
