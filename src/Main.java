public class Main {
    public static String simetrik(String s){
        int top_size=0;
        String biggest_str="";

        // bütün harfler için bir döngü oluşturuyoruz
        for (int i =0;i<s.length();i++){
            int size =1;
            String sub=""+s.charAt(i);

            //her harf için bir sonraki ve bir önceki harf eşleştirmeleri yapılıyor
            //iki harf öncesi ve iki harf sonrası şeklinde eşleşmeleri yapıyor
            //eşleşme sürene kadar devam ediyor
            //eşleşme olmadığı esnada kesip harflerin kaydını bitiriyor

            for(int cap=1;cap<=i;cap++){
                if(i-cap>=0 && i+cap<s.length()){
                    if(s.charAt(i-cap)==s.charAt(i+cap)){
                        size=size+2;
                        sub=s.charAt(i-cap)+sub+s.charAt(i-cap);
                    }
                    else{
                        if(size>top_size){
                            top_size=size;
                            biggest_str=sub;
                            break;
                        }
                    }
                }

            }

        }
        return biggest_str;
    }
    public static void main(String[] args) {
        //yazdırıyoruz
        System.out.println(simetrik("FourscoreandsevenyearsagoourfaathersbroughtforthonthiscontainentanewnationconceivedinzLibertyanddedicatedtothepropositionthatallmenarecreatedequalNowweareengagedinagreahtcivilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));

    }
}