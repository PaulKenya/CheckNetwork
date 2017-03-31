package com.ashokslsk.checknet;

import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.ashokslsk.checknetwork.NetworkStateReceiver;

public class MainActivity extends AppCompatActivity implements NetworkStateReceiver.NetworkStateReceiverListener{

    //Network instance
    private NetworkStateReceiver networkStateReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialise the libe
        //Network register
        networkStateReceiver = new NetworkStateReceiver();
        networkStateReceiver.addListener(this);
        this.registerReceiver(networkStateReceiver, new IntentFilter(android.net.ConnectivityManager.CONNECTIVITY_ACTION));


    }

    @Override
    public void networkAvailable() {

        Toast.makeText(MainActivity.this, "Network Available", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void networkUnavailable() {
        Toast.makeText(MainActivity.this, "Network unavailable", Toast.LENGTH_SHORT).show();
    }
}
