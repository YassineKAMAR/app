package n4;

import com.google.auto.value.AutoValue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class m {
    public static m a(String str, List<String> list) {
        return new a(str, list);
    }

    public abstract List<String> b();

    public abstract String c();
}
