package com.revenuecat.purchases.common;

import x6.a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class Delay {
    private static final /* synthetic */ Delay[] $VALUES;
    public static final Delay DEFAULT;
    public static final Delay LONG;
    public static final Delay NONE;
    private final long maxDelay;
    private final long minDelay;

    private static final /* synthetic */ Delay[] $values() {
        return new Delay[]{NONE, DEFAULT, LONG};
    }

    static {
        a.C0190a c0190a = x6.a.f27324b;
        x6.d dVar = x6.d.f27333d;
        NONE = new Delay("NONE", 0, x6.c.s(0, dVar), x6.c.s(0, dVar));
        long jS = x6.c.s(0, dVar);
        DispatcherConstants dispatcherConstants = DispatcherConstants.INSTANCE;
        DEFAULT = new Delay("DEFAULT", 1, jS, dispatcherConstants.m11getJitterDelayUwyO8pc());
        LONG = new Delay("LONG", 2, dispatcherConstants.m11getJitterDelayUwyO8pc(), dispatcherConstants.m12getJitterLongDelayUwyO8pc());
        $VALUES = $values();
    }

    private Delay(String str, int i8, long j8, long j9) {
        this.minDelay = j8;
        this.maxDelay = j9;
    }

    public static Delay valueOf(String str) {
        return (Delay) Enum.valueOf(Delay.class, str);
    }

    public static Delay[] values() {
        return (Delay[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getMaxDelay-UwyO8pc, reason: not valid java name */
    public final long m9getMaxDelayUwyO8pc() {
        return this.maxDelay;
    }

    /* JADX INFO: renamed from: getMinDelay-UwyO8pc, reason: not valid java name */
    public final long m10getMinDelayUwyO8pc() {
        return this.minDelay;
    }
}
