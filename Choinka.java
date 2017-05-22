public class Choinka {
    public void choinka(int height) {
        height = height - 1;
        int baubleFront = 2;
        int baubleBack = (((height + 1) * 2) - 1) % 10;
        int longest = 0;
        String line;
        int i = 1;
        int j = 0;
        int counter = 0;
        String gap = " ";

        if (height < 4) {
            if (height == 2) {
                longest = 3;
            }
            else if (height == 3) {
                longest = 5;
            }
        }
        else {
            int level = height / 4;
            longest = 5 + (2 * level);
        }

        for (int k = 0; k < (( longest - 1) / 2); k++) {
            gap += " ";
        }
        System.out.println (gap + "1");
        while (height > 0 ) {
            for (; i < 4 && height > 0; height--, i++, baubleFront++, baubleBack--) {
                j = i;
                line = "*";
                gap = "";
                while ((j + counter) > 1) {
                    line += "**";
                    j--;
                }
                int gapLength = ((longest - line.length()) / 2);
                while (gapLength > 0) {
                    gap += " ";
                    gapLength--;
                }
                if (baubleFront == 10) {
                    baubleFront = 0;
                }
                System.out.println (gap + baubleFront + line + baubleBack);
                if (baubleBack == 0) {
                    baubleBack = 10;
                }
            }
            i = 0;
            counter++;
        }
    }
}