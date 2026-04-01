package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
final class bm0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f5875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ EditText f5876b;

    bm0(JsPromptResult jsPromptResult, EditText editText) {
        this.f5875a = jsPromptResult;
        this.f5876b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i8) {
        this.f5875a.confirm(this.f5876b.getText().toString());
    }
}
