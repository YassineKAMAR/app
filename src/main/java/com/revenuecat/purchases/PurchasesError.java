package com.revenuecat.purchases;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes.dex */
public final class PurchasesError implements Parcelable {
    public static final Parcelable.Creator<PurchasesError> CREATOR = new Creator();
    private final PurchasesErrorCode code;
    private final String message;
    private final String underlyingErrorMessage;

    public static final class Creator implements Parcelable.Creator<PurchasesError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError createFromParcel(Parcel parcel) {
            q.f(parcel, "parcel");
            return new PurchasesError(PurchasesErrorCode.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError[] newArray(int i8) {
            return new PurchasesError[i8];
        }
    }

    public PurchasesError(PurchasesErrorCode code, String str) {
        q.f(code, "code");
        this.code = code;
        this.underlyingErrorMessage = str;
        this.message = code.getDescription();
    }

    public /* synthetic */ PurchasesError(PurchasesErrorCode purchasesErrorCode, String str, int i8, j jVar) {
        this(purchasesErrorCode, (i8 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PurchasesErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    public String toString() {
        return "PurchasesError(code=" + this.code + ", underlyingErrorMessage=" + this.underlyingErrorMessage + ", message='" + this.message + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        out.writeString(this.code.name());
        out.writeString(this.underlyingErrorMessage);
    }
}
