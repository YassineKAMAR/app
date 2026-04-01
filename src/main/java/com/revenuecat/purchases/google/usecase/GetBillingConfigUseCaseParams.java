package com.revenuecat.purchases.google.usecase;

/* JADX INFO: loaded from: classes.dex */
public final class GetBillingConfigUseCaseParams implements UseCaseParams {
    private final boolean appInBackground;

    public GetBillingConfigUseCaseParams(boolean z7) {
        this.appInBackground = z7;
    }

    public static /* synthetic */ GetBillingConfigUseCaseParams copy$default(GetBillingConfigUseCaseParams getBillingConfigUseCaseParams, boolean z7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z7 = getBillingConfigUseCaseParams.getAppInBackground();
        }
        return getBillingConfigUseCaseParams.copy(z7);
    }

    public final boolean component1() {
        return getAppInBackground();
    }

    public final GetBillingConfigUseCaseParams copy(boolean z7) {
        return new GetBillingConfigUseCaseParams(z7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GetBillingConfigUseCaseParams) && getAppInBackground() == ((GetBillingConfigUseCaseParams) obj).getAppInBackground();
    }

    @Override // com.revenuecat.purchases.google.usecase.UseCaseParams
    public boolean getAppInBackground() {
        return this.appInBackground;
    }

    public int hashCode() {
        boolean appInBackground = getAppInBackground();
        if (appInBackground) {
            return 1;
        }
        return appInBackground ? 1 : 0;
    }

    public String toString() {
        return "GetBillingConfigUseCaseParams(appInBackground=" + getAppInBackground() + ')';
    }
}
