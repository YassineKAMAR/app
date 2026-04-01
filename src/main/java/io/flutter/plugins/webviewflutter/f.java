package io.flutter.plugins.webviewflutter;

import android.hardware.display.DisplayManager;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList<DisplayManager.DisplayListener> f23429a;

    class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f23430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DisplayManager f23431b;

        a(ArrayList arrayList, DisplayManager displayManager) {
            this.f23430a = arrayList;
            this.f23431b = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i8) {
            Iterator it = this.f23430a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayAdded(i8);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i8) {
            if (this.f23431b.getDisplay(i8) == null) {
                return;
            }
            Iterator it = this.f23430a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayChanged(i8);
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i8) {
            Iterator it = this.f23430a.iterator();
            while (it.hasNext()) {
                ((DisplayManager.DisplayListener) it.next()).onDisplayRemoved(i8);
            }
        }
    }

    f() {
    }

    private static ArrayList<DisplayManager.DisplayListener> c(DisplayManager displayManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList<>();
        }
        try {
            Field declaredField = DisplayManager.class.getDeclaredField("mGlobal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(displayManager);
            Field declaredField2 = obj.getClass().getDeclaredField("mDisplayListeners");
            declaredField2.setAccessible(true);
            ArrayList arrayList = (ArrayList) declaredField2.get(obj);
            Field field = null;
            ArrayList<DisplayManager.DisplayListener> arrayList2 = new ArrayList<>();
            for (Object obj2 : arrayList) {
                if (field == null) {
                    field = obj2.getClass().getField("mListener");
                    field.setAccessible(true);
                }
                arrayList2.add((DisplayManager.DisplayListener) field.get(obj2));
            }
            return arrayList2;
        } catch (IllegalAccessException | NoSuchFieldException e8) {
            Log.w("DisplayListenerProxy", "Could not extract WebView's display listeners. " + e8);
            return new ArrayList<>();
        }
    }

    void a(DisplayManager displayManager) {
        ArrayList<DisplayManager.DisplayListener> arrayListC = c(displayManager);
        arrayListC.removeAll(this.f23429a);
        if (arrayListC.isEmpty()) {
            return;
        }
        Iterator<DisplayManager.DisplayListener> it = arrayListC.iterator();
        while (it.hasNext()) {
            displayManager.unregisterDisplayListener(it.next());
            displayManager.registerDisplayListener(new a(arrayListC, displayManager), null);
        }
    }

    void b(DisplayManager displayManager) {
        this.f23429a = c(displayManager);
    }
}
