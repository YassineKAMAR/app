package com.revenuecat.purchases.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Date;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Transaction implements Parcelable {
    public static final Parcelable.Creator<Transaction> CREATOR = new Creator();
    private final String productId;
    private final String productIdentifier;
    private final Date purchaseDate;
    private final String revenuecatId;
    private final String transactionIdentifier;

    public static final class Creator implements Parcelable.Creator<Transaction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction createFromParcel(Parcel parcel) {
            q.f(parcel, "parcel");
            return new Transaction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Date) parcel.readSerializable());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Transaction[] newArray(int i8) {
            return new Transaction[i8];
        }
    }

    public Transaction(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate) {
        q.f(transactionIdentifier, "transactionIdentifier");
        q.f(revenuecatId, "revenuecatId");
        q.f(productIdentifier, "productIdentifier");
        q.f(productId, "productId");
        q.f(purchaseDate, "purchaseDate");
        this.transactionIdentifier = transactionIdentifier;
        this.revenuecatId = revenuecatId;
        this.productIdentifier = productIdentifier;
        this.productId = productId;
        this.purchaseDate = purchaseDate;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Transaction(String productId, JSONObject jsonObject) throws JSONException {
        q.f(productId, "productId");
        q.f(jsonObject, "jsonObject");
        String string = jsonObject.getString("id");
        q.e(string, "jsonObject.getString(\"id\")");
        String string2 = jsonObject.getString("id");
        q.e(string2, "jsonObject.getString(\"id\")");
        this(string, string2, productId, productId, JSONObjectExtensionsKt.getDate(jsonObject, "purchase_date"));
    }

    public static /* synthetic */ Transaction copy$default(Transaction transaction, String str, String str2, String str3, String str4, Date date, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = transaction.transactionIdentifier;
        }
        if ((i8 & 2) != 0) {
            str2 = transaction.revenuecatId;
        }
        String str5 = str2;
        if ((i8 & 4) != 0) {
            str3 = transaction.productIdentifier;
        }
        String str6 = str3;
        if ((i8 & 8) != 0) {
            str4 = transaction.productId;
        }
        String str7 = str4;
        if ((i8 & 16) != 0) {
            date = transaction.purchaseDate;
        }
        return transaction.copy(str, str5, str6, str7, date);
    }

    public static /* synthetic */ void getProductId$annotations() {
    }

    public static /* synthetic */ void getRevenuecatId$annotations() {
    }

    public final String component1() {
        return this.transactionIdentifier;
    }

    public final String component2() {
        return this.revenuecatId;
    }

    public final String component3() {
        return this.productIdentifier;
    }

    public final String component4() {
        return this.productId;
    }

    public final Date component5() {
        return this.purchaseDate;
    }

    public final Transaction copy(String transactionIdentifier, String revenuecatId, String productIdentifier, String productId, Date purchaseDate) {
        q.f(transactionIdentifier, "transactionIdentifier");
        q.f(revenuecatId, "revenuecatId");
        q.f(productIdentifier, "productIdentifier");
        q.f(productId, "productId");
        q.f(purchaseDate, "purchaseDate");
        return new Transaction(transactionIdentifier, revenuecatId, productIdentifier, productId, purchaseDate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Transaction)) {
            return false;
        }
        Transaction transaction = (Transaction) obj;
        return q.b(this.transactionIdentifier, transaction.transactionIdentifier) && q.b(this.revenuecatId, transaction.revenuecatId) && q.b(this.productIdentifier, transaction.productIdentifier) && q.b(this.productId, transaction.productId) && q.b(this.purchaseDate, transaction.purchaseDate);
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    public final Date getPurchaseDate() {
        return this.purchaseDate;
    }

    public final String getRevenuecatId() {
        return this.revenuecatId;
    }

    public final String getTransactionIdentifier() {
        return this.transactionIdentifier;
    }

    public int hashCode() {
        return (((((((this.transactionIdentifier.hashCode() * 31) + this.revenuecatId.hashCode()) * 31) + this.productIdentifier.hashCode()) * 31) + this.productId.hashCode()) * 31) + this.purchaseDate.hashCode();
    }

    public String toString() {
        return "Transaction(transactionIdentifier=" + this.transactionIdentifier + ", revenuecatId=" + this.revenuecatId + ", productIdentifier=" + this.productIdentifier + ", productId=" + this.productId + ", purchaseDate=" + this.purchaseDate + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        q.f(out, "out");
        out.writeString(this.transactionIdentifier);
        out.writeString(this.revenuecatId);
        out.writeString(this.productIdentifier);
        out.writeString(this.productId);
        out.writeSerializable(this.purchaseDate);
    }
}
