package Ejendomsvurdering;

public class Grund {

    int kvm;
    int kvmPris;
    int byggeret;

    public Grund(int kvm, int kvmPris, int byggeret){
        this.kvm = kvm;
        this.kvmPris = kvmPris;
        this.byggeret = byggeret;
    }

    public int vurdering(){
        return kvm * kvmPris + byggeret;
    }

}
