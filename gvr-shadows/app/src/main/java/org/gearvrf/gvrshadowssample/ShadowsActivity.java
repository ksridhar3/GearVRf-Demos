package org.gearvrf.gvrshadowssample;

import org.gearvrf.GVRActivity;

import android.os.Bundle;

public class ShadowsActivity extends GVRActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setMain(new ShadowsMain(), "gvr.xml");
    }

}
