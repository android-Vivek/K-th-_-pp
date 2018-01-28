package com.vivek.hack.katha_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Mantra extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.vivek.hack.katha_app.R.layout.activity_mantra);
        mAdView = (AdView) findViewById(com.vivek.hack.katha_app.R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView = (AdView) findViewById(com.vivek.hack.katha_app.R.id.adView1);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest1);

        mAdView = (AdView) findViewById(com.vivek.hack.katha_app.R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest2);

TextView t100;
        t100=(TextView)(findViewById(R.id.web1));

        String text1;

        text1 = "\nगायत्री मंत्र बहुत ही चमत्कारी और शक्तिशाली माना गया है। शास्त्रों के मुताबिक इस मंत्र के 24\n" +
                "अक्षर 24 महाशक्तियों के प्रतीक होकर शक्ति बीज हैं। वेदों में गायत्री शक्ति ही प्राण, आयु, शक्ति, तेज, कीर्ति\n" +
                "और धन देने वाली मानी गई है। यही वजह है कि गायत्री मंत्र को महामन्त्र पुकारा जाता है, जो शरीर की कई\n" +
                "शक्तियों को जाग्रत करता है, जिससे उपासक ऊर्जावान, दीर्घ और निरोगी जीवन प्राप्त करता है।";
       t100.setText(text1);
        TextView t101;
        t101=(TextView)(findViewById(R.id.web2));

        String text;

        text = "\nमुश्किल कामों में कामयाबी, रुकावटों को दूर करने, बुद्धि लाभ के लिए इस गणेश गायत्री मंत्र का\n" +
                "स्मरण करना चाहिए";
        t101.setText(text);

        TextView t102;
        t102=(TextView)(findViewById(R.id.web3));
        String text3;

        text3 = "<br>शत्रु को हराने, बहादुरी, भय व दहशत दूर करने, पुरुषार्थी बनने व किसी भी आक्रमण से बचने के\n" +
                "लिए नृसिंह गायत्री असरदार साबित होता है";
       t102.setText(text3);

        TextView t103;
        t103=(TextView)(findViewById(R.id.web4));
        String text4;

        text4 = "\nपालन-पोषण की क्षमता व काबिलियत बढ़ाने या किसी भी तरह से सबल बनने के लिए विष्णु\n" +
                "गायत्री का महत्व है";
        t103.setText(text4);

        TextView t104;
        t104=(TextView)(findViewById(R.id.web5));
        String text5;

        text5 = "\nदायित्वों व कर्तव्यों को लेकर दृढ़ बनने, अमंगल का नाश व शुभता को बढ़ाने के लिए शिव गायत्री\n" +
                "मंत्र बड़ा ही प्रभावी माना गया है";

       t104.setText(text5);
        TextView t105;
        t105=(TextView)(findViewById(R.id.web6));
        String text6;
        text6 = "<br>सक्रियता, समर्पण, निस्वार्थ व मोह से दूर रहकर काम करने, खूबसूरती व सरल स्वभाव की चाहत\n" +
                "कृष्ण गायत्री मंत्र पूरी करता है";
       t105.setText(text6);
        TextView t106;
        t106=(TextView)(findViewById(R.id.web7));
        String text7;
        text7 = "\nप्रेम भाव को बढ़ाने व द्वेष या घृणा को दूर रखने के लिए राधा गायत्री मंत्र का स्मरण बढ़ा ही लाभ\n" +
                "देता है";
        t106.setText(text7);
        TextView t107,t108,t109,t110;
        t107=(TextView)(findViewById(R.id.web8));
        String text9;

        text9 = "\nरुतबा, पैसा, पद, यश व भौतिक सुख-सुविधाओं की चाहत लक्ष्मी गायत्री मंत्र शीघ्र पूरी कर देता है -";
        t107.setText(text9);

        t108=(TextView)(findViewById(R.id.web9));
        String text10;
        text10 = "\nताकत बढ़ाने, प्रभावशाल व होनहार बनने के लिए अग्निदेव का स्मरण अग्नि गायत्री मंत्र से करना शुभ होता है -";
        t108.setText(text10);

        t109=(TextView)(findViewById(R.id.web10));
        String text11;
        text11 = "\nसंयम के जरिए बीमारियों, हिंसा के भाव रोकने व भूत-प्रेत या अनिष्ट से रक्षा में इन्द्र गायत्री मंत्र प्रभावी माना गया है -";
        t109.setText(text11);

        t110=(TextView)(findViewById(R.id.web11));
        String text12;
        text12 = "\nबुद्धि व विवेक, दूरदर्शिता, चतुराई से सफलता मां सरस्वती गायत्री मंत्र से फौरन मिलती है -";
      t110.setText(text12);

        TextView t111;
        t111=(TextView)(findViewById(R.id.web12));
        String text13;

        text13 = "\nविघ्नों के नाश, दुर्जनों व शत्रुओं को मात व अहंकार के नाश के लिए दु्र्गा गायत्री मंत्र का महत्व है।";
        t111.setText(text13);
    }
}
