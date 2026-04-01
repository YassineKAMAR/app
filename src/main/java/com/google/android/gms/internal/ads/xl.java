package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class xl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ByteArrayOutputStream f17358a = new ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Base64OutputStream f17359b = new Base64OutputStream(this.f17358a, 10);

    public final String toString() {
        String string;
        try {
            this.f17359b.close();
        } catch (IOException e8) {
            qg0.e("HashManager: Unable to convert to Base64.", e8);
        }
        try {
            try {
                this.f17358a.close();
                string = this.f17358a.toString();
            } catch (IOException e9) {
                qg0.e("HashManager: Unable to convert to Base64.", e9);
                string = "";
            }
            return string;
        } finally {
            this.f17358a = null;
            this.f17359b = null;
        }
    }
}
