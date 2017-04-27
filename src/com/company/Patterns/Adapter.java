package com.company.Patterns;

/**
 * Created by Маша on 23.04.2017.
 */
public class Adapter {
    public static void main(String[] args) {
        Integer i = new Integer(9);
        i = 8;
        System.out.println(i);
        VectorGraficInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();
        VectorGraficInterface g2 = new VectorAdapterFromRaster1();
        g2.drawLine();
        g2.drawSquare();

    }

}

interface VectorGraficInterface {
    void drawLine();

    void drawSquare();
}

class RasterGraphics {
    void drawRasterLine() {
        System.out.println("draw some line");
    }

    void drawRasterSquare() {
        System.out.println("draw some square");
    }
}

class VectorAdapterFromRaster extends RasterGraphics implements VectorGraficInterface {

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}

class VectorAdapterFromRaster1 implements VectorGraficInterface {
    RasterGraphics r = new RasterGraphics();

    @Override
    public void drawLine() {
        r.drawRasterLine();
    }

    @Override
    public void drawSquare() {
        r.drawRasterSquare();

    }
}
