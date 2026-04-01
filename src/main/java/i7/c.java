package i7;

import java.util.List;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f22566a;

    public c(List<String> missingFields, String serialName) {
        StringBuilder sb;
        String str;
        q.f(missingFields, "missingFields");
        q.f(serialName, "serialName");
        if (missingFields.size() == 1) {
            sb = new StringBuilder();
            sb.append("Field '");
            sb.append(missingFields.get(0));
            sb.append("' is required for type with serial name '");
            sb.append(serialName);
            str = "', but it was missing";
        } else {
            sb = new StringBuilder();
            sb.append("Fields ");
            sb.append(missingFields);
            sb.append(" are required for type with serial name '");
            sb.append(serialName);
            str = "', but they were missing";
        }
        sb.append(str);
        this(missingFields, sb.toString(), null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List<String> missingFields, String str, Throwable th) {
        super(str, th);
        q.f(missingFields, "missingFields");
        this.f22566a = missingFields;
    }

    public final List<String> a() {
        return this.f22566a;
    }
}
