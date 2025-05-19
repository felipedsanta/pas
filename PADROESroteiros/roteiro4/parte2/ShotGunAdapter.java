package PADROESroteiros.roteiro4.parte2;

import PADROESroteiros.roteiro4.roteiro4_nova_arma.armas.artilharia.ShotGun;

public class ShotGunAdapter extends ShotGun implements Arma {

    @Override
    public void carregar() {
        this.loadGun();
    }

    @Override
    public void atirar() {
        this.shotKill();
    }

    @Override
    public void mirar() {
        this.targetEnemy();
    }

}
