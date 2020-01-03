package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 03-06-2019.
 */
public class hospitals extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.hospitals);
        String[] url1 = {"chennai.apollohospitals.com   -  APOLLO" ,"www.fortismalar.com          -   FORTISMALAR",
                "www.birlaheart.org              -   BIRLA HEART","www.bellevueclinic.com     -   BELLEVUECLINIC",
                "www.kem.edu                       -   KING EDWARD","www.nhp.gov.in                    -   NATIONAL HEALTH PORTAL",
                "www.sgrh.com                     -   SRI GANGA RAM","tmc.gov.in                             -   TATA MEMORIAL",
                "www.dragarwal.com           -   DR_AGARWAL","www.arasan.org                   -    ARASAN",
                "www.janakient.com             -    JANAKI ENT","entanand.com                       -    MVC MEMORIAL ENT",
                "www.maxhealthcare.in        -    MAX HEALTHCARE","www.lilavatihospital.com    -     LILAVATI",
                "www.sevenhillshospital.com    -   SEVEN HILLS","www.rubyhall.com                      -   RUBY HALL",
                "www.manipalhospitals.com      -   MANIPAL","www.miotinternational.com      -   MIOT","www.kohinoorhospitals.in         -   KOHINOOR"};
        String[] t = {"yatra","expedia"};
//        final TextView myClickableUrl = (TextView) findViewById(R.id.TextView1);
//        myClickableUrl.setText("web site1: www.stackoverflow.com");
        //  Linkify.addLinks(myClickableUrl, Linkify.WEB_URLS);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.list_view, url1);  //adapter should hold textview id(list_view.xml)
        // ArrayAdapter adapter1 = new ArrayAdapter<String>(this, R.layout.list_view, t);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
        // listView.setAdapter(adapter1);
        // Linkify.addLinks(listView, Linkify.WEB_URLS);

    }

    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}





