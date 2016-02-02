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

/**
 * Created by zappa_000 on 20/01/2016.
 */
public class TramA {


    public GoogleMap setlineTramA(GoogleMap googleMap){

        PolylineOptions polyLine = new PolylineOptions();
        googleMap.addPolyline(polyLine
                        .add(
                                new LatLng(47.928871, 1.924974),
                                new LatLng(47.928152, 1.917796),
                                new LatLng(47.928526, 1.914964),
                                new LatLng(47.929346, 1.912250),
                                new LatLng(47.928728, 1.908527),
                                new LatLng(47.928757, 1.906027),
                                new LatLng(47.924816, 1.907500),
                                new LatLng(47.921272, 1.906965),
                                new LatLng(47.920761, 1.904272),
                                new LatLng(47.919309, 1.903325),
                                new LatLng(47.917964, 1.900686),
                                new LatLng(47.914948, 1.900655),
                                new LatLng(47.910899, 1.904206),
                                new LatLng(47.906980, 1.903884),
                                new LatLng(47.906606, 1.906019),
                                new LatLng(47.906225, 1.905826),
                                new LatLng(47.906354, 1.904989),
                                new LatLng(47.902751, 1.903798),
                                new LatLng(47.902477, 1.903361),
                                new LatLng(47.901785, 1.902875),
                                new LatLng(47.900756, 1.903004),
                                new LatLng(47.900324, 1.904013),
                                new LatLng(47.889123, 1.904946),
                                new LatLng(47.888965, 1.905515),
                                new LatLng(47.888030, 1.905365),
                                new LatLng(47.887016, 1.906610),
                                new LatLng(47.881461, 1.910676),
                                new LatLng(47.879576, 1.908927),
                                new LatLng(47.875964, 1.912478),
                                new LatLng(47.873424, 1.912864),
                                new LatLng(47.869358, 1.912220),
                                new LatLng(47.867803, 1.911812),
                                new LatLng(47.865327, 1.913024),
                                new LatLng(47.861598, 1.911844),
                                new LatLng(47.861080, 1.910514),
                                new LatLng(47.857934, 1.905160),
                                new LatLng(47.856811, 1.905085),
                                new LatLng(47.851699, 1.913397),
                                new LatLng(47.849049, 1.915564),
                                new LatLng(47.846716, 1.916508),
                                new LatLng(47.845924, 1.917753),
                                new LatLng(47.845355, 1.920703),
                                new LatLng(47.846608, 1.922752),
                                new LatLng(47.849812, 1.922956),
                                new LatLng(47.850330, 1.924598),
                                new LatLng(47.845095, 1.937279),
                                new LatLng(47.844181, 1.939446),
                                new LatLng(47.841488, 1.937429),
                                new LatLng(47.841164, 1.936034),
                                new LatLng(47.830073, 1.927730),
                                new LatLng(47.830671, 1.920295),
                                new LatLng(47.836584, 1.917409),
                                new LatLng(47.837059, 1.917924),
                                new LatLng(47.837311, 1.919126)

                        )
                        .width(5)
                        .color(Color.BLUE)
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
        canvas.drawText("Tram A", 10, canvas.getHeight()/2, paint); // paint defines the text color, stroke width, size
        LatLng temp = new LatLng(47.928871, 1.924974);

        googleMap.addMarker(new MarkerOptions()
                        .position(temp)
                                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2))
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .title("Jules Verne")
                        .snippet("Fleury Les Aubrais")
        );
        temp = new LatLng(47.837311, 1.919126);
        googleMap.addMarker(new MarkerOptions()
                        .position(temp)
                                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2))
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .title("Hôpital de la Source")
                        .snippet("Orléans la Source")
        );
        return googleMap;
    }

}
