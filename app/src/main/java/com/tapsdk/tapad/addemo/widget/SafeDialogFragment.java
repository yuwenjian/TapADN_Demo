package com.tapsdk.tapad.addemo.widget;

import android.app.DialogFragment;
import android.os.Bundle;

public class SafeDialogFragment extends DialogFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        try {
            super.onActivityCreated(savedInstanceState);
        } catch (Exception e) {
        }
    }
}
