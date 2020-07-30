/**
 * @author liuboting
 * @date 2020/7/3 17:43
 */

public class BetterSolution {
    public int romanToInt(String s) {
        int strLength = s.length();
        char[] ch = new char[strLength];
        int num = 0;
        ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] == 'I'){
                if(i+1<ch.length&&ch[i+1] == 'V'){
                    num += 4;
                    i++;
                    continue;
                }else if(i+1<ch.length&&ch[i+1] == 'X'){
                    num += 9;
                    i++;
                    continue;
                }
                else{
                    num+=1;
                    continue;
                }
            }else if(ch[i] == 'V'){
                num +=5;
            }else if(ch[i] == 'X'){
                if(i+1<ch.length&&ch[i+1] == 'L'){
                    num +=40;
                    i++;
                    continue;
                }else if(i+1<ch.length&&ch[i+1] == 'C'){
                    num +=90;
                    i++;
                    continue;
                }else {
                    num +=10;
                    continue;
                }
            }else if(ch[i] == 'L'){
                num += 50;
            }else if(ch[i] == 'C'){
                if(i+1<ch.length&&ch[i+1] == 'D'){
                    num +=400;
                    i++;
                    continue;
                }else if(i+1<ch.length&&ch[i+1] == 'M'){
                    num +=900;
                    i++;
                    continue;
                }else {
                    num += 100;
                    continue;
                }
            }else if(ch[i] == 'D'){
                num += 500;
                continue;
            }else if(ch[i] == 'M'){
                num += 1000;
                continue;
            }
        }
        return num;
    }
}
