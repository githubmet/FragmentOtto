package hikmetanil.fragmentotto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import hikmetanil.fragmentotto.communication.P005Interface;
import hikmetanil.fragmentotto.fragment.P005FragmentBottom;
import hikmetanil.fragmentotto.fragment.P005FragmentTop;

public class P005FragmentCommunication extends AppCompatActivity implements P005Interface {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p005fragment_communication);


        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.relativeLayoutTopP005,new P005FragmentTop(),
                "fragment_top_p005");
        fragmentTransaction.add(R.id.relativeLayoutBottomP005,new P005FragmentBottom(),
                "fragment_bottom_p005");

        fragmentTransaction.commit();

    }

    @Override
    public void moveDataMtd(String textViewV) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        Fragment fragmentBottom= fragmentManager.findFragmentByTag("fragment_bottom_p005");

        ((P005FragmentBottom)fragmentBottom).setTextViewVMtd(textViewV);
    }
}
