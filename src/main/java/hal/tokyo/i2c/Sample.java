/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hal.tokyo.i2c;

/**
 *
 * @author gn5r
 */
public class Sample {

    public static void main(String[] args) throws Exception {

        /*    ArduinoMegaクラスのインスタンスを生成    */
        ArduinoMega arduinoMega = new ArduinoMega();

        /*    Addressを表示    */
        arduinoMega.getAddress();

        while (true) {
            if (arduinoMega.read() != -1) {
                System.out.println(String.valueOf(arduinoMega.read()));
                break;
            }
        }
    }
}