import org.junit.Test;
import org.junit.Assert;

public class AldeanoTest {
    //Pruebas base
    @Test
    public void crearAldeanoEnPosicionIndicada(){
        Aldeano aldeano = new Aldeano(5,7);
        Assert.assertEquals(true,aldeano.estaEnPos(5,7));
    }
    //Pruebas Mov normales

    @Test
    public void moverAldeanoUnaUnidadArribaExitosamente(){ //Ver tema pos
        Aldeano aldeano = new Aldeano(4,5);
        Assert.assertEquals(true,aldeano.estaEnPos(4,5));
        moverHaciaArriba(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(4,6));
    }

    @Test
    public void moverAldeanoUnaUnidadIzquierdaExitosamente(){
        Aldeano aldeano = new Aldeano(2,4); //idem
        Assert.assertEquals(true,aldeano.estaEnPos(2,4));
        moverHaciaIzquierda(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(1,4));
    }

    @Test
    public void moverAldeanoUnaUnidadDerechaExitosamente(){
        Aldeano aldeano = new Aldeano(23,15); //idem
        Assert.assertEquals(true,aldeano.estaEnPos(23,15));
        moverHaciaDerecha(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(24,15));
    }

    @Test
    public void moverAldeanoUnaUnidadAbajoExitosamente(){
        Aldeano aldeano = new Aldeano(10,10); //idem
        Assert.assertEquals(true,aldeano.estaEnPos(10,10));
        moverHaciaAbajo(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(10,9));
    }

    @Test
    public void moverAldeanoUnaUnidadAbajoIzquierdaExitosamente(){
        Aldeano aldeano = new Aldeano(15,15); //idem
        Assert.assertEquals(true,aldeano.estaEnPos(15,15));
        moverHaciaAbajoIzquierda(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(14,14));
    }

    @Test
    public void moverAldeanoUnaUnidadAbajoDerechaExitosamente(){
        Aldeano aldeano = new Aldeano(34,8); //idem
        Assert.assertEquals(true,aldeano.estaEnPos(34,8));
        moverHaciaAbajoDerecha(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(35,7));
    }

    @Test
    public void moverAldeanoUnaUnidadArribaIzquierdaExitosamente(){
        Aldeano aldeano = new Aldeano(19,42); //idem
        Assert.assertEquals(true,aldeano.estaEnPos(19,42));
        moverHaciaArribaIzquierda(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(18,43));
    }

    @Test
    public void moverAldeanoUnaUnidadaArribaDerechaExitosamente(){
        Aldeano aldeano = new Aldeano(33,33); //idem
        Assert.assertEquals(true,aldeano.estaEnPos(33,33));
        moverHaciaArribaDerecha(aldeano);
        Assert.assertEquals(true,aldeano.estaEnPos(34,34));
    }

    //Pruebas mov unidad inexistente , hacer las comentadas cuando se sepa tamanio map

    @Test
    public void moverAldeanoUnaUnidadArribaInexistente(){
        Aldeano aldeano = new Aldeano(1,1);
        Assert.assertEquals(true,aldeano.estaEnPos(1,1));
        try{
            moverHaciaArriba(aldeano);
        }catch(Exception posicionInexistente){}
    }
/*
    @Test
    public void moverAldeanoUnaUnidadAbajoInexistente(){
        Aldeano aldeano = new Aldeano();
        Assert.assertEquals(true,aldeano.estaEnPos(ver,ver));
        try{
            moverHaciaArribaDerecha(aldeano);
        }catch(Exception unidadInexistente){}
    }
    @Test
    public void moverAldeanoUnaUnidadDerechaInexistente(){
        Aldeano aldeano = new Aldeano;

    }
        @Test
    public void moverAldeanoUnaUnidadAbajoDerechaInexistente(){
        Aldeano aldeano = new Aldeano;

    }

    @Test
    public void moverAldeanoUnaUnidadAbajoIzquierdaInexistente(){
        Aldeano aldeano = new Aldeano;

    }
*/

    @Test
    public void moverAldeanoUnaUnidadIzquierdaInexistente(){
        Aldeano aldeano = new Aldeano(5,1);
        Assert.assertEquals(true,aldeano.estaEnPos(5,1));
        try{
            moverHaciaIzquierda(aldeano);
        }catch(Exception unidadInexistente){}
    }

    @Test
    public void moverAldeanoUnaUnidadArribaIzquierdaInexistente(){
        Aldeano aldeano = new Aldeano(1,2);
        Assert.assertEquals(true,aldeano.estaEnPos(1,2));
        try{
            moverHaciaArribaIzquierda(aldeano);
        }catch(Exception unidadInexistente){}
    }

