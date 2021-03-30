import 'dart:math';
import 'dart:ui';

class ColorUtils{

    static Color getRandomColor(){
        var random = Random();
        var r = random.nextInt(256);
        var g = random.nextInt(256);
        var b = random.nextInt(256);
        return Color.fromARGB(255,r,g,b);
    }

}