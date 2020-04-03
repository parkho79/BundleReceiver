package com.parkho.receiver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.parkho.BundleKey;

public class PhReceiverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = getIntent().getBundleExtra("Bundle");
        if (bundle == null) {
            return;
        }

        ((TextView) findViewById(R.id.tv_name_data)).setText(bundle.getString(BundleKey.SHARE_NAME));

        ((TextView) findViewById(R.id.tv_number_data)).setText(String.valueOf(bundle.getInt(BundleKey.SHARE_NUMBER)));

        ((TextView) findViewById(R.id.tv_parcelable_data)).setText(String.valueOf(bundle.getBoolean(BundleKey.SHARE_BUNDLE)));
    }
}
