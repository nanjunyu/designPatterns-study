package designpatterns.adapter;

/**
 * @Author Frank
 * @Description
 * @Date: Create in  2019-07-16 10:55
 */
public class PoliceCarAdapter extends CarController {

    private PoliceSound policeSound;
    private PoliceLamp policeLamp;

    public PoliceCarAdapter() {
        policeSound = new PoliceSound();
        policeLamp = new PoliceLamp();
    }

    @Override
    public void phonate() {
        policeSound.sound();
    }

    @Override
    public void twinkle() {
        policeLamp.twinkle();
    }
}
