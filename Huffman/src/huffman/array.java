//Eren Can Çelik
//02210201055
package huffman;

import java.util.HashMap;

public class array {
    HashMap dizi = new HashMap(); //frekans bulmak için hashmap tanımladım
    HashMap output=new HashMap(); // output için hashmap tanımladım
    array(String str){
        char [] chararr=new char[str.length()];
        str.getChars(0, str.length(), chararr, 0); // burada verilen string ifadeyi karakter dizisine dönüştürüyorum ki kolayca okunsun.
        for (int i=0;i<chararr.length;i++){  //bu kısımda karakterlerin frekansını buluyoruz
            int counter=0;
            for (int j=0;j<chararr.length;j++){
                if (chararr[i]==chararr[j]){
                    counter++;
                }
            }
            dizi.put(chararr[i], counter);
            
        }
        Object[] arr=dizi.keySet().toArray(); //burada hashmapin key değerleri ile dizi oluşturuyorum
        if (dizi.size()<=2 && dizi.size()>0){ //eğer alfabe maximum 2 harften oluşuyorsa
            for (int i=0;i<dizi.size();i++){
                String a=Integer.toBinaryString(i);
                output.put(arr[i], a);
            }
        }else if (dizi.size()<=4 && dizi.size()>2){ // eğer alfabe maximum 4 harften oluşuyorsa
            for (int i=0;i<dizi.size();i++){
                String a=Integer.toBinaryString(i);
                if (a.length()==1){
                    output.put(arr[i], "0"+a);
                }else{
                    output.put(arr[i], a);
                }
            }
        }else if(dizi.size()<=8 && dizi.size()>4){ // eğer alfabe maximum 8 harften oluşuyorsa
            for (int i=0;i<dizi.size();i++){
                String a=Integer.toBinaryString(i);
                if (a.length()==1){
                    output.put(arr[i], "00"+a);
                }else if (a.length()==2){
                    output.put(arr[i], "0"+a);
                }else{
                    output.put(arr[i], a);
                }
            }
        }else if(dizi.size()<=16 && dizi.size()>8){ // eğer alfabe maximum 16 harften oluşuyorsa 
            for (int i=0;i<dizi.size();i++){
                String a=Integer.toBinaryString(i);
                if (a.length()==1){
                    output.put(arr[i], "000"+a);
                }else if (a.length()==2){
                    output.put(arr[i], "00"+a);
                }else if (a.length()==3){
                    output.put(arr[i], "0"+a);
                }
                else{
                    output.put(arr[i], a);
                }
            }
        }
        else if (dizi.size()>16){ // eğer alfabe 16 harften daha fazla karakterden oluşuyorsa . Burada bitirdim çünkü max 29 harf kullanılabilir.
            for (int i=0;i<dizi.size();i++){
                String a=Integer.toBinaryString(i);
                if (a.length()==1){
                    output.put(arr[i], "0000"+a);
                }else if (a.length()==2){
                    output.put(arr[i], "000"+a);
                }else if (a.length()==3){
                    output.put(arr[i], "00"+a);
                }else if (a.length()==4){
                    output.put(arr[i], "00"+a);
                }
                else{
                    output.put(arr[i], a);
                }
            }
        }//buradan sonrası output için
        System.out.println("Harf kodları="+output.entrySet());
        System.out.println("alfabe "+dizi.size()+" karakterden oluşuyor.");
        System.out.print("Çıktı=");
        for (int i=0;i<chararr.length;i++){
            System.out.print(output.get(chararr[i])+" ");
        }
        System.out.println();
    }
    
}
