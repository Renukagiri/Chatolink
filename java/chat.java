
//select and make a chat

package sample.chat;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by USER on 29-05-2019.
 */
public class chat extends AppCompatActivity {
    private final int REQUEST_CODE = 99;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        setContentView(R.layout.selectoption);

        TextView txt = (TextView) findViewById(R.id.text);
        txt.setSelected(true);
        txt.setHorizontallyScrolling(true);
        Button btPick = (Button) findViewById(R.id.button);
        // btPick.setBackgroundResource(R.drawable.apps);
        Button btPick1 = (Button) findViewById(R.id.button2);
        // btPick1.setBackgroundResource(R.drawable.apps);

        btPick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
        btPick1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(chat.this, links.class);
                startActivity(intent);

            }

        });

    }

    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }


    public void onActivityResult(int reqCode, int resultCode, Intent data) {
        super.onActivityResult(reqCode, resultCode, data);
        switch (reqCode) {
            case (REQUEST_CODE):
                if (resultCode == Activity.RESULT_OK) {
                    Uri contactData = data.getData();
                    Cursor c = getContentResolver().query(contactData, null, null, null, null);
                    if (c.moveToFirst()) {
                        String contactId = c.getString(c.getColumnIndex(ContactsContract.Contacts._ID));
                        String hasNumber = c.getString(c.getColumnIndex(ContactsContract.Contacts.HAS_PHONE_NUMBER));
                        String name = c.getString(c.getColumnIndex(ContactsContract.Contacts.DISPLAY_NAME));
                        String num = "";
                        if (Integer.valueOf(hasNumber) == 1) {
                            Cursor numbers = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = " + contactId, null, null);
                            while (numbers.moveToNext()) {

                                num = numbers.getString(numbers.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                                final String finalNum = num;

                                final String finalNum1 = finalNum.replace("+", "").replace(" ", "");
                                int length = finalNum1.length();

                                //  final String finalNum2 = finalNum.append("91");

                                if (length == 12) {

                                    //final String finalNum2 = finalNum.replace("+", "91");
                                    Toast.makeText(chat.this, "Number=" + finalNum1, Toast.LENGTH_LONG).show();
                                    TextView textView = (TextView) findViewById(R.id.textView2);
                                    textView.setText(finalNum1);
                                    TextView textView1 = (TextView) findViewById(R.id.textView4);
                                    textView1.setText(name);


                                    //   boolean whatsappFound = AndroidUtils.isAppInstalled(context, "com.whatsapp");

                                    textView.setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {
//                                        Intent myIntent = new Intent(view.getContext(), fileselect.class);
//                                        startActivityForResult(myIntent, 0);
//                                        finish();
                                            boolean isAppInstalled = appInstalledOrNot("com.whatsapp");

                                            if (isAppInstalled) {
                                                String smsNumber = finalNum1; // E164 format without '+' sign
                                                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                                                sendIntent.setType("text/plain");
                                                sendIntent.putExtra(Intent.EXTRA_TEXT, "hello");
                                                sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix

                                                sendIntent.setPackage("com.whatsapp");


                                                startActivity(sendIntent);
                                            } else {
//                                                Toast.makeText(chat.this, "No Whatsapp,please install to chat!!!",
//                                                        Toast.LENGTH_LONG).show();
                                                String smsNumber = finalNum1;

                                                //***to check for both sms and hangouts option***///

//                                                Intent sms = new Intent(Intent.ACTION_VIEW);
//                                                sms.setType("vnd.android-dir/mms-sms");
//                                                sms.setData(Uri.parse("sms:" +  smsNumber));
//                                                sms.putExtra("sms_body","This is test message"); //Replace the message witha a vairable
//                                                startActivity(sms);

                                                //*** if no whatsapp,open as default sms application
                                                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                                                smsIntent.addCategory(Intent.CATEGORY_DEFAULT);
                                                smsIntent.setType("vnd.android-dir/mms-sms");
                                                smsIntent.setData(Uri.parse("sms:" + smsNumber));
                                                smsIntent.putExtra("sms_body","This is test message");
                                                startActivity(smsIntent);
                                            }
                                        }


                                    });


                                } else {


                                    Toast.makeText(chat.this, "Number=" + "91".concat(finalNum), Toast.LENGTH_LONG).show();
                                    TextView textView = (TextView) findViewById(R.id.textView2);
                                    textView.setText("91".concat(finalNum));

                                    TextView textView1 = (TextView) findViewById(R.id.textView4);
                                    textView1.setText(name);

                                    textView.setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {
//                                        Intent myIntent = new Intent(view.getContext(), fileselect.class);
//                                        startActivityForResult(myIntent, 0);
//                                        finish();
                                            //final String finalNum2 = finalNum2.replace("", "91");

                                            boolean isAppInstalled = appInstalledOrNot("com.whatsapp");
                                            if(isAppInstalled) {
                                                String smsNumber = "91".concat(finalNum); // E164 format without '+' sign
                                                Intent sendIntent = new Intent(Intent.ACTION_SEND);
                                                sendIntent.setType("text/plain");
                                                sendIntent.putExtra(Intent.EXTRA_TEXT, "hello");
                                                sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
                                                sendIntent.setPackage("com.whatsapp");


                                                startActivity(sendIntent);
                                            }else  {
//                                                Toast.makeText(chat.this, "No Whatsapp,please install to chat!!!",
//                                                        Toast.LENGTH_LONG).show();
                                               // Uri SMS_URI = Uri.parse("smsto:+smsNumber"); //Replace the phone number
                                                String smsNumber = "91".concat(finalNum);


                                                //***to check for both sms and hangouts option***///

//                                                Intent sms = new Intent(Intent.ACTION_VIEW);
//                                                sms.setType("vnd.android-dir/mms-sms");
//                                                sms.setData(Uri.parse("sms:" +  smsNumber));
//
//                                                sms.putExtra("sms_body","This is test message"); //Replace the message witha a vairable
//
//                                                startActivity(sms);

                                                //*** if no whatsapp,open as default sms application
                                                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                                                smsIntent.addCategory(Intent.CATEGORY_DEFAULT);
                                                smsIntent.setType("vnd.android-dir/mms-sms");
                                                smsIntent.setData(Uri.parse("sms:" + smsNumber));
                                                smsIntent.putExtra("sms_body","This is test message");
                                                startActivity(smsIntent);

                                            }

                                        }

                                    });

                                }
                            }
                        }
                    }
                    break;
                }
