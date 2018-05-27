import java.util.Scanner;
public class Tuan2 {
	public static String docSo(int a) {
        String [] arr1 = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín", "mười"};
        String [] arr2 = {"mươi", "mốt", "hai", "ba", "bốn", "lăm", "sáu", "bảy", "tám", "chín"};
        
        if(a <= 10) return arr1[a];//Các số từ 0->10
        
        int chuc = a / 10, donvi = a % 10;
        if(donvi == 0) return arr1[chuc] + " " + arr2[0];  //Các số 20-30-40-50-60-70-80-90
        if(chuc == 1) return arr1[10] + " " + arr1[donvi]; //Các số 11->19
        return arr1[chuc] + " " + arr2[0] + " " + arr2[donvi]; //Trường hợp còn lại
    }
	
	public static String vietHoaChuCaiDau(String s) {
	    s = s.toLowerCase();
	    return ((char)(s.charAt(0) - 32)) + s.substring(1, s.length());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một số từ 0 -> 99");
        int so = sc.nextInt();
        if(so < 0 || so >= 100) System.out.println("Số bạn nhập không đúng.");
        else System.out.println("Đọc số đã nhập: " + vietHoaChuCaiDau(docSo(so)));
	}

}
