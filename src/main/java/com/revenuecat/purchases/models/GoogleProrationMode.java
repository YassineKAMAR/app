package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ProrationMode;
import e6.p;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public enum GoogleProrationMode implements ProrationMode {
    IMMEDIATE_WITHOUT_PRORATION(3),
    IMMEDIATE_WITH_TIME_PRORATION(1),
    IMMEDIATE_AND_CHARGE_FULL_PRICE(5),
    IMMEDIATE_AND_CHARGE_PRORATED_PRICE(2);

    public static final CREATOR CREATOR = new CREATOR(null);
    private final int playBillingClientMode;

    public static final class CREATOR implements Parcelable.Creator<GoogleProrationMode> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(j jVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleProrationMode createFromParcel(Parcel in) {
            q.f(in, "in");
            String string = in.readString();
            if (string != null) {
                return GoogleProrationMode.valueOf(string);
            }
            return null;
        }

        public final GoogleProrationMode fromPlayBillingClientMode(Integer num) {
            if (num == null) {
                return null;
            }
            num.intValue();
            for (GoogleProrationMode googleProrationMode : GoogleProrationMode.values()) {
                if (num.intValue() == googleProrationMode.getPlayBillingClientMode()) {
                    return googleProrationMode;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleProrationMode[] newArray(int i8) {
            return new GoogleProrationMode[i8];
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleProrationMode.values().length];
            try {
                iArr[GoogleProrationMode.IMMEDIATE_WITHOUT_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoogleProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    GoogleProrationMode(int i8) {
        this.playBillingClientMode = i8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final GoogleReplacementMode getAsGoogleReplacementMode$purchases_defaultsRelease() {
        int i8 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i8 == 1) {
            return GoogleReplacementMode.WITHOUT_PRORATION;
        }
        if (i8 == 2) {
            return GoogleReplacementMode.WITH_TIME_PRORATION;
        }
        if (i8 == 3) {
            return GoogleReplacementMode.CHARGE_FULL_PRICE;
        }
        if (i8 == 4) {
            return GoogleReplacementMode.CHARGE_PRORATED_PRICE;
        }
        throw new p();
    }

    @Override // com.revenuecat.purchases.ProrationMode
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        out.writeString(name());
    }
}
