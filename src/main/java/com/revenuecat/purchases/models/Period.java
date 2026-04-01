package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.LogUtilsKt;
import e6.p;
import e6.r;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Period implements Parcelable {
    private static final double DAYS_PER_MONTH = 30.0d;
    private static final double DAYS_PER_WEEK = 7.0d;
    private static final double DAYS_PER_YEAR = 365.0d;
    private static final double MONTHS_PER_YEAR = 12.0d;
    private static final double WEEKS_PER_MONTH = 4.345238095238096d;
    private static final double WEEKS_PER_YEAR = 52.142857142857146d;
    private final String iso8601;
    private final Unit unit;
    private final int value;
    public static final Factory Factory = new Factory(null);
    public static final Parcelable.Creator<Period> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Period> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period createFromParcel(Parcel parcel) {
            q.f(parcel, "parcel");
            return new Period(parcel.readInt(), Unit.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Period[] newArray(int i8) {
            return new Period[i8];
        }
    }

    public static final class Factory {
        private Factory() {
        }

        public /* synthetic */ Factory(j jVar) {
            this();
        }

        public final Period create(String iso8601) {
            q.f(iso8601, "iso8601");
            r period = PeriodKt.toPeriod(iso8601);
            return new Period(((Number) period.c()).intValue(), (Unit) period.d(), iso8601);
        }
    }

    public enum Unit {
        DAY,
        WEEK,
        MONTH,
        YEAR,
        UNKNOWN
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Unit.values().length];
            try {
                iArr[Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Period(int i8, Unit unit, String iso8601) {
        q.f(unit, "unit");
        q.f(iso8601, "iso8601");
        this.value = i8;
        this.unit = unit;
        this.iso8601 = iso8601;
    }

    public static /* synthetic */ Period copy$default(Period period, int i8, Unit unit, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = period.value;
        }
        if ((i9 & 2) != 0) {
            unit = period.unit;
        }
        if ((i9 & 4) != 0) {
            str = period.iso8601;
        }
        return period.copy(i8, unit, str);
    }

    public final int component1() {
        return this.value;
    }

    public final Unit component2() {
        return this.unit;
    }

    public final String component3() {
        return this.iso8601;
    }

    public final Period copy(int i8, Unit unit, String iso8601) {
        q.f(unit, "unit");
        q.f(iso8601, "iso8601");
        return new Period(i8, unit, iso8601);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Period)) {
            return false;
        }
        Period period = (Period) obj;
        return this.value == period.value && this.unit == period.unit && q.b(this.iso8601, period.iso8601);
    }

    public final String getIso8601() {
        return this.iso8601;
    }

    public final Unit getUnit() {
        return this.unit;
    }

    public final int getValue() {
        return this.value;
    }

    public final double getValueInMonths() {
        double d8;
        double d9;
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i8 == 1) {
            d8 = this.value;
            d9 = DAYS_PER_MONTH;
        } else {
            if (i8 != 2) {
                if (i8 == 3) {
                    return this.value;
                }
                if (i8 == 4) {
                    return ((double) this.value) * MONTHS_PER_YEAR;
                }
                if (i8 != 5) {
                    throw new p();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d8 = this.value;
            d9 = WEEKS_PER_MONTH;
        }
        return d8 / d9;
    }

    public final double getValueInWeeks$purchases_defaultsRelease() {
        double d8;
        double d9;
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i8 == 1) {
            return ((double) this.value) / DAYS_PER_WEEK;
        }
        if (i8 == 2) {
            return this.value;
        }
        if (i8 == 3) {
            d8 = this.value;
            d9 = WEEKS_PER_MONTH;
        } else {
            if (i8 != 4) {
                if (i8 != 5) {
                    throw new p();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d8 = this.value;
            d9 = WEEKS_PER_YEAR;
        }
        return d8 * d9;
    }

    public final double getValueInYears$purchases_defaultsRelease() {
        double d8;
        double d9;
        int i8 = WhenMappings.$EnumSwitchMapping$0[this.unit.ordinal()];
        if (i8 == 1) {
            d8 = this.value;
            d9 = DAYS_PER_YEAR;
        } else if (i8 == 2) {
            d8 = this.value;
            d9 = WEEKS_PER_YEAR;
        } else {
            if (i8 != 3) {
                if (i8 == 4) {
                    return this.value;
                }
                if (i8 != 5) {
                    throw new p();
                }
                LogUtilsKt.errorLog$default("Unknown period unit trying to get value in months: " + this.unit, null, 2, null);
                return 0.0d;
            }
            d8 = this.value;
            d9 = MONTHS_PER_YEAR;
        }
        return d8 / d9;
    }

    public int hashCode() {
        return (((this.value * 31) + this.unit.hashCode()) * 31) + this.iso8601.hashCode();
    }

    public String toString() {
        return "Period(value=" + this.value + ", unit=" + this.unit + ", iso8601=" + this.iso8601 + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        out.writeInt(this.value);
        out.writeString(this.unit.name());
        out.writeString(this.iso8601);
    }
}
