package org.tselex.mytaoplan;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by zappa_000 on 20/01/2016.
 */
public class MyPosition {

    public GoogleMap setZoom(GoogleMap googleMap,int intZoom){
        googleMap.moveCamera(CameraUpdateFactory.zoomTo(intZoom));
        return googleMap;
    }
    public GoogleMap setPosition(GoogleMap googleMap,LatLng pos){
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(pos));
        MarkerOptions options = new MarkerOptions()
                .position(pos)
                .title("Ma Position")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_person_pin_circle_black_18dp));

        googleMap.addMarker(options);
        return googleMap;
    }
    /*
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        }*/
}
