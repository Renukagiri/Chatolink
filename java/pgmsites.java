package sample.chat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by USER on 07-06-2019.
 */
public class pgmsites extends AppCompatActivity
{
            protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
                assert getSupportActionBar() != null;   //null check
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button

            setContentView(R.layout.pgmsites);
            String[] url1 = {"www.codecademy.com     -    CODECADEMY" ,"www.khanacademy.org     -    KHANACADEMY",
                    "www.codewars.com          -    CODEWARS","www.topcoder.com            -    TOPCODER",
                    "www.codechef.com           -    CODECHEF","www.hackerearth.com      -    HACKEREARTH",
                    "www.hackerrank.com       -    HACKERRANK","www.sitepoint.com            -    SITEPOINT",
                    "codesignal.com                  -    CODESIGNAL","codeforces.com                 -     CODEFORCES",
                    "projecteuler.net                  -     PROJECTEULER","artofproblemsolving.com -     AOPS",
                    "www.codingame.com       -     CODINGAME","www.freecodecamp.org   -     FREECODECAMP",
                    "www.coderbyte.com         -     CODERBYTE","leetcode.com                      -     LEETCODE",
                    "www.spoj.com                    -     SPOJ","challengerocket.com    -    CHALLENGEROCKET","hack.codingblocks.com    -     CODINGBLOCKS"};
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
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
    }






