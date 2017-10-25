package myapplication.tutorialspoint7.example.com.aes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

        String seedValue = "This Is MySecure";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            String normalText = "VIJAY";
            String normalTextEnc;
            try {
                normalTextEnc = AESHelper.encrypt(seedValue, normalText);
                String normalTextDec = AESHelper.decrypt(seedValue, normalTextEnc);
                TextView txe = new TextView(this);
                txe.setTextSize(14);
                txe.setText("Normal Text ::"+normalText +" \n Encrypted Value :: "+normalTextEnc +" \n Decrypted value :: "+normalTextDec);
                setContentView(txe);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }



        }


    }
