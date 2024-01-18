package com.example.mruto.cashflow.viewmodel;

/**
 * Created by MRUTO on 3/29/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.IntentCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.MenuItem;

import com.example.mruto.cashflow.R;
import com.example.mruto.cashflow.view.StartScreenActivity;

public class NavigationViewClass {

    private Context context;

    public NavigationViewClass(Context _context){
        this.context = _context;
    }

    public void onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_exit) {
            Intent newActivity = new Intent(context, StartScreenActivity.class);

            newActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | IntentCompat.FLAG_ACTIVITY_CLEAR_TASK);

            context.startActivity(newActivity);

        }
    }
}