    @Test
    public void moverAldeanoUnaUnidadArribaDerechaInexistente(){
        Aldeano aldeano = new Aldeano(24,1);
        Assert.assertEquals(true,aldeano.estaEnPos(24,1));
        try{
            moverHaciaArribaDerecha(aldeano);
        }catch(Exception unidadInexistente){}

    }

    //Mover mas de 1 vez falla en cada posicion

    @Test
    public void moverAldeanoADerechaLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano(1,1);
        Assert.assertEquals(true,aldeano.estaEnPos(1,1));
        moverHaciaAbajo(aldeano);
        try{
            moverHaciaDerecha(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    @Test
    public void moverAldeanoAIzquierdaLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano(3,3);
        Assert.assertEquals(true,aldeano.estaEnPos(3,3));
        moverHaciaArriba(aldeano);
        try{
            moverHaciaIzquierda(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    @Test
    public void moverAldeanoArribaLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano(28,30);
        Assert.assertEquals(true,aldeano.estaEnPos(28,30));
        moverHaciaDerecha(aldeano);
        try{
            moverHaciaArriba(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    @Test
    public void moverAldeanoArribaIzquierdaLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano(11,19);
        Assert.assertEquals(true,aldeano.estaEnPos(11,19));
        moverHaciaArribDerecha(aldeano);
        try{
            moverHaciaArribaIzquierda(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    @Test
    public void moverAldeanoArribaDerechaLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano;
        Assert.assertEquals(true,aldeano.estaEnPos(3,3));
        moverHaciaAbajoIzquierda(aldeano);
        try{
            moverHaciaArribaDerecha(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    @Test
    public void moverAldeanoAbajoLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano(17,48);
        Assert.assertEquals(true,aldeano.estaEnPos(17,48));
        moverHaciaArribaDerecha(aldeano);
        try{
            moverHaciaAbajo(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    @Test
    public void moverAldeanoAbajoIzquierdaLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano(34,41);
        Assert.assertEquals(true,aldeano.estaEnPos(34,41));
        moverHaciaAbajo(aldeano);
        try{
            moverHaciaAbajoIzquierda(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    @Test
    public void moverAldeanoAbajoDerechaLuegoDeHaberMovidoLanzaExcepcion(){
        Aldeano aldeano = new Aldeano(10,3);
        Assert.assertEquals(true,aldeano.estaEnPos(10,3));
        moverHaciaIzquierda(aldeano);
        try{
            moverHaciaAbajoDerecha(aldeano);
        }catch(Exception unidadYaMovio){}
    }

    //Pruebas construccion

    @Test
    public void AldeanoConstruyeCuartelYSeVerificaQueExiste(){
        Aldeano aldeano = new Aldeano(2,3);
        aldeano.construirCuartel();
        //Assert.assertEquals(); npi

    }

    @Test
    public void AldeanoConstruyePlazaCentralYSeVerificaQueExiste(){
        Aldeano aldeano = new Aldeano(10,9);

    }

    @Test
    public void AldeanoConstruyeCuartelYSeVerificaQueEsDuranteTurnoJugador(){
        Aldeano aldeano = new Aldeano(6,20);

    }

    @Test
    public void AldeanoConstruyePlazaCentralYSeVerificaQueEsDuranteTurnoJugador(){
        Aldeano aldeano = new Aldeano(24,4);

    }

    @Test
    public void AldeanoConstruyeCuartelYSeVerificaQueoNoGeneraOro(){
        Aldeano aldeano = new Aldeano(35,30);

    }

    @Test
    public void AldeanoConstruyePlazaCentralYSeVerificaQueNoGeneraOro(){
        Aldeano aldeano = new Aldeano(45,11);

    }

    //Pruebas de reparacion

    @Test
    public void AldeanoReparaCuartelYSeVerificaSuEstado(){
        Aldeano aldeano = new Aldeano;

    }

    @Test
    public void AldeanoReparaCuartelYSeVerificaAumentoVidaCuartel(){
        Aldeano aldeano = new Aldeano;

    }

    @Test
    public void AldeanoFinalizaReparacionCuartelYGeneraOro(){
        Aldeano aldeano = new Aldeano;

    }

    @Test
    public void AldeanoReparaPlazaCentralYSeVerificaSuEstado(){
        Aldeano aldeano = new Aldeano;

    }

    @Test
    public void AldeanoReparaPlazaCentralYSeVerificaAumentoVidaPlazaCentral(){
        Aldeano aldeano = new Aldeano;

    }

    @Test
    public void AldeanoFinalizaReparacionPlazaCentralYGeneraOro(){
        Aldeano aldeano = new Aldeano;

    }






}
