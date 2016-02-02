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
public class TramB {


    public GoogleMap setlineTramB(GoogleMap googleMap){

        PolylineOptions polyLine = new PolylineOptions();
        googleMap.addPolyline(polyLine
                        .add(
                                new LatLng(47.894977, 1.854265),
                                new LatLng(47.901134, 1.855467),
                                new LatLng(47.901134, 1.855467),
                                new LatLng(47.902789, 1.872552),
                                new LatLng(47.899016, 1.875575),
                                new LatLng(47.901940, 1.897896),
                                new LatLng(47.901300, 1.902971),
                                new LatLng(47.901796, 1.909001),
                                new LatLng(47.903263, 1.908674),
                                new LatLng(47.912828, 1.912451),
                                new LatLng(47.911422, 1.925765),
                                new LatLng(47.911339, 1.930046),
                                new LatLng(47.909422, 1.934461),
                                new LatLng(47.908530, 1.938270),
                                new LatLng(47.908695, 1.942148),
                                new LatLng(47.910475, 1.944991),
                                new LatLng(47.909501, 1.947732),
                                new LatLng(47.909853, 1.949288),
                                new LatLng(47.909727, 1.950935),
                                new LatLng(47.909806, 1.963633)
                        )
                        .width(5)
                        .color(Color.RED)
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
        canvas.drawText("Tram B", 10, canvas.getHeight()/2, paint); // paint defines the text color, stroke width, size
        LatLng temp = new LatLng(47.894977, 1.854265);

        googleMap.addMarker(new MarkerOptions()
                        .position(temp)
                                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2))
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .title("Gorges Pompidou")
                        .snippet("La chapelle St-Mesmin")
        );
        temp = new LatLng(47.909806, 1.963633);
        googleMap.addMarker(new MarkerOptions()
                        .position(temp)
                                //.icon(BitmapDescriptorFactory.fromResource(R.drawable.marker2))
                        .icon(BitmapDescriptorFactory.fromBitmap(bmp))
                        .title("Clos du Hameau")
                        .snippet("St-Jean-de-Braye")
        );
        return googleMap;
    }

}
