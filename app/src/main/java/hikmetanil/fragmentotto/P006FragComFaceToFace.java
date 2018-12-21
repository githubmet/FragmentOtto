package hikmetanil.fragmentotto;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import hikmetanil.fragmentotto.fragment.P006FragmentBottom;
import hikmetanil.fragmentotto.fragment.P006FragmentTop;

public class P006FragComFaceToFace extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p006frag_com_face_to_face);

        FragmentManager fragmentManager= getSupportFragmentManager();

        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.relativeLayoutTopP006,new P006FragmentTop(),
                "fragment_top_p006");
        fragmentTransaction.add(R.id.relativeLayoutBottomP006,new P006FragmentBottom(),
                "fragment_bottom_p006");
        fragmentTransaction.commit();

    }

    public void onClickMtdP006(View view) {
        FragmentManager fragmentManager= getSupportFragmentManager();

        P006FragmentTop p006FragmentTop= (P006FragmentTop) fragmentManager.findFragmentByTag("fragment_top_p006");
        String textViewV= p006FragmentTop.getTextViewTextMtd();

        P006FragmentBottom p006FragmentBottom= (P006FragmentBottom) fragmentManager.findFragmentByTag("fragment_bottom_p006");
        p006FragmentBottom.setTextViewTextMtd(textViewV);
    }
}
