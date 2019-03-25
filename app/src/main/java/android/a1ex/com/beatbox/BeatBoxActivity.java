package android.a1ex.com.beatbox;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BeatBoxActivity extends android.a1ex.com.beatbox.SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return android.a1ex.com.beatbox.BeatBoxFragment.newInstance();
    }
}
