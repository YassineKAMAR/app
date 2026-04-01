package u6;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface b<R> extends a {
    R call(Object... objArr);

    R callBy(Map<Object, ? extends Object> map);

    List<Object> getParameters();

    i getReturnType();

    List<Object> getTypeParameters();

    l getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
