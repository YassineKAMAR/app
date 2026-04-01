package com.revenuecat.purchases.common;

import com.revenuecat.purchases.LogLevel;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Config {
    public static final String frameworkVersion = "7.4.0";
    public static final Config INSTANCE = new Config();
    private static LogLevel logLevel = LogUtilsKt.debugLogsEnabled(LogLevel.Companion, false);

    private Config() {
    }

    public final LogLevel getLogLevel() {
        return logLevel;
    }

    public final void setLogLevel(LogLevel logLevel2) {
        q.f(logLevel2, "<set-?>");
        logLevel = logLevel2;
    }
}
