package com.company.Patterns;

/**
 * Created by Маша on 23.04.2017.
 */
public class Adapter {
    public static void main(String[] args) {
        VectorGraficInterface g1 = new VectorAdapterFromRaster();
        g1.drawLine();
        g1.drawSquare();

    }

}
interface VectorGraficInterface{
    void drawLine();
    void drawSquare();
}
class RasterGraphics{
    void drawRasterLine(){
        System.out.println("draw some line");
    }
    void drawRasterSquare(){
        System.out.println("draw some square");
    }
}
class VectorAdapterFromRaster extends RasterGraphics implements VectorGraficInterface{

    @Override
    public void drawLine() {
        drawRasterLine();
    }

    @Override
    public void drawSquare() {
        drawRasterSquare();
    }
}