package org.tselex.mytaoplan;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

/**
 * Created by zappa_000 on 20/01/2016.
 */
public class Bus9 {


    public GoogleMap setlineBus9(GoogleMap googleMap){



        
        PolylineOptions polyLine = new PolylineOptions();
        googleMap.addPolyline(polyLine
                        .add(
                                new LatLng(47.906433, 1.905947),
                                new LatLng(47.904649, 1.913296),
                                new LatLng(47.906720, 1.914272),
                                new LatLng(47.908166, 1.914122),
                                new LatLng(47.919787, 1.917931),
                                new LatLng(47.919988, 1.914787),
                                new LatLng(47.922576, 1.914315),
                                new LatLng(47.924711, 1.914733),
                                new LatLng(47.926544, 1.915817),
                                new LatLng(47.926501, 1.920055),
                                new LatLng(47.928111, 1.920034),
                                new LatLng(47.928133, 1.924336),
                                new LatLng(47.927443, 1.924926),
                                new LatLng(47.932655, 1.928424),
                                new LatLng(47.930958, 1.929883),
                                new LatLng(47.930642, 1.930784),
                                new LatLng(47.931296, 1.932372),
                                new LatLng(47.930865, 1.933895),
                                new LatLng(47.933532, 1.936824),
                                new LatLng(47.931677, 1.943766),
                                new LatLng(47.932159, 1.946030),
                                new LatLng(47.932137, 1.949367),
                                new LatLng(47.931641, 1.949549),
                                new LatLng(47.931576, 1.951191),
                                new LatLng(47.931576, 1.951191),
                                new LatLng(47.936200, 1.952488),
                                new LatLng(47.936301, 1.947435),
                                new LatLng(47.936653, 1.944474),
                                new LatLng(47.937896, 1.940000),
                                new LatLng(47.942632, 1.944077),
                                new LatLng(47.944659, 1.946609)
                        )
                        .width(3)
                        .color(Color.GREEN)
                        .clickable(true)

        );



        Bitmap.Config conf = Bitmap.Config.ARGB_8888;
        Bitmap bmp = Bitmap.createBitmap(85, 45, conf);
        Canvas canvas = new Canvas(bmp);
        int epais=3;
        Paint paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(epais);
        canvas.drawRect(0, 0, canvas.getWidth(), canvas.getHeight(), paint);

        paint.setColor(Color.CYAN);
        canvas.drawRect(epais,epais,canvas.getWidth()- epais,canvas.getHeight()-epais, paint);

        paint.setColor(Color.BLACK);
        paint.setTextSize(20);
        //paint.setFontFeatureSettings();
        canvas.drawText("Bus 9", 10, canvas.getHeight()/2, paint); // paint defines the text color, stroke width, size
        LatLng temp = new LatLng(47.906433, 1.905947);

        googleMap.addMarker(new MarkerOptions()
                        .position(temp)
                                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2))
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .title("Centre Gare")
                        .snippet("Orléans")
        );
        temp = new LatLng(47.944659, 1.946609);
        googleMap.addMarker(new MarkerOptions()
                        .position(temp)
                                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2))
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .title("Herveline")
                        .snippet("Fleury-Les-Aubrais")
        );
        return googleMap;
    }

}
