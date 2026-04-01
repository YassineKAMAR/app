package c6;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toast$Callback;
import kotlin.jvm.internal.q;
import s5.j;
import s5.k;

/* JADX INFO: loaded from: classes.dex */
public final class d implements k.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f3477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Toast f3478b;

    public static final class a extends Toast$Callback {
        a() {
        }

        @Override // android.widget.Toast$Callback
        public void onToastHidden() {
            super.onToastHidden();
            d.this.f3478b = null;
        }
    }

    public d(Context context) {
        q.f(context, "context");
        this.f3477a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(d this$0) {
        q.f(this$0, "this$0");
        Toast toast = this$0.f3478b;
        if (toast != null) {
            toast.show();
        }
    }

    @Override // s5.k.c
    public void onMethodCall(j call, k.d result) {
        Toast toast;
        q.f(call, "call");
        q.f(result, "result");
        String str = call.f26252a;
        View view = null;
        if (q.b(str, "showToast")) {
            String strValueOf = String.valueOf(call.a("msg"));
            String strValueOf2 = String.valueOf(call.a("length"));
            String strValueOf3 = String.valueOf(call.a("gravity"));
            Number number = (Number) call.a("bgcolor");
            Number number2 = (Number) call.a("textcolor");
            Number number3 = (Number) call.a("fontSize");
            int i8 = q.b(strValueOf3, "top") ? 48 : q.b(strValueOf3, "center") ? 17 : 80;
            boolean zB = q.b(strValueOf2, "long");
            if (number == null || Build.VERSION.SDK_INT > 31) {
                Toast toastMakeText = Toast.makeText(this.f3477a, strValueOf, zB ? 1 : 0);
                this.f3478b = toastMakeText;
                if (Build.VERSION.SDK_INT <= 31) {
                    if (toastMakeText != null) {
                        try {
                            view = toastMakeText.getView();
                        } catch (Exception unused) {
                        }
                    }
                    q.c(view);
                    View viewFindViewById = view.findViewById(R.id.message);
                    q.e(viewFindViewById, "findViewById(...)");
                    TextView textView = (TextView) viewFindViewById;
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                }
            } else {
                Object systemService = this.f3477a.getSystemService("layout_inflater");
                q.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View viewInflate = ((LayoutInflater) systemService).inflate(g.f3482a, (ViewGroup) null);
                TextView textView2 = (TextView) viewInflate.findViewById(f.f3481a);
                textView2.setText(strValueOf);
                Drawable drawable = this.f3477a.getDrawable(e.f3480a);
                q.c(drawable);
                q.c(drawable);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f3477a);
                this.f3478b = toast2;
                toast2.setDuration(zB ? 1 : 0);
                Toast toast3 = this.f3478b;
                if (toast3 != null) {
                    toast3.setView(viewInflate);
                }
            }
            int i9 = Build.VERSION.SDK_INT;
            if (i9 <= 31) {
                if (i8 != 17) {
                    Toast toast4 = this.f3478b;
                    if (i8 == 48 ? toast4 != null : toast4 != null) {
                        toast4.setGravity(i8, 0, 100);
                    }
                } else {
                    Toast toast5 = this.f3478b;
                    if (toast5 != null) {
                        toast5.setGravity(i8, 0, 0);
                    }
                }
            }
            Context context = this.f3477a;
            if (context instanceof Activity) {
                q.d(context, "null cannot be cast to non-null type android.app.Activity");
                ((Activity) context).runOnUiThread(new Runnable() { // from class: c6.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.c(this.f3476a);
                    }
                });
            } else {
                Toast toast6 = this.f3478b;
                if (toast6 != null) {
                    toast6.show();
                }
            }
            if (i9 >= 30 && (toast = this.f3478b) != null) {
                toast.addCallback(new a());
            }
        } else {
            if (!q.b(str, "cancel")) {
                result.c();
                return;
            }
            Toast toast7 = this.f3478b;
            if (toast7 != null) {
                if (toast7 != null) {
                    toast7.cancel();
                }
                this.f3478b = null;
            }
        }
        result.a(Boolean.TRUE);
    }
}
