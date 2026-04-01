package com.amazon.a.a.i;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import com.amazon.a.a.i.c;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f3693b = new com.amazon.a.a.o.c("SimplePrompt");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f3694e = "OK";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f3695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final a f3696d;

    public enum a {
        LEGACY,
        EXTENDED
    }

    public h(c cVar) {
        this(cVar, a.LEGACY);
    }

    public h(c cVar, a aVar) {
        com.amazon.a.a.o.a.a.a((Object) cVar, "content");
        this.f3695c = cVar;
        this.f3696d = aVar;
        f3693b.a("created SimplePrompt with mode " + aVar);
    }

    private void a(AlertDialog.Builder builder) {
        String[] strArrB = this.f3695c.b();
        if (strArrB.length < 1 || strArrB.length > 2) {
            f3693b.b("Unexpected button count: " + strArrB.length);
            return;
        }
        boolean[] zArrA = a(this.f3695c.c());
        int i8 = -1;
        int i9 = 0;
        for (int i10 = 0; i10 < zArrA.length; i10++) {
            if (zArrA[i10]) {
                i9++;
                i8 = i10;
            }
        }
        com.amazon.a.a.o.c cVar = f3693b;
        if (i9 == 1) {
            cVar.a("single button dialog");
            a(builder, strArrB[i8], i8);
        } else {
            cVar.a("two button dialog");
            builder.setNegativeButton(strArrB[0], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i11) {
                    if (h.this.k()) {
                        h.this.a(0);
                    }
                }
            });
            builder.setPositiveButton(strArrB[1], new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.3
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i11) {
                    if (h.this.k()) {
                        h.this.a(1);
                    }
                }
            });
        }
    }

    private void a(AlertDialog.Builder builder, String str, final int i8) {
        builder.setNeutralButton(str, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.4
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i9) {
                if (h.this.k()) {
                    h.this.a(i8);
                }
            }
        });
    }

    private boolean[] a(c.a[] aVarArr) {
        if (aVarArr == null) {
            return null;
        }
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i8 = 0; i8 < aVarArr.length; i8++) {
            boolean zA = a(aVarArr[i8]);
            zArr[i8] = zA;
            if (!zA) {
                f3693b.a("filterActions() filtering item " + i8);
            }
        }
        return zArr;
    }

    private final Dialog e(Activity activity) {
        f3693b.a("Legacy mode dialog, legacy title = " + this.f3695c.e() + ", extended title = " + this.f3695c.f());
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f3695c.f()).setMessage(this.f3695c.d()).setCancelable(false).setNeutralButton(f3694e, new DialogInterface.OnClickListener() { // from class: com.amazon.a.a.i.h.1
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i8) {
                if (h.this.k()) {
                    h.this.i();
                }
            }
        });
        return builder.create();
    }

    private final Dialog f(Activity activity) {
        com.amazon.a.a.o.c cVar = f3693b;
        cVar.a("doCreate() called to create extended dialog");
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f3695c.f()).setMessage(this.f3695c.d()).setCancelable(false);
        a(builder);
        cVar.a("doCreate() returning");
        return builder.create();
    }

    protected void a(int i8) {
        f3693b.b("extended doAction from base class called, this should never happen.");
        i();
    }

    @Override // com.amazon.a.a.i.b
    protected void a(d dVar) {
        i();
    }

    protected boolean a(c.a aVar) {
        return aVar == c.a.DEFAULT;
    }

    @Override // com.amazon.a.a.i.b
    protected boolean b(Activity activity) {
        return this.f3695c.h();
    }

    @Override // com.amazon.a.a.i.b
    public final Dialog d(Activity activity) {
        return this.f3696d == a.LEGACY ? e(activity) : f(activity);
    }

    protected abstract void i();
}
