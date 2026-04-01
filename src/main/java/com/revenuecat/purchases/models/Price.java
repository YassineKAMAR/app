package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.privacysandbox.ads.adservices.topics.d;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    public static final class Creator implements Parcelable.Creator<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            q.f(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i8) {
            return new Price[i8];
        }
    }

    public Price(String formatted, long j8, String currencyCode) {
        q.f(formatted, "formatted");
        q.f(currencyCode, "currencyCode");
        this.formatted = formatted;
        this.amountMicros = j8;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ Price copy$default(Price price, String str, long j8, String str2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = price.formatted;
        }
        if ((i8 & 2) != 0) {
            j8 = price.amountMicros;
        }
        if ((i8 & 4) != 0) {
            str2 = price.currencyCode;
        }
        return price.copy(str, j8, str2);
    }

    public final String component1() {
        return this.formatted;
    }

    public final long component2() {
        return this.amountMicros;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final Price copy(String formatted, long j8, String currencyCode) {
        q.f(formatted, "formatted");
        q.f(currencyCode, "currencyCode");
        return new Price(formatted, j8, currencyCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return q.b(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && q.b(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        return (((this.formatted.hashCode() * 31) + d.a(this.amountMicros)) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Price(formatted=" + this.formatted + ", amountMicros=" + this.amountMicros + ", currencyCode=" + this.currencyCode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        out.writeString(this.formatted);
        out.writeLong(this.amountMicros);
        out.writeString(this.currencyCode);
    }
}
