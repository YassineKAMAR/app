package com.revenuecat.purchases.hybridcommon;

import java.util.Map;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class ErrorContainer {
    private final int code;
    private final Map<String, Object> info;
    private final String message;

    public ErrorContainer(int i8, String message, Map<String, ? extends Object> info) {
        q.f(message, "message");
        q.f(info, "info");
        this.code = i8;
        this.message = message;
        this.info = info;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorContainer copy$default(ErrorContainer errorContainer, int i8, String str, Map map, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = errorContainer.code;
        }
        if ((i9 & 2) != 0) {
            str = errorContainer.message;
        }
        if ((i9 & 4) != 0) {
            map = errorContainer.info;
        }
        return errorContainer.copy(i8, str, map);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final Map<String, Object> component3() {
        return this.info;
    }

    public final ErrorContainer copy(int i8, String message, Map<String, ? extends Object> info) {
        q.f(message, "message");
        q.f(info, "info");
        return new ErrorContainer(i8, message, info);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorContainer)) {
            return false;
        }
        ErrorContainer errorContainer = (ErrorContainer) obj;
        return this.code == errorContainer.code && q.b(this.message, errorContainer.message) && q.b(this.info, errorContainer.info);
    }

    public final int getCode() {
        return this.code;
    }

    public final Map<String, Object> getInfo() {
        return this.info;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((this.code * 31) + this.message.hashCode()) * 31) + this.info.hashCode();
    }

    public String toString() {
        return "ErrorContainer(code=" + this.code + ", message=" + this.message + ", info=" + this.info + ')';
    }
}
