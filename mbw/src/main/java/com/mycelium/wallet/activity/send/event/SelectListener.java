package com.mycelium.wallet.activity.send.event;

import android.support.v7.widget.RecyclerView;

/**
 * Created by elvis on 31.08.17.
 */

public interface SelectListener {
    void onSelect(RecyclerView.Adapter adapter, int position);
}
