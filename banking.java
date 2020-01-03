package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 10-06-2019.
 */
public class banking extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.banking);
        String[] url1 = {"www.canarabank.in               -     CANARA BANK" ,"www.onlinesbi.com               -     STATE BANK OF INDIA (SBI)",
                "www.axisbank.com               -      AXIS BANK","www.hdfcbank.com              -      HDFC",
                "www.pnbindia.in                    -      PUNJAB NATIONAL BANK","www.syndicatebank.in         -      SYNDICATE BANK",
                "www.centralbankofindia.co.in  -     CENTRAL BANK  ","www.unionbankofindia.co.in    -      UNION BANK OF INDIA",
                "www.icicibank.com               -     ICICI","www.bankofindia.co.in         -     BANK OF INDIA",
                "www.iob.in                              -     INDIAN OVERSEAS BANK","www.andhrabank.in              -     ANDHRA BANK",
                "www.allahabadbank.in         -     ALLAHABAD BANK","www.idbi.com                        -     INDUSTRIAL DEVELOPMENT BANK OF INDIA (IDBI)",
                "www.corpbank.com              -     CORPORATION BANK","www.federalbank.co.in         -     FEDERAL BANK",
                "www.bankofbaroda.in           -     BANK OF BARODA","www.ucobank.com                -     UNITED COMMERCIAL BANK","www.kotak.com                     -     KOTAK MAHINDRA BANK",
        "www.southindianbank.com   -     SOUTH INDIAN BANK","www.online.citibank.co.in     -     CITI BANK","www.kvb.co.in                         -     KARUR VYSYA BANK","www.indusind.com                 -     INDUSIND BANK",
        "www.lvbank.com                    -     LAKSHMI VILAS BANK"};
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
