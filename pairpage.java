//dummy program for take a contact

package sample.chat;


import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
    public class pairpage extends Activity {
        private final int REQUEST_CODE=99;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.phonenum);
            Button btPick=(Button)findViewById(R.id.phnum);
            btPick.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI);
                    startActivityForResult(intent, REQUEST_CODE);
                }
            });
        }

        @Override
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
                            String num = "";
                            if (Integer.valueOf(hasNumber) == 1) {
                                Cursor numbers = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, null, ContactsContract.CommonDataKinds.Phone.CONTACT_ID + " = " + contactId, null, null);
                                while (numbers.moveToNext()) {
                                    num = numbers.getString(numbers.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
                                    Toast.makeText(pairpage.this, "Number="+num, Toast.LENGTH_LONG).show();
                                    TextView textView = (TextView) findViewById(R.id.textView);
                                    textView.setText(num);
                                    textView.setOnClickListener(new View.OnClickListener() {

                                        public void onClick(View view) {
                                            Intent myIntent = new Intent(view.getContext(), fileselect.class);
                                            startActivityForResult(myIntent, 0);
                                            finish();
                                        }

                                    });


                                }
                            }
                        }
                        break;
                    }
            }
        }


    }

