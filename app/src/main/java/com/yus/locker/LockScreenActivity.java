package com.yus.locker;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.os.Bundle;

public class LockScreenActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DevicePolicyManager mDevicePolicyManager = (DevicePolicyManager) this.getSystemService(Activity.DEVICE_POLICY_SERVICE);
        finish();
        mDevicePolicyManager.lockNow();
    }
}