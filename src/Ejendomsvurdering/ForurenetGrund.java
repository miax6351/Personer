package Ejendomsvurdering;

public class ForurenetGrund extends Grund {

    private int fradrag;

    public ForurenetGrund(int kvm, int kvmPris, int byggeret, int fradrag) {
        super(kvm, kvmPris, byggeret);
        this.fradrag = fradrag;
    }

    public void setFradrag(){
        this.fradrag = fradrag;
    }

    @Override
    public int vurdering() {
        return super.vurdering() - fradrag;
    }
}
