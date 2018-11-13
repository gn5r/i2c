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

        /*    1秒間隔でI2Cデバイスから受信したデータを表示    */
        while (true) {
            System.out.println("writing");
            arduinoMega.write(1);
            Thread.sleep(1000);
        }
        
    }
}