//                else
//                {
//                    Toast.makeText(chat.this, "no chat application " ,
//                            Toast.LENGTH_LONG).show();
//                }
        }


    }

    private boolean appInstalledOrNot(String uri) {
        PackageManager pm = getPackageManager();
        try {
            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
        }

        return false;
    }


    // Launch Google Chrome after clicking the button

//    public void launchGoogleChrome(View view) {
//        Intent launchGoogleChrome = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
//        startActivity(launchGoogleChrome);
//    }


//        String smsNumber = "6381468418";
//        boolean isWhatsappInstalled = whatsappInstalledOrNot("com.whatsapp");
//        if (isWhatsappInstalled) {
//
//            Intent sendIntent = new Intent("android.intent.action.MAIN");
//            sendIntent.setComponent(new ComponentName("com.whatsapp", "com.whatsapp.Conversation"));
//            sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators(smsNumber) + "@s.whatsapp.net");//phone number without "+" prefix
//
//            startActivity(sendIntent);
//        } else {
//            Uri uri = Uri.parse("market://details?id=com.whatsapp");
//            Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
//            Toast.makeText(this, "WhatsApp not Installed",
//                    Toast.LENGTH_SHORT).show();
//            startActivity(goToMarket);
//        }
//    }
//
//    private boolean whatsappInstalledOrNot(String uri) {
//        PackageManager pm = getPackageManager();
//        boolean app_installed = false;
//        try {
//            pm.getPackageInfo(uri, PackageManager.GET_ACTIVITIES);
//            app_installed = true;
//        } catch (PackageManager.NameNotFoundException e) {
//            app_installed = false;
//        }
//        return app_installed;
//    }


//        String num ="";
//        String smsNumber = num; // E164 format without '+' sign
//        Intent sendIntent = new Intent(Intent.ACTION_SEND);
//        sendIntent.setType("text/plain");
//        sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
//        sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
//        sendIntent.setPackage("com.whatsapp");
//
//
//        startActivity(sendIntent);
//    }

//    public static boolean isAppInstalled(Context context, String packageName) {
//        try {
//            context.getPackageManager().getApplicationInfo(packageName, 0);
//            return true;
//        }
//        catch (PackageManager.NameNotFoundException e) {
//            return false;
//        }
//    }

}
