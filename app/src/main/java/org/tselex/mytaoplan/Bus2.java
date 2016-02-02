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
import java.util.List;

/**
 * Created by zappa_000 on 20/01/2016.
 */
public class Bus2 {


    public GoogleMap setlineBus2(GoogleMap googleMap){


        ArrayList<LatLng> arretline2 = new ArrayList<LatLng>();
        arretline2.add( new LatLng(47.883747, 1.818818));
        arretline2.add( new LatLng(47.885150, 1.824794));
        arretline2.add( new LatLng(47.886783, 1.829279));
        arretline2.add( new LatLng(47.888531, 1.834214));
        arretline2.add( new LatLng(47.889639, 1.837272));
        arretline2.add( new LatLng(47.891279, 1.841864));
        arretline2.add( new LatLng(47.893286, 1.848462));
        arretline2.add( new LatLng(47.895056, 1.854202));
        arretline2.add( new LatLng(47.902286, 1.859635));
        arretline2.add( new LatLng(47.904271, 1.865107));
        arretline2.add( new LatLng(47.906148, 1.870589));
        arretline2.add( new LatLng(47.906234, 1.874258));
        arretline2.add( new LatLng(47.906565, 1.878142));
        arretline2.add( new LatLng(47.909830, 1.881790));
        arretline2.add( new LatLng(47.908363, 1.885320));
        arretline2.add( new LatLng(47.906306, 1.889890));
        arretline2.add( new LatLng(47.904997, 1.892776));
        arretline2.add( new LatLng(47.903523, 1.895222));
        arretline2.add( new LatLng(47.905688, 1.898816));
        arretline2.add( new LatLng(47.906983, 1.901241));
        arretline2.add( new LatLng(47.906566, 1.905189));
        arretline2.add( new LatLng(47.905156, 1.910124));
        arretline2.add( new LatLng(47.904221, 1.914780));
        arretline2.add( new LatLng(47.903142, 1.917891));
        arretline2.add( new LatLng(47.901531, 1.918964));
        arretline2.add( new LatLng(47.901531, 1.918964));
        arretline2.add( new LatLng(47.901788, 1.923838));
        arretline2.add( new LatLng(47.902399, 1.927218));
        arretline2.add( new LatLng(47.903154, 1.931059));
        arretline2.add( new LatLng(47.903816, 1.934117));
        arretline2.add( new LatLng(47.904183, 1.939835));
        arretline2.add( new LatLng(47.905082, 1.945092));
        arretline2.add( new LatLng(47.905607, 1.949469));
        arretline2.add( new LatLng(47.906082, 1.952752));
        arretline2.add( new LatLng(47.907146, 1.959565));
        arretline2.add( new LatLng(47.907729, 1.964103));
        arretline2.add( new LatLng(47.908383, 1.968588));
        arretline2.add( new LatLng(47.910620, 1.969929));
        arretline2.add( new LatLng(47.911907, 1.971849));
        arretline2.add( new LatLng(47.911914, 1.977750));
        arretline2.add( new LatLng(47.912043, 1.983726));
        arretline2.add( new LatLng(47.909763, 1.983200));
        arretline2.add( new LatLng(47.907900, 1.983447));
        arretline2.add( new LatLng(47.907907, 1.979327));
        arretline2.add( new LatLng(47.909779, 1.976760));
        arretline2.add( new LatLng(47.912043, 1.983726));



        PolylineOptions polyLine = new PolylineOptions();
        polyLine.width(5);
        polyLine.color(Color.BLACK);

        for(LatLng latLng:arretline2){
            googleMap.addPolyline(polyLine.add(latLng));
        }

        /*



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
        );*/
        return googleMap;
    }
}
