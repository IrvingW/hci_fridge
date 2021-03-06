package io.appetizer.hci_fridge.util;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import io.appetizer.hci_fridge.R;

public class ItemClickSupport implements RecyclerView.OnChildAttachStateChangeListener {

    private View.OnClickListener mItemClickListener = null;
    private View.OnLongClickListener mItemLongClickListener = null;
    private RecyclerView mRecyclerView = null;

    public ItemClickSupport(RecyclerView view, View.OnClickListener listener,
                                    View.OnLongClickListener listener2){
        mRecyclerView = view;
        mItemClickListener = listener;
        mItemLongClickListener = listener2;
        view.addOnChildAttachStateChangeListener(this);
    }

    @Override
    public void onChildViewAttachedToWindow(View view) {
        if (mItemClickListener != null){
            view.setOnClickListener(mItemClickListener);
        }
        if (mItemLongClickListener != null){
            view.setOnLongClickListener(mItemLongClickListener);
        }
    }

    @Override
    public void onChildViewDetachedFromWindow(View view) {

    }

}
