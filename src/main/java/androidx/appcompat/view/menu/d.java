package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.k;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class d extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    e f530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f531b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LayoutInflater f534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f535f;

    public d(e eVar, LayoutInflater layoutInflater, boolean z7, int i8) {
        this.f533d = z7;
        this.f534e = layoutInflater;
        this.f530a = eVar;
        this.f535f = i8;
        a();
    }

    void a() {
        g gVarV = this.f530a.v();
        if (gVarV != null) {
            ArrayList<g> arrayListZ = this.f530a.z();
            int size = arrayListZ.size();
            for (int i8 = 0; i8 < size; i8++) {
                if (arrayListZ.get(i8) == gVarV) {
                    this.f531b = i8;
                    return;
                }
            }
        }
        this.f531b = -1;
    }

    public e b() {
        return this.f530a;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public g getItem(int i8) {
        ArrayList<g> arrayListZ = this.f533d ? this.f530a.z() : this.f530a.E();
        int i9 = this.f531b;
        if (i9 >= 0 && i8 >= i9) {
            i8++;
        }
        return arrayListZ.get(i8);
    }

    public void d(boolean z7) {
        this.f532c = z7;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<g> arrayListZ = this.f533d ? this.f530a.z() : this.f530a.E();
        int i8 = this.f531b;
        int size = arrayListZ.size();
        return i8 < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f534e.inflate(this.f535f, viewGroup, false);
        }
        int groupId = getItem(i8).getGroupId();
        int i9 = i8 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f530a.F() && groupId != (i9 >= 0 ? getItem(i9).getGroupId() : groupId));
        k.a aVar = (k.a) view;
        if (this.f532c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i8), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
