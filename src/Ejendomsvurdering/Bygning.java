package Ejendomsvurdering;

public class Bygning {

    int kvm;
    int kvmPris;

    public Bygning(int kvm, int kvmPris){
        this.kvm = kvm;
        this.kvmPris = kvmPris;
    }

    public int vurdering(){
        return kvm * kvmPris;
    }

}
