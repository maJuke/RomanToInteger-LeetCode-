public class Translate {
    public static int romanToInt(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char chAfter;
            char chBefore;
            if (i != (s.length() - 1))
                chAfter = s.charAt(i+1);
            else
                chAfter = ' ';
            if (i != 0)
                chBefore = s.charAt(i-1);
            else
                chBefore = ' ';
            switch(ch) {
                case ('I'):
                    if (chAfter == 'V')
                        res += 4;
                    else if (chAfter == 'X')
                        res += 9;
                    else
                        res++;
                    break;
                case ('V'):
                    if (chBefore == 'I')
                        break;
                    else
                        res += 5;
                    break;
                case ('X'):
                    if (chBefore == 'I')
                        break;
                    else if (chAfter == 'L')
                        res += 40;
                    else if (chAfter == 'C')
                        res += 90;
                    else
                        res += 10;
                    break;
                case ('L'):
                    if (chBefore == 'X')
                        break;
                    else
                        res += 50;
                    break;
                case ('C'):
                    if (chBefore == 'X')
                        break;
                    else if (chAfter == 'D')
                        res += 400;
                    else if (chAfter == 'M')
                        res += 900;
                    else
                        res += 100;
                    break;
                case ('D'):
                    if (chBefore == 'C')
                        break;
                    else
                        res += 500;
                    break;
                case ('M'):
                    if (chBefore == 'C')
                        break;
                    else
                        res += 1000;
            }
        }
        return res;
    }
}
