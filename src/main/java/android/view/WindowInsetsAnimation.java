package android.view;

import android.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WindowInsetsAnimation {

    public /* synthetic */ class Callback {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Callback(int i8) {
        }

        @NonNull
        public native /* synthetic */ Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull Bounds bounds);
    }

    static {
        throw new NoClassDefFoundError();
    }

    public native /* synthetic */ int getTypeMask();
}
