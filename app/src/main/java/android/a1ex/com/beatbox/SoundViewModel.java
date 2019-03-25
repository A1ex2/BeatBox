package android.a1ex.com.beatbox;

import android.a1ex.com.beatbox.BeatBox;
import android.a1ex.com.beatbox.Sound;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle() {
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
